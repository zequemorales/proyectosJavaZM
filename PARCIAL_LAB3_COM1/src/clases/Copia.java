package clases;

public class Copia {
	private int idProducto;
	private boolean entregado=false;
	private String titulo;
	private int idCopia;
	

	public Copia(int idPelicula, String titulo, int idCopia) {
		setIdPelicula(idPelicula);
		setTitulo(titulo);
		setIdCopia(idCopia);
	}
	

	public String imprimirCopia() {
		return "Copia [idPelicula=" + idProducto + ", entregado=" + entregado + ", titulo=" + titulo + ", idCopia="
				+ idCopia + "]";
	}


	public int getIdPelicula() {
		return idProducto;
	}

	public void setIdPelicula(int idPelicula) {
		this.idProducto = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIdCopia() {
		return idCopia;
	}

	public void setIdCopia(int idCopia) {
		this.idCopia = idCopia;
	}

	public void entregar() {
		this.entregado = true;
	}

	public void devolver() {
		this.entregado = false;
	}
	
	public boolean isEntregado() {
		return entregado; // si devuelve false esta en el videoclub y si esta
							// true esta prestado
	}


	

}
