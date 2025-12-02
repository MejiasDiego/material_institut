package model;

/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/

/**
 * Representa una categoria de material (per exemple: llibres, ordinadors,
 * projectors).
 */
public class Categoria {
	private String nom;

	/**
	 * Constructor de la categoria.
	 * 
	 * @param nom Nom de la categoria
	 */
	public Categoria(String nom) {
		this.nom = nom;
	}

	/**
	 * Obté el nom de la categoria.
	 * 
	 * @return nom de la categoria
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Assigna un nou nom a la categoria.
	 * 
	 * @param nom Nou nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
