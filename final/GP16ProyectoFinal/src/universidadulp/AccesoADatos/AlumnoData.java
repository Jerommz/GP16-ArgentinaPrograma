package universidadulp.AccesoADatos;

//imports de paquetes y clases necesarios
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Alumno;

public class AlumnoData {

    //atributos necesarios para los metodos utilizados
    private final Connection con;

    //constructor vacio
    public AlumnoData() {
        con = Conexion.getConnection();
    }

    //metodo para agregar un nuevo alumno a la base de datos
    public void nuevoAlumno(Alumno alumno) {

        //query insertar alumno en la base de datos
        String sql = "insert into alumno(dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //seteo de idAlumno en alumnoData
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado.");
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no agregado.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno.");
        }

    }

    //metodo para buscar alumno con id en la base de datos
    public Alumno buscarAlumno(int id) {
        //query para obtener dni, apellido, nombre y fechanacimiento
        String sql = "select dni, apellido, nombre, fechaNacimiento from alumno where idAlumno = ? and estado = 1";
        Alumno alumno = null;
        try {
            
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                //seteo de datos en nueva instancia de alumno
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }

    //metodo para buscar alumno con dni en la base de datos
    public Alumno buscarAlumnoPorDni(int dni) {
        //query para obtener idAlumno, apellido, nombre, fechanacimiento
        String sql = "select idAlumno, apellido, nombre, fechaNacimiento from alumno where dni = ? and estado = 1";
        Alumno alumno = null;
        try {
            
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                //seteo de datos en nueva instancia de alumno
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(dni);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;

    }

    //metodo para modificar alumno en la base de datos
    public void modificarAlumno(Alumno alumno) {
        //query para actualizar dni, apellido, nombre, fechanacimiento
        String sql = "update alumno set dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? where idAlumno = ?";
        try {
            
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();

            //modificacion de alumno
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no modificado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error.");
        }
    }

    //metodo para eliminar alumno con id en la base de dato
    public void eliminarAlumno(int id) {
        //query para actualizar estado
        String sql = "update alumno set estado = 0 where idAlumno = ?";

        try {
            
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            //modificacion de alumno
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno.");
        }
    }

    //metodo para listar alumnos en la base de datos
    public List<Alumno> listarAlumnos() {
        //query para obtener idAlumno, dni, apellido, nombre, fechanacimiento, estado
        String sql = "SELECT  idAlumno,  dni,  apellido,  nombre,  fechaNacimiento , estado  FROM alumno WHERE estado = 1";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                //modificacion de alumno
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getNString("apellido"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                alumnos.add(alumno);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al buscar alumnos ");
        }
        return alumnos;
    }

}
