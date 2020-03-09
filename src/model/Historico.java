package model;

public class Historico {
	
	private Automobile vehiculo;
	private TarjetaCredito medioPago;
	private String direction;
	
	

	public Historico(Automobile vehiculo, TarjetaCredito medioPago, String direction) {
		
		this.vehiculo = vehiculo;
		this.direction = direction;
		this.medioPago = medioPago;
		
	}



	public Automobile getVehiculo() {
		return vehiculo;
	}



	public void setVehiculo(Automobile vehiculo) {
		this.vehiculo = vehiculo;
	}



	public TarjetaCredito getMedioPago() {
		return medioPago;
	}



	public void setMedioPago(TarjetaCredito medioPago) {
		this.medioPago = medioPago;
	}



	public String getDirection() {
		return direction;
	}



	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	

}
