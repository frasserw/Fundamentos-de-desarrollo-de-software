package ejercicio6;
/**
 * 
 * @author willi
 *
 */
public class FreidoraAire extends Electrodomestico{
	private int vatios;

	/**
	 * @param codigo
	 * @param marca
	 * @param modelo
	 * @param vatios
	 */
	public FreidoraAire(int codigo, String marca, String modelo,int precioBase,int vatios) {
		super(codigo, marca, modelo,precioBase);
		this.vatios = vatios;
	}

	/**
	 * @return the vatios
	 */
	public int getVatios() {
		return vatios;
	}

	/**
	 * @param vatios the vatios to set
	 */
	public void setVatios(int vatios) {
		this.vatios = vatios;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Freidora de Aire "+super.toString() + " Vatios " + this.vatios;
	}
	
	@Override
	public int calcularPago(int dato) {
		// TODO Auto-generated method stub
		return (vatios * dato)+precioBase;
		
	}
}
