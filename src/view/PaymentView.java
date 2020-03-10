package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.PaymentController;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class PaymentView {
	
	
	private String franquicia, pam, cvc, fecha;
	private PaymentController paymentController;

	private PApplet app;
	private PImage bPayment;
	private int screen = 10;

	private ControlP5 cp5;
	private String[] inputs;
	private PFont ralewayM;

	public PaymentView(PApplet app) {

		this.app = app;
		bPayment = app.loadImage("Imagenes/Backgrounds/Payment.png");
		paymentController = new PaymentController(app);

		ralewayM = app.createFont("Tipografia/Raleway-Medium.ttf", 20);

		cp5 = new ControlP5(app);
		inputs = new String[4];

		inputs[0] = "franquicia";
		inputs[1] = "pam";
		inputs[2] = "cvc";
		inputs[3] = "fecha";

		cp5.addTextfield(inputs[0]).setPosition((78), 452).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[1]).setPosition((78), 523).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[2]).setPosition((78), 595).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[3]).setPosition((78), 669).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();
	}

	public void drawScreen() {
		// TODO Auto-generated method stub
		app.image(bPayment, 0, 0);

	}

	public void nuevaCreditCard() {
		
		if (app.mouseX > 148 && app.mouseX < 266 && app.mouseY > 640 && app.mouseY < 668) {

			franquicia = cp5.get(Textfield.class, "franquicia").getText();
			pam = cp5.get(Textfield.class, "pam").getText();
			cvc = cp5.get(Textfield.class, "cvc").getText();
			fecha = cp5.get(Textfield.class, "fecha").getText();
			
			screen = 8;
			paymentController.nuevaTrajeta(franquicia,pam,cvc,fecha);
		}
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void mostrarInputs(int screen2) {

		if (screen2 != 10) {
			cp5.hide();
		}
		if (screen2 == 10) {
			cp5.show();
		}

	}

}
