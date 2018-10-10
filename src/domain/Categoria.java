package domain;

public enum Categoria {
	
	RESERVADO("reservado"), 
	ADOPTADO("adoptado"), 
	INVISIBLE("invisible"),
	URGENTE("urgente"), 
	DISPONIBLE("disponible");
	
	private final String categoria;
	
	//Constructor
	private Categoria(String categoria){
		this.categoria = categoria;
	}
	
	public String getCategoria(){
		return categoria;
	}

}
