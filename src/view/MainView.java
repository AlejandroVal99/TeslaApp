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

		switch (screen) {
		
		case 1://splashScreen
			
			break;
		case 2://Log in screen
		
			break;
		case 3://sign in o register screen
			
			break;
		case 4://Select Model screen
			
			break;
		case 5://Info Model Screen
			
			break;
		case 6://Compare menu screen 
			
			break;
		case 7://Compare Screen
			
			break;
		case 8://Info delivery Screen
		
			break;
		case 9://historico Screen
			break;
		case 10://Thanks Screen
			break;
		case 11://Payment Screen
			break;

		}

	}

	public void mousePressed(){
		
	}

}
