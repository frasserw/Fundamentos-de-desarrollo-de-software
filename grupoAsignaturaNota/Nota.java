package grupoAsignaturaNota;

import java.util.Arrays;

public class Nota {
	private double[] nota =new double[4];
	private Persona estudiante;
	/**
	 * @param nota
	 * @param estudiante
	 */
	public Nota(double[] nota, Persona estudiante) {
		super();
		double nota1=nota[0];
		nota1 = nota1*.30;
		double nota2=nota[1];
		nota2 = nota2*.30;
		double nota3=nota[2];
		nota3 = nota3*.40;
		nota[3] = nota1+nota2+nota3;
		this.nota = nota;
		this.estudiante = estudiante;
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
	 * @return the estudiante
	 */
	public Persona getEstudiante() {
		return estudiante;
	}
	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(Persona estudiante) {
		this.estudiante = estudiante;
	}
	
	@Override
	public String toString() {
		return  " Estudiante=" + estudiante + "Nota " + Arrays.toString(nota);
	}

}













