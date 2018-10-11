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
	public ArrayList<Animal> listarAnimalesByCategoria(Categoria actual);
	public ArrayList<Animal> listarAnimalByID(int id);
	public ArrayList<Animal> listarAnimalesByPalabra(String palabra);

}