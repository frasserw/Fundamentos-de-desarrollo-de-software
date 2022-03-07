package cursonotas;

import java.util.Scanner;

public class AppNOtas {
	private static Scanner leerDato =new Scanner(System.in);
	private static Curso miCurso;
	private static Estudiante estu;
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salida=true;
		int key;
		while(salida) {
			key=0;
			System.out.println("MODULO DE NOTAS");
			System.out.println("1. Crear curso");
			System.out.println("2. Inscribir estudiante");
			System.out.println("3. Buscar estudiante");
			System.out.println("4. Modificar estudiante");
			System.out.println("5. Lista de inscritos");
			System.out.println("6. Lista de notas por rango");
			System.out.println("7. Salir ");
			System.out.println("Entrar un numero entre 1 y 7");
			key = leerDato.nextInt();
			switch (key) {
			case 1:crearCurso();
				break;
			case 2:datosEstudiante();
				break;
			case 3: buscarEstudiante();
				break;
			case 4: modificarEstudiante();
				break;
			case 5: miCurso.muestraLista();
				break;
			case 6: miCurso.muestraListaNotas();
				break;
			case 7: salida=false;
				break;
			default:System.out.println("Entrar un numero entre 1 y 7");
				break;
			}			
		}
		
		
	}
	/**
	 * 
	 */
	public static void crearCurso() {
		System.out.println("DATOS DEL NUEVO CURSO");
		System.out.print("Codigo ");
		int codigoC = leerDato.nextInt();
		System.out.println("Datos de la Asignatura");
		System.out.print("Codigo ");
		int codigoA = leerDato.nextInt();
		System.out.print("Denominación ");
		String denominacion = leerDato.next();
		System.out.print("Grupo");
		String grupo = leerDato.next();
		System.out.println("Datos del Docente");
		System.out.print("Identificacion ");
		int id = leerDato.nextInt();
		System.out.print("Nombre");
		String nombre = leerDato.next();
		System.out.print("profesion ");
		String profesion = leerDato.next();
		System.out.print("Cuanto Estudiantes en el Curso ");
		int nEstudiante = leerDato.nextInt();
		//Creamnos la instancia de la clase curso
		miCurso =new Curso(codigoC,new Asignatura(codigoA,denominacion),grupo,new Docente(id,nombre,profesion),nEstudiante);
		
	}
	/**
	 * 
	 */
	public static void datosEstudiante() {
		System.out.println("DATOS DE UN ESTUDIANTE");
		System.out.print("Id ");
		int id = leerDato.nextInt();
		System.out.println("Nombre");
		String nombre = leerDato.next();
		System.out.println("Notas");
		double[] nota =new double[3];
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Ingrese la Nota " + (i+1));
			nota[i] = leerDato.nextDouble();
		}
		//Se crea una instancia de la clase estudiante
		Estudiante miEstudiante =new Estudiante(id,nombre,nota);
		//Se instancia a la función para agregar un estudiante a la 
		//lista de estudiantes
		if(miCurso.agregarEstudiante(miEstudiante)) 
			System.out.println("Se inscribio un estudiante");
		else
			System.out.println("Error no se inscribio el estudiante");
	}
	/**
	 * 
	 */
	public static void buscarEstudiante() {
		System.out.println("BUSCAR UN ESTUDIANTE");
		System.out.println("Entre el codigo del estudiante");
		int id =leerDato.nextInt();
		estu = miCurso.buscaEstudiante(id);
		if(estu != null)
			System.out.println(estu);
		else
			System.out.println("El estudiante no existe");
	}
	/**
	 * 
	 */
	public static void modificarEstudiante() {
		buscarEstudiante();
		System.out.println("DATOS A MODIFICAR");
		System.out.println("Nombre ");
		String nombre =leerDato.next();
		estu.setNombre(nombre);
	}

}
