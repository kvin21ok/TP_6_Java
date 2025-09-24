package tp_6_gastaldello.ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public class Autor {
    
    private String id;
    private String nombre;
    private String nacionalidad;
    
    public Autor(){}
    
    public Autor(String id, String nombre, String nacionalidad){
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString(){
        return "Autor{"
                +"id = '" +id +'\''
                +", nombre = '" +nombre +'\''
                +", nacionalidad = '" +nacionalidad
                +'}';
    }
    
    public void mostrarInfo(){ //se podria prescindir de este metodo al tener un toString pero lo pide el tp
        System.out.println(toString());
    }

}
