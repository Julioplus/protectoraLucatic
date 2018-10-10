package dao;

import java.util.List;

import domain.Animal;

public interface IAnimalDAO {
	
	public List<Animal> getAnimales(String nombre);
}