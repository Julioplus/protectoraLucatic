package dao;

import java.util.List;

import domain.Animal;

public interface IAnimalDAO {
	
	public List<Animal> getAnimales(String nombre);
	
	public boolean anadirAnimal();
	public boolean anadirAnimal(Animal animal);
	public boolean eliminarAnimal();
	public void listarAnimal();
	
	
	
}