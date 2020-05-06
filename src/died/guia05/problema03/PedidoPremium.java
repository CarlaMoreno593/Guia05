package died.guia05.problema03;

//Los envíos premium, el cliente tiene la garantía de recibir el pedido en menos
//de 12 horas, pero se le cobra un 20% extra sobre cada producto hasta 5
//productos, y un 30% extra si son más de 5 productos los pedidos hasta un
//máximo de 20.


public class PedidoPremium extends Pedido{

	private final int CANTIDADMAX = 20;
	
	
	//Constructores
	public PedidoPremium() {

	}
	
	public PedidoPremium(int i) {
		this.id = i;
	}
	
	
	
	
	
	@Override
	public double precio() {

		double precio = 0;
		
		//Si el pedido tiene menos de 5 productos, cobra el 20% de cada producto
		if(this.productos.size()<6) {
			
			for(Producto unProducto : this.productos) {
				
				precio+= unProducto.getCosto() + unProducto.getCosto()*0.20;  
				
			}
			
		}
		else {
			
			//Si el pedido tiene más de 5 productos, cobra el 30% de cada producto
			for(Producto unProducto : this.productos) {
				
				precio+= unProducto.getCosto() + unProducto.getCosto()*0.30;  
				
			}
			
		}
		
		return precio;
	}
	
	
//	Por cada pedido premium el 15% del costo final y $50 extras si el pedido tiene
//	más de 10 productos.
	@Override
	public double comision() {
		
		if(this.entrega == null) {
			
			return 0;
			
		}
		
		double comision = this.precio()*0.15;
		
		if(this.productos.size()>=10) {
			
			return comision + 50.0;
			
		}
		
		return comision;
		
	}
	
	@Override
	public int getMaximo() {
		
		return CANTIDADMAX;
		
	}
	
	
	
}
