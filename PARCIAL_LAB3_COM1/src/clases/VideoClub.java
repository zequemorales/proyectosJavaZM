package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoClub {

	private ArrayList<Producto> ListaDeProductos;
	private ArrayList<Cliente> ListadoDeClientes;

	public VideoClub() {
		ListaDeProductos = new ArrayList<Producto>();
		ListadoDeClientes = new ArrayList<Cliente>();
	}
	
	
	public void agregarCopias(Producto p , int cantidadDeCopias){
		int numAle;
		for(int i=0;i<=cantidadDeCopias;i++){
			Copia copy = new Copia(p.getIdProducto(), p.getTitulo() ,numAle = (int) (Math.random() * 1000) + 1);
					p.agregarCopia(copy);
		}
		
		
	}

	public boolean agregarProducto(Producto p) {
		boolean flag = false;
		for (int i = 0; i < ListaDeProductos.size(); i++) {
			if (ListaDeProductos.get(i).getIdProducto() == p.getIdProducto()) {
				System.out.println("Un producto con el mismo ID ya se encuentra en la lista");
				flag = true;
			}
		}
		if (!flag) {
			ListaDeProductos.add(p);
		}
		return flag;

	}

	public void agregarCliente(Cliente c) {

		boolean flag = false;
		for (int i = 0; i < ListadoDeClientes.size(); i++) {
			if (ListadoDeClientes.get(i).getIdCliente() == c.getIdCliente()) {
				System.out.println("Un cliente con el mismo ID ya se encuentra en la lista");
				flag = true;
			}
		}
		if (!flag) {
			ListadoDeClientes.add(c);
		}

	}

	public void listarProductos() {
		for (Producto p : ListaDeProductos) {
			System.out.println(p.imprimir());
		}
	}

	public void listarClientes() {
		for (Cliente c : ListadoDeClientes) {
			System.out.println(c.mostrarCliente());
		}
	}

	public void eliminarProducto(int idProduc) {

		boolean flag = false;
		for (int i = 0; i < ListaDeProductos.size(); i++) {
			if (ListaDeProductos.get(i).getIdProducto() == idProduc) {
				ListaDeProductos.remove(i);
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("\nNo se encontro el Producto");

		}
	}

	public void eliminarCliente(int idClient) {
		boolean flag = false;
		for (int i = 0; i < ListadoDeClientes.size(); i++) {
			if (ListadoDeClientes.get(i).getIdCliente() == idClient) {
				ListadoDeClientes.remove(i);
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("\nNo se encontro el Cliente");

		}
	}
	
	public void AlquilarProducto(Producto p ){
		
		
	}

}
