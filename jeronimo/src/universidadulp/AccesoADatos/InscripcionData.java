package universidadulp.AccesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

public class InscripcionData {

    Connection con;

    MateriaData materiaDB;
    AlumnoData alumnoDB;

    public void InscripcionData() {

        con = Conexion.getConnection();

    }

//    public void nuevoInscripcion(Inscripcion insc) {
//        String sql = "insert into inscripcion(idAlumno, idMateria, nota) values (?, ?, ?, ?)";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, alumnoDB.buscarAlumno().getIdAlumno());
//            ps.setInt(2, insc);
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al guardar la inscripcion.");
//        }
//    }
    
    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "select * from inscripcion";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alumno = alumnoDB.buscarAlumno(rs.getInt("idAlumno"));
                Materia materia = materiaDB.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error.");
        }
        return inscripciones;
    }
//    
//    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
//        
//    }
//    
//    public List<Materia> obtenerMateriasCursadas(int id){
//        
//    }
//    
//    public List<Materia> obtenerMateriasNoCursadas(int id){
//        
//    }
//    
//    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
//        
//    }
//    
//    public void actualizarNota(int idAlumno, int idMateria, double nota){
//        
//    }
//    
//    public List<Alumno> obtenerAlumnosPorMateria(int idMateria){
//        
//    }

}
