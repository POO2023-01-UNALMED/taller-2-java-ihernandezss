package test;

public class Motor {
	
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	//metodos
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo=tipo;
		}
	}
}
