package controller;

import model.TeslaApp;
import processing.core.PApplet;
import view.CompareMenuView;

public class CompareMenuController {
	private PApplet app;
	private TeslaApp teslaapp;
	
	
	public CompareMenuController(PApplet app) {
		
		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}


	public void pintarModelo(int posX, int posY) {
		
		teslaapp.mostrarModelo(posX, posY);
		// TODO Auto-generated method stub
		
	}

}
