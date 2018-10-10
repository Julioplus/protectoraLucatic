package dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import domain.Animal;

public class AnimalDAO implements IAnimalDAO{

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