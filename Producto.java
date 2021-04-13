package tienda;

import utilidades.Fecha;

/**
 * 
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private long precio;
    private int cantidadA;
    private Fecha fechaVento;
    /**
     * 
     * @param codigo
     * @param descripcion
     * @param precio
     */
    public Producto(int codigo,String descripcion,long precio) {
        super();
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    /**
     * Método para crear un relación de comosición enter la clase Producto y la clase Fecha
     * @param anio 
     * @param mes
     * @param dia
     */
   
     public void fechaVento(int anio, int mes , int  dia){
       this.fechaVento =new Fecha(anio,mes,dia);
    }
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidadA() {
        return cantidadA;
    }

    public Fecha getFechaVento() {
        return fechaVento;
    }

    public long getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadA(int cantidadA) {
        this.cantidadA = cantidadA;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public void setFechaVento(Fecha fechaVento) {
        this.fechaVento = fechaVento;
    }
    /**
    * 
    */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " Codigo " + this.codigo + " Descripción " + this.descripcion + " Precio " + this.precio + " Fecha vencimiento " + this.fechaVento;
    }

}
