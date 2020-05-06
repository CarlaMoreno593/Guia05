package died.guia05.problema03;

//El usuario tiene la opción de indicar que el
//envío básico es Express, y necesita recibirlo en 24 horas. Si lo marca como
//Express entonces se le cobra un 20% sobre el total del envío. (en el caso
//anterior a los $105 se le suma un 20%, es decir $21 y el costo del envío será
//$126)

public class PedidoBasicoExpress extends PedidoBasico {
	
	public PedidoBasicoExpress() {
		super();
	}
	
	public PedidoBasicoExpress(int id) {
		super(id);
	}

	
	@Override
	public double precio(){
		
		return super.precio() + super.precio()*0.20;
		
	}
	
	//En teoria, hereda comision, y comision usa el this para calcular el precio total del pedido
	//por lo que deberia usar este metodo para obtener el precio total, y no el de PedidoBasico
	
}
