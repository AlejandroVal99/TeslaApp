package model;

import processing.core.PApplet;
import processing.core.PImage;

public class AutoCompare extends Automobile {
	
	private PImage foto;

	public AutoCompare(String modelo, int precio, int velMax, float timeAcelracion, String nivelConsumo, PImage foto,
			PApplet app) {
		super(modelo, precio, velMax, timeAcelracion, nivelConsumo, app);
		// TODO Auto-generated constructor stub
		
		this.foto = foto;
	}


	

	
	

}
