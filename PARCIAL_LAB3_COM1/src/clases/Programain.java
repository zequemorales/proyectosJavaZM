package clases;

import java.util.Date;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.DefaultValueLoaderDecorator;

public class Programain {
	
	public static  Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Producto p1 = new Pelicula(0, null, null, 0, null) ;
		Producto p2 =null;
		Producto p3 =null;
		Producto p4 =null;
		Producto p5 =null;
		Producto p6 =null;
		Cliente c1=null;Cliente c2=null;Cliente c3=null; Cliente c4=null;
		
		
		java.util.Date fecha = new Date();
		
		System.out.println("************************************");
		VideoClub DonVideo = new VideoClub();
		System.out.println("VIDEOCLUB DON VIDEO");
		System.out.println("************************************");
		
		c1=crearCliente(DonVideo);
		c2=crearCliente(DonVideo);
		
		p1=crearProductoPelicula(DonVideo);
		p6=crearProductoVideojuego(DonVideo);
		
		System.out.println("INGRESE LA CANTIDAD DE COPIAS");
		int cantCopias;
		cantCopias=teclado.nextInt();
		DonVideo.agregarCopias(p1, cantCopias);
		
		p1.listarCopias();
		
		System.out.println("INGRESE EL PRODUCTO A ALQUILAR");
		int idProducto;
		idProducto=teclado.nextInt();
		
		System.out.println("INGRESE EL ID DEL CLIENTE QUE ALQUILA EL PRODUCTO");
		int idCliente;
		idCliente=teclado.nextInt();
		
		DonVideo.AlquilarProducto(idProducto, fecha, idCliente);
		
		DonVideo.listarCopias(idProducto);
		
		System.out.println("INGRESE EL PRODUCTO A ALQUILAR");
		idProducto=teclado.nextInt();
		
		System.out.println("INGRESE EL ID DEL CLIENTE QUE ALQUILA EL PRODUCTO");
		idCliente=teclado.nextInt();
		
		DonVideo.AlquilarProducto(idProducto, fecha, idCliente);
		DonVideo.listarCopias(idProducto);
		
		DonVideo.listarReg(1);
		DonVideo.listarReg(2);

		

//	
//		System.out.println("************************************");
//		
//		DonVideo.listarClientes();
//		System.out.println("************************************");
//		
//		DonVideo.eliminarCliente(10);
//		System.out.println("************************************");
//		DonVideo.listarClientes();
		
		

		teclado.close();
	}
	public static Producto crearProductoPelicula(VideoClub donv){
		int id;
		String titulo;
		String genero;
		String creador;
		int duracion;
		
		System.out.println("Ingrese el id de la Pelicula");
		id=teclado.nextInt();
		System.out.println("Ingrese el Titulo de la Pelicula");
		titulo=teclado.next();
		System.out.println("Ingrese el Genero de la Pelicula");
		genero=teclado.next();
		System.out.println("Ingrese la Creador de la Pelicula");
		creador=teclado.next();
		System.out.println("Ingrese la Duracion de la Pelicula");
		duracion=teclado.nextInt();
		Producto p = new Pelicula(id, titulo, genero, duracion, creador);
		donv.agregarProducto(p);
		System.out.println(p.imprimir());
		return p;

	}
	
	public static Producto crearProductoVideojuego(VideoClub donv){
		int id;
		String titulo;
		String genero;
		String compania;
		int horasEstimadas;
		
		System.out.println("Ingrese el id del Videojuego");
		id=teclado.nextInt();
		System.out.println("Ingrese el Titulo del Videojuego");
		titulo=teclado.next();
		System.out.println("Ingrese el Genero del Videojuego");
		genero=teclado.next();
		System.out.println("Ingrese la Compañia del Videojuego");
		compania=teclado.next();
		System.out.println("Ingrese las Horas estimadas del VideoJuego");
		horasEstimadas=teclado.nextInt();
		Producto p = new VideoJuego(id, titulo, genero, compania, horasEstimadas);
		donv.agregarProducto(p);
		System.out.println(p.imprimir());
		return p;
		}
	public static Cliente crearCliente(VideoClub donv){
		int id;
		String Nombre;
		String Apellido;
		
		System.out.println("Ingrese el id del Cliente");
		id=teclado.nextInt();
		System.out.println("Ingrese el Nombre del Cliente");
		Nombre=teclado.next();
		System.out.println("Ingrese el Apellido del Cliente");
		Apellido=teclado.next();
		Cliente c = new Cliente(id, Nombre, Apellido);
		donv.agregarCliente(c);
		System.out.println(c.mostrarCliente());
		return c;
		
	}


	

}
