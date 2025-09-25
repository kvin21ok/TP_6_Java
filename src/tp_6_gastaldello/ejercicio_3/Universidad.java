package tp_6_gastaldello.ejercicio_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Gastaldello
 */
public class Universidad {
    
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(){}
    
    public Universidad(String nombre){
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p){
        if (!profesores.contains(p)){
            profesores.add(p);
        }
    }
    
    public void agregarCurso(Curso c){
        if (!cursos.contains(c)){
            cursos.add(c);
        }
    }
    
    public Profesor buscarProfesorPorId(String id){
        for (Profesor profesor: profesores){
            if (profesor.getId().equals(id)){
                return profesor;
            } 
        }
        return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo){
        for (Curso curso: cursos){
            if (curso.getCodigo().equals(codigo)){
                return curso;
            } 
        }
        return null;
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null){
            curso.setProfesor(profesor);
            System.out.println("Profe asignado!");
        } else{
            System.out.println("Curso o profe no encontrado :(");
        }
    }
    
    public void listarProfesores(){
        for (Profesor p: profesores){
            System.out.println(p.getNombre());
        }
    }
    
    public void listarCursos(){
        for (Curso c: cursos){
            System.out.println(c.getCodigo() +" - " +c.getNombre());
        }
    }
    
    public void eliminarProfesor(String id){
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null){
            // recorrer una copia de la lista para evitar ConcurrentModificationException
            for (Curso c : new ArrayList<>(profesor.getCursos())){
                c.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profe despedido");
        } else {
            System.out.println("No hay Profe con ese id");
        }
    }
    
    public void eliminarCurso(String codigo){
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null){
            if (curso.getProfesor() != null){
                curso.setProfesor(null);
            }
            cursos.remove(curso);
            System.out.println("Curso cancelado");
        } else {
            System.out.println("No hay curso con ese codigo");
        }
    }

}
