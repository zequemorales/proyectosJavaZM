package clases;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import interfaces.ICarga;
import interfaces.IListados;
import interfaces.ILogin;

public class AvionDeCarga extends Avion  implements IListados , ILogin, ICarga{
	private int cantidadDeKG;
	private ArrayList<String> listaDePosiblesProductos;
	

	public AvionDeCarga(int id,String nombreDeModelo, String marca, int capacidadCombustible, String tipoMotor, int cantKG) {
		super(id,nombreDeModelo, marca, capacidadCombustible, tipoMotor, 0);
		setCantidadDeKG(cantKG);
		listaDePosiblesProductos=new ArrayList<>();
		
	}


	public int getCantidadDeKG() {
		return cantidadDeKG;
	}


	public void setCantidadDeKG(int cantidadDeKG) {
		this.cantidadDeKG = cantidadDeKG;
	}

	@Override
	public boolean agregarListado(String posibleProducto){
		boolean flag=false;
		if(!existeEnListado(posibleProducto)){
			if(	listaDePosiblesProductos.add(posibleProducto)){
				flag=true;
			}
		}
		return flag;
	}
	
	@Override
	public boolean eliminarListado(String posibleProducto){
		boolean flag=false;
		
		if(existeEnListado(posibleProducto)){
			if(	listaDePosiblesProductos.remove(posibleProducto)){
				flag=true;
			}
		}
		return flag;
	}
	
	@Override
	public String listar (){
		StringBuilder str = new StringBuilder();
		int i=1;
		for(String s : listaDePosiblesProductos ){
			str.append("POSIBLE PRODUCTO Nº "+ i+ ": " + s + "\n");
			i++;
		}
		return str.toString();
	}



	@Override
	public boolean existeEnListado(String posibleProducto){
		boolean flag=false;
		for(int i =0; i<listaDePosiblesProductos.size();i++){
			if(listaDePosiblesProductos.contains(posibleProducto)){
				flag=true;
			}
		}
		return flag;
	}


	@Override
	public String ingresar(String usuarioIngresado, String contraseniaIngresada) {
		String usuario="admin";
		String contra="admin";
		if(usuario.equals(usuarioIngresado)&&contra.equals(contraseniaIngresada)){
			
			return "Se ingreso correctamente";
		}
		else{
			return "usuario o contra incorrecto";
		}
		
	}
	
	
	@Override
	public String descargarContenido() {
		return "Contenido Descargado";
	}


	@Override
	public String toString() {
		return super.toString() + "AvionDeCarga [cantidadDeKG = " + cantidadDeKG + ", listaDePosiblesProductos = " + listar()
				+ "]";
	}
	
	public JSONObject getFormatoJSON()
	{
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = super.getFormatoJSON();
			jsonObject.put("cantidad de kg", getCantidadDeKG());
			JSONArray jsonarrayListadoProductos = new JSONArray();
			for(String producto : listaDePosiblesProductos){
				jsonarrayListadoProductos.put(producto);
			}
			jsonObject.put("Lista Productos", jsonarrayListadoProductos);
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		
		return jsonObject;
		
	}

}
