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

}
