package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class CompareController {
	private PApplet app;
	private TeslaApp teslaapp;
	
	
	public CompareController(PApplet app) {
		
		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}
	

}
