package abstracta;
/**
 * Clase abstracta implementa métodos abstarctos y concretos
 * @author Willian
 *
 */
public abstract class Figura {
	protected double area;
	protected double perimetro;
	/**
	 * Métodos abstractos 
	 */
	public abstract void calcularArea();
	public abstract void calcularPerimetro();
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(float area) {
		this.area = area;
	}
	/**
	 * @return the perimetro
	 */
	public double getPerimetro() {
		return perimetro;
	}
	/**
	 * @param perimetro the perimetro to set
	 */
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	
}
