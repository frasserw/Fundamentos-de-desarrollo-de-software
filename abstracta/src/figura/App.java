package figura;
/**
 * Clase App para testing de la implementación de clase abstracta
 * @author Willian
 *
 */
public class App {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura triangulo =new Triangulo(10,12,7);
		triangulo.calcularArea();
		triangulo.calcularPerimetro();
		System.out.println(triangulo.getArea());
		System.out.println(triangulo.getPerimetro());
		
	}

}
