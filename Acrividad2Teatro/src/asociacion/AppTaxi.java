package asociacion;
/**
 * 
 * @author william frasser acevedo
 *
 */
public class AppTaxi {

	public static void main(String[] args) {
		Persona miPersona =new Persona("Juanita");
		//
		Taxi miTaxi =new Taxi("ABC100",miPersona);
		//
		System.out.println("Placa " + miTaxi.getPlaca());
		System.out.println("Conductor " + miTaxi.getConductor().getNombre());
		
		Taxi miTaxi1 =new Taxi("PRT100",miPersona);
		System.out.println("Placa " + miTaxi1.getPlaca());
		System.out.println("Conductor " + miTaxi1.getConductor().getNombre());
		
		
	}
	
	

}
