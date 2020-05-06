package died.guia05.problema02;

public class App {

	public static void main(String[] args) {
		
		Pedido p1 = new PedidoBasicoExpress(1);
		Pedido p2 = new PedidoBasico(2);
		Pedido p3 = new PedidoBasico(3);
		Pedido p4 = new PedidoPremium(4);
		Pedido p5 = new PedidoBasicoExpress(5);
		Pedido p6 = new PedidoPremium(6);

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
		
		p1.agregarProducto(pr1);
		p1.agregarProducto(pr2);
		p1.agregarProducto(pr3);
		p1.agregarProducto(pr4);
		System.out.println("Pedido 1:");
		System.out.println(p1.getProductos());
		System.out.println();
		
		p2.agregarProducto(pr1);
		p2.agregarProducto(pr2);
		p2.agregarProducto(pr3);
		p2.agregarProducto(pr4);
		p2.agregarProducto(pr5);
		//no debería agregarse
		System.out.println(p2.agregarProducto(pr6));
		System.out.println("Pedido 2:");
		System.out.println(p2.getProductos());
		System.out.println();
		
		p3.agregarProducto(pr4);
		p3.agregarProducto(pr5);
		p3.agregarProducto(pr6);
		System.out.println("Pedido 3:");
		System.out.println(p3.getProductos());
		System.out.println();
		
		p4.agregarProducto(pr1);
		p4.agregarProducto(pr2);
		p4.agregarProducto(pr3);
		p4.agregarProducto(pr4);
		p4.agregarProducto(pr5);
		p4.agregarProducto(pr6);
		p4.agregarProducto(pr7);
		p4.agregarProducto(pr8);
		p4.agregarProducto(pr9);
		p4.agregarProducto(pr10);
		p4.agregarProducto(pr11);
		System.out.println("Pedido 4:");
		System.out.println(p4.getProductos());
		System.out.println();
		
		p5.agregarProducto(pr4);
		p5.agregarProducto(pr6);
		p5.agregarProducto(pr8);
		System.out.println("Pedido 5:");
		System.out.println(p5.getProductos());
		System.out.println();
		
		p6.agregarProducto(pr1);
		p6.agregarProducto(pr2);
		p6.agregarProducto(pr3);
		p6.agregarProducto(pr4);
		p6.agregarProducto(pr5);
		System.out.println("Pedido 6:");
		System.out.println(p5.getProductos());
		System.out.println();
		
		c1.agregarPedido(p1);
		c1.agregarPedido(p2);
		c1.agregarPedido(p3);
		c1.agregarPedido(p4);
		c1.agregarPedido(p5);
		c1.agregarPedido(p1);
		System.out.println("Pedidos de Cadete 1:");
		System.out.println(c1.getPedidos());
		System.out.println("Comision Total: " + c1.comisiones());
		System.out.println("Comision por Pedido: ");
		
		for(Pedido p : c1.getPedidos()) {
			
			System.out.println("ID: "+ p.getId() + ", Comisión: " + p.comision());
			
		}
		System.out.println();
		
		c2.agregarPedido(p3);
		c2.agregarPedido(p4);
		c2.agregarPedido(p5);
		c2.agregarPedido(p6);
		System.out.println("Pedidos de Cadete 2:");
		System.out.println(c2.getPedidos());
		p3.entregarPedido();
		System.out.println("Comision Total: " + c2.comisiones());
		System.out.println("Comision por Pedido: ");
		
		for(Pedido p : c2.getPedidos()) {
			
			System.out.println("ID: "+ p.getId() + ", Comisión: " + p.comision());
			
		}
	}
}
