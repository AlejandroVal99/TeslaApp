package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class PaymentController {
	private PApplet app;
	private TeslaApp teslaapp;

	public PaymentController(PApplet app) {

		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}

	public void nuevaTrajeta(String franquicia, String pam, String cvc, String fecha) {
		// TODO Auto-generated method stub
		teslaapp.tarjetaPago(franquicia, pam, cvc, fecha);
	}

}
