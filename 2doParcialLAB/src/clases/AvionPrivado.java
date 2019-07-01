package clases;

import org.json.JSONException;
import org.json.JSONObject;

import interfaces.IComida;
import interfaces.IMantas;
import interfaces.IMundial;

public class AvionPrivado extends Avion implements IComida, IMantas, IMundial {
	private boolean jacuzzi;
	private String claveWIFI;
	

	public AvionPrivado(int id, String nombreDeModelo, String marca, int capacidadCombustible, String tipoMotor,
			int cantAsientos, boolean jacu, String clave) {
		super(id, nombreDeModelo, marca, capacidadCombustible, tipoMotor, cantAsientos);
		setJacuzzi(jacu);
		setClaveWIFI(clave);
	}

	public boolean getTieneJacuzzi() {
		return jacuzzi;
	}
	
	public void setJacuzzi(boolean jacuzzi) {
		this.jacuzzi = jacuzzi;
	}
	
	public String getClaveWIFI() {
		return claveWIFI;
	}
	
	public void setClaveWIFI(String claveWIFI) {
		this.claveWIFI = claveWIFI;
	}

	@Override
	public String darMantas() {
		return "Se entregaron mantas";
	}

	@Override
	public String servirComida() {
		return "Se sirvio la comida";
	}

	@Override
	public boolean sePuedeverMundial(boolean SePuedeOno) {
		if(SePuedeOno){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public String VerMundial(boolean SePuedeOno) {
		if(sePuedeverMundial(SePuedeOno)){
			return "Viendo Mundial";
		}
		else{
			return "No se puede ver el mundial";
		}
		
	}

	@Override
	public String toString() {
		return super.toString()+ "AvionPrivado [jacuzzi=" + jacuzzi + ", claveWIFI=" + claveWIFI + "]";
	}
	
	public JSONObject getFormatoJSON()
	{
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = super.getFormatoJSON();
			jsonObject.put("Tiene Jacuzzi", getTieneJacuzzi());
			jsonObject.put("Clave WIFI", getClaveWIFI());
	
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonObject;
		
	}
}
