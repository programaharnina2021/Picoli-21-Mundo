package observadorJava;

import java.util.Observable;


public class Sujeto extends Observable {
	private int vida=9;
	
	public Sujeto() {
		super();
	}
	
	public void incrementaVida() {
		vida++;
		setChanged();
		notifyObservers(vida);
	}
}
