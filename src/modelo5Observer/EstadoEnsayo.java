package modelo5Observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class EstadoEnsayo {
	public ArrayList<Ser> menores = new ArrayList<>();
	public ArrayList<Ser> adultos = new ArrayList<>();
	public ArrayList<Ser> ancianos = new ArrayList<>();

	private Observer adultoObserver = new Observer() {
		@Override
		public void update(Observable o, Object arg) {
			adultos.add(menores.remove(menores.indexOf(arg)));
		}

	};
	private Observer ancianoObserver = new Observer() {

		@Override
		public void update(Observable o, Object arg) {
			ancianos.add(adultos.remove(adultos.indexOf(arg)));

		}
	};

	public EstadoEnsayo() {
		super();
		Ser ser = new Ser();
		menores.add(ser);
		ser.addAdultoObserver(adultoObserver);
		ser.addAncianoObserver(ancianoObserver);
	}

	public void envejecer() {
		for (Ser ser : menores) {
			ser.envejecer();
		}
	}

}
