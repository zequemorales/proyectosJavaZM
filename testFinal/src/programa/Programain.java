package programa;

import org.json.JSONArray;
import org.json.JSONException;

import clases.AyudanteDeCampo;
import clases.Entrenador;
import clases.Federacion;
import clases.Futbolista;
import clases.IntegrantePersona;
import clases.Masajista;
import excepciones.CupoEntrenadoresException;
import excepciones.CupoFutbolistasException;

public class Programain {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Federacion afa = new Federacion("AFA", "12/12/1980", 5);
		Entrenador entrenador1 = new Entrenador("JUAN", "Martinez", 20, "vertical", "ataque");
		Entrenador entrenador2 = new Entrenador("ezeq", "Martinez", 20, "vertical", "ataque");
		Entrenador entrenador3 = new Entrenador("martin", "Martinez", 20, "vertical", "ataque");

		try {
			afa.agregarEntrenador(entrenador1);

			
		} catch (CupoEntrenadoresException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		try {
			afa.agregarEntrenador(entrenador2);
			
		} catch (CupoEntrenadoresException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		try {
			afa.agregarEntrenador(entrenador3);
			
		} catch (CupoEntrenadoresException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		
		
		//JUGADORES
		
		Futbolista f21 = new Futbolista("PEPE", "AP", 12, 1, "arquero");
		Futbolista f22 = new Futbolista("PEPE", "AP", 12, 1, "arquero");
		Futbolista f23 = new Futbolista("PEPE", "AP", 12, 1, "arquero");
		Futbolista f24 = new Futbolista("PEPE", "AP", 12, 1, "arquero");
		Futbolista f25 = new Futbolista("PEPE", "AP", 12, 1, "arquero");
	
		
		
		int cantJug=0;
		while(cantJug<22){
			
			try {
				Futbolista f = new Futbolista("PEPE", "AP", 12, 1, "arquero");
				afa.agregarFutbolista(f);
				cantJug++;
			} catch (CupoFutbolistasException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
		
		try {
			afa.agregarFutbolista(f22);
		} catch (CupoFutbolistasException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		try {
			afa.agregarFutbolista(f23);
		} catch (CupoFutbolistasException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		try {
			afa.agregarFutbolista(f24);
		} catch (CupoFutbolistasException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		AyudanteDeCampo a1 = new AyudanteDeCampo("ezequiel", "Morales", 10, "vertical");
		
		afa.agregarAyudante(a1);
		
		Masajista m1 = new Masajista("fran", "narichi", 20, "kinesiologo", 2);
		afa.agregarMasajista(m1);
		
		
		
		
		/////// JSONARRAY 
		try{
			JSONArray jsonarrayFederacion = new JSONArray();
			// OBTENEMOS DESDE LA LISTA DE ORDEN
			for(IntegrantePersona integrantes : afa.devuelveLista() ){
				jsonarrayFederacion.put(integrantes.getFormatoJSON());
			}
			
			String salida= jsonarrayFederacion.toString();
			System.out.println(salida);
		}
		catch(JSONException e){
			e.getMessage();
			
		}

	}

}
