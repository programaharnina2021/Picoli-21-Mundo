package modelo3strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SerTest {

	@Test
	void testEnvejecer() {
		Ser ser=new Ser();
		System.out.println("esperanza de vida "+ser.getEsperanzaVida());
		for (int i = 0; ser.isAlive(); i++) {
			ser.vivir(1);
		}
	}

}
