package almacendefinitivo;

public class Contacto {
	private String nombre;
	private String apellido;
	private int numTelefonico;
	private int edad;
	
	public Contacto(){}
	
	public Contacto(String linedContacto, String separator){
		
		String [] strArray = linedContacto.split(separator);
		this.setNombre(strArray[0]);
		this.setApellido(strArray[1]);
		this.setNumTelefonico(Integer.parseInt(strArray[2]));
		this.setEdad(Integer.parseInt(strArray[3]));
		
	}
	

	//-------------getters-------------
	public String getNombre(){
	return this.nombre;
	}
	public String getApellido(){
	return this.apellido;
	}
	public int getNumTelefonico(){
	return this.numTelefonico;
	}
	public int getEdad(){
	return this.edad;
	}
	//-------------setters-------------
	public void setNombre (String nombre){
	this.nombre = nombre;
	}
	public void setApellido (String apellido){
	this.apellido = apellido;
	}
	public void setNumTelefonico (int numTelefonico){
	this.numTelefonico = numTelefonico;
	}
	public void setEdad (int edad){
	this.edad = edad;
	}
	
	public String formattedContacto(){
		
		String formattedContacto =
		"nombre y apellido: " + this.nombre + " " +this.apellido + "\n" +
		this.numTelefonico + 
		this.edad;
		
		return formattedContacto;
	}
}
