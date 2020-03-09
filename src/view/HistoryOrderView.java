package view;

import controller.HistoryOrderController;
import processing.core.PApplet;
import processing.core.PImage;

public class HistoryOrderView {

	private HistoryOrderController historyController;

	private PApplet app;
	private PImage bHistoryOrder;
	private int screen;
	

	public HistoryOrderView(PApplet app) {
		bHistoryOrder = app.loadImage("Imagenes/Backgrounds/HistoricoScreen.png");
		this.app = app;
		historyController = new HistoryOrderController(app);
		// TODO Auto-generated constructor stub
	}

	public void drawScreen() {
		// TODO Auto-generated method stub
		app.image(bHistoryOrder, 0, 0);
	}
}
