package ejercicio1;

public class Curso {
	private String codigo;
	private String programa;
	private Asignatura asignatura;
	private Docente docente;
	private Estudiante[] listaEstudiante;
	/**
	 * @param codigo
	 * @param programa
	 * @param asignatura
	 */
	public Curso(String codigo, String programa, Asignatura asignatura, int numeroEstu) {
		this.codigo = codigo;
		this.programa = programa;
		this.asignatura = asignatura;
		this.listaEstudiante =new Estudiante[numeroEstu];
	}
	/**
	 * 
	 * @param estudiante
	 */
	public void inscribirEstudiante(Estudiante estudiante) {
		for (int i = 0; i < listaEstudiante.length; i++) {
			if(listaEstudiante[i] == null) {
				listaEstudiante[i] = estudiante;
				return;
			}
			
		}
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the programa
	 */
	public String getPrograma() {
		return programa;
	}
	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(String programa) {
		this.programa = programa;
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
	public Docente getDocente() {
		return docente;
	}
	/**
	 * @param docente the docente to set
	 */
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	/**
	 * @return the listaEstudiante
	 */
	public Estudiante[] getListaEstudiante() {
		return listaEstudiante;
	}
	/**
	 * @param listaEstudiante the listaEstudiante to set
	 */
	public void setListaEstudiante(Estudiante[] listaEstudiante) {
		this.listaEstudiante = listaEstudiante;
	}
	/**
	 * 
	 */
	public void mostrarLista() {
		for (Estudiante estudiante : listaEstudiante) {
			System.out.println(estudiante);
		}
	}
	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", asignatura=" + asignatura + ", docente=" + docente + "]";
	}
	
	


	

}
