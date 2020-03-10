package view;

import processing.core.PApplet;
import processing.core.PImage;

public class SplashScreenView {

	private PApplet app;
	private PImage bSplashScreen;
	private int screen = 1;

	public SplashScreenView(PApplet app) {

		bSplashScreen = app.loadImage("Imagenes/Backgrounds/SplashScreen.png");
		this.app = app; 

	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void drawScreen() {

		app.image(bSplashScreen, 0, 0);

	}

	public void cambioScreen() {
		
		if(app.mouseX > 178 && app.mouseX < 235 && app.mouseY > 825 && app.mouseY < 850) {
			
			screen = 2;
			
		}
		
		
		
		
	}

}
