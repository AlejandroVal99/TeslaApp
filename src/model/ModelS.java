package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelS extends Automobile {

	private PImage selectModel;
	private PImage modelPic;
	

	public ModelS(String modelo, int precio, int velMax, double timeAceleracion, String nivelConsumo, PApplet app) {
		super(modelo, precio, velMax, timeAceleracion, nivelConsumo, app);

		selectModel = app.loadImage("../Imagenes/SelectionModel/ModelSSelect.png");
		modelPic= app.loadImage("../Imagenes/Modelos/ModelS.png");
 
		/*animacion = new PImage[26];

		for (int i = 0; i < 26; i++) {
			if (i < 10) {

				animacion[i] = app.loadImage("../Animaciones/AniModelS/TeslaS_0000" + i + ".png");

			}
			if (i > 9) {

				animacion[i] = app.loadImage("../Animaciones/AniModelS/TeslaS_000" + i + ".png");

			}
		}*/

	}

	public void drawModel() {
		app.image(selectModel, 0, 0);
	}
	
	public void vistaModelo(int posX,int posY) {
		app.image(modelPic, posX, posY);
	}
	
}
