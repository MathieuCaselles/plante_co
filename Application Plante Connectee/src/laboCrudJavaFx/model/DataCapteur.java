/**
 * 
 */
package laboCrudJavaFx.model;

/**
 * @author Hugo
 *
 */
public class DataCapteur {
	private int id;
	private String date;
	private Float humidactu; 
	private Float tempactu;
	private Float lumactu;

	public DataCapteur() {
		super();
		this.setId(1);
		this.setDate("2019-01_01");
		this.setHumidactu((float) 1.1);
		this.setTempactu((float) 2.1);
		this.setLumactu((float) 3.1);
	}

	public DataCapteur(int id, String date, Float humidactu, Float tempactu, Float lumactu) {
		super();
		this.setId(id);
		this.setDate(date);
		this.setHumidactu(humidactu);
		this.setTempactu(tempactu);
		this.setLumactu(lumactu);
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
	 * @return the date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * @return the humidactu
	 */
	public Float getHumidactu() {
		return humidactu;
	}


	/**
	 * @param humidactu the humidactu to set
	 */
	public void setHumidactu(Float humidactu) {
		this.humidactu = humidactu;
	}


	/**
	 * @return the tempactu
	 */
	public Float getTempactu() {
		return tempactu;
	}


	/**
	 * @param tempactu the tempactu to set
	 */
	public void setTempactu(Float tempactu) {
		this.tempactu = tempactu;
	}


	/**
	 * @return the lumactu
	 */
	public Float getLumactu() {
		return lumactu;
	}


	/**
	 * @param lumactu the lumactu to set
	 */
	public void setLumactu(Float lumactu) {
		this.lumactu = lumactu;
	}

}
