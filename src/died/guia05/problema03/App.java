package died.guia05.problema03;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

	public static void main(String[] args) {
		
		Comisionable p1 = new PedidoBasicoExpress(1);
		Comisionable p2 = new PedidoBasico(2);
		Comisionable p3 = new PedidoBasico(3);
		Comisionable p4 = new PedidoPremium(4);
		Comisionable p5 = new PedidoBasicoExpress(5);
		Comisionable p6 = new PedidoPremium(6);

		Cadete c1 = new Cadete(60);
		Cadete c2 = new Cadete(61);
		
		Producto pr1 = new Producto("Producto 1", 20);
		Producto pr2 = new Producto("Producto 2", 20);
		Producto pr3 = new Producto("Producto 3", 20);
		Producto pr4 = new Producto("Producto 4", 20);
		Producto pr5 = new Producto("Producto 5", 20);
		Producto pr6 = new Producto("Producto 6", 20);
		Producto pr7 = new Producto("Producto 7", 20);
		Producto pr8 = new Producto("Producto 8", 20);
		Producto pr9 = new Producto("Producto 9", 20);
		Producto pr10 = new Producto("Producto 10", 20);
		Producto pr11 = new Producto("Producto 11", 20);
		
		
		Tramite t1 = new Tramite("Tramite 1", "Domicilio 1", LocalDate.now(), LocalTime.now());
		Tramite t2 = new Tramite("Tramite 2", "Domicilio 2", LocalDate.now(), LocalTime.now());
		
		
		((Pedido)p1).agregarProducto(pr1);
		((Pedido)p1).agregarProducto(pr2);
		((Pedido)p1).agregarProducto(pr3);
		((Pedido)p1).agregarProducto(pr4);
		System.out.println("Comisionable 1:");
		System.out.println(((Pedido)p1).getProductos());
		System.out.println();
		
		((Pedido)p2).agregarProducto(pr1);
		((Pedido)p2).agregarProducto(pr2);
		((Pedido)p2).agregarProducto(pr3);
		((Pedido)p2).agregarProducto(pr4);
		((Pedido)p2).agregarProducto(pr5);
		//no debería agregarse
		System.out.println(((Pedido)p2).agregarProducto(pr6));
		System.out.println("Pedido 2:");
		System.out.println(((Pedido)p2).getProductos());
		System.out.println();
		
		((Pedido)p3).agregarProducto(pr4);
		((Pedido)p3).agregarProducto(pr5);
		((Pedido)p3).agregarProducto(pr6);
		System.out.println("Pedido 3:");
		System.out.println(((Pedido)p3).getProductos());
		System.out.println();
		
		((Pedido)p4).agregarProducto(pr1);
		((Pedido)p4).agregarProducto(pr2);
		((Pedido)p4).agregarProducto(pr3);
		((Pedido)p4).agregarProducto(pr4);
		((Pedido)p4).agregarProducto(pr5);
		((Pedido)p4).agregarProducto(pr6);
		((Pedido)p4).agregarProducto(pr7);
		((Pedido)p4).agregarProducto(pr8);
		((Pedido)p4).agregarProducto(pr9);
		((Pedido)p4).agregarProducto(pr10);
		((Pedido)p4).agregarProducto(pr11);
		System.out.println("Pedido 4:");
		System.out.println(((Pedido)p4).getProductos());
		System.out.println();
		
		((Pedido)p5).agregarProducto(pr4);
		((Pedido)p5).agregarProducto(pr6);
		((Pedido)p5).agregarProducto(pr8);
		System.out.println("Pedido 5:");
		System.out.println(((Pedido)p5).getProductos());
		System.out.println();
		
		((Pedido)p6).agregarProducto(pr1);
		((Pedido)p6).agregarProducto(pr2);
		((Pedido)p6).agregarProducto(pr3);
		((Pedido)p6).agregarProducto(pr4);
		((Pedido)p6).agregarProducto(pr5);
		System.out.println("Pedido 6:");
		System.out.println(((Pedido)p6).getProductos());
		System.out.println();
		
		c1.agregarTarea(p1);
		c1.agregarTarea(p2);
		c1.agregarTarea(p3);
		c1.agregarTarea(p4);
		c1.agregarTarea(p5);
		c1.agregarTarea(p1);
		c1.agregarTarea(t1);
		System.out.println("Pedidos de Cadete 1:");
		System.out.println(c1.getTareas());
		System.out.println("Comision Total: " + c1.comisiones());
		System.out.println("Comision por Pedido: ");
		
		for(Comisionable p : c1.getTareas()) {
			
			System.out.println("Comisión: " + p.comision());
			
		}
		System.out.println();
		
		c2.agregarTarea(p3);
		c2.agregarTarea(p4);
		c2.agregarTarea(p5);
		c2.agregarTarea(p6);
		c2.agregarTarea(t2);
		System.out.println("Pedidos de Cadete 2:");
		System.out.println(c2.getTareas());
		((Pedido)p3).entregarPedido();
		System.out.println("Comision Total: " + c2.comisiones());
		System.out.println("Comision por Pedido: ");
		
		for(Comisionable p : c2.getTareas()) {
			
			System.out.println("Comisión: " + p.comision());
			
		}
	}
}
