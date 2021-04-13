package herencia;

public class Docente extends Persona{
    private String profesion;
    private int salarioHora;

    public Docente(int id, String nombre, String telefono, String profesion, int salarioHora) {
        super(id, nombre, telefono);
        //TODO Auto-generated constructor stub
        this.profesion = profesion;
        this.salarioHora = salarioHora;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getSalarioHora() {
        return salarioHora;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Profesión " + this.profesion + " Salrio Hora " + this.salarioHora;
    }
   
    
}
