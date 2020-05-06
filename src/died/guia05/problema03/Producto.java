package died.guia05.problema03;

public class Producto {

	private String descripcion;
	private double costo;
	
	
	//Constructor
	public Producto() {
		
	}
	public Producto(String descripcion, double costo) {

		this.descripcion = descripcion;
		this.costo = costo;
		
	}
	

	//Getters and Setters
	public String getDescripcion() {
		return descripcion;
	}

	public double getCosto() {
		return costo;
	}
	
	
	//Sobreescribo metodo equals para usar el contains en Pedido
	@Override
	public boolean equals(Object p2) {
		
		return ((p2 instanceof Producto) && this.descripcion.equals(((Producto)p2).getDescripcion()) && (((Producto)p2).getCosto()==this.costo));
	
	}

	@Override
	public String toString() {
		
		return "[" + this.descripcion + ", " + this.costo + "]";
		
	}


}
