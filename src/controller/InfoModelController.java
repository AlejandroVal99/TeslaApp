package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class InfoModelController {
	private PApplet app;
	private TeslaApp teslaapp;
	
	
	public InfoModelController(PApplet app) {
		
		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}


	public void pintarInfo() {
		
		teslaapp.mostrarInfoModel();
		// TODO Auto-generated method stub
		
	}


	public void pintarModelo(int posX,int posY) {
		
		teslaapp.mostrarModelo(posX, posY);
		
	}

}
