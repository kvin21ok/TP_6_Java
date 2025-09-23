package tp_6_gastaldello.ejercicio_1;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        
        //Crear al menos cinco productos con diferentes categorías  
        Producto p1 = new Producto("0001", "Fernet Bronca", 17000.00, 1000, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("0002", "Camisa Hawaiana", 30000.50, 1050, CategoriaProducto.ROPA);
        Producto p3 = new Producto("0003", "AiFon 700 Serie B", 1000000.99, 10, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("0004", "Sillon Casados Con Hijos", 100.00, 1, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("0005", "CocoColo", 3000.00, 1000, CategoriaProducto.ALIMENTOS);
        //y agregarlos al inventario.
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        //Listar todos los productos mostrando su información y categoría
        System.out.println("==--Lista de productos--==");
        inventario.listarProductos();
        
        //Buscar un producto por ID y mostrar su información.
        System.out.println("==--Buscamos por Id--==");
        Producto buscado = inventario.buscarProductoPorId("0004");
        if (buscado != null){
            buscado.mostrarInfo();
        }
        
        //Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("==--Filtrados por categoria especifica--==");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        //Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("==--Eliminar y listar restantes--==");
        inventario.eliminarProducto("0002");
        inventario.listarProductos();
        
        //Actualizar el stock de un producto existente.
        System.out.println("==--Actualizamos stcok de prod existente--==");
        inventario.actualizarStock("0005", 0);
        inventario.buscarProductoPorId("0005").mostrarInfo();
        
        //Mostrar el total de stock disponible.
        System.out.println("==--Total de stock disponible--==");
        System.out.println(inventario.obtenerTotalStock());
        
        //Obtener y mostrar el producto con mayor stock. 
        System.out.println("==--Prod con mayor stock--==");
        Producto maxStock = inventario.obtenerProductoConMayorStock();
        if (maxStock != null){
            maxStock.mostrarInfo();
        }
        
        //Filtrar productos con precios entre $1000 y $3000
        System.out.println("==--Filtrado por precio--==");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        //Mostrar las categorías disponibles con sus descripciones. 
        System.out.println("==--Categorias disp con sus descricpiones--==");
        inventario.mostrarCategoriasDisponibles();

    }

}
