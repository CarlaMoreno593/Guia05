package died.guia05.problema01;

public class Coordenada {
	
	//Latitud y Longitud}
	private double latitud;
	private double longitud;
	
	
	//b) Sobrecargar los constructores. Esta clase debe ofrecer el constructor por
	//defecto y un constructor con la latitud y la longitud
	public Coordenada() {
		
	}
	
	public Coordenada(double lat, double longi) {
		this.latitud = lat;
		this.longitud = longi;
	}
	
	//Getters and Setters
	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}
	
	
	
	//c) Agregar a la clase Coordenadas el método equals para determinar si
	//dos coordenadas son iguales. Tienen mismos valores de longitud y latitud
	@Override
	public boolean equals(Object c2) {
		
		if(c2 instanceof Coordenada)
			return (this.latitud == ((Coordenada)c2).getLatitud() && this.longitud == ((Coordenada)c2).getLongitud());
		
		return false;
	}
	
	//d) Agregar a la clase Coordenadas el método toString()
	@Override
	public String toString() {
		
		return "[ Latitud: " + this.latitud + ", Longitud: " + this.longitud + " ]"; 
		
	}

}
