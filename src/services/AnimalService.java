package services;

import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import dao.AnimalDAO;
import dao.IAnimalDAO;
import domain.Animal;
import domain.Categoria;
import domain.Descripcion;

public class AnimalService implements IAnimalService {
	
	private IAnimalDAO AnimalDAO = new AnimalDAO();
	/*
	private String nombre;
	private Descripcion descripcion;	
	private Time fechaEntrada;
	private Time fechaSalida;
	private Categoria estado;
	 */

	public boolean anadirAnimal(String[] entrada) throws ClassNotFoundException, SQLException {
		Animal nuevo = new Animal(entrada[0], new Descripcion(entrada[1], entrada[2]), Time.valueOf(entrada[3]), Categoria.valueOf(entrada[4]));
		
		return true;
	}
	public boolean editarAnimal(String[] entrada) throws ClassNotFoundException, SQLException {
		Animal nuevo = new Animal(entrada[0], new Descripcion(entrada[1], entrada[2]), Time.valueOf(entrada[3]), Categoria.valueOf(entrada[4]));
		return true;
	}
	public boolean eliminarAnimal(String[] entrada) throws ClassNotFoundException, SQLException {
		Animal nuevo = new Animal(entrada[0], new Descripcion(entrada[1], entrada[2]), Time.valueOf(entrada[3]), Categoria.valueOf(entrada[4]));
		return true;
	}
	
	
	
	
	@Override
	public ArrayList<Animal> getAnimales(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Animal getAnimal(int id) {
		// TODO Auto-generated method stub
		return null;
	}
//    public List<Animal> getAnimales(String categoria) {
//       return AnimalDAO.getAnimales(categoria);
//    }

}