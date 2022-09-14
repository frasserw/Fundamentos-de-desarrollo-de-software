package figura;
/**
 * Clase Triangulo implementa métodos abstractos de la clase abstracta Figura 
 * @author Willian frasser acevedo
 */
public class Triangulo extends Figura{
	private double lado1;
	private double lado2;
	private double lado3;
	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		double semiP = (this.lado1+this.lado2+this.lado3)/2;
		
		this.area =(semiP*((semiP-this.lado1)*(semiP-this.lado2)*(semiP-this.lado3)));
		this.area = Math.pow(this.area, 0.5);
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.lado3 = Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2)-(2*lado1+lado2)*Math.cos(97));
		this.perimetro = this.lado1 + this.lado2 + this.lado3;
	}

}
