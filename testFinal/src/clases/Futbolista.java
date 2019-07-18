package clases;

import org.json.JSONException;
import org.json.JSONObject;

import interfaces.IJugarPartidos;
import interfaces.IPrePartido;

public class Futbolista extends IntegrantePersona implements IJugarPartidos {
	private int numeroCamiseta;
	private String puesto;

	public Futbolista(String nombreA, String apellidoA, int edadA, int numeroCamisetaA, String puestoA) {
		super(nombreA, apellidoA, edadA);
		setNumeroCamiseta(numeroCamisetaA);
		setPuesto(puestoA);

	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String viajar() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "FUTBOLISTA-->" + "Viajando";
	}

	@Override
	public String concentrar() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "FUTBOLISTA-->" + "Concentrando";
	}

	@Override
	public String jugarPartido() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "FUTBOLISTA-->" + "Jugando Partido";
		}
	
	
	public JSONObject getFormatoJSON() throws JSONException
	{
		JSONObject jsonObject = super.getFormatoJSON();
		jsonObject.put("numero camiseta", getNumeroCamiseta());
		jsonObject.put("puesto" , getPuesto());
		
		return jsonObject;
		
	}

}
