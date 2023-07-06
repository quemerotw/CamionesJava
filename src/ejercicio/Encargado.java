package ejercicio;

import java.util.ArrayList;

public class Encargado extends Persona implements Suscriptor {

	@Override
	public void productoRechazado(Producto producto) {
		System.out.println(String.format("[Encargado] se rechazo %s",  producto.getDescripcion()));
	}
	
	@Override
	public void productoAceptado(Producto producto) {
		System.out.println(String.format("[Encargado] se aceptado %s",  producto.getDescripcion()));
	}
}
