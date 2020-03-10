package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelX extends Automobile {

	private PImage selectModel;
	private PImage modelPic;

	public ModelX(String modelo, int precio, int velMax, double timeAcelracion, String nivelConsumo, PApplet app) {
		super(modelo, precio, velMax, timeAcelracion, nivelConsumo, app);

		selectModel = app.loadImage("../Imagenes/SelectionModel/ModelXSelect.png");
		modelPic = app.loadImage("../Imagenes/Modelos/ModelX.png");

		

		for (int i = 0; i < animacion.length; i++) {
			
				animacion[i] = app.loadImage("../Animaciones/AniModelX/TeslaX_000" + i + ".png");

			System.out.println(i);
		}
	}

	public void drawModel() {
		app.image(selectModel, 0, 0);
	}

	public void vistaModelo(int posX, int posY) {
		app.image(modelPic, posX, posY);
	}

}
