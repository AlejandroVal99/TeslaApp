package model;

import processing.core.PApplet;

public class PeugeotE208 extends Automobile {

	public PeugeotE208(String modelo, int precio, int velMax, double timeAceleracion, String nivelConsumo,
			PApplet app) {
		super(modelo, precio, velMax, timeAceleracion, nivelConsumo, app);
		// TODO Auto-generated constructor stub

		//cargarImagenes();
		
	}
	
	public void cargarImagenes() {
		for (int i = 0; i < 26; i++) {

			animacion[i] = app.loadImage("../Animaciones/AniPeugeot/peugeot_000" + i + ".png");

		}
	}

}
