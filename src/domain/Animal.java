package domain;

import java.sql.Time;

public class Animal {
	
	private int id;
	private String nombre;
	private Descripcion descripcion;	
	private Time fechaEntrada;
	private Time fechaSalida;
	private Categoria estado;
	//private Galeria fotos;
	
	public Animal(){
		
	}
	
	public Animal(String nombre, Descripcion descripcion, Time fechaEntrada, Categoria estado){
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.fechaEntrada=fechaEntrada;
		this.estado = estado;
	}
	
	public Animal(int id, String nombre, Descripcion descripcion, Time fechaEntrada, Time fechaSalida, Categoria estado){
		this.id = id;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.fechaEntrada=fechaEntrada;
		this.fechaSalida=fechaSalida;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Descripcion getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(Descripcion descripcion) {
		this.descripcion = descripcion;
	}

	public Time getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Time fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Time getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Time fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Categoria getEstado() {
		return estado;
	}

	public void setEstado(Categoria estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	/*public Galeria getFotos() {
		return fotos;
	}

	public void setFotos(Galeria fotos) {
		this.fotos = fotos;
	}*/

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaEntrada="
				+ fechaEntrada + ", fechaSalida=" + fechaSalida + ", estado=" + estado + "]";
	}
	
}