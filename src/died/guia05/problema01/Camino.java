package died.guia05.problema01;

import java.util.ArrayList;
import java.util.List;

public class Camino {

	//Lista de coordenadas que un repartidor debe seguir para entregar productos
	//La primera coordenada es donde arranca y la ultima es donde finaliza
	private List<Coordenada> camino;
	
	public Camino() {
		
		this.camino = new ArrayList<Coordenada>();
		
	}
	
	//Getters and Setters
	
	public List<Coordenada> getCamino() {
		return camino;
	}

	//f) Crear en la clase camino los siguientes métodos “agregar”:
	
	//1. public void agregar(Coordenada x) : agrega un punto a la lista
	//de destinos representado por la coordenda
	public void agregar(Coordenada x) {
		
		//Si no contiene la coordenada x, entonces lo agrega. No tiene sentido agregar dos veces
		//la misma coordenada. ¿O si?
		if(!this.camino.contains(x))
			this.camino.add(x);
	
	}
	
	//2. public void agregar(double lat, double lng) : agrega un punto a
	//la lista de destinos representados por la coordenada de latitud lat
	//y longitud lng
	public void agregar(double lat, double lng) {
		
		Coordenada c = new Coordenada(lat, lng);
		agregar(c);
		
	}
	
	//3. public void agregar(int mtsLt,int mtsLn): agrega un nuevo punto a
	//la lista de destinos, cuya latitud y longitud será la suma de los
	//metros recibidos como parámetros ( para calcular como sumar
	//“metros” a una latitud y longitud puede guiarse por este enlace
	//https://stackoverflow.com/a/7478827/2370742 )
	//Asumo que los metros pueden entrar en negativo o positivo
	//Longitud-> Este (+) u Oeste(-)
	//Latitud-> Norte (+) u Sur(-) (en el mapa, se divide en lineas horizontales, pero avanzas verticalmente)
	//El enunciado no dice desde donde, arranco desde el origen (latitud 0, longitud 0)
	public void agregar(int mtsLt, int mtsLn) {
		
		
		//Radio de la tierra en KM
		double radioTierra = 6378.137; 
		//Valor de PI, obtenido desde la clase java.lang.Math
		double pi = Math.PI;
		//Valor de  1 metro en 1 grado (latitud o longitud)
		double metros = (1 / ((2 * pi / 360) * radioTierra)) / 1000;  
		
		//Nueva latitud. TODO ¿Desde dónde?
		double latitud = 0 + (mtsLt * metros);
		
		//Nueva longitud. TODO ¿Desde dónde? //donde puse 0 en el coseno va la latitud desde la que parto
		double longitud = 0 + (mtsLn * metros) / Math.cos(0 * (pi / 180));
		
		agregar(new Coordenada(latitud, longitud));
		
	}
	
	//g)Agregar a la clase camino el método “public List<Coordenada>
	//buscar(Coordenada no,Coordenada se)” que retorna todos los puntos
	//del camino que se encuentran dentro del limite establecido por la
	//coordenada no (noroeste, es decir el límite superior izquierdo) y la
	//coordenada se (sureste, es decir el limite inferior derecho).
	public List<Coordenada> buscar(Coordenada no, Coordenada se){
		
		List<Coordenada> lista = new ArrayList<Coordenada>();
		
		//Verifico si no es valido en comparación con se
		//Verifico si no estan invertidos (no es se, se es no)
		if(no.getLatitud()<se.getLatitud() && se.getLongitud()<no.getLongitud()) {
			
			Coordenada aux = se;
			se = no;
			no = aux;
		
		}
		//Es un punto valido
		if(no.getLatitud()>se.getLatitud() && no.getLongitud()<se.getLongitud()) {
			
			for(Coordenada unaCoordenada : this.camino) {
				
				//Reviso rango de latidud ([se.lat, no.lat])
				if(unaCoordenada.getLatitud()>=se.getLatitud() && unaCoordenada.getLatitud()<=no.getLatitud()) {
					//Reviso rango de longitud [no.long, se.long]
					if(unaCoordenada.getLongitud()>=no.getLongitud() && unaCoordenada.getLongitud()<=se.getLongitud()) {
						lista.add(unaCoordenada);
					}
				}
			}
			
			
		}
		
		return lista;
	
	}
	
	public List<Coordenada> buscar(Coordenada centro, double m){
		
		//Radio de la tierra en KM
		double radioTierra = 6378.137; 
		//Valor de PI, obtenido desde la clase java.lang.Math
		double pi = Math.PI;
		//Valor de  1 metro en 1 grado (latitud o longitud)
		double metros = (1 / ((2 * pi / 360) * radioTierra)) / 1000;  
		
		//Obtengo el NO. Sumo en latitud, resto en longitud
		double noLa = centro.getLatitud() + (m * metros);
		double noLo = centro.getLongitud() - (m * metros) / Math.cos(centro.getLatitud() * (pi / 180));
		Coordenada no = new Coordenada(noLa, noLo);
		
		//Obtengo el SE. Resto en latitud, sumo en longitud
		double seLa = centro.getLatitud() - (m * metros);
		double seLo = centro.getLongitud() + (m * metros) / Math.cos(centro.getLatitud() * (pi / 180));
		Coordenada se = new Coordenada(seLa, seLo);
			
		return buscar(no,se);
		
	}
}
