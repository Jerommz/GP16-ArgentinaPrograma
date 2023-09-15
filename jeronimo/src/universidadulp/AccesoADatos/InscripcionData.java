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
        List<Inscripcion> insc = new ArrayList();
        String sql = "select idAlumno, idMateria, nota from inscripcion";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                int idAlumno=rs.getInt("idAlumno");
                int idMateria=rs.getInt("idMateria");
                int nota=rs.getInt("nota");
                Inscripcion inscrip=new Inscripcion();
                inscrip.setAlumno(alumnoDB.buscarAlumno(idAlumno));
                inscrip.setMateria(materiaDB.buscarMateria(idMateria));
                inscrip.setNota(rs.getInt(nota));
                insc.add(inscrip);  
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER ALA BASE DE DATOS.");
        }
        return insc;
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
