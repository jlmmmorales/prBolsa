package prBolsa;
import java.util.*;
/**
 * Una bolsa es un tipo de datos que define una colección de elementos no ordenados, que pueden estar repetidos.
 * @author Usuario
 *
 * @param <E> Tipo de los elementos de la bolsa
 */
public class Bolsa<E> {
		
	private Set<Nodo<E>> nodos;
	
	public Bolsa(){
		nodos = new HashSet<Nodo<E>>();
	}
	
	public void annadir(E elem){
		Nodo<E> n = busca(elem);
		if(n==null){
			//El nodo no esta lo añado a mi estructura de nodos
			n = new Nodo<E>(elem);
			nodos.add(n);
		}else{
			//El nodo ya esta en la estructura, incremento su número de multiplicidad
			n.incrementarVeces();
		}
		
	}
	
	public void eliminar(E elem){
		Nodo<E> n = busca(elem);
		if(n==null){
			//El nodo no esta luego no elimino nada
		}else {
			//El nodo ya esta en la estructura, decremento o elimino definitivamente
			int vecesNodo = n.getMultiplicidad();
			if(vecesNodo >= 2){
				// Existe más de un nodo igual, decremento en uno su número de veces
				n.decrementarVeces();
			}else{
				// Elimino definitivamente el elemento de la extructura
				nodos.remove(n);
			}
		}
	}
	
	public void eliminarTodas(E elem){
		Nodo<E> n = busca(elem);
		if(n != null){
			nodos.remove(n);
		}
	}
	
	public boolean esta(E elem){
		boolean resultado = false;
		Nodo<E> n  = busca(elem);
		if(n != null){
			resultado = true;
		}
		return resultado;
	}
	
	private Nodo<E> busca(E elem){
		Nodo<E> resultado = null;
		
		for(Nodo<E> n : nodos){
			if(n.getElem().equals(elem)){
				//Lo he encontrado
				resultado = n;
			}
		}
		return resultado;
	}
		
	@Override
	public String toString(){
		StringBuilder cadena = new StringBuilder("[");
		for(Nodo<E> n: nodos){
			cadena.append(n.toString()+" ");
		}
		return cadena.toString()+"]";
	}
}
