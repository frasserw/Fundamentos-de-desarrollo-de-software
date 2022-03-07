package asociacion;
/**
 * 
 * @author william
 *
 */
public class Taxi {
	private String placa;
	private Persona conductor;
	 /** @param placa
	 * @param conductor
	 * 
	 */
	public Taxi(String placa, Persona conductor) {
		super();
		this.placa = placa;
		this.conductor = conductor;
		
	}
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the conductor
	 */
	public Persona getConductor() {
		return conductor;
	}
	/**
	 * @param conductor the conductor to set
	 */
	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}
	
	public String toString() {
		return "Taxi [placa=" + placa + ", conductor=" + conductor + "]";
	}
	
	
}
