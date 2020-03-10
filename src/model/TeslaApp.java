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

		// Arreglo de vehiculos tesla

		// modelo 3
		modelosTesla[0] = new Model3(" 3", 52690, 145, 3.2, "low", app);
		// modelo s
		modelosTesla[1] = new ModelS(" S", 99690, 163, 2.7, "low", app);
		// modelo x
		modelosTesla[2] = new ModelX(" X", 94490, 163, 2.4, "low", app);

		// Arreglo de vehiculos a Comparar
		modelosCompare[0] = new BMWSeries3("BMWSeries3", 52690, 139, 8.1, "medium", app);
		modelosCompare[1] = new PeugeotE208("PeugeotE208", 99690, 184, 5.6, "high", app);
		modelosCompare[2] = new AudiEtron55("AuidEtron55", 94490, 134, 5.7, "low", app);

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

		System.out.println(users.get(0).getUsername() + " " + (users.get(0).getPassword()));
		for (int i = 0; i < users.size(); i++) {
			if (username.equals(users.get(i).getUsername()) && (password.equals(users.get(i).getPassword()))) {
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

	public void crearCompra() {

		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).guardarCompra(users.get(posUserActive).getAutomovil(),
					users.get(posUserActive).getTarjetaCredito(), users.get(posUserActive).getAddress());
		}

	}

	public void comprarModel3() {
		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).setAutomovil(modelosTesla[0]);
			;
		}
	}

	public void comprarModelS() {
		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).setAutomovil(modelosTesla[1]);
			;
		}
	}

	public void comprarModelX() {
		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).setAutomovil(modelosTesla[2]);
			;
		}
	}

	public void mostrarModel3Selec() {
		modelosTesla[0].drawModel();
	}

	public void mostrarModelXSelec() {
		modelosTesla[2].drawModel();
	}

	public void mostrarModelSSelec() {
		modelosTesla[1].drawModel();
	}

	public void mostrarInfoModel() {

		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).getAutomovil().mostrarInfoModel();
			;
		}
	}

	public void mostrarModelo(int posX, int posY) {
		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).getAutomovil().vistaModelo(posX, posY);
			;
		}
	}

	public void comparoPeugeot() {

		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).setComAutomovil(modelosCompare[1]);
		}

	}

	public void comparoBMW() {

		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).setComAutomovil(modelosCompare[0]);
		}

	}

	public void comparoAudiE() {

		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).setComAutomovil(modelosCompare[2]);
		}

	}

	public void animacionTeslaCar(int posY) {
		
		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).getAutomovil().animacionModelo(posY);;
		}
		
	}

	public void animacionCompareCar(int posY) {
		
		if (users.get(posUserActive).isActive()) {
			users.get(posUserActive).getComAutomovil().animacionModelo(posY);;
		}
		
	}

}
