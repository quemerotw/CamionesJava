package ejercicio;

public class TransporteException extends Exception {

	private String mensaje = "Se produjo un error inesperado";
	
	public TransporteException() {
		
	}

	public TransporteException(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String getMessage() {
		return this.mensaje;
	}
}
