package model;

import processing.core.PImage;
import processing.core.PApplet;
import processing.core.PFont;

public abstract class Automobile {
	
	protected String modelo;
	protected int precio;
	protected double timeAceleracion;
	protected String nivelConsumo;
	protected PImage foto;
	protected int velMax;
	protected PImage selectModel;
	protected PApplet app;
	protected PImage[] animacion;
	protected int contador = 0;
	protected PFont raleway;
	
	
	public Automobile(String modelo, int precio, int velMax, double timeAceleracion, String nivelConsumo, PApplet app) {
		
		this.modelo = modelo;
		this.precio = precio;
		this.velMax = velMax;
		this.timeAceleracion = timeAceleracion;
		this.nivelConsumo = nivelConsumo;
		this.app = app;
		this.contador = 0; 
		animacion = new PImage[26];
		raleway = app.createFont("Tipografia/Raleway-Medium.ttf", 70);
		
	}
	public void drawModel() {
		
	}

	public void vistaModelo(int posX, int posY) {
		
		
		
	}
	
	
	public void mostrarInfoModel() {
		app.textFont(raleway, 41);
		app.text(modelo, 264, 190);//modelo
		app.textFont(raleway, 41); 
		app.text("$"+precio, 135, 250);//precio
		app.text(""+timeAceleracion, 40, 350);//tiempoAceleration
		app.text(velMax, 175, 350);//velocidad
		
	}
	
	public void animacionModelo(int posy) {
		app.image(animacion[contador],0,posy);
		if(contador < animacion.length) {
		if(app.frameCount % 2 == 0) {
			contador++;
		}
		}
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getTimeAceleracion() {
		return timeAceleracion;
	}

	public void setTimeAceleracion(double timeAceleracion) {
		this.timeAceleracion = timeAceleracion;
	}

	public String getNivelConsumo() {
		return nivelConsumo;
	}

	public void setNivelConsumo(String nivelConsumo) {
		this.nivelConsumo = nivelConsumo;
	}

	public PImage getFoto() {
		return foto;
	}

	public void setFoto(PImage foto) {
		this.foto = foto;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public PImage getSelectModel() {
		return selectModel;
	}

	public void setSelectModel(PImage selectModel) {
		this.selectModel = selectModel;
	}

}
