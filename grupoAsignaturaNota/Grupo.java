package grupoAsignaturaNota;

import java.util.Arrays;

public class Grupo {
	private int codigo;
	private Asignatura asignatura;
	private Persona docente;
	private Nota[] listaNota;
	/**
	 * 
	 * @param codigo
	 * @param asignatura
	 * @param docente
	 * @param elemento numero de elementos en el array Nota 
	 */
	public Grupo(int codigo, Asignatura asignatura, Persona docente, int elemento) {
		this.codigo = codigo;
		this.asignatura = asignatura;
		this.docente = docente;
		this.listaNota =new Nota[elemento];
	}
	/**
	 * 
	 * @param notica
	 */
	public void agregarNota(Nota notica) {
		for (int i = 0; i < this.listaNota.length; i++) {
			if(listaNota[i] == null) {
				listaNota[i]=notica;
				return;
			}
		}
	}
	/**
	 * 
	 */
	public void listaNota() {
		System.out.println("Codgo del Grupo " + this.codigo + this.asignatura + " Docente "+this.docente.getNombre());
		System.out.println();
		for (Nota nota : listaNota) {
			System.out.println(nota.getEstudiante()+" "+Arrays.toString(nota.getNota()));
		}
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}
	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	/**
	 * @return the docente
	 */
	public Persona getDocente() {
		return docente;
	}
	/**
	 * @param docente the docente to set
	 */
	public void setDocente(Persona docente) {
		this.docente = docente;
	}
	/**
	 * @return the nota
	 */
	public Nota[] getNota() {
		return listaNota;
	}
	/**
	 * @param nota the nota to set
	 */
	public void setNota(Nota[] nota) {
		this.listaNota = nota;
	}
	@Override
	public String toString() {
		return "Codigo " + this.codigo + " Asignatura " + this.asignatura + " Docente " + this.docente.getNombre();
	}
	
	
	

}
