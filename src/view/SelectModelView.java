package view;

import controller.SelectModelController;
import processing.core.PApplet;
import processing.core.PImage;

public class SelectModelView {
	private SelectModelController selectModelController;
	private PApplet app;
	private PImage bSelectModel;
	private int screen = 4;
	private int model = 1;

	public SelectModelView(PApplet app) {

		bSelectModel = app.loadImage("Imagenes/Backgrounds/ModelSelection.png");
		this.app = app;
		selectModelController = new SelectModelController(app);
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {

		app.image(bSelectModel, 0, 0);

		switch (model) {

		case 1:
			
			selectModelController.pintarModel3();
			break;

		case 2:
			selectModelController.pintarModelX();
			break;
		case 3:			
			selectModelController.pintarModelS();
			break;
		}

		// TODO Auto-generated method stub

	}
	
	public void escogerCarro() {
		
		switch (model) {

		case 1:
			if (app.mouseX > 350 && app.mouseX < 381 && app.mouseY > 159 && app.mouseY < 188) {
				model = 2;
				
			}

			break;

		case 2:
			
			if (app.mouseX > 350 && app.mouseX < 381 && app.mouseY > 159 && app.mouseY < 188) {
				model = 3;	
			}
			if (app.mouseX > 34 && app.mouseX < 60 && app.mouseY > 159 && app.mouseY < 189) {
				model = 1;	
			}

			break;
		case 3:
			
			if (app.mouseX > 34 && app.mouseX < 60 && app.mouseY > 159 && app.mouseY < 189) {
				model = 2;	
			}
			
			break;
		}
		
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

}
