package clases;

import java.util.ArrayList;

public class VideoClub {
	
	private ArrayList<Producto> ListaDeProductos;
	private ArrayList <Cliente> ListadoDeClientes;
	
	
	public VideoClub() {
		ListaDeProductos = new ArrayList<Producto>();
		ListadoDeClientes = new ArrayList<Cliente>();
	}
	
	public void agregarProducto(Producto p) 
	{
		ListaDeProductos.add(p);

	}
	public void agregarCliente(Cliente c) 
	{
		ListadoDeClientes.add(c);

	}
	
	
	
	public void listarElementos() {
		for (Producto c : ListaDeProductos)
		{
			System.out.println(c.imprimir());
		}
	}
	
	
	

}
