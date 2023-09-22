package universidadulp.Vistas;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import universidadulp.AccesoADatos.Conexion;

public class AlumnosPorMateria extends javax.swing.JInternalFrame {

    private Connection con;

    public AlumnosPorMateria() {
        initComponents();
        con = Conexion.getConnection();
        mostrarComboBox();
    }
    
    class jPanelGradient extends JPanel {
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(52,143,80);
            Color color2 = new Color(86,180,211);
            GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jPanelGradient();
        jcbListaMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaAlumnoMaterias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(458, 523));
        jPanel1.setLayout(null);

        jcbListaMaterias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbListaMaterias.setForeground(java.awt.Color.black);
        jcbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaMateriasActionPerformed(evt);
            }
        });
        jPanel1.add(jcbListaMaterias);
        jcbListaMaterias.setBounds(232, 68, 161, 25);

        jtTablaAlumnoMaterias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtTablaAlumnoMaterias.setForeground(java.awt.Color.black);
        jtTablaAlumnoMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtTablaAlumnoMaterias);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 420, 350);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Listado de alumnos por materia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(85, 6, 308, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Seleccione una materia:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 74, 154, 19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        setBounds(0, 0, 473, 523);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaMateriasActionPerformed
        // TODO add your handling code here:
        mostrarTabla();
    }//GEN-LAST:event_jcbListaMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbListaMaterias;
    private javax.swing.JTable jtTablaAlumnoMaterias;
    // End of variables declaration//GEN-END:variables

    public void mostrarTabla() {
        String[] col = {"ID", "DNI", "Apellido", "Nombre"};
        DefaultTableModel modelo = new DefaultTableModel(null, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jtTablaAlumnoMaterias.setModel(modelo);
        jtTablaAlumnoMaterias.setAutoCreateRowSorter(true);
        TableColumnModel columna = jtTablaAlumnoMaterias.getColumnModel();
        columna.getColumn(0).setMaxWidth(30);

        String sql = "SELECT alumno.idAlumno, alumno.dni, alumno.apellido, alumno.nombre\n"
                + "FROM `alumno`\n"
                + "INNER JOIN inscripcion\n"
                + "ON alumno.idAlumno = inscripcion.idAlumno\n"
                + "INNER JOIN materia\n"
                + "ON materia.idMateria = inscripcion.idMateria\n"
                + "WHERE materia.nombre=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, jcbListaMaterias.getSelectedItem().toString());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("alumno.idAlumno"));
                String dni = String.valueOf(rs.getInt("alumno.dni"));
                String apellido = rs.getString("alumno.apellido");
                String nombre = rs.getString("alumno.nombre");
                String dataM[] = {id, dni, apellido, nombre};
                modelo.addRow(dataM);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error..");
        }

    }

    public void mostrarComboBox() {
        String sql = "select nombre from materia WHERE 1 order by idMateria ASC";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                jcbListaMaterias.addItem(nombre);
            }
        } catch (SQLException ex) {
        }
    }

}
