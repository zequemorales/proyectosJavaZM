package clases;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import interfaces.IComida;
import interfaces.IListados;
import interfaces.IMantas;

public class AvionComercial extends Avion implements IListados, IComida, IMantas{
	
	private int cantidadAzafatas;
	private ArrayList<String> listaDeServicios;

	public AvionComercial(int id,String nombreDeModelo, String marca, int capacidadCombustible, String tipoMotor,
			int cantAsientos, int cantAza) {
		super(id,nombreDeModelo, marca, capacidadCombustible, tipoMotor, cantAsientos);
		setCantidadAzafatas(cantAza);
		listaDeServicios= new ArrayList<>();
	}
	
	/**
	 * Agrega un servicio a la lista
	 * @param servicio
	 * el servicio a agregar
	 * @return true si se agrega, false si ya existe o no se puede
	 */
	public boolean agregarListado(String servicio){
		boolean flag=false;
		if(!existeEnListado(servicio)){
			if(	listaDeServicios.add(servicio)){
				flag=true;
			}
		}
		return flag;
	}
	
	@Override
	public String toString() {
		return super.toString() + "AvionComercial [cantidadAzafatas=" + cantidadAzafatas + ", listaDeServicios=" + listar() + "]";
	}

	public boolean eliminarListado(String servicio){
		boolean flag=false;
		
		if(existeEnListado(servicio)){
			if(	listaDeServicios.remove(servicio)){
				flag=true;
			}
		}
		return flag;
	}
	
	public String listar (){
		StringBuilder str = new StringBuilder();
		int i=1;
		for(String s : listaDeServicios ){
			str.append("SERVICIO Nº "+ i+ ": " + s + "||");
			i++;
		}
		return str.toString();
	}

	public int getCantidadAzafatas() {
		return cantidadAzafatas;
	}

	public void setCantidadAzafatas(int cantidadAzafatas) {
		this.cantidadAzafatas = cantidadAzafatas;
	}
	
	public boolean existeEnListado(String servicio){
		boolean flag=false;
		for(int i =0; i<listaDeServicios.size();i++){
			if(listaDeServicios.contains(servicio)){
				flag=true;
			}
		}
		return flag;
	}

	@Override
	public String darMantas() {
		return "Se entregaron mantas";
	}

	@Override
	public String servirComida() {
		return "Se sirvio la comida";
	}
	
	public String getFormatoJSON()
	{
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = super.getFormatoJSON();
			jsonObject.put("cantidad de Azafatas", getCantidadAzafatas());
			JSONArray jsonarrayListadoServicios = new JSONArray();
			for(String servicio : listaDeServicios){
				
				jsonarrayListadoServicios.put(servicio);
			}
			jsonObject.put("Lista Servicios", jsonarrayListadoServicios);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonObject.toString();
		
	}
	
}
