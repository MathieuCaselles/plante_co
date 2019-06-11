/**
 * 
 */
package laboCrudJavaFx.model;


public class PlanteUse {

	private int id;
	private String name;
	private String categorie;
	private String description;
	private Float humidopti; 
	private Float tempopti;
	private Float lumopti;
	private String periodeflo;
	
	public PlanteUse() {
		super();
		this.name = "rien";
		this.setCategorie("rien");
		this.setDescription("rien");
		this.setHumidopti((float)1.1);
		this.setTempopti((float)2.1);
		this.setLumopti((float)3.1);
		this.setPeriodeflo("rien");
	}

	public PlanteUse(String name, String categorie, String description, Float humidopti, Float tempopti, Float lumopti, String periodeflo) {
		super();
		this.name = name;
		this.setCategorie(categorie);
		this.setDescription(description);
		this.setHumidopti(humidopti);
		this.setTempopti(tempopti);
		this.setLumopti(lumopti);
		this.setPeriodeflo(periodeflo);
	}
	
	public PlanteUse(int id, String name, String categorie, String description, Float humidopti, Float tempopti, Float lumopti, String periodeflo) {
		super();
		this.id = id;
		this.name = name;
		this.setCategorie(categorie);
		this.setDescription(description);
		this.setHumidopti(humidopti);
		this.setTempopti(tempopti);
		this.setLumopti(lumopti);
		this.setPeriodeflo(periodeflo);
	}
	



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}




	/**
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}




	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}




	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}




	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}




	/**
	 * @return the humidopti
	 */
	public Float getHumidopti() {
		return humidopti;
	}




	/**
	 * @param humidopti the humidopti to set
	 */
	public void setHumidopti(Float humidopti) {
		this.humidopti = humidopti;
	}




	/**
	 * @return the tempopti
	 */
	public Float getTempopti() {
		return tempopti;
	}




	/**
	 * @param tempopti the tempopti to set
	 */
	public void setTempopti(Float tempopti) {
		this.tempopti = tempopti;
	}




	/**
	 * @return the lumopti
	 */
	public Float getLumopti() {
		return lumopti;
	}




	/**
	 * @param lumopti the lumopti to set
	 */
	public void setLumopti(Float lumopti) {
		this.lumopti = lumopti;
	}




	/**
	 * @return the periodeflo
	 */
	public String getPeriodeflo() {
		return periodeflo;
	}




	/**
	 * @param periodeflo the periodeflo to set
	 */
	public void setPeriodeflo(String periodeflo) {
		this.periodeflo = periodeflo;
	}

}
