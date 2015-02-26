package almacendefinitivo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException,UnsupportedEncodingException {
		
		int seleccion;
		Scanner sc = new Scanner(System.in);
		Productos productos = null;
		if (args.length == 0) {
		System.out.println("El número de argumentos no es válido:");
		System.out.println("java main.java <fichero_distribuidores>");
		System.exit(-1);
		}
		//Leemos la lista de distribuidores del fichero.
		Distribuidores.leerDistribuidores(args[0]);
		
		
	//	 Distribuidores.mostrarDistribuidores();
		
		//funciona correctamente
		
		do{
			System.out.println("¿Que quieres hacer?");
			System.out.println("mostrar distribuidres----------1");
			System.out.println("solicitar productos------------2");
			System.out.println("mostrar productos--------------3");
			System.out.println("salir del programa-------------4");
			
			seleccion = sc.nextInt();
			switch(seleccion){
			case 1:
				   Distribuidores.mostrarDistribuidores();
				   break;
			case 2:
				   productos  = new Productos(sc);
				   break;
			case 3:
				  if (productos == null){
				System.out.println("no hay productos cargados");
			   }
			  productos.mostrarProductos();
			  break;
			case 4:
				   break;
			default:
					System.out.println("no has insertado una opción correcta");
			}
		}
		while(seleccion != 4);
		System.out.println("programa finalizado");
		sc.close();
		
	}

}
