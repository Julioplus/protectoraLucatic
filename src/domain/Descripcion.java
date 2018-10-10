package domain;

import java.io.Serializable;

public class Descripcion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cabecera;
	private String cuerpo;
	
	public Descripcion(){
		
	}
	
	//TODO Check Descripcion methods
	
	/*public Descripcion(String cabecera){
		this.cabecera=cabecera;
	}*/
	
	public Descripcion(String cuerpo){
		this.cuerpo=cuerpo;
	}

	public Descripcion(String cabecera, String cuerpo){
		this.cabecera=cabecera;
		this.cuerpo=cuerpo;
	}
	
	
	public String getCabecera() {
		return cabecera;
	}

	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	
	
}
