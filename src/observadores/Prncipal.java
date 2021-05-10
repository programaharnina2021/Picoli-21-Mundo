package observadores;

public class Prncipal {
public static void main(String[] args) {
	SujetoConcreto sujeto=new SujetoConcreto();
	ObservadorConcreto obConcreto=new ObservadorConcreto();
	//add el observador
	sujeto.addObservador(obConcreto);
	//el valor que cambia es en el sujeto no en el observador
	sujeto.setValor(15);
	//el que reacciona es el observador
}
}
