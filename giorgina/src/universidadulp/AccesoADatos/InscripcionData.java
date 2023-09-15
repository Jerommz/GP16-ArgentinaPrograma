
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
    
    public InscripcionData(){
    con =Conexion.getConnection();
    }
//    public void guardarinscripcin(Inscripcion insc){
//     
//          String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES ( ? , ? , ?)";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setDouble(1, insc.getNota());
//             ps.setInt(2, insc.getAlumno().getIdAlumno());
//            ps.setInt(3, insc.getAteria().getIdMateria());
//            int filasAfectadas = ps.executeUpdate();
//            if (filasAfectadas > 0) {
//                ResultSet rs = ps.getGeneratedKeys();
//                if (rs.next()) {
//                    insc.setIdInscripcion(rs.getInt(1));
//                    JOptionPane.showMessageDialog(null, "Inscripción guardada exitosamente");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "No se pudo guardar la inscripción");
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al guardar la inscripción");
//        }
//       
    
    
//}
    public List <Materia>ObtenerMateriasCursadas(int id ){
    List <Materia> materias= new ArrayList<Materia>();
    
        try {
            String sql ="SELECT incripcion.idMateria, nombre , anio FROM inscripcion,"
            + "materia WHERE inscripcion.idMateria=materia.idMateria\n"
            + "OR inscripcion.idAlumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while(rs.next()){
             materia =new Materia();
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

}
