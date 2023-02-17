
public abstract class Unidades {
	
	private String nombre;
	private double vida;
	private double defensa;
	private double ataque;
	
	
	public Unidades(String nombre, double vida, double defensa, double ataque) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.defensa = defensa;
		this.ataque = ataque;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getVida() {
		return vida;
	}


	public void setVida(double vida) {
		
		this.vida = vida;
	}


	public double getDefensa() {
		return defensa;
	}


	public void setDefensa(double defensa) {
		
		this.defensa = defensa;
	}


	public double getAtaque() {
		return ataque;
	}


	public double setAtaque(double ataque) {
		return this.ataque = ataque;

	}

	@Override
	public String toString() {
		return "Unidades [nombre=" + nombre + ", vida=" + vida + ", defensa=" + defensa + ", ataque=" + ataque + "]";
	}
	
	
	public abstract double calcularAtaquePotencial();
	public abstract double calcularDefensaPotencial();
	
	public int tirarDados() {
		int total = 0;
		

		for (int i = 0; i < 3; i++) {
			int dado =(int)(Math.random()*6+1);
			total=total+dado;
		}
		
		
		
		
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
