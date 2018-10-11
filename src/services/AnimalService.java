package services;

import java.sql.ResultSet;
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
	
	@Override // Listado
	public ArrayList<Animal> listarAnimalesByCategoria(String categoria) {
		ArrayList<Animal> busqueda = new ArrayList<Animal>();
		try {
			switch (Categoria.valueOf(categoria)) {
				case RESERVADO:
					busqueda.addAll(AnimalDAO.listarAnimalesByCategoria(Categoria.valueOf(categoria)));
					break;
				case DISPONIBLE:
					busqueda.addAll(AnimalDAO.listarAnimalesByCategoria(Categoria.valueOf(categoria)));
				case INVISIBLE:
					busqueda.addAll(AnimalDAO.listarAnimalesByCategoria(Categoria.valueOf(categoria)));
				case URGENTE:
					busqueda.addAll(AnimalDAO.listarAnimalesByCategoria(Categoria.valueOf(categoria)));
					break;
				default:
					busqueda.addAll(AnimalDAO.listarAnimalesByCategoria(Categoria.valueOf(categoria)));
					break;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return busqueda;
	}

	@Override //Detalle
	public ArrayList<Animal> listarAnimalByID(int id) {
		ArrayList<Animal> busqueda = new ArrayList<Animal>();
		try {
			busqueda = AnimalDAO.listarAnimalByID(id);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return busqueda;
			
	}
	
	@Override // Buscador
	public ArrayList<Animal> listarAnimalesByPalabra(String palabra) {
		ArrayList<Animal> busqueda = new ArrayList<Animal>();
		try {
			busqueda = AnimalDAO.listarAnimalesByPalabra(palabra);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return busqueda;
			
	}

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