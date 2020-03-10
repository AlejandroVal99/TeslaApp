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
	
	
	public int getScreen() {
		return screen;
	}


	public void setScreen(int screen) {
		this.screen = screen;
	}


	public void drawScreen() {
		app.image(bCompareMenu, 0, 0);
		// TODO Auto-generated method stub 
		
	}
	
	public void cambioScreen() {
		
		if (app.mouseX > 35 && app.mouseX < 381 && app.mouseY > 496 && app.mouseY < 558) {
			screen = 7;//compare screen
			compareMenuController.comparoPeugeot();
			
		}else if (app.mouseX > 35 && app.mouseX < 381 && app.mouseY > 593 && app.mouseY < 655) {
			screen = 7;//compare Screen 
			compareMenuController.comparoAudiE();
			
		}else if (app.mouseX > 35 && app.mouseX < 381 && app.mouseY > 690 && app.mouseY < 752) {
			screen = 7;//compare screen 
			compareMenuController.comparoBMW();
			
		}
		else if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {
			screen = 5;//InfoModel 
		}
		
	}


	public void drawModelo(int posX, int posY) {
		// TODO Auto-generated method stub
		compareMenuController.pintarModelo(posX,posY);
		
	}
	

}
