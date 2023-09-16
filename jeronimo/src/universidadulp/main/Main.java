package universidadulp.main;

import universidadulp.AccesoADatos.InscripcionData;
import universidadulp.Entidades.Inscripcion;



public class Main {

    public static void main(String[] args) {
        
        testObtenerInscripciones();
        
    }
    
    public static void testObtenerInscripciones() {
        InscripcionData id=new InscripcionData();
        
        for(Inscripcion inscripcion:id.obtenerInscripciones()){
            System.out.println("ID: "+inscripcion.getIdInscripcion());
            System.out.println("Apellido: "+inscripcion.getAlumno().getApellido());
            System.out.println("Materia: "+inscripcion.getMateria().getNombre());
        }
    }
    
}
