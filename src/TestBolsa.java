import prBolsa.*;

public class TestBolsa {
	public static void main(String[] args){
		Bolsa<String> bs = new Bolsa<>();
		bs.annadir("A");
		bs.annadir("B");
		bs.annadir("B");
		System.out.println(bs);
		bs.eliminarTodas("B");
		System.out.println(bs);
		if (bs.esta("B")){
			System.out.println("No debería estar ahí");
		}
	
		Bolsa<Integer> bi = new Bolsa<>();
		bi.annadir(1);
		bi.annadir(2);
		bi.annadir(3);
		bi.annadir(2);
		bi.annadir(4);
		System.out.println(bi);
		bi.eliminar(2);
		System.out.println(bi);
		
	}
	
}

/* Salida
[(A:1) (B:2) ]
[(A:1) ]
[(1:1) (4:1) (3:1) (2:2) ]
[(1:1) (4:1) (3:1) (2:1) ]
*/