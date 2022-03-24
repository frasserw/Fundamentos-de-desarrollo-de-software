package ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiendaElectrodomesticos {
	private ArrayList<Electrodomestico> listaElectrodomesticos;
	/**
	 * 
	*/
	public TiendaElectrodomesticos() {
		listaElectrodomesticos =new ArrayList<Electrodomestico>();
	}
	/**
	 * 
	 */
	public void adicionarElectrodomestico(Electrodomestico e) {
		listaElectrodomesticos.add(e);
	}
	
	public void catalogoElectrodomesticos() {
		listaElectrodomesticos.forEach((e)->System.out.print(e+" \n"));
	}
	/**
	 * Función Busca un dato en la lista dinamica de Electrodomesticos 
	 * Referencia de busqueda el codigo del electrodomestico.
	 * @param codigo entero es el identificador del producto en la lista
	 * @return un objeto Electrodomestico
	 */
	public Electrodomestico buscarElectro(int codigo) {
		for (Electrodomestico e : listaElectrodomesticos) {
			if(e.getCodigo() == codigo)
				return e;
							
		}
		return null;
		
	} 
	/**
	 * Función parar borrar 
	 */
	public void borrar(Electrodomestico e) {
		
			listaElectrodomesticos.remove(e);
	}
		
}
	
	
	
	


