import java.util.ArrayList;
import java.util.List;

public class Imperio {
	
	
	private String nombre;
	List<Unidades> imperio = new ArrayList<Unidades>();
	
	Imperio(){
		
	}
	
	public Imperio(String nombre) {
		this.nombre = nombre;
		
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void agregar(Unidades unidad) {
		
		imperio.add(unidad);
		
	}
	
	
	public void eliminar (Unidades unidad) {
		if(imperio.remove(unidad)) {
			System.out.println("elmento eliminado");
		}else {
		System.out.println("no se pudo eliminar");
		}
	}
	
	
	public void mostrar() {
		
		for(Unidades x : imperio) {
			System.out.println(x.getNombre());
		}
		
	}
	
	public int tamaño() {
		return imperio.size();
	}
	
	
	
	
	
	
	
	
	
	
	
	public void tropaAleatoria(Imperio imperio1,Imperio imperio2) {

		
		for (int i = 0; i < 4; i++) {
			imperio1.agregar(objetoAleatorio());
		}
		
		for (int i = 0; i < 4; i++) {
			
			imperio2.agregar(objetoAleatorio());
		}

		
	}
	
	
	public Unidades objetoAleatorio() {
		
		Unidades objetoAleatorio = null;
		
		for (int i = 0; i < 4; i++) {
			
			int rand = (int)(Math.random()*4+1);
			
			
			switch (rand) {
			case 1:
				objetoAleatorio = new Sanador("Sanador",500,7,1);
				return objetoAleatorio;
			case 2:
				objetoAleatorio = new Guerrero("Guerrero",500, 5, 10); 
				return objetoAleatorio;
			case 3:
				objetoAleatorio = new Aldeano("Aldeano",300, 3, 5);
				return objetoAleatorio;
			case 4:
				objetoAleatorio = new Caballeriza("Cabelleriza",700, 7, 15);
				return objetoAleatorio;
			default:
				break;
			}
		}
		return objetoAleatorio;
		
	}

	public Unidades get(int i) {
		return imperio.get(i);	
	}


	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
