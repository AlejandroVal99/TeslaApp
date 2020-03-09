package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class LoginController {
	private PApplet app;
	private TeslaApp teslaapp;
	
	
	public LoginController(PApplet app) {
		
		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}

}
