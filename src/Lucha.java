
public class Lucha {
	
	private Imperio primerImperioAtacante;
	private Imperio segundoImperioAtacante;
	//primer

	
	Lucha(){
		
	}
	

	
	public void luchar( Imperio imperio1, Imperio imperio2) {
		
		System.out.println("Comenzo la Lucha");
		
		turnos(imperio1,imperio2);
		
		while(imperio1.tamaño()>0 && imperio2.tamaño()>0) {
			combate(imperio1,imperio2);
			
		}
		if(imperio1.tamaño()>0) {
			System.out.println("ganador imperio1");
		}else {
			System.out.println("ganador imperio2");
		}
		
		
	}
	
	



	public void combate( Imperio imperio1, Imperio imperio2){
		
		Unidades sobreviviente;
		
		Unidades muerto;
		
		boolean flag = true;
		
		
			do {
				
				System.out.println("");
				if(segundoImperioAtacante.get(0).getVida() <=0 || primerImperioAtacante.get(0).getVida() <=0) {
					flag =false;
					break;
				}
				
				
				
				double ataque = Math.round(segundoImperioAtacante.get(0).getVida() - (primerImperioAtacante.get(0).calcularAtaquePotencial()*segundoImperioAtacante.get(0).calcularDefensaPotencial()));
				segundoImperioAtacante.get(0).setVida(ataque);
				 			
				System.out.println(primerImperioAtacante.get(0).getNombre() +" del "+primerImperioAtacante.getNombre()+" ataco al " +segundoImperioAtacante.get(0).getNombre()
						+ " con un daño de " + primerImperioAtacante.get(0).calcularAtaquePotencial() +" | vida restante:  "+segundoImperioAtacante.get(0).getVida());
			
				System.out.println("");

				if(segundoImperioAtacante.get(0).getVida() <=0 || primerImperioAtacante.get(0).getVida() <=0) {
					flag =false;
					break;
				}
			
				
				double ataquex = Math.round(primerImperioAtacante.get(0).getVida() - (segundoImperioAtacante.get(0).calcularAtaquePotencial()*primerImperioAtacante.get(0).calcularDefensaPotencial()));
				primerImperioAtacante.get(0).setVida(ataquex);
			
				System.out.println(segundoImperioAtacante.get(0).getNombre() +" del "+segundoImperioAtacante.getNombre()+" ataco al " +primerImperioAtacante.get(0).getNombre()
						+ " con un daño de " + segundoImperioAtacante.get(0).calcularAtaquePotencial() +" | vida restante:  "+primerImperioAtacante.get(0).getVida());
				
				
			} while (flag ==true);
		
			
			
			
			

			
			
			
			if(primerImperioAtacante.get(0).getVida()<=0) {
				sobreviviente = segundoImperioAtacante.get(0);
				muerto = primerImperioAtacante.get(0);	
				System.out.println("el ganador es el " + sobreviviente.getNombre() +
						" del " +segundoImperioAtacante.getNombre()+" a muerto el " + muerto.getNombre());
				
				primerImperioAtacante.eliminar(muerto);
				
			}else if(segundoImperioAtacante.get(0).getVida()<=0) {
				sobreviviente = primerImperioAtacante.get(0);
				muerto = segundoImperioAtacante.get(0);
				System.out.println("el ganador es el " + sobreviviente.getNombre() +
						" del "+primerImperioAtacante.getNombre() +" a muerto el " + muerto.getNombre());
				segundoImperioAtacante.eliminar(muerto);
			}
			

			System.out.println("termino primer duelo");
			
			System.out.println("");
			primerImperioAtacante.mostrar();
			System.out.println("");
			segundoImperioAtacante.mostrar();

		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	public void turnos(Imperio imperio1, Imperio imperio2) {
		
		double dado =(double)(Math.random());
		
		if(dado >= 0.5) {
			primerImperioAtacante = imperio1;
			segundoImperioAtacante = imperio2;
			
			System.out.println(primerImperioAtacante.get(0).getNombre()+" del  " + primerImperioAtacante.getNombre()+ "  comienza el ataque");
		}else {
			primerImperioAtacante = imperio2;
			segundoImperioAtacante = imperio1;
			
			System.out.println(primerImperioAtacante.get(0).getNombre()+" del  " + primerImperioAtacante.getNombre()+ "  comienza el ataque");

		}

	}
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
