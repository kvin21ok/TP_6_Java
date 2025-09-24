package tp_6_gastaldello.ejercicio_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Gastaldello
 */
public class Biblioteca {
    
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(){
        this.libros = new ArrayList<>();
    };
    
    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros(){
        for(Libro libro: libros){
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        for (Libro libro: libros){
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }
    
    public void eliminarLibro(String isbn){
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null){
            libros.remove(libroAEliminar);
        }
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio){
        for (Libro libro: libros){
            if (libro.getAnioPublicacion() == anio){
                libro.mostrarInfo();
            }
        }
    }
    
    public void mostrarAutoresDisponibles(){
        List<Autor> autoresListados = new ArrayList<>(); //crea una lista temporal
        for (Libro libro: libros){ //para cada libro en libros
            if (!autoresListados.contains(libro.getAutor())){ //si el autor no esta en la lista temporal
                libro.getAutor().mostrarInfo(); //mostramos info del autor
                autoresListados.add(libro.getAutor()); //llamamos a la lista temporal, guardamos el autor ya mostrado para no volver a mostrarlo de vuelta
            }
        }
    }
    
    public String getNombre(){
        return nombre;
    }
}
