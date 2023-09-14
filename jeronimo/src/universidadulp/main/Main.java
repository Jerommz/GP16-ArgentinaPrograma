package universidadulp.main;

import java.time.LocalDate;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Materia;

public class Main {

    public static void main(String[] args) {

//        Alumno pablo = new Alumno(4, 12345678, "asd", "asd", LocalDate.of(1999, 9, 8), true);
//
//        AlumnoData alum = new AlumnoData();
//    alum.guardarAlumno(pablo);
//        alum.modificarAlumno(pablo);
//      alum.eliminarAlumno(4);
//      Alumno alumnoEncontrado=alum.buscarAlumno(1);
//      System.out.println("DNI: "+alumnoEncontrado.getDni());
//      System.out.println("Apellido: "+alumnoEncontrado.getApellido());
//      System.out.println("Nombre: "+alumnoEncontrado.getNombre());
//      System.out.println("Estado: "+alumnoEncontrado.isActivo());


//        AlumnoData alu = new AlumnoData();
//        for (Alumno alumno : alu.listarAlumnos()) {
//            System.out.println(alumno.getDni());
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getNombre());
        MateriaData materia = new MateriaData();
        for (Materia mat : materia.listarMateria()) {
            System.out.println(mat.getIdMateria());
            System.out.println(mat.getNombre());
            System.out.println(mat.getAnioMateria());
            System.out.println(mat.isActivo());
        }
    }
}
