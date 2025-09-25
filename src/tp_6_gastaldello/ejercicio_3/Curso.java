package tp_6_gastaldello.ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(){}
    
    public Curso(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Profesor getProfesor(){
        return profesor;
    }
    public void setProfesor(Profesor p){
        if (this.profesor == p) return;
        // quitar del profesor anterior
        if (this.profesor != null){
            this.profesor.eliminarCursoInterno(this);
        }
        this.profesor = p;
        // agregar al nuevo profesor
        if (p != null){
            p.agregarCursoInterno(this);
        }
    }
    
    @Override
    public String toString(){
        return "Curso{"
                +"codigo = '" +codigo +'\''
                +", nombre = '" +nombre +'\''
                +", profesor = '" +(profesor != null ? profesor.getNombre(): "sin asignar")
                +'}';
    }
    
    public void mostrarInfo(){
        System.out.println(toString());
    }

}
