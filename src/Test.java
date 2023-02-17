import java.util.ArrayList;
import java.util.List;

class Test {

	public static void main(String[] args) {
		
		Imperio imperio1 = new Imperio("imperio1");
		Imperio imperio2 = new Imperio("imperio2");
		
		Lucha lucha = new Lucha();

		//relleno de imperio
		
		imperio1.tropaAleatoria(imperio1, imperio2);
		
		System.out.println("imperio 1");
		imperio1.mostrar();
		
		System.out.println("");
		
		System.out.println("imperio 2");
		imperio2.mostrar();
		
		// lucha
		
		System.out.println("");
		
		lucha.luchar(imperio1, imperio2);
		
		System.out.println("FIN");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
