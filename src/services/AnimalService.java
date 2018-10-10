package services;

import java.util.List;
import dao.AnimalDAO;
import dao.IAnimalDAO;
import domain.Animal;

public class AnimalService implements IAnimalService {
	
	private IAnimalDAO AnimalDAO = new AnimalDAO();
	
    public List<Animal> getAnimales(String categoria) {
       return AnimalDAO.getAnimales(categoria);
    }

}