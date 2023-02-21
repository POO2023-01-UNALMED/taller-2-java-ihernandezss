package test;

public class Auto {
	String modelo;
	int precio;
	String marca;
	Asiento[] asientos;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	//metodos
	int cantidadAsientos() {
		int puesto=0;
		for (int i=0; i<asientos.length; i++) {
			if(asientos[i]!=null)
				puesto++;
		}
		
		return puesto;
	
	}
	
	
	String verificarIntegridad() {
		boolean result=true; 
		if(this.registro==motor.registro){ 
			for (Asiento asiento: this.asientos) { 
				if (asiento!=null){ 
					if (asiento.registro!=this.registro) {
						result=false;
						break;
					}
				}
			}
		}
		return result? "Auto original":"Las piezas no son originales"; 
	}

}