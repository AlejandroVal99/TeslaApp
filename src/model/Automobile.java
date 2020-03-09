package model;

import processing.core.PImage;
import processing.core.PApplet;

public abstract class Automobile {
	
	protected String modelo;
	protected int precio;
	protected float timeAceleracion;
	protected String nivelConsumo;
	protected PImage foto;
	protected int velMax;
	protected PImage selectModel;
	protected PApplet app;
	
	public Automobile(String modelo, int precio, int velMax, float timeAceleracion, String nivelConsumo, PApplet app) {
		
		this.modelo = modelo;
		this.precio = precio;
		this.velMax = velMax;
		this.timeAceleracion = timeAceleracion;
		this.nivelConsumo = nivelConsumo;
		this.app = app;
		
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

	public float getTimeAceleracion() {
		return timeAceleracion;
	}

	public void setTimeAceleracion(float timeAceleracion) {
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
