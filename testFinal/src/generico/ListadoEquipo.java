package generico;

import java.util.ArrayList;

public class ListadoEquipo<T> {
	
	private ArrayList<T> listadoMiembros;
	
	public ListadoEquipo(){
		listadoMiembros=new ArrayList<T>();
	}
	
	public boolean agregar(T objeto) {
		boolean flag=false;
		
		if(listadoMiembros.add(objeto)){
			flag=true;
		}
		return flag;
	}
	
	/**
	 * Borra un elemento.	
	 */
	public boolean quitar(T objeto) {
		boolean flag=false;
		if(listadoMiembros.remove(objeto)){
			flag=true;
		}
		return flag;
	}
	/**
	 *  Listar
	 *  @return String toda la coleccion.
	 */
	
	public String listar() {
		StringBuilder str = new StringBuilder();
		for(T o : listadoMiembros)
		{
			str.append(o.toString());
			str.append("| \n");
		}
		return str.toString();
		}
	
	
	public int tamanioLista(){
		return listadoMiembros.size();
	}
	
	public ArrayList<T> devuelveLista(){
		return listadoMiembros;
	}


}
