package almacendefinitivo;
import java.util.Scanner;
public abstract class Producto {
	private Distribuidor distribuidor;
	private String marca;
	private Double precio;
	private String procedencia;
	
	public Producto(Distribuidor distribuidor, String marca, Double precio, String procedencia){
		this.distribuidor = distribuidor;
		this.marca = marca;
		this.precio = precio;
		this.procedencia = procedencia;
	}
	public Producto(Scanner sc){
		System.out.println("dime la marca");
		this.setMarca(sc.next());
		System.out.println("dime el precio");
		this.setPrecio(sc.nextDouble());
		System.out.println("dime la procedencia");
		this.setProcedencia(sc.next());
		System.out.println("dime el distribuidor del producto");
		this.setDistribuidor(Distribuidores.buscarDistribuidor(sc.next()));
	}
	//-------------getters-------------
			public String getMarca(){
				return this.marca;
			}
			public String getProcedencia(){
				return this.procedencia;
			}
			public Double getPrecio(){
				return this.precio;
			}
			public Distribuidor getDistribuidor(){
				return this.distribuidor;
			}
			//-------------setters----------------
			public void setMarca (String marca){
				this.marca = marca;
			}
			public void setProcedencia (String procedencia){
				this.procedencia = procedencia;
			}
			public void setPrecio(Double precio){
				this.precio = precio;
			}
			public void setDistribuidor (Distribuidor distribuidor){
				this.distribuidor = distribuidor;
			}
	public void mostrarProducto(){
		System.out.println("\tmarca: " + this.getMarca());
		System.out.println("\tprecio: " + this.getPrecio());
		System.out.println("\tprocedencia: " + this.getProcedencia());
		System.out.println("\tdistribuidor: " + this.getDistribuidor().getNombre());
	}
}

