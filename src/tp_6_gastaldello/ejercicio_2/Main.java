package tp_6_gastaldello.ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args) {
        
        //creamos biblioteca
        Biblioteca biblio1 = new Biblioteca("Manuel Belgrano");
        
        //creamos al menos 3 autores
        Autor autor1 = new Autor("0001", "Garcia Marquez", "colombiano");
        Autor autor2 = new Autor("0002", "Luis Borges", "argentino");
        Autor autor3 = new Autor("0003", "Allan Poe", "estadounidense");
        
        //agregamos 5 libros asociados a algunos de los autores ya creados a la biblioteca
        biblio1.agregarLibro("00L1", "El hacedor", 1960, autor2);
        biblio1.agregarLibro("00L2", "Ficciones", 1944, autor2);
        biblio1.agregarLibro("00L3", "El aleph", 1949, autor2);
        biblio1.agregarLibro("00L4", "Cien años de soledad", 1967, autor1);
        biblio1.agregarLibro("00L5", "El otoño del patriarca", 1975, autor1);
        
        //Listar todos los libros con su información y la del autor.
        biblio1.listarLibros();
        
        //Buscar un libro por su ISBN y mostrar su información.
        biblio1.buscarLibroPorIsbn("00L3").mostrarInfo();
        
        //Filtrar y mostrar los libros publicados en un año específico.
        biblio1.filtrarLibrosPorAnio(1967);
        
        //Eliminar un libro por su ISBN y listar los libros restantes.
        biblio1.eliminarLibro("00L1"); //borramos "El hacedor"
        biblio1.listarLibros();
        
        //Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("Cantidad de libros disponibles en " +biblio1.getNombre() +" es: " +biblio1.obtenerCantidadLibros());
        
        //Listar todos los autores de los libros disponibles en la biblioteca.
        biblio1.mostrarAutoresDisponibles();
        
        autor3.mostrarInfo();

    }


}
