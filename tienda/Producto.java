package tienda;

import java.time.*;

import grupoAsignaturaNota.Persona;

public class Producto {
	private int codigo;
	private String descripcion;
	private int precio;
	private int cantidadActual;
	private LocalDate fechaCompra;
	private Tipo tipo;
	private Persona proveedor;
	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param cantidadActual
	 * @param tipo
	 * @param proveedor
	 */
	public Producto(int codigo, String descripcion, int precio, int cantidadActual, Tipo tipo, Persona proveedor) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidadActual = cantidadActual;
		this.tipo = tipo;
		this.proveedor = proveedor;
		this.fechaCompra = LocalDate.now();
		
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @return the cantidadActual
	 */
	public int getCantidadActual() {
		return cantidadActual;
	}
	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}
	@Override
	public String toString() {
		return "Producto codigo=" + codigo + " descripcion=" + descripcion + " precio=" + precio;
	}
	
}
