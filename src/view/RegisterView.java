package view;

import controlP5.ControlP5;
import controller.RegisterController;
import processing.core.PApplet;
import processing.core.PImage;

public class RegisterView {
	
	private String username, password, confirmPassword, email;
	private RegisterController registerController;
	private PApplet app; 
	private ControlP5 cp5;
	private String[] inputs;

	private PImage bRegisterView;
	private int screen;
	
	public RegisterView (PApplet app) {
		
		bRegisterView = app.loadImage("Imagenes/Backgrounds/SigninScreen.png");
		this.app = app;
		registerController = new RegisterController(app);
		
		cp5 = new ControlP5(app);
		inputs = new String[4];
		
		inputs[0] = "username";
		inputs[1] = "password";
		inputs[2] = "confirmPassword";
		inputs[3] = "email";

		//for (int i = 0; i < inputs.length; i++) {
			cp5.addTextfield(inputs[0]).setPosition((78), 358).setSize(250, 30)
					.setAutoClear(true);
		//}
		
	}

	public void drawScreen() {
		
		app.image(bRegisterView,0,0);
		
	}

}
