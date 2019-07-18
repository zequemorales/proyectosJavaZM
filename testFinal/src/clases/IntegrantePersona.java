package clases;

import org.json.JSONException;
import org.json.JSONObject;

import interfaces.IPrePartido;

public abstract class IntegrantePersona implements IPrePartido{
	private String nombre;
	private String apellido;
	private int edad;
	
	public IntegrantePersona(String nombreA, String apellidoA, int edadA){
		setNombre(nombreA);
		setApellido(apellidoA);
		setEdad(edadA);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public JSONObject getFormatoJSON() throws JSONException
	{
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("nombre", getNombre());
		jsonObject.put("apellido", getApellido());
		jsonObject.put("edad", getEdad());
		
		return jsonObject;
		
	}

}
