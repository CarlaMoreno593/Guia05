package died.guia05.problema03;

import java.util.ArrayList;
import java.util.List;

//- Crear la clase Cadete, e implementar los métodos
//“agregarPedido”: agrega un pedido que tiene que llevar el
//cadete
//“comisiones” que retorna el total de comisiones que cobrará el
//cadete por todos los pedidos que le han agregado

public class Cadete {
	
	private int id;
	private List<Comisionable> tareas;
	
	
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

	public List<Comisionable> getTareas() {
		return tareas;
	}
	
	
	public void agregarTarea(Comisionable p) {
		
		if(this.tareas == null) {
			
			this.tareas = new ArrayList<Comisionable>();
			
		}
		
		if(!this.tareas.contains(p)) {
			
			this.tareas.add(p);
			
		}
	}
	
	public double comisiones() {
		
		double comisiones = 0;
		for(Comisionable unaTarea : this.tareas) {
			
			comisiones+=unaTarea.comision();
			
		}
		
		return comisiones;
	}
	
	
}
