package clases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hangar<K, V> {
	
	private String tipoAvion;
	
	private HashMap<K, V> listaMapa;
	
	

	public Hangar(String tipoAvion) {
		setTipoAvion(tipoAvion);
		listaMapa=new HashMap<>();
	}


	public String getTipoAvion() {
		return tipoAvion;
	}


	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	
	public int cantAviones(){
		return listaMapa.size();
	}
	/**
	 * Existe
	 */

	public boolean existeEnMapa(K clave) {
		return listaMapa.containsKey(clave);
	}
	


	/**
	 * Agrega un elemento
	 * 
	 * @return true si se agrego y false si no.
	 */
	public boolean agregarAvionAlHangar(K clave, V valor) {
		boolean flag = false;
		if (!existeEnMapa(clave)) {
			listaMapa.put(clave, valor);
			flag = true;
		}
		return flag;
	}

	/**
	 * Buscar
	 */

	public V obtenerSegunClave(K clave) {
		return listaMapa.get(clave);
	}

	/**
	 * Borra un elemento
	 * 
	 * @return true si se borro y false si no.
	 */

	public boolean borrar(K clave) {
		boolean flag = false;
		if (existeEnMapa(clave)) {
			listaMapa.remove(clave);
			flag = true;
		}
		return flag;
	}

	/**
	 * Listar
	 * 
	 * @return en un String toda la coleccion
	 */

	public String toString() {
		Iterator<Map.Entry<K, V>> entradas = listaMapa.entrySet().iterator();
		StringBuilder str = new StringBuilder();
		str.append("( Clave |" + " Valor )" + "\n");
		while (entradas.hasNext()) {
			Map.Entry<K, V> entrada = entradas.next();
			str.append("\n(" + entrada.getKey() + " |" + entrada.getValue() + ")");
		}
		return str.toString();
	}

	/**
	 * Devolver lista
	 */
	public HashMap<K, V> devolverLista() {
		return listaMapa;
	}

}
