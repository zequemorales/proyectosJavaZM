package clases;

public class VideoJuego extends Producto {
	
	

	private String compania;
	private int horasEstimadas;
	
	public VideoJuego(int idProducto, String titulo, String genero, int stock, String compania,
			int horasEstimadas) {
		super(idProducto, titulo, genero, stock);
		setCompania(compania);
		setHorasEstimadas(horasEstimadas);
		
	}
	
	

	@Override
	public String imprimir() {
		return "VideoJuego [compania=" + compania + ", horasEstimadas=" + horasEstimadas + "]" + super.imprimir();
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


	@Override
	public int comparar(Producto a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
