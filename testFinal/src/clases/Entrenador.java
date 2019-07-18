package clases;

import interfaces.IEntrenamientos;
import interfaces.IJugarPartidos;
import interfaces.IPrePartido;

public class Entrenador extends IntegrantePersona implements IEntrenamientos, IJugarPartidos {
	private String sistemaDeJuego;
	private String estilo;
	
	public Entrenador ( String nombreA, String apellidoA, int edadA, String sistemaDeJuegoA, String estiloA){
		super(nombreA, apellidoA, edadA);
		setSistemaDeJuego(sistemaDeJuegoA);
		setEstilo(estiloA);
	}
	
	public String getSistemaDeJuego() {
		return sistemaDeJuego;
	}
	public void setSistemaDeJuego(String sistemaDeJuego) {
		this.sistemaDeJuego = sistemaDeJuego;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	@Override
	public String prepararEntrenamiento() {
		
		return getNombre()+getApellido() + "ENTRENADOR-->" + "Preparando entrenamiento";
	}

	@Override
	public String viajar() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "ENTRENADOR-->" + "Viajando";
	}

	@Override
	public String concentrar() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "ENTRENADOR-->" + "Concentrando";
	}

	@Override
	public String jugarPartido() {
		// TODO Apéndice de método generado automáticamente
		return getNombre() + getApellido() + "ENTRENADOR-->" + "Jugando Partido";
	}
}
