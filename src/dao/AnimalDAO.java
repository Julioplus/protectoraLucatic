package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator; //Usado no activado
import java.util.List;
import java.util.Map;
import domain.*; //Usado no implimentado

public class AnimalDAO implements IAnimalDAO{
	
	private Map<Integer, Animal> stock;
	private ConexionDB conector = new ConexionDB();
	
	public AnimalDAO() {
		stock = new HashMap<>();
	}
	
	public Map<Integer, Animal> getStock() {
		return stock;
	}
	
	public void setStock(Map<Integer, Animal> stock){
		this.stock = stock;
	}

	public ArrayList<Animal> mostrarAnimales(String nombre) {
		
		
		return null;
	}
	
	public boolean anadirAnimal(Animal nuevo) throws ClassNotFoundException, SQLException {
		String query = "INSERT INTO animales (id_animal, nombre, fecha_entrada, fecha_salida, descripcion, cabecera, estado)"
				+ "  VALUES('"+nuevo.getId()+"', '"+nuevo.getNombre()+"', '"+nuevo.getFechaEntrada()+"', null, '"
				+nuevo.getDescripcion().getCuerpo()+"', '"+nuevo.getDescripcion().getCabecera()+"', '"+nuevo.getEstado()+"')";
		return conector.anadir(query);
	}
	
	public boolean editarAnimal(Animal nuevo) throws ClassNotFoundException, SQLException {
		String query = "UPDATE animales SET nombre = '"+nuevo.getNombre()+"', fecha_entrada = '"+nuevo.getFechaEntrada()+
				"', fecha_salida = '"+nuevo.getFechaSalida()+"', descripcion = '"+nuevo.getDescripcion().getCuerpo()+
				"', cabecera = '"+nuevo.getDescripcion().getCabecera()+"', estado = '"+nuevo.getEstado()+
				"' WHERE id_animal = '"+nuevo.getId()+"'";
		return conector.modificar(query);
	}
	
	public boolean eliminarAnimal(Animal nuevo) throws ClassNotFoundException, SQLException {
		String query = "DELETE FROM animales WHERE '"+nuevo.getId()+"'";
		return conector.borrar(query);
	}	
	
	public void  veranimal(Animal nuevo)throws ClassNotFoundException, SQLException{
		String query= "SELECT * FROM animales where ID_ANIMAL="+nuevo.getId();
		java.sql.ResultSet resultadoquery = conector.mostraranimal(query);
		while(resultadoquery.next()){
			nuevo.setId(resultadoquery.getInt("ID_ANIMAL"));
			nuevo.setNombre(resultadoquery.getString("NOMBRE"));
			nuevo.setFechaEntrada(resultadoquery.getTime("FECHA_ENTRADA"));
			nuevo.setEstado((Categoria.valueOf(resultadoquery.getString("ESTADO"))));
			//nuevo.setDescripcion((Descripcion.));
		}
		
	}
	
//	public List<Animal> getAnimales(String categoria){
//		
//		List<Animal> animales = new ArrayList<>();
//		
//		if(categoria.equals("invisibles")){
//			animales.add(new Animal("Grumpy Cat"));
//			animales.add(new Animal("Felix El Gato"));
//		}else{
//			animales.add(new Animal("Garfield"));
//		}
//		
//		return (animales);
//		
//	}

	/* Revisar
	@Override
	public boolean listarAnimales() {
		Integer id;
		Iterator<Integer> animales = animalDAO.keySet().iterator();
		System.out.println("Listando animales...");
		while(((Iterator<Integer>) animalStock).hasNext()){
			id = animales.next();
			System.out.println("[" + id + "]: " + animalStock.get(id));
		}
	}*/

	public List<Animal> getAnimales(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override // Este método hay que matarlo después
	public boolean listarAnimales() {
		// TODO Auto-generated method stub
		return false;
	}

}