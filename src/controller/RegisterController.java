package controller;

import model.TeslaApp;
import processing.core.PApplet;

public class RegisterController {

	private PApplet app;
	private TeslaApp teslaapp;

	public RegisterController(PApplet app) {

		this.app = app;
		teslaapp = new TeslaApp(app);
		// TODO Auto-generated constructor stub
	}

	public void getInfoForm(String username, String password, String confirmPassword, String email) {
		teslaapp.registerUser(username, password, email);
		
	}

}
