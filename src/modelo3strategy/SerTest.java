package modelo3strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import modelo.Coordenada;

class SerTest {

	@Ignore
	void testEnvejecer() {
		Ser ser=new Ser();
		System.out.println("esperanza de vida "+ser.getEsperanzaVida());
		for (int i = 0; ser.isAlive(); i++) {
			ser.vivir(1);
		}
	}
	@Test
	void testRecalculoVidaAnciano() {
		Comportamiento comportamiento=new Comportamiento() {
			@Override
			public float alimentar(int sueldo, float esperanzaVida) {
				return recalcularVejez(sueldo, esperanzaVida);
			}
			float recalcularVejez(int sueldo,float esperanzaVida){
				//TODO recalcular la esperanza de vida
				float coeficiente=(float)sueldo/Edades.anciano.getNecesidadVital();
				if(coeficiente>=.3f) {
					return esperanzaVida-=1;
				}else {
					//vamos a perder hasta dos periodos
				}
				return esperanzaVida;
			}
		};
		float esperanzaVida=80f;
		int sueldo[]= {50,15};
		float resultado[]= {80f,79f};
		for (int i = 0; i < resultado.length; i++) {
			assertEquals(resultado[i], comportamiento.alimentar(sueldo[i], esperanzaVida));
		}
	}

}
