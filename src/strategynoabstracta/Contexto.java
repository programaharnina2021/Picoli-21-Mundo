package strategynoabstracta;

public class Contexto {
//	Esto es lo que reaLMENTE HACE que sea strategy
	// esto es el rombo relleno
	Estrategia estrategia = new EstrategiaB();
	int contador=0;
	public void comprobar() {
		contador++;
		if(contador==5) {
			estrategia=new EstrategiaA();
		}
	}
}
