package clases;

import interfaces.ILogin;

public class AvionMilitar extends Avion implements ILogin {
	private int sistemaArmas;
	private int cantBalas;
	
	public AvionMilitar(int id, String nombreDeModelo, String marca, int capacidadCombustible, String tipoMotor,
			int cantAsientos, int sitArma, int cantBalas) {
		super(id, nombreDeModelo, marca, capacidadCombustible, tipoMotor, cantAsientos);
		setSistemaArmas(sitArma);
		setCantBalas(cantBalas);
	}

	
	@Override
	public String toString() {
		return super.toString() + "AvionMilitar [sistemaArmas=" + sistemaArmas + ", cantBalas=" + cantBalas + "]";
	}


	public String getSistemaArmasString() {
		if(sistemaArmas==1){
			return "AIRE-AIRE";
		}
		else{
			return "AIRE-TIERA";
		}
	}



	public void setSistemaArmas(int sistemaArmas) {
		this.sistemaArmas = sistemaArmas;
	}



	public int getCantBalas() {
		return cantBalas;
	}



	public void setCantBalas(int cantBalas) {
		this.cantBalas = cantBalas;
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


	
	

}
