package universidadulp.Vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbListaMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaAlumnoMaterias = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Listado de alumnos por materia");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Seleccione una materia:");

        jcbListaMaterias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbListaMaterias.setForeground(java.awt.Color.black);
        jcbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaMateriasActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaMateriasActionPerformed
        // TODO add your handling code here:
        mostrarTabla();
    }//GEN-LAST:event_jcbListaMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
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
                String[] dataM = {id, dni, apellido, nombre};
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
