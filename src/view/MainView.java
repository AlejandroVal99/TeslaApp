package view;

import processing.core.PApplet;

public class MainView extends PApplet {

	private int screen = 1;
	private SplashScreenView splashScreenView;
	private LoginView loginView;
	private RegisterView registerView;
	private SelectModelView selectModelView;
	private InfoModelView infoModelView;
	private CompareMenuView compareMenuView;
	private CompareView compareView;
	private DeliveryInfoView deliveryView;
	private PaymentView paymentView;
	private ThanksView thanksView;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");
	}

	public void settings() {
		size(414, 896);
	}

	public void setup() {
		
		

	}
	
	public void draw() {
		
	}
}
