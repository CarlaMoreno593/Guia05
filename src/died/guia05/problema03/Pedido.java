package died.guia05.problema03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Pedido implements Comisionable{
	
	protected int id;
	protected List<Producto> productos;
	protected final int CANTIDADMAX = 20;
	protected LocalDate entrega;
	
	//Getters and Setters
	public int getId() {
		return this.id;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}
	
	
//	Agregar a Pedido el método concreto y final “boolean agregarProducto(Producto p)” 
//	que recibe como argumento un producto y lo agrega al pedido si es que todavía hay 
//	espacio y retorna true. Si ya alcanzó el limite máximo de productos no lo agrega y retorna
//	false.
	public final boolean agregarProducto(Producto p) {
		
		//Creo la lista si es nula
		if(productos==null) {
			productos = new ArrayList<Producto>();
			
		}
		
		//Verifico que no contenga al producto y que no supere la cantidad maxima. TODO ver si no verifica antes que exista o no
		if(productos.size()<getMaximo() && !productos.contains(p)) {
			
			return productos.add(p);
			
		}
		
		return false;
		
	}
	
	   public int getMaximo() {
		
			return CANTIDADMAX;
			
	   }

//	Agregar en Pedido los métodos abstractos “precio()” y “comisión()” que
//	permiten calcular para cada pedido el precio del mismo y la comisión
//	del mismo e implementarlos en las clases concretas.
	public abstract double precio();
	public abstract double comision();
	
	@Override
	public boolean equals(Object p) {
		
		return (p instanceof Pedido && id == ((Pedido)p).getId());
		
	}
	
	@Override
	public String toString() {
		
		return "[ID: " + id + ", Maximo: "+ getMaximo() +"]";
		
	}
	
	//Al agregar el atributo LocalDate, solo alcanza con verificar si la entrega se hizo o no
	//modifica el calculo de comision por cada pedido y agrego este metodo. Cadete no fue modificado
	public final void entregarPedido() {
		
		this.entrega = LocalDate.now();
		
	}
	
}
