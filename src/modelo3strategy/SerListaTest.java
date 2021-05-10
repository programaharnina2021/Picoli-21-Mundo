package modelo3strategy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo2.Adulto;
import modelo2.Ser;

class SerListaTest {

	@Test
	void test() {
		ArrayList<Ser> menores=new ArrayList<>();
		ArrayList<Ser> adultos=new ArrayList<>();
		menores.add(new Ser());
		for (int i = 0; i < 120; i++) {
			Ser ser = menores.get(0);
			ser.envejecer();
			if(ser.pasaAAdulto()) {
				menores.remove(ser);
				adultos.add(ser);
			}
			
		}
	}

}
