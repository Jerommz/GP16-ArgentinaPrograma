package universidadulp.AccesoADatos;

import java.sql.Connection;
import universidadulp.Entidades.Inscripcion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import universidadulp.Entidades.Materia;
import universidadulp.Entidades.Alumno;
import java.sql.ResultSet;

    public class InscripcionData {

    private Connection con = null;
    private MateriaData matdata;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConnection();
    }

    public void guardarinscripci0n(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion (nota,IdAlumno,idMateria) VALUES ( ? , ? , ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno(sql).getIdAlumno(0));
            ps.setInt(3, insc.getMateria().getIdMateria());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {

                 insc.setIdInscripcion(rs.getInt(1));
              
                  

                    JOptionPane.showMessageDialog(null, "Inscripción guardada exitosamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar la inscripción");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la inscripción");
        }

    }

//}
    public List<Materia> ObtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "SELECT incripcion.idMateria, nombre , anio FROM inscripcion,"
                    + "materia WHERE inscripcion.idMateria=materia.idMateria\n"
                    + "OR inscripcion.idAlumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getNString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones");
        }
        return materias;
        
        }
    public List<Inscripcion>obtenerInscripcion(){
         List<Inscripcion>inscriptos=new ArrayList<Inscripcion>();
         try {
            String sql ="SELECT * FROM inscripcion ";
            PreparedStatement ps =con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            
            while(rs.next()){
             Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alumno = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia materia = matdata.buscaMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));
                inscriptos.add(inscripcion);
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error al obtener inscripciones");   
        }
         
        
        return inscriptos; 
    }
      public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "select idInscripto, idMateria, nota from inscripcion where idAlumno = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alumno = aluData.buscarAlumno(id);
                Materia materia = matdata.buscaMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error.");
        }
        return inscripciones;
    }
    
       
    }


