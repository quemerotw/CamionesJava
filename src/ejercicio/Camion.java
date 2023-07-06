package ejercicio;

import java.util.ArrayList;

public class Camion implements Suscriptor{

	private String marca;
	private int anioAdquisicion;
	private Chofer chofer;
	private Acoplado acoplado;
	private ArrayList<Producto> rechazados = new ArrayList<Producto>();
	
	
	public Camion(Acoplado acoplado) {
		this.acoplado = acoplado;
	}
	
	@Override
	public void productoRechazado(Producto producto) {
		this.rechazados.add(producto);
	}
	
	@Override
	public void productoAceptado(Producto producto) {	
	}
	
	public ArrayList<Producto> getRechazados(){
		return this.rechazados;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnioAdquisicion() {
		return anioAdquisicion;
	}
	public void setAnioAdquisicion(int anioAdquisicion) {
		this.anioAdquisicion = anioAdquisicion;
	}
	public Chofer getChofer() {
		return chofer;
	}
	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	public Acoplado getAcoplado() {
		return acoplado;
	}
	public void setAcoplado(Acoplado acoplado) {
		this.acoplado = acoplado;
	}
}
