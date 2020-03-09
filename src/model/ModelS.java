package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelS extends Automobile {

	private PImage selectModel;

	public ModelS(String modelo, int precio, int velMax, float timeAceleracion, String nivelConsumo, PApplet app) {
		super(modelo, precio, velMax, timeAceleracion, nivelConsumo, app);

	}

}
