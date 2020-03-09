package view;

import controller.SelectModelController;
import processing.core.PApplet;
import processing.core.PImage;

public class SelectModelView {
	private SelectModelController selectModelController;
	private PApplet app;
	private PImage bSelectModel;
	private int screen;
	
	public SelectModelView (PApplet app) {
		
		bSelectModel = app.loadImage("Imagenes/Backgrounds/ModelSelection.png");
		this.app = app;
		selectModelController = new SelectModelController(app);
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		
		app.image(bSelectModel, 0, 0);
		
		
		// TODO Auto-generated method stub
		
	}
	

}
