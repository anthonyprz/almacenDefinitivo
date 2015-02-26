package almacendefinitivo;

public class Direccion {

	private String ciudad;
	private int codigoPostal;
	private String calle;
	private int numero;
	
	public Direccion(){}
	public Direccion (String linedDireccion, String separator){
	
		String[] strArray = linedDireccion.split(separator);
		this.setCiudad(strArray[0]);
		this.setCodigoPostal(Integer.parseInt(strArray[1]));
		this.setCalle(strArray[2]);
		this.setNumero(Integer.parseInt(strArray[3]));
	}
	
	
	//-------------getters-------------
	public String getCiudad (){
	return this.ciudad;
	}
	public int getCodigoPostal(){
	return this.codigoPostal;
	}
	public String getCalle (){
	return this.calle;
	}
	public int getNumero(){
	return this.numero;
	}
	//-------------setters----------------
	public void setCiudad (String ciudad){
	this.ciudad = ciudad;
	}
	public void setCodigoPostal (int codigoPostal){
	this.codigoPostal = codigoPostal;
	}
	public void setCalle (String calle){
	this.calle = calle;
	}
	public void setNumero (int numero){
	this.numero = numero;
	}
	public String formattedDireccion(){
		
		String formattedDireccion = 
		"Direccion:\n" +
		this.ciudad + " " +
		this.codigoPostal + " " +
		this.calle + " " +
		this.numero;
		
		return formattedDireccion;
	}
}
