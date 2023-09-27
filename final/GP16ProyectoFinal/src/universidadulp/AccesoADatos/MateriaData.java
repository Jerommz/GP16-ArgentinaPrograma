package universidadulp.AccesoADatos;

//imports de paquetes y clases necesarios
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Materia;

public class MateriaData {
    //atributos necesarios para los metodos utilizados
    private final Connection con;

    //constructor vacio
    public MateriaData() {
        con = Conexion.getConnection();
    }

    //metodo agregar nueva materia
    public void nuevaMateria(Materia materia) {
        //query para insertar nombre, año, estado
        String sql = "insert into materia(nombre, año, estado)"
                + "values (?, ?, ?)";
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            //seteo de valores de query sacados del parametro
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            
            //ejecucion de query
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregada.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }

    }

    public Materia buscarMateria(int id) {
        //query para obtener nombre, año, estado
        String sql = "select nombre, año, estado from materia where idMateria = ? and estado = 1";
        Materia materia = null;
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            
            //seteo de valores de query sacados del parametro
            ps.setInt(1, id);
            
            //ejecucion de query
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //declaracion de nueva materia
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "Materia no encontrada.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
        return materia;
    }

    public void modificarMateria(Materia materia) {
        //query para actualizar nombre, año
        String sql = "update materia set nombre = ?, año = ? where idMateria = ?";
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            
            //seteo de valores de query sacados del parametro
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.getIdMateria());
            
            //ejecucion de query
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada.");
            } else {
                JOptionPane.showMessageDialog(null, "Materia no modificada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public void eliminarMateria(int id) {
        //query para actualizar estado
        String sql = "update materia set estado = 0 where idMateria = ?";

        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            
            //seteo de valores de query sacados del parametro
            ps.setInt(1, id);
            
            //ejecucion de query
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno.");
        }
    }
//    

    public List<Materia> listarMateria() {
        //query para obtener todos los datos en materia
        String sql = "SELECT idMateria, nombre, año, estado FROM materia WHERE estado = 1";
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            
            //ejecucion de query
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //declaracion de nueva materia
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al buscar alumnos ");
        }
        return materias;
    }

}
