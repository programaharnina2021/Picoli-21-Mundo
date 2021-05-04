package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import oldmodelo.Ser;

class SerTest {

	@Test
	void testEnvejecer() {
		int miEsperanza=50;
		Ser ser = new Ser();
		ser.setEsperanzaVida(miEsperanza);
		for (int i = 0; i <= miEsperanza+1; i++) {
			//Si al envejecer llega a pasar de ser menor a Adulto
			ser.envejecer();
			//Tambien hay que probar que no esta vivo sobrepasando su esperanzaVida
		}
	}

	@Test
	void testEsperanzaVida() {
		int seres = 2400;
		int minimo = 0;
		int maximo = 120;
		boolean haSidoMinimo = false, haSidoMaximo = false;
		for (int i = 0; i < seres; i++) {
			Ser ser = new Ser();
			System.out.println(ser.getEsperanzaVida());
			assertTrue(ser.getEsperanzaVida() >= 0 && ser.getEsperanzaVida() <= 120);
			if (ser.getEsperanzaVida() == minimo) {
				haSidoMinimo = true;
			} else if (ser.getEsperanzaVida() == maximo) {
				haSidoMaximo = true;
			}
		}
		assertTrue(haSidoMinimo);
		assertTrue(haSidoMaximo);
	}

}
