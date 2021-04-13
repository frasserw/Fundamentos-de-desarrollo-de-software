package herencia;
/**
 * 
 */
public class Persona {
    protected int id;
    protected String nombre;
    protected String telefono;
    /**
     * 
     * @param id
     * @param nombre
     * @param telefono
     */
    public Persona(int id,String nombre,String telefono) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " Id " + this.id + " Nombre " + this.nombre + " Telefono " + this.telefono;
    }
}
