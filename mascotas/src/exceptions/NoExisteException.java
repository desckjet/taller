package exceptions;

public class NoExisteException extends Exception{

	private static final long serialVersionUID = 30458906028790159L;

	public NoExisteException(int contenido) {
		super ("El elemento con el código " + contenido + "no existe");
	}
	
	public NoExisteException() {
		super ("no es posible insertar ");
	}
}
