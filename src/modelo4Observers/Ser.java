package modelo4Observers;

import java.util.Random;

import utiles.Utiles;

public class Ser {
	private static final int vidaMax = 120;
	private static final int vidaMin = 0;

	protected float esperanzaVida;
	protected int edad;
	private Comportamiento comportamiento;

	public Ser() {
		super();
		esperanzaVida = calculaEsperanzaVida(vidaMin, vidaMax);
		comportamiento = new Menor();
	}

	public boolean isAlive() {
		return this.edad <= this.esperanzaVida;
	}

	public boolean envejecer() {
		this.edad++;
		if(pasaAAdulto()) {
			//TODO hay que comprobar la viabilidad del menor
			comportamiento=new Adulto();
		}
		if(pasaAAnciano()) {
			//Una solucion para no tener clases sin propiedades
			//son los objetos anonimos
			comportamiento=new Comportamiento() {
				
				@Override
				public float alimentar(int sueldo, float esperanzaVida) {
					return recalcularVejez(sueldo, esperanzaVida);
				}
				float recalcularVejez(int sueldo,float esperanzaVida){
					//TODO recalcular la esperanza de vida
					return esperanzaVida;
				}
			};
		}
		return isAlive();
	}

	public boolean vivir(int sueldo) {
		this.esperanzaVida=comportamiento.alimentar(sueldo,this.esperanzaVida);
		return envejecer();
	}

	public Ser(Ser ser) {
		this.edad = ser.edad;
		this.esperanzaVida = ser.esperanzaVida;
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

	protected void recalcularEsperanzaDeVida(int sueldo) {
		// TODO recalculando
	}

	public boolean pasaAAnciano() {
		return edad == Edades.adulto.getEdadMaxima();
	}

	public boolean pasaAAdulto() {
		return edad == Edades.menor.getEdadMaxima();
	}
}
