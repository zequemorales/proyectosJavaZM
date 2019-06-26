package clases;

import java.util.ArrayList;
import java.util.HashMap;

public class Aeropuerto {
	private String nombre;
	private int codigoInternacional;
	private String direccion;
	private int CapacidadDeOperacion; // cantidad de aviones que pueden
										// transitar por sus pistas
	private HashMap<String,Hangar>ListadoHangares;  
	
	public Aeropuerto(String nombre, int codigoInternacional, String dir , int capacidad){
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
	public int getCodigoInternacional() {
		return codigoInternacional;
	}
	public void setCodigoInternacional(int codigoInternacional) {
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
	
	
	

}
