package domain;

public class Animal {
	
	private int id;
	private String nombre;
	private String descripcion;
	private Categoria categoria;
	
	public Animal(){}
	
	public Animal(String nombre){
		this.nombre = nombre;
	}
	
	public Animal(String nombre, Categoria categoria){
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
	public Animal(int id, String nombre, Categoria categoria, String descripcion){
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria
				+ "]";
	}


}