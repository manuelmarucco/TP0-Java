package classes;

public class Persona {
	
	private int colesterol = 200;
	private int cantidadDeComidas = 0;
	private boolean estaBien = true;
	
	//getters y setters
	
	public int getColesterol(){
		return colesterol;
	}
	
	public int getCantidadDeComidas(){
		return cantidadDeComidas;
	}

	//metodos para comer
	
	public void comer(Comida comida) {
		
		colesterol = colesterol + comida.getColesterol();
		cantidadDeComidas = cantidadDeComidas + 1;
		
	}

	public boolean estaBien() {
		
		if(colesterol > 200)	estaBien = false;
			
		return estaBien;
	}

	public void tomarPastilla() {
		colesterol = 200;
		
	}
	
}
