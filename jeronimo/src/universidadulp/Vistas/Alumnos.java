package universidadulp.Vistas;

import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtDniAlumno = new javax.swing.JTextField();
        jtNombreAlumno = new javax.swing.JTextField();
        jtApellidoAlumno = new javax.swing.JTextField();
        jdFechaNacAlumno = new com.toedter.calendar.JDateChooser();
        jcbEstadoAlumno = new javax.swing.JCheckBox();
        jbNuevoAlumno = new javax.swing.JButton();
        jgModificarAlumno = new javax.swing.JButton();
        jbEliminarAlumno = new javax.swing.JButton();
        jbBuscarAlumno = new javax.swing.JButton();
        jtID = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Alumno");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Documento");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("Fecha de nacimiento");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(java.awt.Color.black);
        jLabel10.setText("Estado");

        jtDniAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtDniAlumno.setForeground(java.awt.Color.black);

        jtNombreAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtNombreAlumno.setForeground(java.awt.Color.black);

        jtApellidoAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtApellidoAlumno.setForeground(java.awt.Color.black);

        jdFechaNacAlumno.setDateFormatString("yyyy-MM-dd");

        jcbEstadoAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbEstadoAlumno.setForeground(java.awt.Color.black);

        jbNuevoAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbNuevoAlumno.setForeground(java.awt.Color.black);
        jbNuevoAlumno.setText("Nuevo");
        jbNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumnoActionPerformed(evt);
            }
        });

        jgModificarAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jgModificarAlumno.setForeground(java.awt.Color.black);
        jgModificarAlumno.setText("Modificar");
        jgModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgModificarAlumnoActionPerformed(evt);
            }
        });

        jbEliminarAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbEliminarAlumno.setForeground(java.awt.Color.black);
        jbEliminarAlumno.setText("Eliminar");
        jbEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarAlumnoActionPerformed(evt);
            }
        });

        jbBuscarAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbBuscarAlumno.setForeground(java.awt.Color.black);
        jbBuscarAlumno.setText("Buscar");
        jbBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarAlumnoActionPerformed(evt);
            }
        });

        jtID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtID.setForeground(java.awt.Color.black);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addGap(0, 168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbEstadoAlumno)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDniAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscarAlumno)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jbNuevoAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminarAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(jgModificarAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jdFechaNacAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDniAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jbBuscarAlumno)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jcbEstadoAlumno))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jdFechaNacAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoAlumno)
                    .addComponent(jbEliminarAlumno)
                    .addComponent(jgModificarAlumno))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jbEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAlumnoActionPerformed
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
