package tp_6_gastaldello.ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args) {
        
         // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("p001", "Carlos Villagran", "Historiador");
        Profesor p2 = new Profesor("p002", "Ramon Valdez", "Economista");
        Profesor p3 = new Profesor("p003", "Roberto Gomez Bolanos", "Biologo");

        Curso c1 = new Curso("c001", "Historia");
        Curso c2 = new Curso("c002", "Contabilidad");
        Curso c3 = new Curso("c003", "Cs. Naturales");
        Curso c4 = new Curso("c004", "Marketing");
        Curso c5 = new Curso("c005", "Fisica");

        // 2. Agregar profesores y cursos a la universidad.
        Universidad u1 = new Universidad("UTN");
        u1.agregarProfesor(p1);
        u1.agregarProfesor(p2);
        u1.agregarProfesor(p3);

        u1.agregarCurso(c1);
        u1.agregarCurso(c2);
        u1.agregarCurso(c3);
        u1.agregarCurso(c4);
        u1.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        u1.asignarProfesorACurso("c001", "p001"); // Carlos
        u1.asignarProfesorACurso("c002", "p002"); // Ramon
        u1.asignarProfesorACurso("c003", "p003"); // Roberto
        u1.asignarProfesorACurso("c004", "p002"); // Ramon
        u1.asignarProfesorACurso("c005", "p003"); // Roberto
        
        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n--- Cursos con su profesor ---");
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
        c4.mostrarInfo();
        c5.mostrarInfo();

        System.out.println("\n--- Profesores con sus cursos ---");
        System.out.println(p1.getNombre() + " dicta:");
        p1.listarCursos();

        System.out.println(p2.getNombre() + " dicta:");
        p2.listarCursos();

        System.out.println(p3.getNombre() + " dicta:");
        p3.listarCursos();

        // 5. Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n--- Cambiar profesor de 'Fisica' a Carlos Villagran ---");
        u1.asignarProfesorACurso("c005", "p001"); // ahora c5 pertenece a p1
        c5.mostrarInfo();

        System.out.println(p1.getNombre() + " dicta:");
        p1.listarCursos();

        System.out.println(p3.getNombre() + " dicta:");
        p3.listarCursos(); // c5 ya no está aca

        // 6. Remover un curso y verificar que ya no aparece en la lista del profesor
        System.out.println("\n--- Eliminar curso 'Marketing' ---");
        u1.eliminarCurso("c004");
        System.out.println(p2.getNombre() + " dicta:");
        p2.listarCursos(); // c4 eliminado

        // 7. Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n--- Eliminar profesor 'Ramon Valdez' ---");
        u1.eliminarProfesor("p002");
        System.out.println(c2.getNombre() + " tiene profesor?: " + 
                           (c2.getProfesor() != null ? c2.getProfesor().getNombre() : "sin asignar"));

        // 8. Mostrar un reporte: cantidad de cursos por profesor
        System.out.println("\n--- Reporte: cantidad de cursos por profesor ---");
        for (Profesor p : new Profesor[]{p1, p2, p3}) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s).");
        }
    }

}
