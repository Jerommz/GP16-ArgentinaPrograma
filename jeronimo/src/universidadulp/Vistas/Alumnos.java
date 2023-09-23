package universidadulp.Vistas;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.Entidades.Alumno;

public class Alumnos extends javax.swing.JInternalFrame {

    AlumnoData alumnoDB = new AlumnoData();
    private Connection con;

    public Alumnos() {
        initComponents();
        con = Conexion.getConnection();
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
        jtID = new javax.swing.JTextField();
        jdFechaNacAlumno = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtDniAlumno = new javax.swing.JTextField();
        jtNombreAlumno = new javax.swing.JTextField();
        jtApellidoAlumno = new javax.swing.JTextField();
        jcbEstadoAlumno = new javax.swing.JCheckBox();
        jbNuevoAlumno = new javax.swing.JButton();
        jgModificarAlumno = new javax.swing.JButton();
        jbEliminarAlumno = new javax.swing.JButton();
        jbBuscarAlumno = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(439, 466));

        jPanel1.setPreferredSize(new java.awt.Dimension(439, 466));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jtID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtID.setForeground(java.awt.Color.black);
        jPanel1.add(jtID);
        jtID.setBounds(167, 81, 24, 23);

        jdFechaNacAlumno.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jdFechaNacAlumno);
        jdFechaNacAlumno.setBounds(170, 300, 170, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Alumno");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(167, 6, 72, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Documento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(68, 82, 75, 19);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Apellido");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(96, 195, 47, 19);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Nombre");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(91, 132, 52, 19);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("Fecha de nacimiento");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 300, 134, 19);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(java.awt.Color.black);
        jLabel10.setText("Estado");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(99, 257, 44, 19);

        jtDniAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtDniAlumno.setForeground(java.awt.Color.black);
        jPanel1.add(jtDniAlumno);
        jtDniAlumno.setBounds(203, 81, 101, 23);

        jtNombreAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtNombreAlumno.setForeground(java.awt.Color.black);
        jPanel1.add(jtNombreAlumno);
        jtNombreAlumno.setBounds(173, 131, 131, 23);

        jtApellidoAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtApellidoAlumno.setForeground(java.awt.Color.black);
        jPanel1.add(jtApellidoAlumno);
        jtApellidoAlumno.setBounds(173, 194, 131, 23);

        jcbEstadoAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbEstadoAlumno.setForeground(java.awt.Color.black);
        jPanel1.add(jcbEstadoAlumno);
        jcbEstadoAlumno.setBounds(173, 257, 24, 24);

        jbNuevoAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbNuevoAlumno.setForeground(java.awt.Color.black);
        jbNuevoAlumno.setText("Nuevo");
        jbNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevoAlumno);
        jbNuevoAlumno.setBounds(90, 380, 65, 31);

        jgModificarAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jgModificarAlumno.setForeground(java.awt.Color.black);
        jgModificarAlumno.setText("Modificar");
        jgModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgModificarAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(jgModificarAlumno);
        jgModificarAlumno.setBounds(260, 380, 77, 31);

        jbEliminarAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbEliminarAlumno.setForeground(java.awt.Color.black);
        jbEliminarAlumno.setText("Eliminar");
        jbEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminarAlumno);
        jbEliminarAlumno.setBounds(170, 380, 70, 31);

        jbBuscarAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbBuscarAlumno.setForeground(java.awt.Color.black);
        jbBuscarAlumno.setText("Buscar");
        jbBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscarAlumno);
        jbBuscarAlumno.setBounds(317, 77, 65, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 413, 489);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarAlumnoActionPerformed
        // TODO add your handling code here:
        try {
            if (jtDniAlumno.getText() == null) {
                JOptionPane.showMessageDialog(null, "Para buscar, introduzca el DNI del alumno.");
            } else {
                int dni = Integer.parseInt(jtDniAlumno.getText());
                String sql = "select idAlumno, apellido, nombre, fechaNacimiento, estado from alumno where dni = ?";
                try {
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1, dni);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        int id = rs.getInt("idAlumno");
                        jtID.setText(String.valueOf(alumnoDB.buscarAlumno(id).getIdAlumno()));
                        jtDniAlumno.setText(String.valueOf(alumnoDB.buscarAlumno(id).getDni()));
                        jtApellidoAlumno.setText(alumnoDB.buscarAlumno(id).getApellido());
                        jtNombreAlumno.setText(alumnoDB.buscarAlumno(id).getNombre());
                        jcbEstadoAlumno.setSelected(alumnoDB.buscarAlumno(id).isActivo());
                        jdFechaNacAlumno.setDate(Date.valueOf(alumnoDB.buscarAlumno(id).getFechaNac()));
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos.");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un DNI.");
        }
    }//GEN-LAST:event_jbBuscarAlumnoActionPerformed

    private void jbNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlumnoActionPerformed
        // TODO add your handling code here:
        int dniDB = Integer.parseInt(jtDniAlumno.getText());
        String sql = "select * from alumno where dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dniDB);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Ya hay un alumno registrado con ese DNI.");
            } else {
                if (jtDniAlumno.getText() == null || jtApellidoAlumno.getText() == null || jtNombreAlumno.getText() == null || jdFechaNacAlumno.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos.");
                } else {
                    int dni = Integer.parseInt(jtDniAlumno.getText());
                    String apellido = jtApellidoAlumno.getText();
                    String nombre = jtNombreAlumno.getText();
                    String fechaNac = ((JTextField) jdFechaNacAlumno.getDateEditor().getUiComponent()).getText();
                    boolean estado = jcbEstadoAlumno.isEnabled();
                    Alumno alu = new Alumno(dni, apellido, nombre, LocalDate.parse(fechaNac), estado);
                    alumnoDB.nuevoAlumno(alu);
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error nuevo.");
        }
    }//GEN-LAST:event_jbNuevoAlumnoActionPerformed

    private void jbEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAlumnoActionPerformed
        // TODO add your handling code here:
        if (jtApellidoAlumno.getText() == null || jtNombreAlumno.getText() == null || jdFechaNacAlumno.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Primero debe realizar una busqueda.");
        } else {
            try {
                int dni = Integer.parseInt(jtDniAlumno.getText());
                String sql = "select idAlumno from alumno where dni=?";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, dni);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt("idAlumno");
                    alumnoDB.eliminarAlumno(id);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
            }
        }
    }//GEN-LAST:event_jbEliminarAlumnoActionPerformed

    private void jgModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgModificarAlumnoActionPerformed
        // TODO add your handling code here:
        if (jtApellidoAlumno.getText() == null || jtNombreAlumno.getText() == null || jdFechaNacAlumno.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Primero debe realizar una busqueda.");
        } else {
            int dni = Integer.parseInt(jtDniAlumno.getText());
            String apellido = jtApellidoAlumno.getText();
            String nombre = jtNombreAlumno.getText();
            String fechaNac = ((JTextField) jdFechaNacAlumno.getDateEditor().getUiComponent()).getText();
            boolean estado = jcbEstadoAlumno.isSelected();
            String sql = "select idAlumno from alumno where dni=?";

            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, dni);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt("idAlumno");
                    Alumno alu = new Alumno(id, dni, apellido, nombre, LocalDate.parse(fechaNac), estado);
                    alumnoDB.modificarAlumno(alu);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error");
            }
        }
    }//GEN-LAST:event_jgModificarAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscarAlumno;
    private javax.swing.JButton jbEliminarAlumno;
    private javax.swing.JButton jbNuevoAlumno;
    private javax.swing.JCheckBox jcbEstadoAlumno;
    private com.toedter.calendar.JDateChooser jdFechaNacAlumno;
    private javax.swing.JButton jgModificarAlumno;
    private javax.swing.JTextField jtApellidoAlumno;
    private javax.swing.JTextField jtDniAlumno;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombreAlumno;
    // End of variables declaration//GEN-END:variables

}
