import java.util.ArrayList;
/**
 * 
 * @author william frasser acevedo
 *
 */
public class Empresa {
	private ArrayList<Comision> listaComsion;
	private ArrayList<Fijo> listaFijo;
	/**
	 * 
	 */
	public Empresa() {
		this.listaComsion = new ArrayList<>();
		this.listaFijo = new ArrayList<>();
	}
	/**
	 * Funci�n para adicionar un empelado por comision
	 * @param comision
	 * @return true si se adiciono la instancia al arreglos dinamico
	 */
	public boolean adicionarEmpleadoComision(Comision comision) {
		return listaComsion.add(comision);
	}
	/**
	 * Funci�n para adicionar empleado por salario fijo
	 * @param comision
	 * @return true si se adiciono la instancia al arreglos dinamico
	 */
	public boolean adicionarEmpleadoFijo(Fijo fijo) {
		return listaFijo.add(fijo);
	}
	/**
	 *Funci�n para mostarr los empelados a comisi�n 
	 */
	public void mostrarEmpleadoComision() {
		System.out.println(listaComsion.toString());
	}
	/**
	 *Funci�n para mostarr los empelados de salario fijo 
	 */
	public void mostrarEmpleadoFijo() {
		System.out.println(listaFijo.toString());
	}
}
