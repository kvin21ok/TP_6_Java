package tp_6_gastaldello.ejercicio_1;

/**
 *
 * @author Kevin Gastaldello
 */
public class Producto {
    
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    public Producto(){}
    
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public void mostrarInfo(){
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        return "Producto{" 
                + "id = '" +id +'\'' 
                +", nombre = '" +nombre +'\'' 
                +", precio = " +precio +
                ", cantidad = " +cantidad +
                ", categoria = " +categoria.getDescripcion() +
                '}';
    }
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        if (cantidad >= 0){ //la cantidad no puede ser negativa
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad a actualizar no puede ser negativa, se deja el valor antiguo");
        }
    }
    
    public CategoriaProducto getCategoria(){
        return categoria;
    }

}
