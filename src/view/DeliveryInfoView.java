
package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.DeliveryInfoController;
import controller.RegisterController;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class DeliveryInfoView {
	private DeliveryInfoController deliveryController;
	private String country, state, address;

	private PApplet app;
	private PImage deliveryInfo;
	private int screen = 8;
	private ControlP5 cp5;
	private String[] inputs;
	private PFont ralewayM;

	public DeliveryInfoView(PApplet app) {
		deliveryInfo = app.loadImage("Imagenes/Backgrounds/DeliveryInfo.png");
		this.app = app;
		deliveryController = new DeliveryInfoController(app);

		ralewayM = app.createFont("Tipografia/Raleway-Medium.ttf", 20);

		cp5 = new ControlP5(app);
		inputs = new String[3];

		inputs[0] = "country";  
		inputs[1] = "state";
		inputs[2] = "address";

		cp5.addTextfield(inputs[0]).setPosition((78), 358).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[1]).setPosition((78), 431).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[2]).setPosition((78), 503).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();

	}

	public void getinfoDelivery() {

		if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {

			country = cp5.get(Textfield.class, "country").getText();
			state = cp5.get(Textfield.class, "state").getText();
			address = cp5.get(Textfield.class, "address").getText();
			
			screen = 11;
			deliveryController.getInfoDeliveryCon(country, state, address);
			deliveryController.crearHistorico();
			

		}
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void drawScreen() {
		// TODO Auto-generated method stub
		app.image(deliveryInfo, 0, 0);
	}

	public void mostrarInputs(int screen2) {

		if (screen2 != 8) {
			cp5.hide();
		}
		if (screen2 == 8) {
			cp5.show();
		}
	}

}
