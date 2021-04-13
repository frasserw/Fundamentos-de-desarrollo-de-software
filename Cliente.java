package tienda;

import utilidades.Fecha;

/**
 * 
 */

public class Cliente {
    private int id;
    private String nombre;
     private String telefono;
    private Fecha fechaNacimiento;
    private String correo;
   /**
    * 
    * @param id
    * @param nombre
    * @param telefono
    * @param correo
    */
    public Cliente(int id, String nombre, String telefono, String correo) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;

    }
    /**
     * 
     * @param anio
     * @param mes
     * @param dia
     */
    public void fecha(int anio,int mes,int dia){
        this.fechaNacimiento =new Fecha(anio,mes,dia);
    }
    /**
     * 
     */
   public int getId() {
       return id;
   }
   /**
    * 
    * @return
    */
   public String getNombre() {
       return nombre;
   }

   public String getTelefono() {
       return telefono;
   }

   public String getCorreo() {
       return correo;
   }

   public Fecha getFechaNacimiento() {
       return fechaNacimiento;
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

   public void setCorreo(String correo) {
       this.correo = correo;
   }

   public void setFechaNacimiento(Fecha fechaNacimiento) {
       this.fechaNacimiento = fechaNacimiento;
   }

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return " Id " +this.id + " Nombre " + this.nombre + " Telefeno " + this.telefono + " Correo " + this.correo + " Fecha Nacimiento " + this.fechaNacimiento;
   }


}
