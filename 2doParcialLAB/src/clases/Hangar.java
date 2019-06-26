package clases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hangar<K, V> {

	private HashMap<K, V> listaMapa;

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
	public boolean agregar(K clave, V valor) {
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

	public String listar() {
		Iterator<Map.Entry<K, V>> entradas = listaMapa.entrySet().iterator();
		StringBuilder str = new StringBuilder();
		str.append("( Clave |" + " Valor )" + "\r\n");
		while (entradas.hasNext()) {
			Map.Entry<K, V> entrada = entradas.next();
			str.append("(" + entrada.getKey() + " |" + entrada.getValue() + ")");
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
