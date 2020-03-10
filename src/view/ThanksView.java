package view;

import java.awt.Image;

import controller.ThanksController;
import processing.core.PApplet;
import processing.core.PImage;

public class ThanksView {

	private PApplet app;
	private PImage bThanks;
	private int screen = 11;
	private ThanksController thanksController;

	public ThanksView(PApplet app) {
		
		thanksController = new ThanksController(app);

		this.app = app;
		
		bThanks = app.loadImage("Imagenes/Backgrounds/ThanksScreen.png");
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		app.image(bThanks, 0, 0);
		// TODO Auto-generated method stub

	}

	public void cambioScreen() {

		if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {
			screen = 4;
		} else if (app.mouseX > 35 && app.mouseX < 127 && app.mouseY > 45 && app.mouseY < 65) {
			screen = 4;
		}

	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void drawModelo(int posX, int posY) {
		
	thanksController.pintarModelo(posX,posY);	
		
	}

}
