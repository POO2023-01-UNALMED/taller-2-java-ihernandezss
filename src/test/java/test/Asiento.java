package test;

public class Asiento {
	
	
	String color;
	int precio;
	int registro;
	
	
	//metodos
	public void cambiarColor(String color) {
		if (color == "azul" || color == "verde" || color == "negro" || color == "amarillo" || color== "blanco"){
			this.color = color;
		}
	}
	
}
