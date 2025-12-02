

/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/
import java.util.Scanner;

import model.Categoria;
import model.Material;
import repository.InventariRepository;
import service.InventariService;

/**
 * Classe principal per provar el sistema de gestió d'inventari.
 */
public class Main {
	public static void main(String[] args) {
		InventariRepository repo = new InventariRepository();
		InventariService service = new InventariService(repo);
		Scanner teclat = new Scanner(System.in);

		boolean sortir = false;
		while (!sortir) {
			System.out.println("\n=== MENÚ INVENTARI ===");
			System.out.println("1. Afegir material");
			System.out.println("2. Llistar materials");
			System.out.println("3. Fer préstec");
			System.out.println("4. Retornar material");
			System.out.println("0. Sortir");
			System.out.print("Opció: ");
			int opcio = teclat.nextInt();
			teclat.nextLine(); // netejar buffer

			switch (opcio) {
			case 1:
				System.out.print("Nom del material: ");
				String nom = teclat.nextLine();
				System.out.print("Categoria: ");
				String cat = teclat.nextLine();
				service.afegirMaterial(nom, new Categoria(cat));
				System.out.println("Material afegit correctament.");
				break;

			case 2:
				System.out.println("Materials a l'inventari:");
				for (Material m : service.llistarMaterials()) {
					System.out.println("- " + m.getNom() + " (" + m.getCategoria().getNom() + ") "
							+ (m.isDisponible() ? "[Disponible]" : "[Prestat]"));
				}
				break;

			case 3:
				System.out.print("Nom del material a prestar: ");
				String prestarNom = teclat.nextLine();
				if (service.ferPrestec(prestarNom)) {
					System.out.println("Préstec realitzat correctament.");
				} else {
					System.out.println("No s'ha pogut fer el préstec (material no disponible).");
				}
				break;

			case 4:
				System.out.print("Nom del material a retornar: ");
				String retornarNom = teclat.nextLine();
				if (service.retornarMaterial(retornarNom)) {
					System.out.println("Material retornat correctament.");
				} else {
					System.out.println("No s'ha pogut retornar (material no prestat).");
				}
				break;

			case 0:
				sortir = true;
				System.out.println("Sortint del sistema...");
				break;

			default:
				System.out.println("Opció no vàlida.");
			}
		}

		teclat.close();
	}
}
