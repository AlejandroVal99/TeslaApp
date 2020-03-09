package view;

import processing.core.PApplet;
import processing.core.PImage;

public class SplashScreenView {

	private PApplet app;
	private PImage bSplashScreen;
	private int screen;

	public SplashScreenView(PApplet app) {

		bSplashScreen = app.loadImage("Imagenes/Backgrounds/SplashScreen.png");
		this.app = app;

	}

	public void drawScreen() {

		app.image(bSplashScreen, 0, 0);

	}

}
