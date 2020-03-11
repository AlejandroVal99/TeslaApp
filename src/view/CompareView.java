package view;

import controller.CompareController;
import processing.core.PApplet;
import processing.core.PImage;

public class CompareView {

	private CompareController compareController;
	private PApplet app;
	private PImage bCompare;
	private int screen = 7;

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public CompareView(PApplet app) {
		bCompare = app.loadImage("Imagenes/Backgrounds/ComapreScreen.png");
		compareController = new CompareController(app);
		this.app = app;
		// TODO Auto-generated constructor stub
	} 

	public void drawScreen() {
		
		app.image(bCompare, 0, 0);
		 
	}
	
	public void animacionTesla(int posY) {
		
		compareController.animacionTesla(posY);
		
	} 
	
	public void animacionCompare(int posY) {
		compareController.animacionCompare(posY);
		
	}
	
	public void cambioScreen() {
		if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {
			screen = 6;//MenuCompareView 
		}
	}

	public void drawModelo(int posX, int posY) {
		
		compareController.pintarModel(posX,posY);
		// TODO Auto-generated method stub
		
	}

}
