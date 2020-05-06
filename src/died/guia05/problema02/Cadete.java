package died.guia05.problema02;

import java.util.ArrayList;
import java.util.List;

//- Crear la clase Cadete, e implementar los métodos
//“agregarPedido”: agrega un pedido que tiene que llevar el
//cadete
//“comisiones” que retorna el total de comisiones que cobrará el
//cadete por todos los pedidos que le han agregado

public class Cadete {
	
	private int id;
	private List<Pedido> pedidos;
	
	
	//Constructor
	public Cadete() {
		
	}
	
	public Cadete(int id) {
		super();
		this.id = id;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	
	public void agregarPedido(Pedido p) {
		
		if(this.pedidos == null) {
			
			this.pedidos = new ArrayList<Pedido>();
			
		}
		
		if(!this.pedidos.contains(p)) {
			
			this.pedidos.add(p);
			
		}
	}
	
	public double comisiones() {
		
		double comisiones = 0;
		for(Pedido unPedido : this.pedidos) {
			
			comisiones+=unPedido.comision();
			
		}
		
		return comisiones;
	}
	
	
}
