package universidadulp.Vistas;

//imports de paquetes y clases necesarios
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.AccesoADatos.InscripcionData;

public class AlumnosPorMateria extends javax.swing.JPanel {

    //atributos necesarios para los metodos utilizados
    private InscripcionData inscripcionDB = new InscripcionData();
    private AlumnoData alumnoDB = new AlumnoData();
    private Connection con;

    //modelo para tabla Inscriptos usada en el metodo mostrarTablaInscriptos
    String[] col1 = {"ID", "DNI", "Alumno"};
    DefaultTableModel modeloInscriptos = new DefaultTableModel(null, col1) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    //modelo para tabla NoInscriptos usada en el metodo mostrarTablaNoInscriptos
    String[] col2 = {"ID", "DNI", "Alumno"};
    DefaultTableModel modeloNoInscriptos = new DefaultTableModel(null, col2) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    //constructor vacio
    public AlumnosPorMateria() {
        initComponents();
        con = Conexion.getConnection();
        mostrarComboBox();
        limpiarTablaInscriptos();
        mostrarTablaInscriptas();
        limpiarTablaNoInscriptos();
        mostrarTablaNoInscriptas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelMid = new javax.swing.JPanel();
        panelMidTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbListaMaterias = new javax.swing.JComboBox<>();
        panelMidBot = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelBot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMateriasInscriptas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaMateriasNoInscriptas = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        panelTop.setPreferredSize(new java.awt.Dimension(0, 60));
        panelTop.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listado de alumnos por materia");
        panelTop.add(jLabel2, java.awt.BorderLayout.CENTER);

        add(panelTop, java.awt.BorderLayout.NORTH);

        panelMid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        panelMid.setPreferredSize(new java.awt.Dimension(0, 80));
        panelMid.setLayout(new java.awt.BorderLayout());

        panelMidTop.setPreferredSize(new java.awt.Dimension(0, 80));
        panelMidTop.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione una materia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        panelMidTop.add(jLabel1, gridBagConstraints);

        jcbListaMaterias.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jcbListaMaterias.setForeground(java.awt.Color.white);
        jcbListaMaterias.setPreferredSize(new java.awt.Dimension(200, 40));
        jcbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaMateriasActionPerformed(evt);
            }
        });
        panelMidTop.add(jcbListaMaterias, new java.awt.GridBagConstraints());

        panelMid.add(panelMidTop, java.awt.BorderLayout.NORTH);

        panelMidBot.setPreferredSize(new java.awt.Dimension(0, 80));
        panelMidBot.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Inscriptos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 275);
        panelMidBot.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("No inscriptos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 275, 0, 0);
        panelMidBot.add(jLabel4, gridBagConstraints);

        panelMid.add(panelMidBot, java.awt.BorderLayout.SOUTH);

        add(panelMid, java.awt.BorderLayout.CENTER);

        panelBot.setPreferredSize(new java.awt.Dimension(0, 500));
        panelBot.setLayout(new java.awt.GridLayout(1, 0));

        jtTablaMateriasInscriptas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(21, 39, 43)));
        jtTablaMateriasInscriptas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTablaMateriasInscriptas.setForeground(java.awt.Color.white);
        jtTablaMateriasInscriptas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTablaMateriasInscriptas.setRowHeight(32);
        jScrollPane1.setViewportView(jtTablaMateriasInscriptas);

        panelBot.add(jScrollPane1);

        jtTablaMateriasNoInscriptas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(21, 39, 43)));
        jtTablaMateriasNoInscriptas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTablaMateriasNoInscriptas.setForeground(java.awt.Color.white);
        jtTablaMateriasNoInscriptas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTablaMateriasNoInscriptas.setRowHeight(32);
        jScrollPane2.setViewportView(jtTablaMateriasNoInscriptas);

        panelBot.add(jScrollPane2);

        add(panelBot, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    //action del combobox que lista las materias
    private void jcbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaMateriasActionPerformed
        // TODO add your handling code here:
        limpiarTablaInscriptos();
        mostrarTablaInscriptas();
        limpiarTablaNoInscriptos();
        mostrarTablaNoInscriptas();

    }//GEN-LAST:event_jcbListaMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbListaMaterias;
    private javax.swing.JTable jtTablaMateriasInscriptas;
    private javax.swing.JTable jtTablaMateriasNoInscriptas;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelMidBot;
    private javax.swing.JPanel panelMidTop;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables

    //metodo para rellenar la tabla materias inscriptas con los datos requeridos
    public void mostrarTablaInscriptas() {
        jtTablaMateriasInscriptas.setModel(modeloInscriptos);
        //codigo para obtener el modelo de las columnas y cambiar su tamaño
        TableColumnModel columna = jtTablaMateriasInscriptas.getColumnModel();
        columna.getColumn(0).setMaxWidth(30);
        //query para obtener idAlumno
        String sql = "select inscripcion.idAlumno, inscripcion.idMateria "
                + "from inscripcion "
                + "inner join alumno on alumno.idAlumno = inscripcion.idAlumno "
                + "inner join materia on materia.idMateria = inscripcion.idMateria "
                + "where materia.nombre = ?";
        String nombreM = jcbListaMaterias.getSelectedItem().toString();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreM);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //declaracion de variables que seran mostradas en cada fila de la tabla
                int idAlumno = rs.getInt("idAlumno");
                int dni = alumnoDB.buscarAlumno(idAlumno).getDni();
                String apellido = alumnoDB.buscarAlumno(idAlumno).getApellido();
                String nombre = alumnoDB.buscarAlumno(idAlumno).getNombre();
                String alumno = nombre + " " + apellido;
                //array para rellenar la tabla
                String dataM[] = {String.valueOf(idAlumno), String.valueOf(dni), alumno};
                modeloInscriptos.addRow(dataM);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    //metodo para rellenar la tabla materias no inscriptas con los datos requeridos
    public void mostrarTablaNoInscriptas() {
        jtTablaMateriasNoInscriptas.setModel(modeloNoInscriptos);
        //codigo para obtener el modelo de las columnas y cambiar su tamaño
        TableColumnModel columna = jtTablaMateriasNoInscriptas.getColumnModel();
        columna.getColumn(0).setMaxWidth(30);
        //query para obtener idAlumno
        String sql = "SELECT idAlumno, nombre "
                + "FROM alumno "
                + "WHERE estado = 1 AND "
                + "idAlumno NOT IN(SELECT idAlumno "
                + "FROM inscripcion "
                + "WHERE inscripcion.idMateria = ?);";
        //obtener item seleccionado en el combobox
        String nombreM = jcbListaMaterias.getSelectedItem().toString();
        //llamo al metodo buscarMateria para obtener la id de la materia
        int idMateria = buscarMateria(nombreM);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //declaracion de variables que seran mostradas en cada fila de la tabla
                int idAlumno = rs.getInt("idAlumno");
                int dni = alumnoDB.buscarAlumno(idAlumno).getDni();
                String apellido = alumnoDB.buscarAlumno(idAlumno).getApellido();
                String nombre = alumnoDB.buscarAlumno(idAlumno).getNombre();
                String alumno = nombre + " " + apellido;
                //array para rellenar la tabla
                String dataNM[] = {String.valueOf(idAlumno), String.valueOf(dni), alumno};
                modeloNoInscriptos.addRow(dataNM);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    //metodo para rellenar el combobox
    public void mostrarComboBox() {
        //query para obtener nombre de la materia
        String sql = "select nombre from materia WHERE 1 order by idMateria ASC";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //declaracion de variables que seran mostradas en el combobox
                String nombre = rs.getString("nombre");
                jcbListaMaterias.addItem(nombre);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    //metodo para limpar/actualizar la tabla inscriptos
    public void limpiarTablaInscriptos() {
        //declaracion de modelo con el modelo de la tabla para eliminar todas las filas
        DefaultTableModel mod = (DefaultTableModel) jtTablaMateriasInscriptas.getModel();
        mod.setRowCount(0);
    }
    //metodo para limpar/actualizar la tabla inscriptos
    public void limpiarTablaNoInscriptos() {
        //declaracion de modelo con el modelo de la tabla para eliminar todas las filas
        DefaultTableModel mod = (DefaultTableModel) jtTablaMateriasNoInscriptas.getModel();
        mod.setRowCount(0);
    }

    //metodo para buscar materia por nombre
    public int buscarMateria(String nombre) {
        int idMateria = 0;
        //query para obtener idMateria
        String sql = "select idMateria "
                + "from materia "
                + "where nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idMateria = rs.getInt("idMateria");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos./buscarMateria");
        }
        return idMateria;
    }
}
