package model;

public class TarjetaCredito {
	
	String franquicia;
	int pam;
	int cvc;
	int fecha;

	public TarjetaCredito(String franquicia, int pam, int cvc, int fecha) {
		// TODO Auto-generated constructor stub
	}
	
	public String getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public int getPam() {
		return pam;
	}

	public void setPam(int pam) {
		this.pam = pam;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}


}
