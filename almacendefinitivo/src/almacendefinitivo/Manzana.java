package almacendefinitivo;

import java.util.Scanner;

public class Manzana extends Producto {
	
	private String tipo;
	private String color;
	
	public Manzana(Distribuidor distribuidor, String marca, Double precio, String procedencia, String tipo, String color){
		super(distribuidor, marca, precio, procedencia);
		this.tipo = tipo;
		this.color = color;
	}
	public Manzana(Scanner sc){
		super(sc);
		System.out.println("tipo de manzana? (delicious-golden-red):");
		this.setTipo(sc.next());
		System.out.println("color de la manzana?");
		this.setColor(sc.next());
	}
//-------------getters-------------
		public String getTipo(){
			return this.tipo;
		}
		
		public String getColor(){
			return this.color;
		}
//-------------setters----------------
		public void setTipo (String tipo){
			this.tipo = tipo;
		}
		public void setColor (String color){
			this.color = color;
		}		
@Override
	public void mostrarProducto(){
	System.out.println("manzana");
	super.mostrarProducto();
	System.out.println("\ttipo: " + this.tipo);
	System.out.println("\tcolor: " + this.color);
	
	}
}		