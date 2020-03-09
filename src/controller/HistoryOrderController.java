package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class HistoryOrderController {
	
	private PApplet app;
	private TeslaApp teslaapp;
	
	
	public HistoryOrderController(PApplet app) {
		
		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}

}
