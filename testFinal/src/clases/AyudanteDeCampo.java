package clases;

import org.json.JSONException;
import org.json.JSONObject;

import interfaces.IEntrenamientos;
import interfaces.IJugarPartidos;
import interfaces.IPrePartido;

public class AyudanteDeCampo extends IntegrantePersona implements IEntrenamientos, IJugarPartidos {
	private String metodologia;
	
	public AyudanteDeCampo ( String nombreA, String apellidoA, int edadA, String metodologiaA){
		super(nombreA, apellidoA, edadA);
		setMetodologia(metodologiaA);
	}

	public String getMetodologia() {
		return metodologia;
	}

	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}

	@Override
	public String prepararEntrenamiento() {
		
		return getNombre()+getApellido() + "AYUDANTE DE CAMPO-->" + "Preparando entrenamiento";
	}

	@Override
	public String viajar() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "AYUDANTE DE CAMPO-->" + "Viajando";
	}

	@Override
	public String concentrar() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "AYUDANTE DE CAMPO-->" + "Concentrando";
	}
	
	@Override
	public String jugarPartido() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "AYUDANTE DE CAMPO-->" + "Jugando Partido";
	}
	
	public JSONObject getFormatoJSON() throws JSONException
	{
		JSONObject jsonObject = super.getFormatoJSON();
		jsonObject.put("metodologia", getMetodologia());
	
		return jsonObject;
		
	}
	

}
