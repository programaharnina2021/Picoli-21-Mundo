package observadorJava;

public class Principal {

	public static void main(String[] args) {
		Sujeto sujeto=new Sujeto();
		Observador observador=new Observador();
		sujeto.addObserver(observador);
		sujeto.incrementaVida();
	}

}
