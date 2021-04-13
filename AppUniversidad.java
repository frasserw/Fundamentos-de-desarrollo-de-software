package herencia;

public class AppUniversidad {
    public static void main(String[] args) {
        Estudiante miEstudiante =new Estudiante(1020,"Juanita ","301212","CCIA",4.0);

        System.out.println("datos del estudiante "+miEstudiante);

        Docente miDocente =new Docente(2020,"Pachito","3001256","INg. CCIA",10000);

        System.out.println(miDocente);

        Administrativo miAdmin =new Administrativo(3050, "Albita", "8562", "Auxiliar", 200000);

        System.out.println(miAdmin);

    }
    
}
