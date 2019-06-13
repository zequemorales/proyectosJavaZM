package clases;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Programain {
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Ezequiel", "Morales", 23);
		Persona p2 = new Persona("Juan", "Martinez", 22);
		Persona p3 = new Persona("Martin", "Perez", 30);
		Persona p4 = new Persona("Daniel", "Morales", 50);
		
		Direccion d1 = new Direccion("Mariani", 5208);
		
		p1.agregarDireccion(d1);
		
		Direccion d2 = new Direccion("Luro", 3280);
		p2.agregarDireccion(d2);
		
		Direccion d3 = new Direccion("Independencia", 1500);
		p3.agregarDireccion(d3);
		
		ArrayList<Persona> ListadoPersonas = new ArrayList<>();
		
		ArrayList<Persona> ListadoCopiaPersonas = new ArrayList<>();
		
		ListadoPersonas.add(p1);
		ListadoPersonas.add(p2);
		ListadoPersonas.add(p3);
		ListadoPersonas.add(p4);
		
		JSONArray jsonArray_Personas= new JSONArray();
		
		for ( Persona p : ListadoPersonas){
			try {
				jsonArray_Personas.put(p.getFormatoJSON());
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
		
		JsonUtiles.grabar(jsonArray_Personas);
		
		/// LECTURA DE JSON Y LO PASAMOS A OBJETOS 
		
		try {
			//// Leemos un archivo json y lo guardamos en un arreglo json . 
			String lectura = new String(JsonUtiles.leer());
			
			JSONArray arregloJSON_LECTURA = new JSONArray(lectura);
			
			//  MUESTRA LA CANTIDAD DE ELEMNTOS QUE HAY EN EL JSON ARRAY.
			
			System.out.println(arregloJSON_LECTURA.length());
			
			
			
			for(int i=0; i < arregloJSON_LECTURA.length();i++){ // RECORREMOS EL ARRAYJSON CON EL .LENGTH
				// CAPTURAMOS TODOS LOS OBJETOS QUE TIENE EL ARCHIVO LEIDO Y ALMACENADOS EN EL ARRAY Y LOS CREAMOS
				Persona p = new Persona();
				JSONObject objetoCopia = arregloJSON_LECTURA.getJSONObject(i);
				
				
				p.setNombre(objetoCopia.getString("Nombre"));
				
				p.setApellido(objetoCopia.getString("Apellido"));
				
				p.setEdad(objetoCopia.getInt("Edad"));
				
				
				for( int cantDir=0; cantDir<objetoCopia.getJSONArray("Direcciones").length(); cantDir++){
					JSONObject objetoCOpiaDireccion = objetoCopia.getJSONArray("Direcciones").getJSONObject(cantDir);
					Direccion d = new Direccion();
					
					d.setCalle(objetoCOpiaDireccion.getString("Calle"));
					d.setNumero(objetoCOpiaDireccion.getInt("Numero"));
			
					p.agregarDireccion(d);
				}
				
				ListadoCopiaPersonas.add(p);
				
				
			}
			
			
		} catch (Exception e) {
			
		}
		
		
		
		System.out.println(ListadoCopiaPersonas.size());
		
		System.out.println("Listado personas");
		System.out.println(ListadoPersonas.toString());

		System.out.println("Listado COPIA personas");
		System.out.println(ListadoCopiaPersonas.toString());
		
		
		
		
		
	}
	
	

}
