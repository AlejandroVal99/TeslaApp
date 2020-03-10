package view;

import controller.CompareMenuController;
import processing.core.PApplet;
import processing.core.PImage;

public class CompareMenuView {
	
	private CompareMenuController compareMenuController;
	
	private PApplet app;
	private PImage bCompareMenu;
	private int screen = 6;
	
	
	public CompareMenuView(PApplet app) {
		
		
		compareMenuController = new CompareMenuController(app);
		bCompareMenu = app.loadImage("Imagenes/Backgrounds/MenuCompare.png");
		this.app = app;
	}
	
	
	public void drawScreen() {
		app.image(bCompareMenu, 0, 0);
		// TODO Auto-generated method stub
		
	}
	
	public void cambioScreen() {
		
	}


	public void drawModelo(int posX, int posY) {
		// TODO Auto-generated method stub
		compareMenuController.pintarModelo(posX,posY);
		
	}
	

}
