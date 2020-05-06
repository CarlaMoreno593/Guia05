package died.guia05.problema02;


//En env�o b�sico se puede agregar hasta 5
//productos y se le cobra adem�s del precio de cada producto, un
//5% extra del precio de cada producto. Es decir si pido un producto por $100, el
//costo del Pedido es $105 ($100 del producto y $5 del env�o) y el env�o se realiza
//entre las 24 y las 48 horas h�biles.

public class PedidoBasico extends Pedido{
	
	protected final int CANTIDADMAX=5;
	

	//Constructores
	public PedidoBasico() {
		
	}
	
	public PedidoBasico(int i) {
		super();
		this.id = i;
	}
	
	
	//Precio total de pedido
	@Override
	public double precio(){
		
		double precio = 0;
		
		for(Producto unProducto : this.productos) {
			
			precio+= unProducto.getCosto() + unProducto.getCosto()*0.05;  
			
		}
		
		return precio;
	}
	
//	 El cadete cobrar� por cada pedido b�sico el 10% del costo final
	@Override
	public double comision() {
		
		if(this.entrega == null) {
			
			return 0;
			
		}
		return this.precio()*0.10;
		
	}
	
	//ESTO ES LO QUE HACE QUE EL MAXIMO CAMBIE SEG�N EL TIPO DE PEDIDOS :D
	@Override
	public int getMaximo() {
		
		return CANTIDADMAX;
		
	}
	
	
}
