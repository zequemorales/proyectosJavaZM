package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import excepciones.AeropuertoFULLExcepcion;
import interfaces.IListados;

public class Aeropuerto{
	private String nombre;
	private String codigoInternacional;
	private String direccion;
	private int CapacidadDeOperacion; // cantidad de aviones que pueden
										// transitar por sus pistas
	private HashMap<String,Hangar>ListadoHangares;  
	
	public Aeropuerto(String nombre, String codigoInternacional, String dir , int capacidad){
		setNombre(nombre);
		setCodigoInternacional(codigoInternacional);
		setDireccion(dir);
		setCapacidadDeOperacion(capacidad);
		ListadoHangares=new HashMap<>();
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoInternacional() {
		return codigoInternacional;
	}
	public void setCodigoInternacional(String codigoInternacional) {
		this.codigoInternacional = codigoInternacional;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCapacidadDeOperacion() {
		return CapacidadDeOperacion;
	}
	public void setCapacidadDeOperacion(int capacidadDeOperacion) {
		CapacidadDeOperacion = capacidadDeOperacion;
	}
	
	/**
	  * Agrega un elemento
	  * @return true si se agrego y false si no.
	  */

	public boolean agregarListado(String clave, Hangar valor) {
		boolean flag=false;
		if(!ListadoHangares.containsKey(clave)){
			
			ListadoHangares.put(clave, valor);
			flag=true;
		}
		return flag;
	}
	
	public <K, V> void agregarAvion(Hangar <K,V> h ,  Avion a){
		try {
			if(contarAviones()<getCapacidadDeOperacion()){
				ListadoHangares.get(h.getTipoAvion()).agregarAvionAlHangar(a.getIdAvion(), a);
			}
			else
				throw new AeropuertoFULLExcepcion("AEROPUERTO FULL") ;
		
		} catch (AeropuertoFULLExcepcion e) {
			
			System.out.println(e.getMessage());

		}
		
	}
	
	public String listarTodosLosHangares(){
		return toString();
		
	}
	public void listarHangar (){
		
	}
	

	public int contarAviones (){
		int cantadorAviones=0;
		
		Iterator<Map.Entry<String, Hangar>> entradas = ListadoHangares.entrySet().iterator();
		
		while (entradas.hasNext()) {
		    Map.Entry<String, Hangar> entrada = entradas.next();
		    cantadorAviones+=entrada.getValue().cantAviones();
		}
		return cantadorAviones;
	}
	

	/**
	 * Borra un elemento
	 * @return true si se borro y false si no.
	 */

	public boolean eliminarListado(String clave) {
		boolean flag=false;
		if(ListadoHangares.get(clave)!=null){
			ListadoHangares.remove(clave);
			flag=true;
		}
		return flag;
	}
	/**
	 * Listar
	 * @return en un String toda la coleccion
	 */

	public String toString() {
		Iterator<Map.Entry<String, Hangar>> entradas = ListadoHangares.entrySet().iterator();
		StringBuilder str = new StringBuilder();
		str.append("( Clave |"+" Valor )"+"\r\n");
		while (entradas.hasNext()) {
		    Map.Entry<String, Hangar> entrada = entradas.next();
		    str.append("\n("+entrada.getKey()+" |"+entrada.getValue()+")\n");
		}
		return str.toString();
	}
	
	public Hangar buscar(String clave) {
		return ListadoHangares.get(clave);
		}
	
	
	

}
