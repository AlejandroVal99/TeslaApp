package model;

import processing.core.PApplet;


public class AudiEtron55 extends Automobile{
	
	

	public AudiEtron55(String modelo, int precio, int velMax, double timeAceleracion, String nivelConsumo, PApplet app) {
		super(modelo, precio, velMax, timeAceleracion, nivelConsumo, app);
		// TODO Auto-generated constructor stub
		
		
		//cargarImagenes();
		 
		 
		 
	}
	public void cargarImagenes() {
		
		 for(int i = 0; i < animacion.length; i++) { 
		
		animacion[i] = app.loadImage("../Animaciones/AniAudiEtro/Audi_000"+i+".png");
		
		}
		
	}

}
