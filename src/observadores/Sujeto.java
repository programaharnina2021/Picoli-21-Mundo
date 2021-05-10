package observadores;

import java.util.ArrayList;

public class Sujeto {

	ArrayList<Observador> observadores = new ArrayList<>();

	public void addObservador(ObservadorConcreto obConcreto) {
		observadores.add(obConcreto);
	}

	public void eliminar() {

	}

	protected void notificar() {

	}
}
