package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Model3 extends Automobile {

	private PImage selectModel;
	private PImage modelPic;

	public Model3(String modelo, int precio, int velMax, double timeAcelracion, String nivelConsumo, PApplet app) {
		super(modelo, precio, velMax, timeAcelracion, nivelConsumo, app);

		selectModel = app.loadImage("../Imagenes/SelectionModel/Model3Select.png");
		modelPic = app.loadImage("../Imagenes/Modelos/Model3.png");

		animacion = new PImage[26];

		/*for (int i = 0; i < 26; i++) {
			if (i < 10) {

				animacion[i] = app.loadImage("../Animaciones/AniModel3/Tesla3_0000" + i + ".png");

			}
			if (i > 9) {

				animacion[i] = app.loadImage("../Animaciones/AniModel3/Tesla3_000" + i + ".png");

			}
		}*/

	}

	public void drawModel() {
		app.image(selectModel, 0, 0);
	}

	public void vistaModelo(int posX, int posY) {
		app.image(modelPic, posX, posY);
	}

}
