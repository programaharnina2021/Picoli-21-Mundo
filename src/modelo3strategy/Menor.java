package modelo3strategy;

public class Menor implements Comportamiento{
	public float factorDesarrollo;

	// Esto solo los menores
	@Override
	public float alimentar(int sueldo,float esperanzaVida) {
		// TODO
		System.out.println("soy un menor");
		return esperanzaVida;
	}

	
}
