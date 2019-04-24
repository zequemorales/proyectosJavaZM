package clases;

import java.util.ArrayList;

public abstract class Producto {

	private int idProducto;
	private String titulo;
	boolean entregado;
	private String genero;
	private ArrayList<String> RegistroDeAlquileres;
	private int stock;

	public Producto(int idProducto, String titulo, String genero, int stock) {
		setIdProducto(idProducto);
		setTitulo(titulo);
		this.entregado = false;
		setGenero(genero);
		setStock(stock);
		RegistroDeAlquileres = new ArrayList<String>();

	}

	public String imprimir() {
		return "Elemento [ID PRODUCTO= " + getIdProducto() + "TITULO= " + getTitulo() + "ENTREGADO= " + isEntregado()
				+ "GENERO= " + getGenero() + "STOCK= " + getStock() + "]";
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	 public void entregar(){
		 this.entregado=true;
	 }

	 public void devolver(){
		 this.entregado=false;
	 }

	 public boolean isEntregado(){
		 return entregado; // si devuelve false esta en el videoclub y si esta true esta prestado 
	 }
	 
	
	abstract public int comparar(Producto a);
	
	public void agregarRegistro(){
		
	}
	

}
