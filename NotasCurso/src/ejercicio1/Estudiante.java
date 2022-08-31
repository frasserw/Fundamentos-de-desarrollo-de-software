package ejercicio1;

import java.util.Arrays;

public class Estudiante {
	private int id;
	private String nombre;
	private String apellido;
	private double nota[];
	private double definitiva;
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param nota
	 */
	public Estudiante(int id, String nombre, String apellido, double[] nota) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		calcularNota();
		
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the nota
	 */
	public double[] getNota() {
		return nota;
	}
	/**
	 * @param nota the nota to set
	 */
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	/**
	 * @return the definitiva
	 */
	public double getDefinitiva() {
		return definitiva;
	}
	/**
	 * @param definitiva the definitiva to set
	 */
	public void setDefinitiva(double definitiva) {
		this.definitiva = definitiva;
	}
	/**
	 * 
	 */
	public void calcularNota() {
		definitiva = nota[0]*30/100 + nota[1]*30/100 + nota[2]*40/100; 
	}
	@Override
	public String toString() {
		return "Id " + id + " Nombre=" + nombre + " Apellido=" + apellido + " Notas "
				+ Arrays.toString(nota) + " Definitiva " + definitiva + (definitiva >=3 ? "Aprobo " :"Reprobo"); 
	}
}
