import java.time.LocalDate;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa miEmpresa =new Empresa();
		
		miEmpresa.adicionarEmpleadoComision(new Comision(10256,"Juanita",new Fecha(10,12,2010),40));
		miEmpresa.adicionarEmpleadoComision(new Comision(12300,"Pachita",new Fecha(20,01,2019),35));
		miEmpresa.adicionarEmpleadoComision(new Comision(25658,"Pachito",new Fecha(01,02,2020),25));
		miEmpresa.adicionarEmpleadoComision(new Comision(85698,"Albita",new Fecha(10,10,2021),41));
		
		miEmpresa.adicionarEmpleadoFijo(new Fijo(5263,"Rosita",new Fecha(10,10,2010),2000000,"Ing.CCIA"));
		miEmpresa.adicionarEmpleadoFijo(new Fijo(5263,"Josecito",new Fecha(30,5,2019),3000000,"Ing.CCIA"));
		miEmpresa.adicionarEmpleadoFijo(new Fijo(5263,"Juachito",new Fecha(01,12,2021),4000000,"Ing.Software"));
		miEmpresa.adicionarEmpleadoFijo(new Fijo(5263,"Maria",new Fecha(23,9,2017),1000000,"Programador"));
		miEmpresa.adicionarEmpleadoFijo(new Fijo(5263,"Martica",new Fecha(5,11,2018),5000000,"Ing.CCIA"));
	
		System.out.println("LISTA DE EMPLEADOS A COMISIÓN");
		miEmpresa.mostrarEmpleadoComision();
		System.out.println("LISTA DE EMPELADOS SALARIO FIJO");
		miEmpresa.mostrarEmpleadoFijo();
	
	}
	
}
