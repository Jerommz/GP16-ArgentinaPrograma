package universidadulp.Vistas;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Materia;

public final class Materias extends javax.swing.JInternalFrame {

    String[] col = {"ID", "Nombre"};
    DefaultTableModel modelo = new DefaultTableModel(null, col) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    MateriaData materiaDB = new MateriaData();
    private Connection con;

    public Materias() {
        initComponents();
        con = Conexion.getConnection();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtIdMateria = new javax.swing.JTextField();
        jtNombreMateria = new javax.swing.JTextField();
        jtAnioMateria = new javax.swing.JTextField();
        jcbEstadoMateria = new javax.swing.JCheckBox();
        jbEliminarMateria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbModificarMateria = new javax.swing.JButton();
        jbBotonActualizar = new javax.swing.JButton();
        jbNuevoMateria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMateria = new javax.swing.JTable();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(483, 499));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Codigo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(51, 78, 43, 19);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(51, 158, 52, 19);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Estado");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(51, 323, 44, 19);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Año");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(51, 241, 25, 19);

        jtIdMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtIdMateria.setForeground(java.awt.Color.black);
        jPanel1.add(jtIdMateria);
        jtIdMateria.setBounds(109, 70, 63, 23);

        jtNombreMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtNombreMateria.setForeground(java.awt.Color.black);
        jPanel1.add(jtNombreMateria);
        jtNombreMateria.setBounds(109, 157, 150, 23);

        jtAnioMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtAnioMateria.setForeground(java.awt.Color.black);
        jPanel1.add(jtAnioMateria);
        jtAnioMateria.setBounds(109, 240, 63, 23);

        jcbEstadoMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbEstadoMateria.setForeground(java.awt.Color.black);
        jPanel1.add(jcbEstadoMateria);
        jcbEstadoMateria.setBounds(109, 323, 24, 24);

        jbEliminarMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbEliminarMateria.setForeground(java.awt.Color.black);
        jbEliminarMateria.setText("Eliminar");
        jbEliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminarMateria);
        jbEliminarMateria.setBounds(200, 410, 70, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Materia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 20, 73, 27);

        jbModificarMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbModificarMateria.setForeground(java.awt.Color.black);
        jbModificarMateria.setText("Modificar");
        jbModificarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificarMateria);
        jbModificarMateria.setBounds(290, 410, 77, 31);

        jbBotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBotonActualizar);
        jbBotonActualizar.setBounds(430, 370, 30, 30);

        jbNuevoMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbNuevoMateria.setForeground(java.awt.Color.black);
        jbNuevoMateria.setText("Nuevo");
        jbNuevoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevoMateria);
        jbNuevoMateria.setBounds(120, 410, 65, 31);

        jtTablaMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtTablaMateria.setForeground(java.awt.Color.black);
        jtTablaMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTablaMateria.setColumnSelectionAllowed(true);
        jtTablaMateria.setGridColor(new java.awt.Color(60, 63, 65));
        jtTablaMateria.setOpaque(false);
        jtTablaMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaMateria);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 70, 200, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoMateriaActionPerformed
        // TODO add your handling code here:
        try {
            if (jtNombreMateria.getText() == null || jtAnioMateria.getText() == null) {
                JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos menos codigo.");
            } else {
                if (jtIdMateria.getText() != null) {
                    JOptionPane.showMessageDialog(null, "No es necesario llenar campo codigo al agregar materia.");
                    jtIdMateria.setText("");
                    String nombre = jtNombreMateria.getText();
                    int anio = Integer.parseInt(jtAnioMateria.getText());
                    boolean estado = jcbEstadoMateria.isEnabled();
                    Materia mat = new Materia(nombre, anio, estado);
                    materiaDB.nuevoMateria(mat);
                    DefaultTableModel mod = (DefaultTableModel) jtTablaMateria.getModel();
                    mod.setRowCount(0);
                    mostrarTabla();
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios.");
        }
    }//GEN-LAST:event_jbNuevoMateriaActionPerformed

    private void jbEliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarMateriaActionPerformed
        // TODO add your handling code here:
        try {
            if (jtIdMateria.getText() == null || jtNombreMateria.getText() == null || jtAnioMateria.getText() == null) {
                JOptionPane.showMessageDialog(null, "Primero debe realizar una busqueda.");
            } else {
                int id = Integer.parseInt(jtIdMateria.getText());

                materiaDB.eliminarAlumno(id);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado.");
        }
    }//GEN-LAST:event_jbEliminarMateriaActionPerformed

    private void jbModificarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarMateriaActionPerformed
        // TODO add your handling code here:
         String sql = "select idMateria from materia";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int i = jtTablaMateria.getSelectedRow();

                String id = jtTablaMateria.getModel().getValueAt(i, 0).toString();
                String nombre = jtNombreMateria.getText();
                int anio = Integer.parseInt(jtAnioMateria.getText());
                boolean estado = jcbEstadoMateria.isSelected();
                Materia mat = new Materia(Integer.valueOf(id), nombre, anio, estado);
                DefaultTableModel mod = (DefaultTableModel) jtTablaMateria.getModel();
                mod.setRowCount(0);
                mostrarTabla();
                materiaDB.modificarMateria(mat);
                jtIdMateria.setText("");
                jtNombreMateria.setText("");
                jtAnioMateria.setText("");
                jcbEstadoMateria.enable(false);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inesperado.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos excepto el codigo.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos excepto el codigo.");
        }
    }//GEN-LAST:event_jbModificarMateriaActionPerformed

    private void jbBotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonActualizarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mod = (DefaultTableModel) jtTablaMateria.getModel();
        mod.setRowCount(0);
        mostrarTabla();
    }//GEN-LAST:event_jbBotonActualizarActionPerformed

    private void jtTablaMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMateriaMouseClicked
        // TODO add your handling code here:
        int i = jtTablaMateria.getSelectedRow();
        String val = jtTablaMateria.getModel().getValueAt(i, 0).toString();
        int id = Integer.valueOf(val);
        String nombre = materiaDB.buscarMateria(id).getNombre();
        int anio = materiaDB.buscarMateria(id).getAnioMateria();
        Boolean estado = materiaDB.buscarMateria(id).isActivo();
        jtIdMateria.setText(String.valueOf(id));
        jtNombreMateria.setText(nombre);
        jtAnioMateria.setText(String.valueOf(anio));
        jcbEstadoMateria.setSelected(true);
    }//GEN-LAST:event_jtTablaMateriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBotonActualizar;
    private javax.swing.JButton jbEliminarMateria;
    private javax.swing.JButton jbModificarMateria;
    private javax.swing.JButton jbNuevoMateria;
    private javax.swing.JCheckBox jcbEstadoMateria;
    private javax.swing.JTextField jtAnioMateria;
    private javax.swing.JTextField jtIdMateria;
    private javax.swing.JTextField jtNombreMateria;
    private javax.swing.JTable jtTablaMateria;
    // End of variables declaration//GEN-END:variables

    public void mostrarTabla() {

        jtTablaMateria.setModel(modelo);
        TableColumnModel columna = jtTablaMateria.getColumnModel();
        columna.getColumn(0).setMaxWidth(25);

        String sql = "SELECT idMateria, nombre FROM materia WHERE estado = 1 order by idMateria ASC";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("idMateria"));
                String nombre = rs.getString("nombre");
                String tbdata[] = {id, nombre};
                modelo.addRow(tbdata);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error..");
        }
    }

}
