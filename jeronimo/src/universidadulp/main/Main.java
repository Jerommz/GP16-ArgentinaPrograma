package universidadulp.main;

import java.time.LocalDate;
import java.util.List;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.AccesoADatos.InscripcionData;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

public class Main {

    public static void main(String[] args) {
        
        InscripcionData inscripcionDAO = new InscripcionData();
        List<Inscripcion> inscripciones = inscripcionDAO.obtenerInscripciones();

        for (Inscripcion inscripcion : inscripciones) {
            System.out.println("Alumno: " + inscripcion.getAlumno() +
                    ", Materia: " + inscripcion.getMateria() +
                    ", Nota: " + inscripcion.getNota());
        }
        
    }
}
