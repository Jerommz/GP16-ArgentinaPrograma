
package universidadulp.AccesoADatos;
import java.sql.Connection;
import universidadulp.Entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MateriaData {
    private Connection con = null;
    public MateriaData(){
     con =Conexion.getConnection();
    }
    public void guardarMateria(Materia materia){
    String sql ="INSERT INTO materia(  nombre ,  anio, estado) VALUES ( ? ,? ,?)";
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //ps.setInt(1 , materia.getIdMateria());
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
            materia.setIdMateria(1);
            JOptionPane.showMessageDialog(null, "Materia guardada");
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la materia ");
            
        }
    
    }
    public void modificarMateria(Materia materia){
    String sql ="UPDATE materia  SET nombre =? , anio =? , estado=?  WHERE idMateria=?";
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            
            
           int cambio = ps.executeUpdate();
           if (cambio == 1){
           JOptionPane.showMessageDialog(null, "la  materia fue modificado exitosamente");
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder modificar datos de la materia");
            
        }
    }
    public void eliminarMateria(int idMa){
        //el borrado es logico
    String sql="UPDATE materia  SET estado = 0 WHERE idMateria =?";
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1 , idMa);
            int eliminar =ps.executeUpdate();
            if (eliminar ==1){
            JOptionPane.showMessageDialog(null,"la materia  se elimino exitosamente ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en eliminar ña materia  ");
            
        }

} 
public Materia buscaMateria(int idMateria){
    String sql ="SELECT idMateria ,  nombre ,  anio  FROM  materia  WHERE estado =1";
    Materia materia  =null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
            materia  =new Materia ();
            materia.setIdMateria(idMateria);
            materia.setNombre(rs.getNString("nombre"));
            materia.setAnioMateria(idMateria);
            
           materia.isActivo();
            
            }else{
            
            JOptionPane.showMessageDialog(null, "El alumno no existe con ese id");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al buscar alumnos ");
        }
    
            
     return materia;       
            
    }
  /*  public   List <Materia> listarMateria(){
    String sql ="SELECT  idMateria,  nombre,  anio,  estado FROM materia  WHERE estado = 1";
    ArrayList <Materia >materias =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
            Materia  materia =new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("anio"));
            materia.setActivo(true);
            materias.add(materia);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al buscar alumnos ");
        }
    
            
     return materias      

}*/

}
