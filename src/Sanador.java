
public class Sanador extends Unidades{

	public Sanador(String nombre, double vida, double defensa, double ataque) {
		super(nombre, vida, defensa, ataque);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Sanador getNombre()=" + getNombre() + ", getVida()=" + getVida() + ", getDefensa()=" + getDefensa()
				+ ", getAtaque()=" + getAtaque();
	}

	@Override
	public double calcularAtaquePotencial() {
		
		int dados = tirarDados();
		
		if(dados==18) {
			return super.getAtaque()*20;
		}else if (dados>=15 && dados<=17) {
			return super.getAtaque()*15;
		}else if(dados>=8 && dados<=15) {
			return super.getAtaque()*10;
		}else if(dados>3 && dados<=7){
			return super.getAtaque()*15;
		}else {		
			return super.getAtaque()*20;
		}
		
		

		
	}
	
	@Override
	public double calcularDefensaPotencial() {
		int dados = tirarDados();
		
		if(dados==18) {
			return super.getDefensa()/12;
		}else if (dados>=15 && dados<=17) {
			return super.getDefensa()/10;
		}else if(dados>=8 && dados<=15) {
			return super.getDefensa()/8;
		}else if(dados>3 && dados<=7){
			return super.getDefensa()/10;
		}else {		
			return super.getDefensa()/12;
		}
	}
	
	
	

	


	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
