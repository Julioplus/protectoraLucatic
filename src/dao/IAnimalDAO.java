package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import domain.Animal;
import domain.Categoria;

public interface IAnimalDAO {
	
	public boolean anadirAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public boolean editarAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public boolean eliminarAnimal(Animal animal) throws ClassNotFoundException, SQLException;
	public ArrayList<Animal> listarAnimalesByCategoria(Categoria actual) throws ClassNotFoundException, SQLException;
	public ArrayList<Animal> listarAnimalByID(int id) throws ClassNotFoundException, SQLException;;
	public ArrayList<Animal> listarAnimalesByPalabra(String palabra) throws ClassNotFoundException, SQLException;;

}