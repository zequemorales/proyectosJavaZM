package clases;

public class Cliente {
	private int idCliente;
	private String Nombre;
	private String Apellido;
	
	
	public Cliente(int idCliente, String nombre, String apellido) {
		setIdCliente(idCliente);
		setNombre(nombre);
		setApellido(apellido);
				
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public String mostrarCliente(){
		return "INFO CLIENTE\n[ID CLIENTE=" + idCliente + ", NOMBRE CLIENTE=" + Nombre + "APELLIDO CLIENTE=" + Apellido +"]";
	}
	public String mostrarNombreCliente(){
		return " [NOMBRE  = " + Nombre + "APELLIDO"+ Apellido + "]";
	}
	
	
	
	

}
