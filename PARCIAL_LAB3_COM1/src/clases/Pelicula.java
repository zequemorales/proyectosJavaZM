package clases;

public class Pelicula extends Producto {
	private int duracion;
	private String creador;

	public Pelicula(int idProducto, String titulo, String genero, int stock, int duracion, String creador) {
		super(idProducto, titulo, genero, stock);
		setCreador(creador);
		setDuracion(duracion);
	}
	
	

	public int getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return "Pelicula [duracion=" + getDuracion() + ", creador=" + getCreador() + "]" + super.imprimir();
	}



	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public int comparar(Producto a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
