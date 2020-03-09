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
	private HistoryOrderView historyOrderView;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");
	}

	public void settings() {
		size(414, 896);
	}

	public void setup() {
		
		
		splashScreenView = new SplashScreenView (this);
		loginView = new LoginView (this);
		registerView = new RegisterView  (this);
		selectModelView = new SelectModelView (this);
		infoModelView = new InfoModelView(this);
		compareMenuView = new CompareMenuView(this);
		compareView = new CompareView(this);
		paymentView = new PaymentView(this);
		deliveryView = new DeliveryInfoView(this);
		thanksView = new ThanksView(this);
		historyOrderView = new HistoryOrderView(this);
		

	}

	public void draw() {
		

		switch (screen) {

		case 1:// splashScreen
			
			splashScreenView.drawScreen();

			break;
		case 2:// Log in screen
			
			loginView.drawScreen();

			break;
		case 3:// sign in o register screen
			
			registerView.drawScreen();

			break;
		case 4:// Select Model screen
			
			selectModelView.drawScreen();
			break;
		case 5:// Info Model Screen
			
			infoModelView.drawScreen();
			
			break;
		case 6:// Compare menu screen
			
			compareMenuView.drawScreen();

			break;
		case 7:// Compare Screen
			compareView.drawScreen();
			
			break;
		case 8:// Info delivery Screen
			deliveryView.drawScreen();
			
			break;
		case 9:// historico Screen
			historyOrderView.drawScreen();
			
			break;
		case 10://Payment Screen
			paymentView.drawScreen();
			
			break;
		case 11://Thanks Screen
			thanksView.drawScreen();
			
			break;

		}

	}

	public void mousePressed() {

		switch (screen) {

		case 1:// splashScreen

			break;
		case 2:// Log in screen

			break;
		case 3:// sign in o register screen

			break;
		case 4:// Select Model screen

			break;
		case 5:// Info Model Screen

			break;
		case 6:// Compare menu screen

			break;
		case 7:// Compare Screen

			break;
		case 8:// Info delivery Screen

			break;
		case 9:// historico Screen

			break;
		case 10:// Thanks Screen

			break;
		case 11:// Payment Screen

			break;

		}
	}

}
