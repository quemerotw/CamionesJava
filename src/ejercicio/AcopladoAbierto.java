package ejercicio;

public class AcopladoAbierto extends Acoplado {

	@Override
	public void cargar(Producto producto) throws AcopladoException {
		
		if (producto instanceof ProductoFrajil) {
			this.notificarRechazo(producto);
			throw new ProductoInvalidoException(producto, this);
		}

		super.cargar(producto);
	}
	
	
}
