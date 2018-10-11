
package services;

import java.util.ArrayList;
import java.util.List;

import domain.Animal;

public interface IAnimalService {
	
	public ArrayList<Animal> getAnimales(String categoria);

}