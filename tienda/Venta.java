package tienda;

import java.time.LocalDate;
import java.util.ArrayList;

import grupoAsignaturaNota.Persona;

public class Venta {
	private int numero;
	private LocalDate fecha;
	private Persona cliente;
	private long valorTotal;
	private long iva;
	private long valorPagar;
	private ArrayList<Detalle> listaDetalle;
	/**
	 * @param numero
	 * @param fecha
	 * @param cliente
	 */
	public Venta(int numero, Persona cliente) {
		super();
		this.numero = numero;
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		listaDetalle =new ArrayList<>();
	}
	/**
	 * 
	 * @param dato
	 */
	public void agregarDetalle(Detalle detalle) {
		
		listaDetalle.add(detalle);
		//Favor Tralizar los calculos de la factura 
		//Acumulados , Iva, valorTotal, valorPagar
	    long total = detalle.getCantidad() * detalle.getProducto().getPrecio();
	    int ivaP = (int) ((detalle.getProducto().getTipo().getIva()/100) * total);
	    
	    this.valorTotal += total;
		this.iva += ivaP;
		this.valorPagar += (valorTotal + iva);
	 
	}
	/*
	 * 
	 */
	
	public void mostrar() {
		System.out.println("Numero "+this.numero);
		System.out.println("Fecha " + this.fecha);
		System.out.println("Cliente " + this.cliente);

		for (Detalle detalle : listaDetalle) {
			System.out.println(detalle.getProducto() +" "+ detalle.getCantidad());
		}

		//incluir el pie de la fatura
		System.out.println("Total " + this.valorTotal);
		System.out.println("Iva " + this.iva);
		System.out.println("Valor a Pagar " + this.valorPagar);
	}
	
	

}
