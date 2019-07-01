package clases;

import org.json.JSONException;
import org.json.JSONObject;

import interfaces.IAviones;

public abstract class Avion implements IAviones {
	private int idAvion;
	private String nombreDeModelo;
	private String marca;
	private int capacidadCombustible;
	private String tipoMotor;
	private int cantidadAsientos;

	public Avion(int id,String nombreDeModelo, String marca, int capacidadCombustible, String tipoMotor, int cantAsientos) {
		setIdAvion(id);
		setNombreDeModelo(nombreDeModelo);
		setMarca(marca);
		setCapacidadCombustible(capacidadCombustible);
		setTipoMotor(tipoMotor);
		setCantidadAsientos(cantAsientos);
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", nombreDeModelo=" + nombreDeModelo + ", marca=" + marca
				+ ", capacidadCombustible=" + capacidadCombustible + ", tipoMotor=" + tipoMotor + ", cantidadAsientos="
				+ cantidadAsientos + "]";
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getNombreDeModelo() {
		return nombreDeModelo;
	}

	public void setNombreDeModelo(String nombreDeModelo) {
		this.nombreDeModelo = nombreDeModelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public String despegar() {
		return "Despegando";
	}

	public String volar() {
		return "Volando";
	}

	public String aterrizar() {
		return "Atarrizando";
	}
	
	
	public String getFormatoJSON()
	{
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("id Avion", getIdAvion());
			jsonObject.put("nombre Modelo", getNombreDeModelo());
			jsonObject.put("Marca", getMarca());
			jsonObject.put("Capacidad Combustible", getCapacidadCombustible());
			jsonObject.put("Tipo Motor", getTipoMotor());
			jsonObject.put("Cantidad de Asientos", getCantidadAsientos());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonObject;
		
	}

}
