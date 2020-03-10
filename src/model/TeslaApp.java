package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class TeslaApp {

	private PApplet app;
	private static ArrayList<User> users;
	private Automobile[] modelosTesla;
	private Automobile[] modelosCompare;
	private int posUserActive;

	public TeslaApp(PApplet app) {

		users = new ArrayList<User>();
		this.app = app;
		modelosTesla = new Automobile[3];
		modelosCompare = new Automobile[3];
		
		modelosTesla[0] = new Model3("Model 3", 52690, 145, 3,"low", app);
		

	}

	public void registerUser(String user, String password, String email) {

		users.add(new User(user, password, email));

		for (User userModel : users) {
			System.out.println(userModel.getUsername());
			System.out.println(userModel.getPassword());
			System.out.println(userModel.getEmail());
			System.out.println("====================");
		}

	}

	public boolean logInVerification(String username, String password) {

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equals(username) && (users.get(i).getPassword().equals(password))) {
				posUserActive = i;
				users.get(i).setActive(true);

				return true;
			}
		}
		return false;
	}

	public void tarjetaPago(String franquicia, String pam, String cvc, String fecha) {

		if (users.get(posUserActive).isActive()) {
			System.out.println("tengo tarjeta");
			users.get(posUserActive).nuevaTarjeta(franquicia, pam, cvc, fecha);

		}

	}

	public void deliveryInformation(String country, String state, String address) {

		if (users.get(posUserActive).isActive()) {
			System.out.println("informacion de pedido check");
			users.get(posUserActive).deliveryInfo(country, address, state);

		}

	}

	public void  crearCompra() {
		
		if(users.get(posUserActive).isActive()) {
			users.get(posUserActive).guardarCompra(users.get(posUserActive).getAutomovil(),users.get(posUserActive).getTarjetaCredito(),users.get(posUserActive).getAddress());
		}
		
	}

}
