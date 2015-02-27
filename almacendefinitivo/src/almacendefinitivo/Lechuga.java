package almacendefinitivo;

import java.util.Scanner;

public class Lechuga extends Producto {
	public Lechuga(Distribuidor distribuidor, String marca, Double precio, String procedencia){
		super(distribuidor, marca, precio, procedencia);
	}
	public Lechuga(Scanner sc){
		super(sc);
	}
	@Override
	public void mostrarProducto(){
	System.out.println("Lechuga");
	super.mostrarProducto();	
	}
}
