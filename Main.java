import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Profesor profesor = new Profesor(123456789, "Juan Perez", "Matematicas");
        Alumno alumno1 = new Alumno(987654321, "María Gonzalez");
        Alumno alumno2 = new Alumno(123456789, "Carlos Martinez");

        Asignatura asignatura1 = new Asignatura(profesor, 101, "08:00", "Algebra");
        Asignatura asignatura2 = new Asignatura(profesor, 102, "10:00", "Calculo");
        Asignatura asignatura3 = new Asignatura(profesor, 103, "12:00", "Geometria");

        Grupo grupo1 = new Grupo("1A", 'A', 30);
        grupo1.getAlumnos()[0] = alumno1;
        grupo1.getAlumnos()[1] = alumno2;

        Scanner scanner = new Scanner(System.in);


        // a
        System.out.println("Aula de la 3ra. asignatura del profesor: " + asignatura3.getAula());

        // b
        System.out.println("Asignaturas que imparte el profesor:");
        System.out.println(asignatura1.getNombre());
        System.out.println(asignatura2.getNombre());
        System.out.println(asignatura3.getNombre());

        // c
        System.out.println("Alumnos del grupo que recibe la asignatura1:");
        for (Alumno alumno : grupo1.getAlumnos()) {
            if (alumno != null) {
                System.out.println("Nombre: " + alumno.getNombre() + ", DNI: " + alumno.getDni());
            }
        }

        // e
        System.out.println("Asignaturas recibidas por el primer grupo de alumno1:");
        Grupo[] gruposAlumno1 = new Grupo[2];
        gruposAlumno1[0] = grupo1;

        for (Grupo grupo : gruposAlumno1) {
            if (grupo != null) {
                System.out.println("Grupo: " + grupo.getCurso() + grupo.getLetra());

                System.out.println("Asignatura: " + asignatura1.getNombre());
            }
        }

        // f
        System.out.println("Ingrese el nombre de la asignatura:");
        String nombreAsignaturaBuscada = scanner.nextLine();

        if (nombreAsignaturaBuscada.equals(asignatura1.getNombre())) {
            System.out.println("El profesor que imparte " + nombreAsignaturaBuscada + " es: " + asignatura1.getProfesor().getNombre());
        } else if (nombreAsignaturaBuscada.equals(asignatura2.getNombre())) {
            System.out.println("El profesor que imparte " + nombreAsignaturaBuscada + " es: " + asignatura2.getProfesor().getNombre());
        } else if (nombreAsignaturaBuscada.equals(asignatura3.getNombre())) {
            System.out.println("El profesor que imparte " + nombreAsignaturaBuscada + " es: " + asignatura3.getProfesor().getNombre());
        } else {
            System.out.println("La asignatura ingresada no existe.");
        }


        // g
        System.out.println("Nombres de los alumnos inscriptos en el grupo de la 2da. asignatura del profesor:");
        for (Alumno alumno : grupo1.getAlumnos()) {
            if (alumno != null) {
                System.out.println("Nombre: " + alumno.getNombre());
            }
        }

        // h:
        // La asociación es una relación entre dos clases que indica que una clase utiliza o está relacionada con la otra de alguna manera.
        // La composición es una relación fuerte entre dos clases, donde la existencia de un objeto depende de la existencia del otro. En otras palabras, una clase (todo) contiene a la otra (parte) y no puede existir independientemente.
        // La agregación es una relación más débil donde una clase puede tener una referencia a otra, pero la existencia de un objeto no depende de la existencia del otro.
    }
}
