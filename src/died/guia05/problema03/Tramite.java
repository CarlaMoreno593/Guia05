package died.guia05.problema03;

import java.time.LocalDate;
import java.time.LocalTime;

//Por cada trámite,realizado, un la app le cobra al usuario un monto fijo de $50. Y un
//cadete por cada trámite cobra $20

public class Tramite implements Comisionable{
	
	private String descripcion;
	private String domicilio;
//	LocalDate->fecha
	private LocalDate fecha;
//	LocalTime->tiempo sin fecha. Despertador por ejemplo.
	private LocalTime hora;
	
	
	
	//Constructores
	
	public Tramite() {
		
	}
	
	public Tramite(String descripcion, String domicilio, LocalDate fecha, LocalTime hora) {
		
		super();
		this.descripcion = descripcion;
		this.domicilio = domicilio;
		this.fecha = fecha;
		this.hora = hora;
		
	}
	
	
	//Getters and Setters
	public String getDescripcion() {
		return descripcion;
	}



	public String getDomicilio() {
		return domicilio;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public LocalTime getHora() {
		return hora;
	}
	
	

	//Para cadete
	@Override
	public double comision() {
		
		return 20.0;
		
	}
	
	//Para usuario
	public double precio() {
		
		return 50.0;
		
	}
		
	
	@Override
	public boolean equals(Object p) {
		
		return (p instanceof Tramite && descripcion.equals(((Tramite)p).getDescripcion()));
		
	}
	
	@Override
	public String toString() {
		
		return "[" + descripcion + "]";
	}
	
}
