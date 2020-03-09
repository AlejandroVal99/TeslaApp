package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class TeslaApp {

	private PApplet app;
	private ArrayList<User> users;
	private Automobile[] modelosTesla;
	private Automobile[] modelosCompare;

	public TeslaApp(PApplet app) {

		this.app = app;

	}

	public void registerUser(String user, String password, String email) {
		users.add(new User(user, password, email));
	}

	public boolean logInVerification(String username, String password) {

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equals(username) && (users.get(i).getPassword().equals(password))) {

				users.get(i).setActive(true);

				return true;
			}
		}
		return false;
	}

	public void tarjetaPago(String franquicia, int pam, int cvc, int fecha) {

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).isActive()) {

				users.get(i).nuevaTarjeta(franquicia, pam, cvc, fecha);

			}
		}
	}

	public void comparaAuto(Automobile tesla, Automobile otro) {

	}
}
