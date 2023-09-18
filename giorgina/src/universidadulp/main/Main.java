
package universidadulp.main;

import java.time.LocalDate;
import java.util.List;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.InscripcionData;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

public class Main {

    public static void main(String[] args) {
        
       // Alumno pablo=new Alumno(4, 12345678,"carlos", "a", LocalDate.of(1999, 9, 8), true);
        
        //AlumnoData alum=new AlumnoData();
////    alum.guardarAlumno(pablo);
////    alum.modificarAlumno(pablo);
//      alum.eliminarAlumno(4);
//      Alumno alumnoEncontrado=alum.buscarAlumno(1);
//      System.out.println("DNI: "+alumnoEncontrado.getDni());
//      System.out.println("Apellido: "+alumnoEncontrado.getApellido());
//      System.out.println("Nombre: "+alumnoEncontrado.getNombre());
//      System.out.println("Estado: "+alumnoEncontrado.isActivo());
       // Crear una instancia de InscripcionData
        /*InscripcionData inscripcionData = new InscripcionData();

        // Crear una instancia de Alumno (sustituye con tus datos reales)
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(355); // Sustituye con el ID de un alumno existente

        // Crear una instancia de Materia (sustituye con tus datos reales)
        Materia materia = new Materia();
        materia.setIdMateria(12); // Sustituye con el ID de una materia existente
        materia.setNombre("historia del derecho");

        // Configurar una instancia de Inscripcion con los datos apropiados
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setNota(8.5); // Sustituye con la nota deseada
        inscripcion.setAlumno(alumno);
        inscripcion.setMateria(materia);

        // Llamar al método guardarinscripci0n
        inscripcionData.guardarinscripci0n(inscripcion);*/
       /* AlumnoData alu =new AlumnoData();
        MateriaData mate =new MateriaData ();
        InscripcionData id =new InscripcionData();
        Alumno lu =alu.buscarAlumno(355);
        Materia materia= mate.buscaMateria(12);
        Inscripcion insc = new Inscripcion(lu, materia, 5.7);
        id.guardarinscripci0n(insc);
funciona
*/   // Crear una instancia de InscripcionData
       /* InscripcionData inscripcionData = new InscripcionData();
         AlumnoData alu =new AlumnoData();
         Inscripcion insc =new Inscripcion();
        List<Inscripcion> inscriptos= inscripcionData.obtenerInscripcion();
        for(int i=0;i<inscriptos.size();i++){
            Inscripcion inscripcion = inscriptos.get(i);
            System.out.println("ID de Inscripción: " + inscripcion.getIdInscripcion());
        }
        */
    }
}








         

    


