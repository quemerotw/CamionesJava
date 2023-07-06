package ejercicio;

public abstract class Producto {

	private static int generadorCodigo;
	
	private int codigo;
	private String descripcion;
	private double volumen;
	private double peso;

	public Producto() {
		generadorCodigo++;
		
		this.codigo = generadorCodigo;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public double getVolumenEmbalaje() {
		return this.volumen * 1.1;
	}
}
