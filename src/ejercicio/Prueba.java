package ejercicio;

public class Prueba {

	public static void main(String[] args) {

		Impresora impresora1 = new Impresora();
		Impresora impresora2 = new Impresora();
		AcopladoAbierto acoplado = new AcopladoAbierto();
		Encargado encargado = new Encargado();

		Camion camion = new Camion(acoplado);
		
		acoplado.suscribirRechazos(impresora1);
		acoplado.suscribirRechazos(encargado);
		acoplado.suscribirRechazos(camion);
		acoplado.suscribirRechazos(impresora2);

		Producto p = new ProductoFrajil();

		try {

			acoplado.cargar(p);

		} catch (AcopladoException e) {
			e.printStackTrace();
			System.out.println("0");
		}
		finally {
			System.out.println("o");
		}
	}

}
