
package universidadulp.main;

import java.time.LocalDate;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.Entidades.Alumno;

public class Main {

    public static void main(String[] args) {
        
        Alumno pablo=new Alumno(4, 12345678,"carlos", "a", LocalDate.of(1999, 9, 8), true);
        
        AlumnoData alum=new AlumnoData();
////    alum.guardarAlumno(pablo);
////    alum.modificarAlumno(pablo);
//      alum.eliminarAlumno(4);
//      Alumno alumnoEncontrado=alum.buscarAlumno(1);
//      System.out.println("DNI: "+alumnoEncontrado.getDni());
//      System.out.println("Apellido: "+alumnoEncontrado.getApellido());
//      System.out.println("Nombre: "+alumnoEncontrado.getNombre());
//      System.out.println("Estado: "+alumnoEncontrado.isActivo());


    }

}
