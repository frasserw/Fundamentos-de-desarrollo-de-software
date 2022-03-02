package cursonotas;

import java.util.Arrays;

public class Estudiante {
	private int id;
	private String nombre;
	private double[] nota;
	private double notaFinal;
	/**
	 * @param id
	 * @param nombre
	 * @param notas
	 * @param notaFinal
	 */
	public Estudiante(int id, String nombre, double[] nota) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nota = nota;
		this.notaFinal = (nota[0]*30/100) + (nota[0]*30/100) + (nota[0]*40/100);

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
	 * @return the notas
	 */
	public double[] getNota() {
		return nota;
	}
	/**
	 * @param notas the notas to set
	 */
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		return notaFinal;
	}
	/**
	 * @param notaFinal the notaFinal to set
	 */
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	/**
	 * 
	 */
	public String toString() {
		return id + " " + nombre + " " + Arrays.toString(nota) + " " + notaFinal;
	}
	
}
