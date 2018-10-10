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

	@Override
	public boolean anadirAnimal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anadirAnimal(Animal animal) {
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
		// TODO Auto-generated method stub
		
	}

}