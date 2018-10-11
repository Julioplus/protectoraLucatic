package domain;

import java.util.ArrayList;

public class Galeria {

	ArrayList<String> direcciones;
	
	public Galeria() {}
	
	public Galeria(String direccion) {
		this.direcciones.add(direccion);
	}
	
	public Galeria(ArrayList<String> direcciones) {
		this.direcciones = direcciones;
	}

	public ArrayList<String> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(ArrayList<String> direcciones) {
		this.direcciones = direcciones;
	}
	
	public String getDireccion(int index) {
		return direcciones.get(index);
	}

	public void setDireccion(String direccion) {
		this.direcciones.add(direccion);
	}
	
}
