package almacendefinitivo;
import java.util.ArrayList;
import java.util.Scanner;
public class Productos {
	
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
	public Productos(Scanner sc){
		System.out.println("cuantos productos quieres insertar?");
		int seleccion = sc.nextInt();
		for (int i = 0; i<seleccion;i++){
		
			System.out.println("que producto quieres insertar?");
			System.out.println("manzana------------1");
			System.out.println("leche--------------2");
			System.out.println("lechuga------------3");
			
			switch(sc.nextInt()){
			case 1: 
					Manzana manzana = new Manzana(sc);
					listaProductos.add(manzana);
					break;
			case 2: 
					Leche leche = new Leche(sc);
			    	listaProductos.add(leche);
			        break;
			case 3:
					Lechuga lechuga = new Lechuga(sc);
			   	    listaProductos.add(lechuga);
			        break;
			default:
					System.out.println("no has insertado una opcion correcta");
					break;
			}
		}
	}
	public void mostrarProductos(){
		if (listaProductos.size() == 0){
			System.out.println("no se han cargado los productos");
		}
		for (int i = 0; i <listaProductos.size();i++){
			Producto producto = listaProductos.get(i);
			producto.mostrarProducto();
		}
	}
}
