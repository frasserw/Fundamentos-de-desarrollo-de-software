package herencia;

public class Administrativo extends Persona{
   private String puestoTrabajo;
    private int salarioBase;

    public Administrativo(int id, String nombre, String telefono,String puestoTrabajo,int salarioBase) {
        super(id, nombre, telefono);
        //TODO Auto-generated constructor stub
        this.puestoTrabajo = puestoTrabajo;
        this.salarioBase = salarioBase;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
    /**
     * 
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Puesto de Trabajo " + this.puestoTrabajo + " Salario Base " + this.salarioBase;
    }
   
}
