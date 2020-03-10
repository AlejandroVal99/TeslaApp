package view;

import controller.InfoModelController;
import processing.core.PApplet;
import processing.core.PImage;

public class InfoModelView {
	
	private InfoModelController infoModelController;
	
	private PApplet app;
	private PImage bInfoModel;
	private int screen = 5;
	
	public InfoModelView(PApplet app) {
		bInfoModel = app.loadImage("Imagenes/Backgrounds/InfoModel.png");
		
		this.app = app;
		infoModelController = new InfoModelController (app);
		// TODO Auto-generated constructor stub
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void drawScreen() {
		 
		app.image(bInfoModel, 0, 0); 
		drawInfoModel();
		
		
		
		// TODO Auto-generated method stub
		
	}
	public void drawInfoModel() {
		infoModelController.pintarInfo();
	}
	
	public void cambioScreen() {
		if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 744 && app.mouseY < 775) {
			screen = 6;//compare menu screen
		}
		else if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {
			screen = 10;//Payment Screen 
		}
	}
	public void drawModelo(int posX,int posY) {
		infoModelController.pintarModelo(posX, posY);
	}
	

}
