
package services;

import java.util.List;

import domain.Animal;

public interface IAnimalService {
	
	public List<Animal> getAnimales(String categoria);

}