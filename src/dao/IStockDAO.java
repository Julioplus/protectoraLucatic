package dao;

import domain.Animal;

public interface IStockDAO {
	
	public void listarAnimales();
	public boolean anadirAnimal(int codigo, Animal a);
	public void eliminarAnimal(int codigo);
	
	
	
}
