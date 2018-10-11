
package services;

import java.sql.SQLException;
import java.util.ArrayList;
import domain.Animal;

public interface IAnimalService {
	
	public ArrayList<Animal> listarAnimalesByCategoria(String categoria);
	public Animal listarAnimalByID(int id);
	public ArrayList<Animal> listarAnimalesByPalabra(String palabra);
	public boolean anadirAnimal(String[] entrada) throws ClassNotFoundException, SQLException;
	public boolean editarAnimal(String[] entrada) throws ClassNotFoundException, SQLException;
	public boolean eliminarAnimal(String[] entrada) throws ClassNotFoundException, SQLException;

}