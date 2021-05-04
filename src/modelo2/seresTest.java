package modelo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class seresTest {

	@Test
	void test() {
		Menor menor=new Menor();
		Adulto adulto=new Adulto();
		Ser ser=new Ser();
		menor.alimentar(1);
		adulto.alimentar(1);
		ser.alimentar(1);
	}

}
