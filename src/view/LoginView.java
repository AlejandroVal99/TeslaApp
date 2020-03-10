package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.LoginController;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class LoginView {
	private LoginController loginController;

	private String username, password;
	private PApplet app;
	private PImage bLoginView;
	private int screen = 2; 
	private ControlP5 cp5;
	private String[] inputs;
	private PFont ralewayM;

	public LoginView(PApplet app) {
		bLoginView = app.loadImage("Imagenes/Backgrounds/LoginScreen.png");
		this.app = app;
		loginController = new LoginController(app);

		ralewayM = app.createFont("Tipografia/Raleway-Medium.ttf", 20);

		cp5 = new ControlP5(app);
		inputs = new String[2];

		inputs[0] = "username";
		inputs[1] = "password";

		cp5.addTextfield(inputs[0]).setPosition((78), 411).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[1]).setPosition((78), 483).setSize(250, 30).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1)).setFont(ralewayM)
				.getCaptionLabel().hide();
	}

	public void drawScreen() {

		app.image(bLoginView, 0, 0);

	}

	public void loginVerification() {
		if (app.mouseX > 148 && app.mouseX < 266 && app.mouseY > 549 && app.mouseY < 581) {

			username = cp5.get(Textfield.class, "username").getText();
			password = cp5.get(Textfield.class, "password").getText();
			System.out.println(username+" "+password);
			
			if (loginController.logInVerifi(username, password)) {
				
				screen = 4;

			}
		}
	}
	public void cambioScreen() {
		
		if (app.mouseX > 319 && app.mouseX < 381 && app.mouseY > 829 && app.mouseY < 845) {
			
			screen = 3;
			
		}
		
	}
	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void mostrarInputs(int screen2) {
		
		if (screen2 != 2) {
			cp5.hide();
		}
		if (screen2 == 2) {
			cp5.show();
		}
	}

}
