package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.RegisterController;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class RegisterView {

	private String username, password, confirmPassword, email;
	private RegisterController registerController;
	private PApplet app;
	private ControlP5 cp5;
	private String[] inputs;
	private PFont ralewayM;

	private PImage bRegisterView;
	private int screen = 3;

	public RegisterView(PApplet app) {

		bRegisterView = app.loadImage("Imagenes/Backgrounds/SigninScreen.png");
		this.app = app;
		registerController = new RegisterController(app);

		ralewayM = app.createFont("Tipografia/Raleway-Medium.ttf", 20);

		cp5 = new ControlP5(app);
		inputs = new String[4];

		inputs[0] = "username";
		inputs[1] = "email";
		inputs[2] = "password";
		inputs[3] = "confirmPassword";

		// for (int i = 0; i < inputs.length; i++) {
		cp5.addTextfield(inputs[0]).setPosition((78), 358).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[1]).setPosition((78), 431).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();
		
		cp5.addTextfield(inputs[2]).setPosition((78), 503).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();
		
		cp5.addTextfield(inputs[3]).setPosition((78), 575).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();
		// }

	}

	public void drawScreen() {

		app.image(bRegisterView, 0, 0);

	}

	public void getInfoForm() {

		if (app.mouseX > 148 && app.mouseX < 266 && app.mouseY > 640 && app.mouseY < 668) {
			
			username = cp5.get(Textfield.class, "username").getText();
			password = cp5.get(Textfield.class, "password").getText();
			confirmPassword = cp5.get(Textfield.class, "confirmPassword").getText();
			email = cp5.get(Textfield.class, "email").getText();

			

			// Esto valida que un string sea igual a otro
			if (password.equals(confirmPassword)) {
				screen = 2;
				registerController.getInfoForm(username, password, confirmPassword, email);
				
			}
		}
	}
	
	public int cambioScreen() {
		if (app.mouseX > 148 && app.mouseX < 266 && app.mouseY > 640 && app.mouseY < 668) {
		screen = 2;
		
		}
		return screen;
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void mostrarInputs(int screen2) {
		
		if(screen2 != 3) {
			cp5.hide();
		}
		if(screen2 == 3) {
			cp5.show();
		}
		
		
		// TODO Auto-generated method stub
		
	}

	
}
