package cursonotas;

public class Curso {
	private int codigo;
	private Asignatura asignatura;
	private String grupo;
	private Docente docente;
	private Estudiante[] listaEstudiante;
	private int tEstudiante=0;
	/**
	 * @param codigo
	 * @param asignatura
	 * @param grupo
	 * @param docente
	 */
	public Curso(int codigo, Asignatura asignatura, String grupo, Docente docente,int numeroEstudiante) {
		super();
		this.codigo = codigo;
		this.asignatura = asignatura;
		this.grupo = grupo;
		this.docente = docente;
		//Se crea una arreglo estatico de instancias objetos estduiantes 
		this.listaEstudiante =new Estudiante[numeroEstudiante];
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
	 * @return the grupo
	 */
	public String getGrupo() {
		return grupo;
	}
	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
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
	 * 
	 * @return
	 */
	public boolean agregarEstudiante(Estudiante estudiante) {
		boolean estado=false;
		for (int i=0;i<listaEstudiante.length;i++) {
			if(listaEstudiante[i] == null) {
				listaEstudiante[i] = estudiante;
				estado=true;
				tEstudiante++;
				break;
			}
		}
		return estado;
	}
	/**
	 * Función muestra la lista de estudiantes con la nota final
	 * y el promedio del curso
	 */
	public void muestraLista() {
		System.out.println("Lista de Estudiante Inscritos");
		System.out.println(asignatura.getCodigo()+"-"+asignatura.getDenominacion()+ " Docente "+docente.getNombre());
		System.out.println("Codigo   Nombre y Apellido ");
		for (Estudiante estudiante : listaEstudiante) {
			if(estudiante != null) {
				System.out.println(estudiante.getId()+" "+estudiante.getNombre());
			}else {
				break;
			}
		}
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Estudiante buscaEstudiante(int id) {
		for (Estudiante e : listaEstudiante) {
			if(e!=null) {
			 if(e.getId() == id) {
				return e;
			 }
			}
		}
		return null;
	}
	/**
	 * Función para mostrar los entudiantes cuyo nota final 
	 * se encuentre en un rango especifico
	 * 
	 */
	public void muestraListaNotas() {
		double acumuladoNota=0;
		for (Estudiante estudiante : listaEstudiante) {
			if(estudiante != null) {
				System.out.println(estudiante);
				acumuladoNota += estudiante.getNotaFinal();
			}else {
				break;
			}
		}
		System.out.println("Promedio del curso -> " + Math.round((acumuladoNota/tEstudiante)*100.0)/100.0);

		
	}

}
