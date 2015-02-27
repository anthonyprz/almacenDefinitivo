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
		do{	
			System.out.println("tipo de manzana? (delicious-golden-red):");
			try{
				this.setTipo(sc.next());
			}catch(Exception e){
				System.out.println("erro" + e);
			}
		}while (tipo == null);	
			System.out.println("color de la manzana?");
			this.setColor(sc.next());
		
		
	}
	 public void setTipo(String tipo) throws Exception {
		 switch (tipo){
			 case "DELICIOUS":
			 case "delicious":
			 case "GOLDEN":
			 case "golden":
			 case "RED":
			 case "red":
			 this.tipo = tipo;
			 break;
			 default:
			 throw new Exception("Tipos de manzana permitidos: DELICIOUS, GOLDEN, RED");
		 }
	}
//-------------getters-------------
		public String getTipo(){
			return this.tipo;
		}
		
		public String getColor(){
			return this.color;
		}
//-------------setters----------------
		
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