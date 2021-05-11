package modelo4Observers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

public class EstadoEnsayo implements Observer {
	public ArrayList<Ser> menores = new ArrayList<>();
	public ArrayList<Ser> adultos = new ArrayList<>();
	public ArrayList<Ser> ancianos = new ArrayList<>();

	public EstadoEnsayo() {
		super();
		Ser ser = new Ser();
		menores.add(ser);
		ser.addObserver(this);
	}

	public void envejecer() {
		for (Ser ser : menores) {
			ser.envejecer();
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if ((Boolean) arg) {
			for (Iterator iterator = menores.iterator(); iterator.hasNext();) {
				Ser ser = (Ser) iterator.next();
				if(ser.equals(o)) {
					iterator.remove();
				}
			}
			adultos.add((Ser) o);
		} else {
			ancianos.add(adultos.remove(adultos.indexOf(o)));
		}
	}

}
