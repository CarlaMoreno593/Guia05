package died.guia05.problema01;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//Cuadrante 1
		System.out.println("Creo coordenada C1:");
		Coordenada c1 = new Coordenada(10,10);
		//Cuadrante 2
		System.out.println("Creo coordenada C2:");
		Coordenada c2 = new Coordenada(-10,10);
		//Cuadrante 3
		System.out.println("Creo coordenada C3:");
		Coordenada c3 = new Coordenada(-10,-10);
		//Cuadrante 4
		System.out.println("Creo coordenada C4:");
		Coordenada c4 = new Coordenada(10,-10);
		
		System.out.println("Creo coordenada C5:");
		Coordenada c5 = new Coordenada(10,10);
		System.out.println("Creo coordenada C6:");
		Coordenada c6 = new Coordenada(-5,5);
		System.out.println("Creo coordenada C7:");
		Coordenada c7 = new Coordenada(5,-5);
		System.out.println("Creo coordenada C8:");
		Coordenada c8 = new Coordenada(-5,-5);
		
		System.out.println("Creo coordenada C0 (Centro):");
		Coordenada c0 = new Coordenada(0,0);
		
		System.out.println();
		
		System.out.println("C1 == C2:");
		System.out.println(c1.equals(c2));
		
		System.out.println("C1 == C5:");
		System.out.println(c1.equals(c5));
		
		System.out.println();
		System.out.println("Creo Camino 1");
		Camino camino1 = new Camino();
		
		//Agrego por coordenada
		camino1.agregar(c5);
		camino1.agregar(c6);
		camino1.agregar(c7);
		camino1.agregar(c8);
		
		//Agrego por latitud y longitud. Recibe Double, por eso la D
		camino1.agregar(15D,-15D);
		camino1.agregar(-15D,15D);
		
		//Agrego por metros de latitud y metros de longitud
		camino1.agregar(16000,178000);
		camino1.agregar(-18000,250000);
		
		System.out.println("Elementos de Camino 1:");
		System.out.println(camino1.getCamino());
		System.out.println();
		
		List<Coordenada> lista = camino1.buscar(c4, c2);
		System.out.println("Lista dentro del rango de coordenadas: ");
		System.out.println("NO: " + c4);
		System.out.println("SE: " + c2);
		System.out.println(lista);
		System.out.println();
		

		lista = camino1.buscar(c2, c4);
		System.out.println("Lista dentro del rango de coordenadas: (Debería ser la misma que la anterior)");
		System.out.println("NO: " + c2);
		System.out.println("SE: " + c4);
		System.out.println(lista);
		System.out.println();
		
		lista = camino1.buscar(c0, 1600000000);
		System.out.println("Lista desde una coordenada, en un radio de m metros: ");
		System.out.println("Coordenada: " + c0);
		System.out.println("Metros: " + 16000);
		System.out.println(lista);
		System.out.println();
		
		lista = camino1.buscar(c5, c5);
		System.out.println("Lista dentro del rango de coordenadas: ");
		System.out.println("NO: " + c5);
		System.out.println("SE: " + c5);
		System.out.println(lista);
		System.out.println();
		
		//Misma Latitud, distinta longitud
		lista = camino1.buscar(c8, c6);
		System.out.println("Lista dentro del rango de coordenadas: ");
		System.out.println("NO: " + c8);
		System.out.println("SE: " + c6);
		System.out.println(lista);
		System.out.println();
		
	}
}
