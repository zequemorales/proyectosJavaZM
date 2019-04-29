package clases;

public class VideoJuego extends Producto {

	private String compania;
	private int horasEstimadas;

	public VideoJuego(int idProducto, String titulo, String genero, String compania, int horasEstimadas) {
		super(idProducto, titulo, genero);
		setCompania(compania);
		setHorasEstimadas(horasEstimadas);

	}

	@Override
	public String imprimir() {
		return "VideoJuego \n- COMPAÑIA = " + compania + "\n- horasEstimadas=" + horasEstimadas + super.imprimir();
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}


}
