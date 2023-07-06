package ejercicio;

public class ProductoFrajil extends Producto {

	@Override
	public double getVolumenEmbalaje() {
		return super.getVolumenEmbalaje()*2;
	}
}
