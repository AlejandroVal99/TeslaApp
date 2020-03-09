package view;

import controller.PaymentController;
import processing.core.PApplet;
import processing.core.PImage;

public class PaymentView {

	private PaymentController paymentController;

	private PApplet app;
	private PImage bPayment;
	private int screen;

	public PaymentView(PApplet app) {
		
		this.app = app;
		bPayment = app.loadImage("Imagenes/Backgrounds/Payment.png");
		paymentController = new PaymentController(app);		
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		// TODO Auto-generated method stub
		app.image(bPayment, 0, 0);
		
	}

}
