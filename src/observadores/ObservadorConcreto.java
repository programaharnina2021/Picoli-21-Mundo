package observadores;

public class ObservadorConcreto extends Observador{

	public Sujeto concreto;
	@Override
	public void actualizar(int valor) {
		super.actualizar(valor);
		System.out.println("el valor ha cambiado a "+ valor);
	}
}
