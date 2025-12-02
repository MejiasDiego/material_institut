package service;

/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/

import java.util.List;

import model.Categoria;
import model.Material;
import repository.InventariRepository;

/**
 * Classe que conté la lògica principal del sistema d'inventari.
 */
public class InventariService {
	private InventariRepository repository;

	/**
	 * Constructor del servei d'inventari.
	 * 
	 * @param repository Repositori utilitzat
	 */
	public InventariService(InventariRepository repository) {
		this.repository = repository;
	}

	/**
	 * Afegeix un nou material a l'inventari.
	 * 
	 * @param nom       Nom del material
	 * @param categoria Categoria del material
	 */
	public void afegirMaterial(String nom, Categoria categoria) {
		Material m = new Material(nom, categoria);
		repository.afegirMaterial(m);
	}

	/**
	 * Llista tots els materials disponibles.
	 * 
	 * @return llista de materials
	 */
	public List<Material> llistarMaterials() {
		return repository.getMaterials();
	}

	/**
	 * Busca un material pel seu nom.
	 * 
	 * @param nom Nom del material
	 * @return Material trobat o null
	 */
	public Material buscarMaterial(String nom) {
		for (Material m : repository.getMaterials()) {
			if (m.getNom().equalsIgnoreCase(nom)) {
				return m;
			}
		}
		return null;
	}

	/**
	 * Presta un material si està disponible.
	 * 
	 * @param nom Nom del material
	 * @return true si s'ha prestat, false si no
	 */
	public boolean ferPrestec(String nom) {
		Material m = buscarMaterial(nom);
		if (m != null && m.isDisponible()) {
			m.prestar();
			return true;
		}
		return false;
	}

	/**
	 * Retorna un material prestat.
	 * 
	 * @param nom Nom del material
	 * @return true si s'ha retornat, false si no
	 */
	public boolean retornarMaterial(String nom) {
		Material m = buscarMaterial(nom);
		if (m != null && !m.isDisponible()) {
			m.retornar();
			return true;
		}
		return false;
	}
}
