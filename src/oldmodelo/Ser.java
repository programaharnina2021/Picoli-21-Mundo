package oldmodelo;
import java.util.Random;

import utiles.Utiles;

public class Ser {
	private static final int vidaMax = 120;
	private static final int vidaMin = 0;
	private static final int edadAdulto = 18;
	private static final int edadAnciano = 65;

	private float esperanzaVida;
	private int edad;
	private int necesidadVital;
	private float factorDesarrollo;
	private long ahorro;
	private boolean activo;

	public Ser() {
		super();
		esperanzaVida = calculaEsperanzaVida(vidaMin, vidaMax);
	}

	public float getEsperanzaVida() {
		return esperanzaVida;
	}

	public void setEsperanzaVida(float esperanzaVida) {
		this.esperanzaVida = esperanzaVida;
	}

	private int calculaEsperanzaVida(int minimo, int maximo) {
		return Utiles.dameNumero(maximo);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean envejecer() {
		this.edad++;
		// TODO tengo que ver si un menor pasa a ser adulto o no
		// y para que pase de adulto a anciano
		return isAlive();
	}

	public boolean isAlive() {
		 return this.edad <= this.esperanzaVida;
	}
	public void vivir(int sueldo) {
		if (edad < edadAdulto) {
			this.crecer(sueldo);
		} else {
			this.alimentar(sueldo);
		}
	}

	// Esto solo los adultos
	// nv 100
	// ahorros 10
	// sueldo 80
	private void alimentar(int cantidad) {
		int total = 0;
		if (edad < edadAnciano) {
			// sueldo es la cantidad
			int resto = cantidad - necesidadVital;
			//resto sera -20
			this.ahorro += resto;
			// ahorros -10
			if (ahorro < 0) {
				total = (int) (necesidadVital - ahorro);
				this.ahorro=0;
			}
		}
		else {
			total=cantidad;
		}
		recalcularEsperanzaDeVida(total);
	}

	// Esto solo los menores
	private void crecer(int cantidad) {
		// TODO
	}

	private void recalcularEsperanzaDeVida(int sueldo) {
		// TODO recalculando
	}
}
