package ejercicio;

public class Impresora implements Suscriptor {

	private String nombre;

	public Impresora() {}
	public Impresora(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void productoRechazado(Producto producto) {
		System.out.println(String.format("[Impresora] Se rechazo el producto %s", producto.getDescripcion()));
	}
	
	@Override
	public void productoAceptado(Producto producto) {
	}
}
