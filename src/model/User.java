package model;

import java.util.ArrayList;

public class User {
	
	private String username;
	private String email;
	private String password;
	private String country;
	private String address;
	private String state;
	private boolean active;
	
	private Automobile comAutomovil;
	private Automobile automovil;
	
	private TarjetaCredito tarjetaCredito;
	private ArrayList<Historico> historicos;
	
	public User(String username, String password, String email) {
		 
		this.username = username;
		this.email = email;
		this.password = password;
		active = false;	
		
	}
	
	public void deliveryInfo(String country, String address, String state) {
		this.address = address;
		this.country = country;
		this.state = state;
	} 
	
	public void nuevaTarjeta (String franquicia, String pam, String cvc, String fecha) {
		tarjetaCredito = new TarjetaCredito(franquicia, pam, cvc, fecha);
	}
	
	public void guardarCompra(Automobile vehiculo, TarjetaCredito medioPago, String direction) {
		
		historicos.add(new Historico(vehiculo,medioPago,direction));
		
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Automobile getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automobile automovil) {
		this.automovil = automovil;
	}

	public TarjetaCredito getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public ArrayList<Historico> getHistoricos() {
		return historicos;
	}

	public void setHistoricos(ArrayList<Historico> historicos) {
		this.historicos = historicos;
	}

	
	

}
