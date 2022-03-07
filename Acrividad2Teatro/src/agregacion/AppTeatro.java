package agregacion;
/**
 * programa:
 * @author william frasser
 * @since
 * @version
 *
 */
public class AppTeatro {

	
	public static void main(String[] args) {
		// Se crea una instancia de la clase teatro
		Teatro miTeatro =new Teatro("Cinema 5");
		//Se llama al método crearTaquilla, y se crea un objeto de la 
		//cñase Taquilla por cmposición
		miTeatro.crearTaquilla(30000);
		
		Pelicula miPelicula =new Pelicula("Matrix","Todos");
		
		miTeatro.pelicula(miPelicula);
		
		System.out.println(miTeatro);
		
		Pelicula miPelicula1 =new Pelicula("El rey de la selva","Todos");
		miTeatro.pelicula(miPelicula1);

		System.out.println(miTeatro);
		
		
		miTeatro.getTaquilla().setValorFuncion(30000);
		
		System.out.println("Nombre del teatro " + miTeatro.getNombre());
		System.out.println("valor de la Función " + miTeatro.getTaquilla().getValorFuncion());
			
	}
	
}






