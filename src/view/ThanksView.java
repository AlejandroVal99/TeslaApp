package view;

import java.awt.Image;

import processing.core.PApplet;
import processing.core.PImage;

public class ThanksView {

	private PApplet app;
	private PImage bThanks;
	private int screen;

	public ThanksView(PApplet app) {

		this.app = app;
		bThanks = app.loadImage("Imagenes/Backgrounds/ThanksScreen.png");
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		app.image(bThanks, 0, 0);
		// TODO Auto-generated method stub

	}

}
