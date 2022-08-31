package ejercicio1;

import java.util.Scanner;

public class App {
	private Curso curso;
	private Scanner leer =new Scanner(System.in);
	
	public void run() {
		boolean salir=true;
		int opc;
		while(salir) {
			opc=0;
			System.out.println("MENU DE OPCIONES");
			System.out.println("1. Crear Curso");
			System.out.println("2. Inscribir estudiante");
			System.out.println("3. Informe notas 1");
			System.out.println("4. Informe notas 2");
			System.out.println("5. Salr");
			System.out.println("Su opción ");
			opc = leer.nextInt();
			switch(opc) {
				case 1: crearCurso();break; 
				case 2: inscribir();break;
				case 3: informe1();break;
				case 4: informe2();break;
				case 5: salir=true;break;
				default : System.out.println("Ingrese un numero de 1 a 5");
			
			}
			
			
		}
		
	}
	/**
	 * 
	 */
	public void crearCurso() {
		System.out.println("Datos del Curso");
		System.out.print("Codigo del curso");
		String codigo = leer.next();
		System.out.print("Programa ");
		String programa = leer.next();
		System.out.println("Datos de la Asignatura");
		System.out.print("Codigo Asignatura ");
		String codigoAsignatura = leer.next();
		System.out.print("Denominación ");
		String denominacion = leer.next();
		System.out.println("Datos del Docente");
		System.out.print("Identificacion ");
		int id = leer.nextInt();
		System.out.print("Nombre ");
		String nombre = leer.next();
		System.out.print("Profesion ");
		String profesion = leer.next();
		System.out.print("Cuantos estudiantes");
		int estudiantes =leer.nextInt();
		
		Asignatura asignatura =new Asignatura(codigoAsignatura,denominacion);
		curso =new Curso(codigo,programa,asignatura,estudiantes);
		Docente miDocente =new Docente(id,nombre,profesion);
		curso.setDocente(miDocente);
	}
	/**
	 * 
	 */
	public void inscribir() {
		try {
			System.out.println("Inscribir Estudiante");
			System.out.println("DATOS DEL ESTUDIANTE");
			System.out.print("Idetificacion ");
			int id = leer.nextInt();
			System.out.print("Nombre ");
			String nombre = leer.next();
			System.out.print("Apellido ");
			String apellido = leer.next();
			System.out.println("Notas ");
			double[] nota =new double[3];
			for (int i = 0; i < nota.length; i++) {
				System.out.print("Nota cote " +i+1+" ");
				nota[i] = leer.nextDouble();
			}
			Estudiante estudiante =new Estudiante(id,nombre,apellido,nota); 
			curso.inscribirEstudiante(estudiante);
		}catch(NullPointerException e) {
			System.out.println("Curso no existe para generar el infor cree un curso");
		}
	}
	/**
	 * 
	 */
	public void informe1() {
		System.out.println("INFORME DE NOTAS ");
		try {
			System.out.println(curso);
			curso.mostrarLista();
		}catch(NullPointerException e) {
			System.out.println("Curso no existe para generar el infor cree un curso");
		}
	}
	/**
	 * 
	 */
	public void informe2() {
		try {
			Estudiante[] lista = curso.getListaEstudiante();
			for (Estudiante estudiante : lista) {
				if(estudiante != null && estudiante.getDefinitiva() >= 4.0)
					System.out.println(estudiante);
			}
		}catch(NullPointerException e) {
			System.out.println("Curso no existe para generar el infor cree un curso");
		}	
	}
		
	
		
}
