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

		case 1://model 3
			if (app.mouseX > 350 && app.mouseX < 381 && app.mouseY > 159 && app.mouseY < 188) {
				model = 2;

			}
			//asignar auto
			else if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {
				
				screen = 10;
				selectModelController.escogiModel3();
				
			}
			//ir a pantalla de detalles 
			else if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 744 && app.mouseY < 775) {
				screen = 5;
				selectModelController.escogiModel3();
			}
 
			break;

		case 2://model X

			if (app.mouseX > 350 && app.mouseX < 381 && app.mouseY > 159 && app.mouseY < 188) {
				model = 3;
			}
			else if (app.mouseX > 34 && app.mouseX < 60 && app.mouseY > 159 && app.mouseY < 189) {
				model = 1;
			}
			//asignar auto
			else if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {
				screen = 10;
				selectModelController.escogiModelX();
			}
			//ir a pantalla de detalles 
			else if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 744 && app.mouseY < 775) {
				screen = 5;
				selectModelController.escogiModelX();
			}

			break;
		case 3://model S

			if (app.mouseX > 34 && app.mouseX < 60 && app.mouseY > 159 && app.mouseY < 189) {
				model = 2;
			}
			//asignar auto
			else if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {
				screen = 10;
				selectModelController.escogiModelS();
			}else if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 744 && app.mouseY < 775) {
				screen = 5;
				selectModelController.escogiModelS();
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
