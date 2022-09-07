package tienda.data;

public class Tipo {
	private String tipo;
	private int iva;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public Tipo(String tipo, int iva) {
		super();
		this.tipo = tipo;
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		return "Tipo [tipo=" + tipo + ", iva=" + iva + "]";
	}
	
}
