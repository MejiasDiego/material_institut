package model;

/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/
import java.time.LocalDate;

/**
 * Classe que representa un préstec de material.
 */
public class Prestec {
	private Material material;
	private String usuari;
	private LocalDate dataInici;
	private LocalDate dataFi;

	/**
	 * Constructor del préstec.
	 * 
	 * @param material  Material prestat
	 * @param usuari    Nom de l'usuari
	 * @param dataInici Data d'inici
	 * @param dataFi    Data de fi
	 */
	public Prestec(Material material, String usuari, LocalDate dataInici, LocalDate dataFi) {
		this.material = material;
		this.usuari = usuari;
		this.dataInici = dataInici;
		this.dataFi = dataFi;
	}

	public Material getMaterial() {
		return material;
	}

	public String getUsuari() {
		return usuari;
	}

	public LocalDate getDataInici() {
		return dataInici;
	}

	public LocalDate getDataFi() {
		return dataFi;
	}
}