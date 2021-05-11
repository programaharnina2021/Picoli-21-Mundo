package modelo4Observers;

public class EnsayoEstado {

	public static void main(String[] args) {
		EstadoEnsayo estado=new EstadoEnsayo();
		for (int i = 0; i <60; i++) {
			estado.envejecer();
			System.out.println();
		}

	}

}
