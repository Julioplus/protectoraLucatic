
package services;

import java.util.ArrayList;
import domain.Animal;

public interface IAnimalService {
	
	public ArrayList<Animal> getAnimales(String categoria);
	public ArrayList<Animal> listarAnimalesByCategoria(String categoria);
	public ArrayList<Animal> listarAnimalByID(int id);
	public ArrayList<Animal> listarAnimalesByPalabra(String palabra);

	public Animal getAnimal(int id) {
		
	}
}