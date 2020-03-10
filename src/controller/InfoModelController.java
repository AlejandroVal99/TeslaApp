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
		
		teslaapp.mostrarModel3Selec();
		// TODO Auto-generated method stub
		
	}

}
