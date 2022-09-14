package figura;
/**
 * Clase Circulo implementa métodos abstractos de la clase abstracta Figura 
 * @author Willian frasser acevedo
 *
 */
public class Circulo extends Figura{
	private double radio;

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area =  (Math.PI * Math.pow(radio, 2));
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro = (2 * Math.PI * this.radio);
	}
	
}
