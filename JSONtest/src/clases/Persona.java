package clases;

import java.util.ArrayList;
import org.json.*;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<Direccion>ListadoDirecciones;
	
	
	public Persona(){
		
		setNombre(null);
		setApellido(null);
		setEdad(0);
		ListadoDirecciones= new ArrayList<>();
	}
	public Persona(String nombre, String apellido, int edad){
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
		ListadoDirecciones = new ArrayList<>();
	}
	

	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){	
		this.nombre=nombre;
	}
	
	public String getApellido(){
		return apellido;
		
	}
	public void setApellido ( String apellido){
		this.apellido=apellido;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	@Override
	public String toString() {
		return "Persona [Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", ListadoDirecciones="
				+ listarDirecciones()+ "] \n";
	}
	
	
	///// METODOS PARA EL ARRAY LIST
	
	
	// agregar
	public boolean agregarDireccion(Direccion d){
	boolean flag=false;
	if (ListadoDirecciones.add(d)) {
		flag=true;
	}
	return flag;
	}
	
	public String listarDirecciones (){
		String CadenaDirecciones="";
		for ( Direccion d : ListadoDirecciones){
			CadenaDirecciones +=d.toString();
		}
		return CadenaDirecciones;
	}
	
	
	/// JSON
	
	public JSONObject getFormatoJSON() throws JSONException{
		
		JSONObject objetoJSON = new JSONObject();
		
		objetoJSON.put("Nombre", getNombre());
		objetoJSON.put("Apellido", getApellido());
		objetoJSON.put("Edad", getEdad());
		JSONArray jsonArray_direcciones = new JSONArray();
		for ( Direccion d : ListadoDirecciones){
			jsonArray_direcciones.put(d.getFormatoJSON());
		}
		objetoJSON.put("Direcciones", jsonArray_direcciones);
		
		
		return objetoJSON;
		
	}

}
