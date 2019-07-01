package programa;
import clases.*;
import excepciones.AeropuertoFULLExcepcion;

public class Programain {

	public static void main(String[] args) {
		Aeropuerto astorMDQ = new Aeropuerto("Astor Piazzola", "MDQ", "Ruta 2 km 300", 5);
		
		AvionComercial avionCom1 = new AvionComercial(12, "F100", "Airbus", 100, "Turbina", 300, 5);
		
		AvionDeCarga avionCarga1 = new AvionDeCarga(3, "G200", "boeing", 1000, "Motor",10000);
		
		AvionMilitar avionMilit1 = new AvionMilitar(6, "a300", "Airbus", 2000, "motor", 100, 1, 10000);
		AvionMilitar avionMilit2 = new AvionMilitar(7, "a300", "Airbus", 2000, "motor", 100, 2, 10000);
		
		AvionPrivado avionPriv1 = new AvionPrivado(8, "M1", "BOEING", 1000, "MOTOR", 20, true, "avion123");
		AvionPrivado avionPriv2 = new AvionPrivado(10, "M2", "BOEING", 1000, "MOTOR", 20, true, "avion123");
		
		avionCom1.agregarListado("Ventas a Bordo");
		avionCom1.agregarListado("Peliculas a Bordo");
		
		avionCarga1.agregarListado("Autos");
		avionCarga1.agregarListado("Motos");
		avionCarga1.agregarListado("Comida");
		
		Hangar<Integer, AvionComercial> HangarComercial = new Hangar<Integer,AvionComercial>("Avion Comercial");
		Hangar<Integer, AvionDeCarga> HangarCarga = new Hangar<Integer,AvionDeCarga>("Avion Carga");
		Hangar<Integer, AvionMilitar> HangarMilitar = new Hangar<Integer,AvionMilitar>("Avion Militar");
		Hangar<Integer, AvionPrivado> HangarPrivado = new Hangar<Integer,AvionPrivado>("Avion Privado");
		
		
		astorMDQ.agregarListado(HangarComercial.getTipoAvion(), HangarComercial);
		astorMDQ.agregarListado(HangarCarga.getTipoAvion(), HangarCarga);
		astorMDQ.agregarListado(HangarMilitar.getTipoAvion(), HangarMilitar);
		astorMDQ.agregarListado(HangarPrivado.getTipoAvion(), HangarPrivado);
		
		
		
		System.out.println("AGREGO PRIV 1");
		try {
			astorMDQ.agregarAvion(HangarCarga, avionCarga1);
		} catch (AeropuertoFULLExcepcion e) {
			// TODO Bloque catch generado automáticamente
			System.out.println(e.getMessage());
		}
		try {
			astorMDQ.agregarAvion(HangarComercial, avionCom1);
		} catch (AeropuertoFULLExcepcion e) {
			// TODO Bloque catch generado automáticamente
			System.out.println(e.getMessage());
			}
		try {
			astorMDQ.agregarAvion(HangarMilitar, avionMilit1);
		} catch (AeropuertoFULLExcepcion e) {
			// TODO Bloque catch generado automáticamente
			System.out.println(e.getMessage());
		}
		try {
			astorMDQ.agregarAvion(HangarMilitar, avionMilit2);
		} catch (AeropuertoFULLExcepcion e) {
			// TODO Bloque catch generado automáticamente
			System.out.println(e.getMessage());
		}
		try {
			astorMDQ.agregarAvion(HangarPrivado, avionPriv1);
		} catch (AeropuertoFULLExcepcion e) {
			// TODO Bloque catch generado automáticamente
			System.out.println(e.getMessage());
		}
		try {
			astorMDQ.agregarAvion(HangarPrivado, avionPriv2);
		} catch (AeropuertoFULLExcepcion e) {
			// TODO Bloque catch generado automáticamente
e.printStackTrace();
		}
	
		
		System.out.println(astorMDQ.contarAviones());
		
		System.out.println(astorMDQ.listarTodosLosHangares());
		
		
		
		
		
		
		

	}

}
