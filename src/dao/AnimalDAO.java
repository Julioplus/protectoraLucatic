package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import domain.*;

public class AnimalDAO implements IAnimalDAO{
	
	private ConexionDB conector = new ConexionDB();
	
	public AnimalDAO() {};
	
	@Override // Listado
	public ArrayList<Animal> listarAnimalesByCategoria(Categoria actual) throws ClassNotFoundException, SQLException {
		System.out.println("--- en DAOlistarAnimalesByCategoria");
		String query = "SELECT * FROM animales WHERE estado ='"+actual.toString().toLowerCase()+"'";
		System.out.println("---"+query);
		ArrayList<Animal> busqueda = veranimal(conector.mostrar(query));
		return busqueda;
	}

	@Override //Detalle
	public ArrayList<Animal> listarAnimalByID(int id) throws ClassNotFoundException, SQLException {
		ArrayList<Animal> busqueda = veranimal(conector.mostrar("SELECT * FROM animales WHERE id_animal = "+id));
		return busqueda;
	}
	
	@Override // Buscador
	public ArrayList<Animal> listarAnimalesByPalabra(String palabra) throws ClassNotFoundException, SQLException {
		ArrayList<Animal> busqueda = veranimal(conector.mostrar("select * from animales where cuerpo like'%"+palabra+"%'"));
		return busqueda;
	}
	
	public boolean anadirAnimal(Animal nuevo) throws ClassNotFoundException, SQLException {
		String query = "INSERT INTO animales (id_animal, nombre, fecha_entrada, fecha_salida, descripcion, cabecera, estado)"
				+ "  VALUES('"+nuevo.getId()+"', '"+nuevo.getNombre()+"', '"+nuevo.getFechaEntrada()+"', null, '"
				+nuevo.getDescripcion().getCuerpo()+"', '"+nuevo.getDescripcion().getCabecera()+"', '"+nuevo.getEstado()+"')";
		return conector.anadir(query);
	}
	
	public boolean editarAnimal(Animal nuevo) throws ClassNotFoundException, SQLException {
		String query = "UPDATE animales SET nombre = '"+nuevo.getNombre()+"', fecha_entrada = '"+nuevo.getFechaEntrada()+
				"', fecha_salida = '"+nuevo.getFechaSalida()+"', descripcion = '"+nuevo.getDescripcion().getCuerpo()+
				"', cabecera = '"+nuevo.getDescripcion().getCabecera()+"', estado = '"+nuevo.getEstado()+
				"' WHERE id_animal = '"+nuevo.getId()+"'";
		return conector.modificar(query);
	}
	
	public boolean eliminarAnimal(Animal nuevo) throws ClassNotFoundException, SQLException {
		String query = "DELETE FROM animales WHERE '"+nuevo.getId()+"'";
		return conector.borrar(query);
	}	
	
	private ArrayList<Animal> veranimal(ResultSet tupla)throws ClassNotFoundException, SQLException{
		Animal encontrado = new Animal();
		ArrayList<Animal> resultado = new ArrayList<Animal>();
		while(tupla.next()){
			encontrado.setId(tupla.getInt("ID_ANIMAL"));
			encontrado.setNombre(tupla.getString("NOMBRE"));
			encontrado.setFechaEntrada(tupla.getTime("FECHA_ENTRADA"));
			encontrado.setEstado((Categoria.valueOf((tupla.getString("ESTADO")).toUpperCase())));
			encontrado.setDescripcion(new Descripcion(tupla.getString("CABECERA"),tupla.getString("CUERPO")));
			//encontrado.setFotos(new Galeria(urlImagen(encontrado.getId())));
			resultado.add(encontrado);
		}
		return resultado;
	}	
	
	public String urlImagen(int id)throws ClassNotFoundException, SQLException {
		return conector.mostrargaleria("SELECT URL FROM galeria_animales WHERE ID_ANIMAL ="+id);
	}

}