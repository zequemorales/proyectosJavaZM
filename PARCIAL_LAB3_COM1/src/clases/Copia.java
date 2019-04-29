package clases;

public class Copia {
	private int idPelicula;
	private boolean entregado=false;
	private String titulo;
	private int id;
	

	public Copia(int idPelicula, String titulo, int id) {
		setIdPelicula(idPelicula);
		setTitulo(titulo);
		setId(id);
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
