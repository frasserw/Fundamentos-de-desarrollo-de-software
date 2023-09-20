package grupoAsignaturaNota;

public class App {

	public static void main(String[] args) {
		Asignatura miAsignatura =new Asignatura(5029,"FDS");
		Persona docente =new Persona(10230,"Pachito");
        
		Grupo miGrupo =new Grupo(5029,miAsignatura,docente,3);
				
        Persona estudiante1 =new Persona(1020,"Junita");
        Persona estudiante2 =new Persona(1030,"Pachita");
        Persona estudiante3 =new Persona(1040,"Albita");
        
        double[] notaJ ={4,3,5,0};
        double[] notaP ={5,4,5,0};
        double[] notaA ={3,4,5,0};
        
        Nota nota1 =new Nota(notaJ,estudiante1);
        Nota nota2 =new Nota(notaP,estudiante2);
        Nota nota3 =new Nota(notaA,estudiante3);
        
        miGrupo.agregarNota(nota1);
        miGrupo.agregarNota(nota2);
        miGrupo.agregarNota(nota3);
        
        miGrupo.listaNota();
        

	}

}
