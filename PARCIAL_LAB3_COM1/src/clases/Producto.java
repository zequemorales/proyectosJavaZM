package clases;

import java.util.ArrayList;
import java.util.Date;

public abstract class Producto {

	private int idProducto;
	private String titulo;
	private String genero;
	private ArrayList<String> RegistroDeAlquileres;
	private ArrayList<Copia> copias;

	public Producto (int idProducto, String titulo, String genero) {
		setIdProducto(idProducto);
		setTitulo(titulo);
		setGenero(genero);
		RegistroDeAlquileres = new ArrayList<>();
		copias = new ArrayList<>();

	}
	
	public void agregarCopia(Copia co) {
		copias.add(co);
	}

	public String imprimir() {
		return "\nElemento \n- ID PRODUCTO= " + getIdProducto() + "\n- TITULO= " + getTitulo() + "\n- GENERO= " + getGenero();
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


	public void agregarRegistroPelicula(Date fecha, Cliente c) {
		String e = "[El Cliente ID=" + c.getIdCliente() + c.getNombre() + c.getApellido() + "alquilo la pelicula el dia"
				+ fecha + ". ]";
		RegistroDeAlquileres.add(e);
	}

	public void agregarRegistroAlqJuego(Date fecha, Cliente c) {
		String e = "[El Cliente ID=" + c.getIdCliente() + c.getNombre() + c.getApellido() + "alquilo el juego el dia"
				+ fecha + ". ]";
		RegistroDeAlquileres.add(e);
	}

	public void listarRegistro() {
		for (String registro : RegistroDeAlquileres) {
			System.out.println(registro);
		}
	}

}
