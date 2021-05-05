package state;

public class Prueba {

	public static void main(String[] args) {
		EstadoA estadoA=new EstadoA();
		EstadoB estadoB=new EstadoB();
		Context context=new Context(estadoA);
//		context=null;
		context.estado.manipula();
//		estadoA.manipula();
		context.setEstado(estadoB);
		context.estado.manipula();
	}

}
