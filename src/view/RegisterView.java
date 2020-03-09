package view;

import controller.RegisterController;
import processing.core.PApplet;
import processing.core.PImage;

public class RegisterView {

	private RegisterController registerController;
	
	private PApplet app; 
	private PImage bRegisterView;
	private int screen;
	
	public RegisterView (PApplet app) {
		
		bRegisterView = app.loadImage("Imagenes/Backgrounds/SigninScreen.png");
		this.app = app;
		registerController = new RegisterController(app);
		
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		
		app.image(bRegisterView,0,0);
		
	}

}
