package clases;

import org.json.JSONException;
import org.json.JSONObject;

import interfaces.IDarAsistencia;
import interfaces.IPrePartido;

public class Masajista extends IntegrantePersona implements IDarAsistencia {
	private String titulo;
	private int aniosExperiencia;
	
	public Masajista(String nombreA, String apellidoA, int edadA, String tituloA, int aniosExperienciaA){
		super(nombreA, apellidoA, edadA);
		setTitulo(tituloA);
		setAniosExperiencia(aniosExperienciaA);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String viajar() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "Masajista-->" + "Viajando";
	}

	@Override
	public String concentrar() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "Masajista-->" + "Concentrando";
	}

	@Override
	public String darAsistencia() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "Masajista-->" + "Dando asistencia";
	}
	
	public JSONObject getFormatoJSON() throws JSONException
	{
		JSONObject jsonObject = super.getFormatoJSON();
		jsonObject.put("titulo", getTitulo());
		jsonObject.put("anios experiencia" , getAniosExperiencia());
		
		return jsonObject;
		
	}
	

}
