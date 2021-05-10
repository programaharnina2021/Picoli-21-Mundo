package observadores;

public class SujetoConcreto extends Sujeto {
	int valor = 9;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		for (Observador observador : observadores) {
			observador.actualizar(valor);
		}
	}
	
	
}
