package strategynoabstracta;

public class Prueba {

	public static void main(String[] args) {
		Contexto contexto=new Contexto();
		contexto.estrategia.manipula();
		for (int i = 0; i < 6; i++) {
			contexto.comprobar();
		}
		contexto.estrategia.manipula();
		
	}

}
