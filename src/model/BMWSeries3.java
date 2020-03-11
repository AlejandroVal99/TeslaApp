package model;

import processing.core.PApplet;
import processing.core.PImage;

public class BMWSeries3 extends Automobile {

	public BMWSeries3(String modelo, int precio, int velMax, double timeAceleracion, String nivelConsumo, PApplet app) {
		super(modelo, precio, velMax, timeAceleracion, nivelConsumo, app);
		// TODO Auto-generated constructor stub
		//cargarImagenes();

	}

	public void cargarImagenes() {
		for (int i = 0; i < animacion.length; i++) {

			animacion[i] = app.loadImage("../Animaciones/AniBMWs3/BMWs3_000" + i + ".png");

		}

	}
}
