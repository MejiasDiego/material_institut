package repository;

/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/

import java.util.ArrayList;
import java.util.List;

import model.Material;

/**
 * Classe que simula la persistència de dades de l'inventari.
 */
public class InventariRepository {
	private List<Material> materials = new ArrayList<>();

	/**
	 * Afegeix un material a la llista.
	 * 
	 * @param material Material a afegir
	 */
	public void afegirMaterial(Material material) {
		materials.add(material);
	}

	/**
	 * Retorna tots els materials.
	 * 
	 * @return llista de materials
	 */
	public List<Material> getMaterials() {
		return materials;
	}
}