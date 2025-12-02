package model;

/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/
/**
 * Classe que representa un material de l'inventari.
 */
public class Material {
	private String nom;
	private Categoria categoria;
	private boolean disponible;

	/**
	 * Constructor del material.
	 * 
	 * @param nom       Nom del material
	 * @param categoria Categoria associada
	 */
	public Material(String nom, Categoria categoria) {
		this.nom = nom;
		this.categoria = categoria;
		this.disponible = true;
	}

	/**
	 * Marca el material com prestat.
	 */
	public void prestar() {
		this.disponible = false;
	}

	/**
	 * Marca el material com disponible.
	 */
	public void retornar() {
		this.disponible = true;
	}

	/**
	 * Comprova si el material està disponible.
	 * 
	 * @return true si està disponible, false si està prestat
	 */
	public boolean isDisponible() {
		return disponible;
	}

	public String getNom() {
		return nom;
	}

	public Categoria getCategoria() {
		return categoria;
	}
}