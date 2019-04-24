package clases;

import java.util.ArrayList;


public class Catalogo {

	private ArrayList<Producto> ListaDeProductos;
	
	public Catalogo() {
		ListaDeProductos = new ArrayList<Producto>();
	
	}
	
	
	public void agregar(Producto e) 
	{
		ListaDeProductos.add(e);

	}
	
	
	
	public void listarElementos() {
		for (Producto e : ListaDeProductos)
		{
			System.out.println(e.imprimir());
		}
	}
}
