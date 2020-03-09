package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Model3 extends Automobile {

	private PImage selectModel;

	public Model3(String modelo, int precio, int velMax, float timeAcelracion, String nivelConsumo, PApplet app) {
		super(modelo, precio, velMax, timeAcelracion, nivelConsumo, app);

	}

}
