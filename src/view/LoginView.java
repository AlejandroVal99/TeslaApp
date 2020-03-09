package view;

import controller.LoginController;
import processing.core.PApplet;
import processing.core.PImage;

public class LoginView {
	private LoginController loginController;
	
	private PApplet app;
	private PImage bLoginView;
	private int screen;
	
	public LoginView(PApplet app) {
		bLoginView = app.loadImage("Imagenes/Backgrounds/LoginScreen.png");
		this.app = app;
		loginController = new LoginController (app);
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		
		app.image(bLoginView,0,0);
		
	}
	
	

}
