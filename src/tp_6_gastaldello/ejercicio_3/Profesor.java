package tp_6_gastaldello.ejercicio_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Gastaldello
 */
public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(){
        this.cursos = new ArrayList<>();
    }
    
    public Profesor(String id, String nombre, String especialidad){
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void agregarCurso(Curso c){
        if (!cursos.contains(c)){
            cursos.add(c);
            if (c.getProfesor() != this){
                c.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso c){
        if (c.getProfesor() == this){
            c.setProfesor(null);
        }
        cursos.remove(c);
    }
    
    public void listarCursos(){
        for (Curso c: cursos){
            System.out.println(c.getCodigo() +" - " +c.getNombre());
        }
    }
    
    @Override
    public String toString(){
        return "Profesor{"
                +"id = '" +id +'\''
                +", nombre = '" +nombre +'\''
                +", especialidad = '" +especialidad
                +", cursos que dicta = '" +cursos
                +'}';
    }
    
    public void mostrarInfo(){
        System.out.println(toString());
    }
    
    public List<Curso> getCursos(){
        return cursos;
    }
    
    public String getId(){
        return id;
    }
    
    public void agregarCursoInterno(Curso c){
        if (!cursos.contains(c)){
            cursos.add(c);
        }
    }

    public void eliminarCursoInterno(Curso c){
        cursos.remove(c);
    } 

}

