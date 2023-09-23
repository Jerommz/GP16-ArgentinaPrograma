package universidadulp.Vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.AccesoADatos.InscripcionData;
import universidadulp.Entidades.Materia;

public final class Inscripciones extends javax.swing.JInternalFrame {

    private Connection con;
    private AlumnoData alumnoDB = new AlumnoData();
    private InscripcionData inscripcionDB = new InscripcionData();

    public Inscripciones() {
        initComponents();
        con = Conexion.getConnection();
        mostrarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbListaAlumnosInscripcion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcMateriasNoInscriptas = new javax.swing.JCheckBox();
        jcMateriasInscriptas = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaInscripcion = new javax.swing.JTable();
        jbAnularInscripcion = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Formulario de inscripcion");

        jcbListaAlumnosInscripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbListaAlumnosInscripcion.setForeground(java.awt.Color.black);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Seleccione un alumno:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Listado de materias");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Materias inscriptas");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Materias no inscriptas");

        jcMateriasNoInscriptas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcMateriasNoInscriptas.setForeground(java.awt.Color.black);
        jcMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jcMateriasInscriptas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcMateriasInscriptas.setForeground(java.awt.Color.black);
        jcMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriasInscriptasActionPerformed(evt);
            }
        });

        jtTablaInscripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtTablaInscripcion.setForeground(java.awt.Color.black);
        jtTablaInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jtTablaInscripcion);

        jbAnularInscripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbAnularInscripcion.setForeground(java.awt.Color.black);
        jbAnularInscripcion.setText("Anular inscripcion");

        jbInscribir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbInscribir.setForeground(java.awt.Color.black);
        jbInscribir.setText("Inscribir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAnularInscripcion)
                        .addGap(73, 73, 73)
                        .addComponent(jbInscribir)
                        .addGap(115, 115, 115))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(189, 189, 189))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(jcbListaAlumnosInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcMateriasNoInscriptas)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcMateriasInscriptas)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbListaAlumnosInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jcMateriasInscriptas)
                    .addComponent(jLabel8)
                    .addComponent(jcMateriasNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnularInscripcion))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriasInscriptasActionPerformed
        // TODO add your handling code here:
        jcMateriasInscriptas.setSelected(false);
        String nombre = jcbListaAlumnosInscripcion.getSelectedItem().toString();
        mostrarTabla(inscripcionDB.obtenerMateriasNoCursadas(buscarAlumno(nombre)));
    }//GEN-LAST:event_jcMateriasInscriptasActionPerformed

    private void jcMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriasNoInscriptasActionPerformed
        // TODO add your handling code here:
        jcMateriasNoInscriptas.setSelected(false);
        String nombre = jcbListaAlumnosInscripcion.getSelectedItem().toString();
        mostrarTabla(inscripcionDB.obtenerMateriasCursadas(buscarAlumno(nombre)));
    }//GEN-LAST:event_jcMateriasNoInscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JCheckBox jcMateriasInscriptas;
    private javax.swing.JCheckBox jcMateriasNoInscriptas;
    private javax.swing.JComboBox<String> jcbListaAlumnosInscripcion;
    private javax.swing.JTable jtTablaInscripcion;
    // End of variables declaration//GEN-END:variables

    public void mostrarComboBox() {

        String sql = "select nombre, apellido from alumno order by idAlumno ASC";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String dato[] = {nombre + " " + apellido};
                for(String datos : dato){
                    jcbListaAlumnosInscripcion.addItem(datos);
                }
            }
        } catch (SQLException ex) {
        }
    }

    public void mostrarTabla(List<Materia> materias) {
        String[] col = {"ID", "Nombre", "Año"};
        DefaultTableModel modelo = new DefaultTableModel(null, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jtTablaInscripcion.setModel(modelo);
        TableColumnModel columna = jtTablaInscripcion.getColumnModel();
        columna.getColumn(0).setMaxWidth(30);
        
        for (int i = 0; i < materias.size(); i++) {
            String idMateria = materias.get(i).getIdMateria() + "";
            String nombreMateria = materias.get(i).getNombre();
            String anioMateria = materias.get(i).getAnioMateria() + "";
            String [] dataM = {idMateria, nombreMateria, anioMateria};
            modelo.addRow(dataM);
        }
        
    }

    public int buscarAlumno(String nombre) {
        String[] valores = nombre.split(" ");
        String nombreSQL=valores[0];
        String sql = "select idAlumno from alumno where nombre = ?";
        int id = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreSQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("idAlumno");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error..");
        }
        return id;
    }

}
