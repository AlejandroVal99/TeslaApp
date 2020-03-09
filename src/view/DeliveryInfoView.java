package view;

import controller.DeliveryInfoController;
import processing.core.PApplet;
import processing.core.PImage;

public class DeliveryInfoView {
	private DeliveryInfoController deliveryController;

	private PApplet app;
	private PImage deliveryInfo;
	private int screen;

	public DeliveryInfoView (PApplet app) {
		deliveryInfo = app.loadImage("Imagenes/Backgrounds/DeliveryInfo.png");
		this.app = app;
		deliveryController = new DeliveryInfoController(app);
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		// TODO Auto-generated method stub
		app.image(deliveryInfo, 0, 0);
	}
}
