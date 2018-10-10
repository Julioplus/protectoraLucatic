package dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import domain.Animal;

public class StockDAO {
	
	private Map<Integer, Animal> stock;
	
	public StockDAO() {
		stock = new HashMap<>();
	}
	
	public Map<Integer, Animal> getStock() {
		return stock;
	}
	
	public void setStock(Map<Integer, Animal> stock){
		this.stock = stock;
	}
	
	public void listarAnimales() {
		Integer clave;
		Iterator<Integer> animales = stock.keySet().iterator();
		 System.out.println("-- LISTADO DE ANIMALRD --");
	        while (animales.hasNext()) {
	            clave = animales.next();
	            System.out.println("[" + clave + "]: " + stock.get(clave));
	        }
	}
	
    public boolean anadirAnimal(int codigo, Animal a)   {
       
            stock.put(codigo, a);
            return true;
        
    }    
    
  

    public void eliminarProducto(int cod)  {
            stock.remove(cod);
    }
	
	
	
	

}
