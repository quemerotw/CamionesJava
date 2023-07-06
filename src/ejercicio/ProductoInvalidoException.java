package ejercicio;

import java.util.ArrayList;

public class ProductoInvalidoException extends AcopladoException {

	private Producto producto;
	private Acoplado acoplado;
	
	public ProductoInvalidoException(Producto producto, 
			Acoplado acoplado) {
		
		this.producto = producto;
		this.acoplado = acoplado;
	}
	
	@Override
	public String getMessage() {
		return String.format("El producto %s no es válido para el acomplado", 
				this.producto.getDescripcion());
	}
}
