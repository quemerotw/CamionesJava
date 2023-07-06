package ejercicio;

import java.util.ArrayList;

public class AcopladoLlenoException extends AcopladoException {

	private Producto producto;
	private Acoplado acoplado;
	
	public AcopladoLlenoException(Producto producto, 
			Acoplado acoplado) {
		
		this.producto = producto;
		this.acoplado = acoplado;	}
	
	@Override
	public String getMessage() {
		return String.format("El producto %s supero la capacidad del acoplado (peso maximo:%d, volumen maximo: %d)",
					this.producto.getDescripcion(), 
					this.acoplado.getPesoMaximo(), 
					this.acoplado.getVolumenMaximo());
	}

	public Producto getProducto() {
		return producto;
	}

	public Acoplado getAcoplado() {
		return acoplado;
	}
	
	
}
