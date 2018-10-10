package domain;

public enum Categoria {
	
	INVISIBLES("Invisibles"),
	URGENTES("Urgentes"), 
	RESERVADOS("Reservados"),
	ADOPTADOS("Adoptados"),
	DISPONIBLES("Disponibles");
	
	private final String categoria;
	
	//Constructor
	private Categoria(String categoria){
		this.categoria = categoria;
	}
	
	public String getCategoria(){
		return categoria;
	}

}
