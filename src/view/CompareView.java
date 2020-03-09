package view;

import controller.CompareController;
import processing.core.PApplet;
import processing.core.PImage;

public class CompareView {

	private CompareController compareController;
	private PApplet app;
	private PImage bCompare;
	private int screen;

	public CompareView(PApplet app) {
		bCompare = app.loadImage("Imagenes/Backgrounds/ComapreScreen.png");
		compareController = new CompareController(app);
		this.app = app;
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		
		app.image(bCompare, 0, 0);
		 
	}

}
