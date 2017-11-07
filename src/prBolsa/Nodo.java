package prBolsa;
/**
 * 
 * @author Usuario
 *
 * @param <T>
 */
public class Nodo<T> {
	private T elem;
	private int multiplicidad;
	
	
	public Nodo(T e){
		elem = e;
		multiplicidad = 1;
	}
	
	public void incrementarVeces(){
		multiplicidad++;
	}
	
	public void decrementarVeces(){
		multiplicidad--;
	}
	
	public int getMultiplicidad(){
		return multiplicidad;
	}
	
	public T getElem(){
		return elem;
	}
	
	@Override
	public String toString(){
		return "("+elem.toString()+":"+multiplicidad+")";
	}
}
