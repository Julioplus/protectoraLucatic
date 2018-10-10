package dao;

import java.sql.SQLException;
import java.util.List;

import domain.Animal;

public interface IAnimalDAO {
	
	public List<Animal> getAnimales(String nombre);
	
	public boolean anadirAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public boolean editarAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public boolean eliminarAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public boolean listarAnimales();
}