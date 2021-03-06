package view;

import processing.core.PApplet;

public class MainView extends PApplet {

	private int screen = 3;
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
			infoModelView.drawModelo(0, 524);
			
			break;
		case 6:// Compare menu screen
			
			compareMenuView.drawScreen();
			compareMenuView.drawModelo(0,186);
 
			break;
		case 7:// Compare Screen
			compareView.drawScreen();
			
			//Problema para recorrer este arreglo, solo con los modelos de tesla, o cuando los ejecuto a los dos a la vez
			//compareView.animacionTesla(82);
			compareView.drawModelo(0,186);
			compareView.animacionCompare(480);
			
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
			thanksView.drawModelo(0,200);
			
			break;

		}
		verInputs();
	}

	public void mouseClicked() {
		
		System.out.println("x "+mouseX +"y "+mouseY);

		switch (screen) {

		case 1:// splashScreen
			splashScreenView.cambioScreen();
			setScreen(splashScreenView.getScreen());
			

			break;
		case 2:// Log in screen
			
			loginView.loginVerification();
			loginView.cambioScreen();
			
			setScreen(loginView.getScreen());
			System.out.println(loginView.getScreen());

			break;
		case 3:// sign in o register screen
			
			registerView.getInfoForm();
			
			setScreen(registerView.getScreen());
			//System.out.println(screen);
			//if (mouseX > 148 && mouseX < 266 && mouseY > 640 && mouseY < 668) {
				//screen = 2;
				//}
			break;
			
		case 4:// Select Model screen
			selectModelView.escogerCarro();
			setScreen(selectModelView.getScreen());
			
			
			break;
			
		case 5:// Info Model Screen
			infoModelView.cambioScreen();
			setScreen(infoModelView.getScreen());
			break;
			
		case 6:// Compare menu screen
			compareMenuView.cambioScreen();
			setScreen(compareMenuView.getScreen());
			

			
			break;
			
		case 7:// Compare Screen
			compareView.cambioScreen();
			setScreen(compareView.getScreen());

			break;
			
		case 8:// Info delivery Screen
			deliveryView.getinfoDelivery();
			setScreen(deliveryView.getScreen());
			break;
			
		case 9:// historico Screen
			historyOrderView.cambioScreen();
			setScreen(historyOrderView.getScreen());
			splashScreenView.setScreen(1);
			loginView.setScreen(2);
			registerView.setScreen(3);
			selectModelView.setScreen(4);
			infoModelView.setScreen(5);
			compareMenuView.setScreen(6);
			compareView.setScreen(7);
			deliveryView.setScreen(8);
			paymentView.setScreen(10);
			break;
			
		case 10:// Payment Screen
			paymentView.nuevaCreditCard();
			setScreen(paymentView.getScreen());
			break;
			
		case 11:// Thanks Screen
			thanksView.cambioScreen();
			setScreen(thanksView.getScreen());
			historyOrderView.cambioScreen();
			setScreen(historyOrderView.getScreen());
			splashScreenView.setScreen(1);
			loginView.setScreen(2);
			registerView.setScreen(3);
			selectModelView.setScreen(4);
			infoModelView.setScreen(5);
			compareMenuView.setScreen(6);
			compareView.setScreen(7);
			deliveryView.setScreen(8);
			paymentView.setScreen(10);

			break;

		}
	}
	public void verInputs() {
		registerView.mostrarInputs(screen);
		loginView.mostrarInputs(screen);
		paymentView.mostrarInputs(screen);
		deliveryView.mostrarInputs(screen);
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

}
