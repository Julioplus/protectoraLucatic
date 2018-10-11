package dao;
import java.sql.Time;
import java.util.ArrayList;

import domain.Categoria;
import domain.Descripcion;
import domain.Animal;
public class Prueba 
{

	public static ArrayList<Animal> coleccion = new ArrayList<>();
    
    @SuppressWarnings("deprecation")
    public Prueba() {
        coleccion.add(new Animal("Nieve", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
        coleccion.add(new Animal("Nieve2", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
        coleccion.add(new Animal("Nieve3", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
        coleccion.add(new Animal("Nieve4", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
        coleccion.add(new Animal("Nieve5", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
    }

    public static ArrayList<Animal> getColeccion() {
    	   coleccion.add(new Animal("Nieve", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
           coleccion.add(new Animal("Nieve2", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
           coleccion.add(new Animal("Nieve3", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
           coleccion.add(new Animal("Nieve4", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
           coleccion.add(new Animal("Nieve5", new Descripcion("el más guapo", "asdfasdfasdfasdfasdfasdf"), new Time(0, 0, 0), Categoria.DISPONIBLE));
        return coleccion;
    }

    public void setColeccion(ArrayList<Animal> coleccion) {
        this.coleccion = coleccion;
    }
}
