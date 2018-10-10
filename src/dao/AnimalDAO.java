package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import domain.*;

import domain.Animal;

public class AnimalDAO implements IAnimalDAO{

		public ArrayList<Animal> mostrarAnimales(String nombre) {
			
			
			return null;
		}
		
		public boolean anadirAnimal(Animal nuevo) {
			String query = "INSERT INTO animales (id_animal, nombre, fecha_entrada, fecha_salida, descripcion, cabecera, estado)"
					+ "  VALUES('"+nuevo.getId()+"', '"+nuevo.getNombre()+"', '"+nuevo.getFechaEntrada()+"', null, '"
					+nuevo.getDescripcion().getCuerpo()+"', '"+nuevo.getDescripcion().getCabecera()+"', '"+nuevo.getEstado()+"')";
			return ConexionBBDD.anadir(query);
		}
		
		public boolean editarAnimal(Animal nuevo) {
			String query = "UPDATE animales SET nombre = '"+nuevo.getNombre()+"', fecha_entrada = '"+nuevo.getFechaEntrada()+
					"', fecha_salida = '"+nuevo.getFechaSalida()+"', descripcion = '"+nuevo.getDescripcion().getCuerpo()+
					"', cabecera = '"+nuevo.getDescripcion().getCabecera()+"', estado = '"+nuevo.getEstado()+
					"' WHERE id_animal = '"+nuevo.getId()+"'";
			return ConexionBBDD.modificar(query);
		}
		
		public boolean eliminarAnimal(Animal nuevo) {
			String query = "DELETE FROM animales WHERE '"+nuevo.getId()+"'";
			return ConexionBBDD.borrar(query);
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
	
	private Map<Integer, Animal> animalStock;
	
	public AnimalDAO(){
		animalStock = new HashMap<>();
	}
	
	public Map<Integer, Animal> getAnimalStock(){
		return animalStock;
	}
	
	public void setStock(Map<Integer, Animal> animalStock){
		this.animalStock = animalStock;
		
	}
	

	@Override
	public boolean anadirAnimal() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean anadirAnimal(int cod, Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean eliminarAnimal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void listarAnimal() {
		Integer id;
		Iterator<Integer> animales = animalStock.keySet().iterator();
		System.out.println("Listando animales...");
		while(((Iterator<Integer>) animalStock).hasNext()){
			id = animales.next();
			System.out.println("[" + id + "]: " + animalStock.get(id));
		}
		
	}

	@Override
	public List<Animal> getAnimales(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}



}