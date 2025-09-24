package tp_6_gastaldello.ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public class Libro {
    
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    public Libro(){}
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Libro{"
                +"isbn = '" +isbn +'\''
                +", titulo = '" +titulo +'\''
                +", anio de publicacion = " +anioPublicacion
                +", autor = '" +autor
                +'}';
    }
    
    public void mostrarInfo(){
        System.out.println(toString());
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    
    public Autor getAutor(){
        return autor;
    }

}
