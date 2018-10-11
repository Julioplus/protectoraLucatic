package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Animal;
import domain.Categoria;

public interface IAnimalDAO {
	
	public List<Animal> getAnimales(String nombre);
	
	public boolean anadirAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public boolean editarAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public boolean eliminarAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public <e> ArrayList<Animal> listarAnimales(e o);
	public ArrayList<Animal> listarAnimalbyID(int id);
}