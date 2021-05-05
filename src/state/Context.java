package state;

public class Context {
	//Contexto de uso, donde voy a usar el State
	Estado estado;
	public Context(Estado estado) {
		super();
		this.estado = estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
