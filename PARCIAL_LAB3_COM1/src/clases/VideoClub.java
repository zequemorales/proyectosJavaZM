package clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class VideoClub {

	private ArrayList<Producto> ListaDeProductos;
	private ArrayList<Cliente> ListadoDeClientes;

	public VideoClub() {
		ListaDeProductos = new ArrayList<Producto>();
		ListadoDeClientes = new ArrayList<Cliente>();
	}

	public boolean agregarCopias(Producto p, int cantidadDeCopias) {
		boolean flag = false;
		int numAle;
		for (int i = 0; i <= cantidadDeCopias; i++) {
			Copia copy = new Copia(p.getIdProducto(), p.getTitulo(), numAle = (int) (Math.random() * 1000) + 1);
			if (p.agregarCopia(copy)) {
				flag = true;
			}
		}
		return flag; // si devulve true es que se agrego correctamente
	}

	public boolean agregarProducto(Producto p) { // Si devuelve false un
													// producto con el mismo id
													// se encuentra en la lista
		boolean flag = true;
		for (int i = 0; i < ListaDeProductos.size(); i++) {
			if (ListaDeProductos.get(i).getIdProducto() == p.getIdProducto()) {
				// System.out.println("Un producto con el mismo ID ya se
				// encuentra en la lista");
				flag = false;
			}
		}
		if (flag) {
			ListaDeProductos.add(p);
		}
		return flag; // si es true se agrego correctamente

	}

	public boolean agregarCliente(Cliente c) { // Si devuelve false un cliente
												// con el mismo id se encuentra
												// en la lista

		boolean flag = true;
		for (int i = 0; i < ListadoDeClientes.size(); i++) {
			if (ListadoDeClientes.get(i).getIdCliente() == c.getIdCliente()) {
				// System.out.println("Un cliente con el mismo ID ya se
				// encuentra en la lista");
				flag = false;
			}
		}
		if (flag) {
			ListadoDeClientes.add(c);
		}
		return flag;

	}

	public void listarProductos() {
		for (Producto p : ListaDeProductos) {
			System.out.println(p.imprimir());
		}
	}

	public void listarPeliculas() {
		for (Producto p : ListaDeProductos) {
			if (p instanceof Pelicula) {
				System.out.println(p.imprimir());
			}
		}

	}

	public void listarVideoJuegos() {
		for (Producto p : ListaDeProductos) {
			if (p instanceof VideoJuego) {
				System.out.println(p.imprimir());
			}
		}
	}

	public void listarClientes() {
		for (Cliente c : ListadoDeClientes) {
			System.out.println(c.mostrarCliente());
		}
	}

	public boolean eliminarProducto(int idProduc) { /// Si Devuelve true se
													/// elimina correctamente
		// y si devuelve false es que no se encontro el producto o hubo un error

		boolean flag = false;
		for (int i = 0; i < ListaDeProductos.size(); i++) {
			if (ListaDeProductos.get(i).getIdProducto() == idProduc) {
				ListaDeProductos.remove(i);
				flag = true;
			}

		}

		return flag;
	}

	public boolean eliminarCliente(int idClient) { // si devuelve true es que se
													// elimino correctamente
		boolean flag = false;
		for (int i = 0; i < ListadoDeClientes.size(); i++) {
			if (ListadoDeClientes.get(i).getIdCliente() == idClient) {
				ListadoDeClientes.remove(i);
				flag = true;
			}
		}
		return flag;
	}

	public Cliente devuelveCliente(int idCliente) {
		Cliente c = null;
		for (int i = 0; i < ListadoDeClientes.size(); i++) {
			if (ListadoDeClientes.get(i).getIdCliente() == idCliente) {
				c = ListadoDeClientes.get(i);
			}
		}
		return c;
	}

	public boolean AlquilarProducto(int idProducto, Date fecha, int idCliente) {
		boolean flag = false;

		for (int i = 0; i < ListaDeProductos.size(); i++) {
			if (!flag) {
				if (ListaDeProductos.get(i).getIdProducto() == idProducto) {
					ListaDeProductos.get(i).darCopiaParaAlquilar();
					if (ListaDeProductos.get(i) instanceof Pelicula) {
						ListaDeProductos.get(i).agregarRegistroPelicula(fecha, addreg(idCliente));

					}
					if (ListaDeProductos.get(i) instanceof VideoJuego) {
						ListaDeProductos.get(i).agregarRegistroAlqJuego(fecha, addreg(idCliente));

					}

					flag = true;
				}
			}
		}
		return flag; //si devuelve true se alquilo correctamente

	}

	public Cliente addreg(int idC) { // Si devuelve false un
		Cliente aux=null;
	
		
		for (int i = 0; i < ListaDeProductos.size(); i++) {
			if (ListadoDeClientes.get(i).getIdCliente() == ListadoDeClientes.get(i).getIdCliente()) {
				aux=ListadoDeClientes.get(i);
			}
		}
		
		return aux; // si es true se agrego correctamente

	}
	
	public void listarCopias(int idProducto) {
		boolean flag = false;

		for (int i = 0; i < ListaDeProductos.size(); i++) {
			if (!flag) {
				if (ListaDeProductos.get(i).getIdProducto() == idProducto) {
					ListaDeProductos.get(i).listarCopias();
					flag=true;
				}
			}
		}

	}
	
	public void listarReg(int idProducto) {
		boolean flag = false;

		for (int i = 0; i < ListaDeProductos.size(); i++) {
			if (!flag) {
				if (ListaDeProductos.get(i).getIdProducto() == idProducto) {
					ListaDeProductos.get(i).listarRegistro();
					flag=true;
				}
			}
		}

	}
	
	

}
