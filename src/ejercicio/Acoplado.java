package ejercicio;

import java.util.ArrayList;
import java.util.Stack;

public abstract class Acoplado {

	private Stack<Producto> carga;
	private double volumenMaximo;
	private double pesoMaximo;

	private double volumenAcumulado;
	private double pesoAcumulado;
	private Camion camion;
	
	private ArrayList<Suscriptor> suscriptores = new ArrayList<Suscriptor>();

	public void suscribirRechazos(Suscriptor suscriptor){
		this.suscriptores.add(suscriptor);
	}

	
	public void setCamion(Camion camion) {
		this.camion = camion;
	}

	public Camion getCamion() {
		return this.camion;
	}
	
	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public double getPesoAcumulado() {
		return pesoAcumulado;
	}

	public void setPesoAcumulado(double pesoAcumulado) {
		this.pesoAcumulado = pesoAcumulado;
	}

	public double getVolumenMaximo() {
		return volumenMaximo;
	}

	public double getVolumenAcumulado() {
		return volumenAcumulado;
	}

	public void cargar(Producto producto) throws AcopladoException{
		 
		boolean volumenOk = this.volumenMaximo <= this.volumenAcumulado + producto.getVolumenEmbalaje();
		boolean pesoOk = this.pesoMaximo <= this.pesoAcumulado + producto.getPeso();
		
		if (!volumenOk || !pesoOk) {
			this.notificarRechazo(producto);
		
			throw new AcopladoLlenoException(producto, this);
		}

		this.pesoAcumulado += producto.getPeso();
		this.volumenAcumulado += producto.getVolumenEmbalaje();

		carga.add(producto);
	
	}
	
	protected void notificarRechazo(Producto producto) {
		// registro rechazo
		for(Suscriptor suscriptores : this.suscriptores) {
			suscriptores.productoRechazado(producto);
		}
	}
	
	public Producto descargar() {
		return carga.pop();
	}
	
}
