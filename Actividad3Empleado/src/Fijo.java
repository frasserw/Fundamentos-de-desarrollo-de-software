/**
 * 
 * @author william frasser acevedo
 *
 */
public class Fijo extends Empleado{
	private int salarioFijo;
	private String rol;
	/**
	 * @param id
	 * @param nombre
	 * @param fechaIngreso
	 * @param salarioFijo
	 * @param rol
	 */
	public Fijo(int id, String nombre, Fecha fechaIngreso, int salarioFijo, String rol) {
		super(id, nombre, fechaIngreso);
		this.salarioFijo = salarioFijo;
		this.rol = rol;
	}
	/**
	 * @return the salarioFijo
	 */
	public int getSalarioFijo() {
		return salarioFijo;
	}
	/**
	 * @param salarioFijo the salarioFijo to set
	 */
	public void setSalarioFijo(int salarioFijo) {
		this.salarioFijo = salarioFijo;
	}
	/**
	 * @return the rol
	 */
	public String getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public int calcularSalario() {
		int anios = aniosAntiguedad();
		if(anios < 2)
			return salarioFijo;
		else if(anios >=2 && anios <= 3)
		     	return salarioFijo += (salarioFijo * 5/100);
		else if(anios >=4 && anios <= 7)
	     	    return salarioFijo += (salarioFijo * 10/100);
		else if(anios >=8 && anios <= 15)
			    return salarioFijo += (salarioFijo * 15/100);
		else 	return salarioFijo += (salarioFijo * 20/100);
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+aniosAntiguedad()+" "+salarioFijo+" "+calcularSalario()+"\n";
	}
	
}
