package clases;

import org.json.JSONException;
import org.json.JSONObject;

public class Direccion {
	


	private String calle;
	private int numero;
	
	
	
	public Direccion(){
		setCalle(null);
		setNumero(0);
		
	}
	public Direccion(String calle, int numero){
		setCalle(calle);
		setNumero(numero);
	}
	
	public String getCalle(){
		return this.calle;
	}
	public void setCalle(String calle){
		this.calle=calle;
		
	}
	
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero){
		this.numero=numero;
	}
	
	
	@Override
	public String toString() {
		return "Direccion [Calle=" + calle + ", Numero=" + numero + "]";
	}
	
	JSONObject getFormatoJSON () throws JSONException{
		
		JSONObject objetoJSON = new JSONObject();
		
		objetoJSON.put("Calle", getCalle());
		objetoJSON.put("Numero", getNumero());
		
		return objetoJSON;
	}
	
	

}
