package view;

import controller.HistoryOrderController;
import processing.core.PApplet;
import processing.core.PImage;

public class HistoryOrderView {

	private HistoryOrderController historyController;

	private PApplet app;
	private PImage bHistoryOrder;
	private int screen = 9;
	

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

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
	
	public void cambioScreen() {
		
		if (app.mouseX > 61 && app.mouseX < 353 && app.mouseY > 797 && app.mouseY < 828) {
			screen = 4; //pantalla principal
			
		}else if (app.mouseX > 170 && app.mouseX < 247 && app.mouseY > 846 && app.mouseY < 863) {
			
			screen = 2;//pantalla de login
			
		}
		
	}
	public void pintarHistoricos(){
		
		historyController.pintarHistorico();
		
	}
}
