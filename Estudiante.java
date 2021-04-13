package herencia;
/**
 * 
 */
public class Estudiante extends Persona{
    private String programa;
    private double nota;
    /**
     * 
     * @param id
     * @param nombre
     * @param telefono
     * @param programa
     * @param nota
     */
   public Estudiante(int id,String nombre,String telefono,String programa,double nota) {
       super(id,nombre,telefono);
       this.programa = programa;
       this.nota = nota;
   }
   /**
    * 
    * @return
    */
   public double getNota() {
       return nota;
   }
   /**
    * 
    * @return
    */
   public String getPrograma() {
       return programa;
   }

   public void setNota(double nota) {
       this.nota = nota;
   }

   public void setPrograma(String programa) {
       this.programa = programa;
   }
   /**
    * 
    */
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return super.toString() + " Programa " + this.programa + " Nota " + this.nota;
   }

}
