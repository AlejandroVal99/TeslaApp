package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class DeliveryInfoController {
	private PApplet app;
	private TeslaApp teslaapp;

	public DeliveryInfoController(PApplet app) {

		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}

	public void getInfoDeliveryCon(String country, String state, String address) {
		teslaapp.deliveryInformation(country, state, address);

	} 
	
	public void crearHistorico() {
		teslaapp.crearCompra();
	}

}
