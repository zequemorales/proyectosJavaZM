package clases;

import java.util.ArrayList;
import java.util.Date;

public abstract class Producto {

	private int idProducto;
	private String titulo;
	private String genero;
	private ArrayList<String> RegistroDeAlquileres;
	private ArrayList<Copia> copias;
	private boolean entregado;

	public Producto(int idProducto, String titulo, String genero) {
		setIdProducto(idProducto);
		setTitulo(titulo);
		setGenero(genero);
		RegistroDeAlquileres = new ArrayList<>();
		copias = new ArrayList<>();
		setEntregado(false);
	}

	public boolean agregarCopia(Copia co) {
		boolean flag = false;
		if (copias.add(co)) {
			flag = true;

		}
		return false;
	}

	public int devuelveStock() {
		int stock = 0;
		for (int i = 0; i <= copias.size(); i++) {
			if (!copias.get(i).isEntregado()) {
				stock++;
			}
		}
		return stock;

	}

	public String imprimir() {
		return "\nElemento \n- ID PRODUCTO= " + getIdProducto() + "\n- TITULO= " + getTitulo() + "\n- GENERO= "
				+ getGenero();
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

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public boolean isEntregado(boolean entregado) {
		return entregado;

	}

	public void darCopiaParaAlquilar() {
		boolean flag = false;

		for (int i = 0; i <= copias.size(); i++) {
			if (!flag) {
				if (!copias.get(i).isEntregado()) {
					copias.get(i).entregar();
					flag = true;
				}
			}
		}

	}

	public void agregarRegistroPelicula(Date fecha, Cliente c ) {
		
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
	public void listarCopias() {
		for (Copia co : copias) {
			System.out.println(co.imprimirCopia());
		}
	}

}
