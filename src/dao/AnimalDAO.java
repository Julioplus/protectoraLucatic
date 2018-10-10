package dao;

import java.util.ArrayList;
import java.util.List;

import domain.Animal;

public class AnimalDAO implements IAnimalDAO{

	public List<Animal> getAnimales(String categoria){
		
		List<Animal> animales = new ArrayList<>();
		
		if(categoria.equals("invisibles")){
			animales.add(new Animal("Grumpy Cat"));
			animales.add(new Animal("Felix El Gato"));
		}else{
			animales.add(new Animal("Garfield"));
		}
		
		return (animales);
		
	}

}