import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Programa Empleado implementa los datos basicos de un Empledo
 * Es una super clase
 * @author william Frasser Acevedo
 *
 */
public class Empleado {
	protected int id;
	protected String nombre;
	protected Fecha fechaIngreso;
	/**
	 * @param id
	 * @param nombre
	 * @param fechaIngreso
	 */
	public Empleado(int id, String nombre, Fecha fechaIngreso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the fechaIngreso
	 */
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	/**
	 * Función para obtener los años de antiguedad de un empleado
	 * @return un entero con los años de antiguedad
	 */
	public int aniosAntiguedad() {
		//Obtiene la fecha actual del sistema
		//Calendar fecha = new GregorianCalendar();
		//return fecha.get(Calendar.YEAR) - fechaIngreso.getAnio(); 
		
		LocalDate toDate = LocalDate.now();
		return toDate.getYear() - fechaIngreso.getAnio();
	}
	
	/**
	 * 
	 */
	public String toString() {
		return " Id " + id + " Nombre " + nombre + " Fecha Ingreso " + fechaIngreso + " ";
	}
	
	
}
