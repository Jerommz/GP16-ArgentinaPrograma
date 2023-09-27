package universidadulp.Vistas;

//imports de paquetes y clases necesarios
import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.*;
import universidadulp.AccesoADatos.*;
import universidadulp.Entidades.Materia;

public class Materias extends javax.swing.JPanel {

    //modelo para tabla materia usada en el metodo mostrar tabla
    String[] col = {"ID", "Nombre"};
    DefaultTableModel modeloTablaMateria = new DefaultTableModel(null, col) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    //atributos necesarios para los metodos utilizados
    MateriaData materiaDB = new MateriaData();
    private Connection con;

    //constructor vacio
    public Materias() {
        initComponents();
        con = Conexion.getConnection();
        mostrarTabla();

        //array con cada boton para que tengan un hover
        JButton btns[] = {jbNuevoMateria, jbEliminarMateria, jbModificarMateria, jbBotonActualizar};

        //loop for para recorrer el array y que realice los cambios a cada boton
        for (JButton btn : btns) {

            //seteo del color default
            btn.setBackground(new Color(60, 63, 65));

            //seteo del look and feel basico de los botones
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                //override al evento mouseEntered para que cuando pase el mouse por arriba cambie al color elegido
                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(80, 41, 179));
                }

                //override al evento mouseExited para que cuando pase el mouse por arriba cambie al color elegido
                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(60, 63, 65));
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMid = new javax.swing.JPanel();
        panelMidLeft = new javax.swing.JPanel();
        panelHalfRight = new javax.swing.JPanel();
        jtNombreMateria = new javax.swing.JTextField();
        jtIdMateria = new javax.swing.JTextField();
        jtAnioMateria = new javax.swing.JTextField();
        jcbEstadoMateria = new javax.swing.JCheckBox();
        panelHalfLeft = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelMidRight = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMateria = new javax.swing.JTable();
        jbBotonActualizar = new javax.swing.JButton();
        panelBottom = new javax.swing.JPanel();
        jbNuevoMateria = new javax.swing.JButton();
        jbEliminarMateria = new javax.swing.JButton();
        jbModificarMateria = new javax.swing.JButton();

        setBackground(new java.awt.Color(34, 40, 44));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        panelTop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        panelTop.setPreferredSize(new java.awt.Dimension(0, 60));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = -9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 17, 660);
        panelTop.add(jLabel1, gridBagConstraints);

        add(panelTop, java.awt.BorderLayout.NORTH);

        panelMid.setLayout(new java.awt.BorderLayout());

        panelMidLeft.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        panelMidLeft.setPreferredSize(new java.awt.Dimension(640, 0));
        panelMidLeft.setLayout(new java.awt.BorderLayout());

        panelHalfRight.setPreferredSize(new java.awt.Dimension(320, 0));
        panelHalfRight.setLayout(new java.awt.GridBagLayout());

        jtNombreMateria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtNombreMateria.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(43, 0, 43, 0);
        panelHalfRight.add(jtNombreMateria, gridBagConstraints);

        jtIdMateria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtIdMateria.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.insets = new java.awt.Insets(36, 0, 34, 0);
        panelHalfRight.add(jtIdMateria, gridBagConstraints);

        jtAnioMateria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtAnioMateria.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(44, 0, 44, 0);
        panelHalfRight.add(jtAnioMateria, gridBagConstraints);

        jcbEstadoMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(43, 0, 43, 0);
        panelHalfRight.add(jcbEstadoMateria, gridBagConstraints);

        panelMidLeft.add(panelHalfRight, java.awt.BorderLayout.EAST);

        panelHalfLeft.setPreferredSize(new java.awt.Dimension(320, 0));
        panelHalfLeft.setLayout(new java.awt.GridLayout(4, 0, 0, -100));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo");
        panelHalfLeft.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        panelHalfLeft.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Año");
        panelHalfLeft.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado");
        panelHalfLeft.add(jLabel5);

        panelMidLeft.add(panelHalfLeft, java.awt.BorderLayout.WEST);

        panelMid.add(panelMidLeft, java.awt.BorderLayout.WEST);

        panelMidRight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(21, 39, 43)));
        panelMidRight.setPreferredSize(new java.awt.Dimension(640, 0));
        panelMidRight.setLayout(new java.awt.BorderLayout());

        jtTablaMateria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
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
        jtTablaMateria.setRowHeight(32);
        jtTablaMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaMateria);

        panelMidRight.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jbBotonActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBotonActualizar.setForeground(java.awt.Color.white);
        jbBotonActualizar.setText("Actualizar");
        jbBotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonActualizarActionPerformed(evt);
            }
        });
        panelMidRight.add(jbBotonActualizar, java.awt.BorderLayout.PAGE_END);

        panelMid.add(panelMidRight, java.awt.BorderLayout.EAST);

        add(panelMid, java.awt.BorderLayout.CENTER);

        panelBottom.setPreferredSize(new java.awt.Dimension(0, 80));
        panelBottom.setLayout(new java.awt.GridLayout(1, 0));

        jbNuevoMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbNuevoMateria.setForeground(java.awt.Color.white);
        jbNuevoMateria.setText("Nuevo");
        jbNuevoMateria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(21, 39, 43)));
        jbNuevoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoMateriaActionPerformed(evt);
            }
        });
        panelBottom.add(jbNuevoMateria);

        jbEliminarMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbEliminarMateria.setForeground(java.awt.Color.white);
        jbEliminarMateria.setText("Eliminar");
        jbEliminarMateria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(21, 39, 43)));
        jbEliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMateriaActionPerformed(evt);
            }
        });
        panelBottom.add(jbEliminarMateria);

        jbModificarMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbModificarMateria.setForeground(java.awt.Color.white);
        jbModificarMateria.setText("Modificar");
        jbModificarMateria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(21, 39, 43)));
        jbModificarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarMateriaActionPerformed(evt);
            }
        });
        panelBottom.add(jbModificarMateria);

        add(panelBottom, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    //action boton nueva materia
    private void jbNuevoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoMateriaActionPerformed
        // TODO add your handling code here:
        try {
            //if para comprobar que ningun campo este vacio
            if (jtNombreMateria.getText() == null || jtAnioMateria.getText() == null) {
                JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos menos codigo.");
            } else {
                //if para setear null el campo idMateria si no esta vacio
                if (jtIdMateria.getText() != null) {
                    jtIdMateria.setText(null);

                    //declaracion de variables que seran enviadas al metodo nuevaMateria
                    String nombre = jtNombreMateria.getText();
                    int anio = Integer.parseInt(jtAnioMateria.getText());
                    boolean estado = jcbEstadoMateria.isEnabled();
                    Materia mat = new Materia(nombre, anio, estado);

                    //invocacion de metodo nueva materia
                    materiaDB.nuevaMateria(mat);

                    //metodo para actualizar tabla
                    actualizarTabla();
                    //limpiar los campos una vez impactado en la DB
                    jtNombreMateria.setText("");
                    jtAnioMateria.setText("");
                    jtIdMateria.setText(null);
                    jcbEstadoMateria.setSelected(false);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios.");
        }
    }//GEN-LAST:event_jbNuevoMateriaActionPerformed

    //action boton eliminar materia
    private void jbEliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarMateriaActionPerformed
        // TODO add your handling code here:
        //if para comprobar que ningun campo este vacio
        if (jtIdMateria.getText() == null || jtNombreMateria.getText() == null || jtAnioMateria.getText() == null) {
            JOptionPane.showMessageDialog(null, "Primero debe realizar una busqueda.");
        } else {
            try {
                //declaracion de variable que sera enviada al metodo eliminar materia
                int id = Integer.parseInt(jtIdMateria.getText());

                //invocacion de metodo eliminar materia
                materiaDB.eliminarMateria(id);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No puede haber campos vacios.");
            }
        }
    }//GEN-LAST:event_jbEliminarMateriaActionPerformed

    //action boton modificar materia
    private void jbModificarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarMateriaActionPerformed
        // TODO add your handling code here:
        //seleccion de fila
        int fila = jtTablaMateria.getSelectedRow();
        if (fila != -1) {
            //declaracio de variables con datos obtenidos de los texfield
            int id = Integer.parseInt(jtTablaMateria.getModel().getValueAt(fila, 0).toString());
            String nombre = jtNombreMateria.getText();
            int anio = Integer.parseInt(jtAnioMateria.getText());
            boolean estado = jcbEstadoMateria.isSelected();

            //constructor de materia con datos obtenidos
            Materia mat = new Materia(id, nombre, anio, estado);

            //metodo para actualiar tabla materia
            actualizarTabla();

            //invocacion de metodo modificar materia
            materiaDB.modificarMateria(mat);

            //seteo de textfields en null
            jtIdMateria.setText(null);
            jtNombreMateria.setText(null);
            jtAnioMateria.setText(null);
            jcbEstadoMateria.enable(false);
        } else {
            JOptionPane.showMessageDialog(null, "No puede haber cambios vacios.");
        }


    }//GEN-LAST:event_jbModificarMateriaActionPerformed

    //action boton actualizar
    private void jbBotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonActualizarActionPerformed
        // TODO add your handling code here:
        //declaracion de modelo nuevo con modelo actual de la tabla materias
        DefaultTableModel mod = (DefaultTableModel) jtTablaMateria.getModel();

        //eliminacion de filas
        mod.setRowCount(0);

        //metodo para mostrar tabla materias
        mostrarTabla();
    }//GEN-LAST:event_jbBotonActualizarActionPerformed

    //action combobox materias
    private void jtTablaMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMateriaMouseClicked
        // TODO add your handling code here:
        //seleccion de fila
        int i = jtTablaMateria.getSelectedRow();

        //declaracion de variables con datos obtenidos de la tabla materia
        String val = jtTablaMateria.getModel().getValueAt(i, 0).toString();
        int id = Integer.valueOf(val);
        String nombre = materiaDB.buscarMateria(id).getNombre();
        int anio = materiaDB.buscarMateria(id).getAnioMateria();
        Boolean estado = materiaDB.buscarMateria(id).isActivo();

        //seteo de textfields con variables dadas
        jtIdMateria.setText(String.valueOf(id));
        jtNombreMateria.setText(nombre);
        jtAnioMateria.setText(String.valueOf(anio));
        jcbEstadoMateria.setSelected(true);
    }//GEN-LAST:event_jtTablaMateriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelHalfLeft;
    private javax.swing.JPanel panelHalfRight;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelMidLeft;
    private javax.swing.JPanel panelMidRight;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables

    //metodo mostrar tabla materia
    public void mostrarTabla() {
        //seteo de modelo tabla materia
        jtTablaMateria.setModel(modeloTablaMateria);

        //obtencion de modelo de columnas para cambiar el tamaño de ellas individualmente
        TableColumnModel columna = jtTablaMateria.getColumnModel();
        columna.getColumn(0).setMaxWidth(45);

        //query obtener idMateria, nombre
        String sql = "SELECT idMateria, nombre FROM materia WHERE estado = 1 order by idMateria ASC";
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //declaracion de variables que seran implementadas dentro de las filas de la tabla
                String id = String.valueOf(rs.getInt("idMateria"));
                String nombre = rs.getString("nombre");
                String tbdata[] = {id, nombre};
                modeloTablaMateria.addRow(tbdata);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error..");
        }
    }

    //metodo actualizar tabla materia
    public void actualizarTabla() {
        //declaracion de modelo nuevo con el modelo actual de la tabla materia
        DefaultTableModel mod = (DefaultTableModel) jtTablaMateria.getModel();

        //eliminacion de filas
        mod.setRowCount(0);

        //metodo para mostrar tabla materia
        mostrarTabla();
    }

}
