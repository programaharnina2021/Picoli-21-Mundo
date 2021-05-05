package modelo2;

import java.util.ArrayList;

public class EnsayoSeres {

	public static void main(String[] args) {
		ArrayList<Menor> menores = new ArrayList<>();
		ArrayList<Adulto> adultos = new ArrayList<>();
		menores.add(new Menor());
		Menor menor = menores.get(0);
		System.out.println(menor.toString());
		System.out.println("esperanza del menor" + menor.esperanzaVida);
		for (int i = 0; i < 18; i++) {
			menor.envejecer();
			if (menor.pasaAAdulto()) {
				menores.remove(menor);
				adultos.add(new Adulto(menor));
			}
		}
		System.out.println("esperanza del adulto" + adultos.get(0).esperanzaVida);
		System.out.println(adultos.get(0).toString());
		// Pero cual es el verdadero problema de que sea otro objeto?
		// que hay que manipularlo desde fuera, el mismo no puede cambiar de naturaleza.
		// que problema me da?, tengo que estar gestionando, manualmente las
		// conversiones y
		// su presencia en las colas.
	}

}
