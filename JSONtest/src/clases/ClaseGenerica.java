package clases;

public class ClaseGenerica<T> {
	T obj;
	
	public ClaseGenerica(){
		obj=null;
		
	}
	
	public void tipoDeClase(){
		System.out.println("El tipo de T es " + obj.getClass().getName());
	}
	
	public void setObj(T obj){
		this.obj=obj;
	}
	public T getObj(){
		return obj;
	}
	
	public  <T> String hola(){
		return "el tipo de T es " + obj.getClass().getName();
		
	}

}
