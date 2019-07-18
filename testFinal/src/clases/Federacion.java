package clases;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import excepciones.CupoEntrenadoresException;
import excepciones.CupoFutbolistasException;
import generico.ListadoEquipo;


public class Federacion {
	
	private String nombre;
	private String fechaFundacion;
	private int cantCopasMundiales;
	private ListadoEquipo<IntegrantePersona>Listado;
	
	public Federacion(String nombreA, String fechaFundacionA, int cantCopasMundialesA ){
		setNombre(nombreA);
		setFechaFundacion(fechaFundacionA);
		setCantCopasMundiales(cantCopasMundialesA);
		Listado=new ListadoEquipo<IntegrantePersona>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(String fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	public int getCantCopasMundiales() {
		return cantCopasMundiales;
	}
	public void setCantCopasMundiales(int cantCopasMundiales) {
		this.cantCopasMundiales = cantCopasMundiales;
	}
	
	public boolean agregarFutbolista ( Futbolista f) throws CupoFutbolistasException{
		boolean flag=false;
		if ( contarFutbolistas() == 23){
			throw new CupoFutbolistasException("YA HAY 23 JUGADORES");
		}
		else { 
			Listado.agregar(f);
			flag=true;
		}
		return flag;
	}
	
	public boolean agregarEntrenador ( Entrenador e) throws CupoEntrenadoresException{
		boolean flag=false;
		if ( contarEntrenadores() ==1){
			throw new CupoEntrenadoresException("YA EXISTE 1 ENTRENADOR");
		}
		else { 
			Listado.agregar(e);
			flag=true;
		}
		return flag;
	}
	
	public boolean agregarAyudante ( AyudanteDeCampo a){
		boolean flag=false;
		if( Listado.agregar(a)){
			
			flag=true;
		}
		return flag;
	}
	
	public boolean agregarMasajista ( Masajista m){
		boolean flag=false;
		if( Listado.agregar(m)){
			
			flag=true;
		}
		return flag;
	}
	

	public int contarFutbolistas (){
		int cont=0;
		for(IntegrantePersona integrante : Listado.devuelveLista()){
			if(integrante instanceof Futbolista){ 
				cont+=1;
			}
		}
		return cont;
	}
	
	public int contarEntrenadores (){
		int cont=0;
		for(IntegrantePersona integrante : Listado.devuelveLista()){
			if(integrante instanceof Entrenador){ 
				cont+=1;
			}
		}
		return cont;
	}
	
	public ArrayList <IntegrantePersona> devuelveLista(){
		return Listado.devuelveLista();
	}
	
	public JSONObject getFormatoJSON() throws JSONException
	{
		JSONObject jsonObject = new JSONObject();
		
		return jsonObject;
		
	}
	

}
