package view;

import controller.InfoModelController;
import processing.core.PApplet;
import processing.core.PImage;

public class InfoModelView {
	
	private InfoModelController infoModelController;
	
	private PApplet app;
	private PImage bInfoModel;
	private int screen;
	
	public InfoModelView(PApplet app) {
		bInfoModel = app.loadImage("Imagenes/Backgrounds/InfoModel.png");
		
		this.app = app;
		infoModelController = new InfoModelController (app);
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		 
		app.image(bInfoModel, 0, 0); 
		
		
		// TODO Auto-generated method stub
		
	}
	public void drawInfoModel() {
		infoModelController.pintarInfo();
	}
	

}
