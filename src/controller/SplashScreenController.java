package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class SplashScreenController {
	
	private PApplet app;
	private TeslaApp teslaapp;
	
	
	public SplashScreenController(PApplet app) {
		
		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}

}
