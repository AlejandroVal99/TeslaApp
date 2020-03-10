package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelX extends Automobile{
	
	private PImage selectModel;
	
	public ModelX(String modelo, int precio, int velMax, double timeAcelracion, String nivelConsumo,
				PApplet app) {
			super(modelo, precio, velMax, timeAcelracion, nivelConsumo, app);

			
		}

}
