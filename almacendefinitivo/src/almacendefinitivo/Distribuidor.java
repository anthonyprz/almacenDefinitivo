package almacendefinitivo;

public class Distribuidor {
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto contacto;
	
	private static int count = 0;
	
	public Distribuidor(){}
	
	public Distribuidor(String linedDistribuidor, String separator) {
		
		String[] strArray = linedDistribuidor.split(separator);
		this.setNombre(strArray[0]);
		this.setCif(strArray[1]);
		this.setDireccion(new Direccion(strArray[2],";"));
		this.setContacto(new Contacto(strArray[3],";"));
		
	}
	
	//-------------getters-------------
	public String getNombre (){
	return this.nombre;
	}
	public String getCif (){
	return this.cif;
	}
	public Direccion getDireccion(){
	return this.direccion;
	}
	public Contacto getContacto (){
	return this.contacto;
	}
	//-------------setters----------------
	public void setNombre(String nombre){
	this.nombre = nombre;
	}
	public void setCif (String cif){
	this.cif = cif;
	}
	public void setDireccion (Direccion direccion){
	this.direccion = direccion;
	}
	public void setContacto (Contacto contacto){
	this.contacto = contacto;
	}
	public String formattedDistribuidor(){
		String distribuidorStr =
		"nombre Distribuidor: " + this.nombre + "\n" +
		"CIF: " + this.cif + "\n" +
		"\t" + this.direccion.formattedDireccion() + "\n" +
		"\t" + this.contacto.formattedContacto() + "\n";
		
		return distribuidorStr;
	}
	public static void contador (){
		count++;
	}
	public static int cantidad(){
		return count;
	}
}
