package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class SelectModelController {
	
	private PApplet app;
	private TeslaApp teslaapp;
	
	
	public SelectModelController(PApplet app) {
		
		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}

}
