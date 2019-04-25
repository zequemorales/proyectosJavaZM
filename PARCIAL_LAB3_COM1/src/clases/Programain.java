package clases;

import java.util.Date;

public class Programain {

	public static void main(String[] args) {
		
		java.util.Date fecha = new Date();
		System.out.println (fecha);
		
		
		VideoClub DonVideo = new VideoClub();
		
		Cliente Carlos=new Cliente(12, "Carlos ", " Perez ");
		DonVideo.agregarCliente(Carlos);
		System.out.println(Carlos.mostrarCliente());
		
		Cliente Pedro = new Cliente(10," Pedro ", " Alvarez ");
		DonVideo.agregarCliente(Pedro);
		System.out.println(Pedro.mostrarCliente());
		
		VideoJuego CallOfDuty = new VideoJuego(1, "Call Of Duty", "Shooter", 10, "Unisoft", 10);
		DonVideo.agregarProducto(CallOfDuty);
		System.out.println(CallOfDuty.imprimir());
		
		//entrego el juego y agrego reg
		CallOfDuty.entregar();
		CallOfDuty.agregarRegistroAlqJuego(fecha, Carlos);

		System.out.println(CallOfDuty.imprimir());
		
		CallOfDuty.listarRegistro();
		
		
		
		
		
	}

}
