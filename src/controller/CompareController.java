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


	public void animacionTesla(int posY) {
		
		teslaapp.animacionTeslaCar(posY);
		
	}


	public void animacionCompare(int posY) {
		
		teslaapp.animacionCompareCar(posY);
		// TODO Auto-generated method stub
		
	}
	
	
	

}
