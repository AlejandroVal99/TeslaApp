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
	public void escogiModel3() {
		teslaapp.comprarModel3();
	}
	public void escogiModelX() {
		teslaapp.comprarModelX();
	}
	
	public void escogiModelS() {
		teslaapp.comprarModelS();
	}

	public void pintarModelX() {
		
		teslaapp.mostrarModelXSelec();
		
	}


	public void pintarModelS() {
		
		teslaapp.mostrarModelSSelec();
		// TODO Auto-generated method stub
		
	}


	public void pintarModel3() {
		teslaapp.mostrarModel3Selec();
		// TODO Auto-generated method stub
		
	}
	public String pintarUser() {
		// TODO Auto-generated method stub
		return teslaapp.nombreUser();
	}

}
