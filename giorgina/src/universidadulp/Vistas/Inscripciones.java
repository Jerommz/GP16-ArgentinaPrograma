package universidadulp.Vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.AccesoADatos.InscripcionData;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

public final class Inscripciones extends javax.swing.JInternalFrame {

    private Connection con;
    private AlumnoData alumnoDB = new AlumnoData();
    private InscripcionData inscripcionDB = new InscripcionData();
    private List <Materia>mat;
    private List<Alumno>alu;
    private MateriaData matData;
    private DefaultTableModel modelo;

    public Inscripciones() {
        initComponents();
        con = Conexion.getConnection();
        alumnoDB=new AlumnoData();
        alu=alumnoDB.listarAlumnos();
        modelo=new DefaultTableModel();
        cargarAlumnos();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbListaAlumnosInscripcion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbMateriasInscriptas = new javax.swing.JLabel();
        jbMateriasNoInscriptas = new javax.swing.JLabel();
        jrMateriasInscriptas = new javax.swing.JCheckBox();
        jrMatNoInsc = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaInscripcion = new javax.swing.JTable();
        jbAnularInscripcion = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 11, true));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

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

        jbMateriasInscriptas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbMateriasInscriptas.setForeground(java.awt.Color.black);
        jbMateriasInscriptas.setText("Materias inscriptas");

        jbMateriasNoInscriptas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbMateriasNoInscriptas.setForeground(java.awt.Color.black);
        jbMateriasNoInscriptas.setText("Materias no inscriptas");

        jrMateriasInscriptas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrMateriasInscriptas.setForeground(java.awt.Color.black);
        jrMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMateriasInscriptasActionPerformed(evt);
            }
        });

        jrMatNoInsc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrMatNoInsc.setForeground(java.awt.Color.black);
        jrMatNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMatNoInscActionPerformed(evt);
            }
        });

        jtTablaInscripcion.setBackground(new java.awt.Color(204, 255, 204));
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
        jtTablaInscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaInscripcionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaInscripcion);

        jbAnularInscripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbAnularInscripcion.setForeground(new java.awt.Color(255, 255, 255));
        jbAnularInscripcion.setText("Anular inscripcion");
        jbAnularInscripcion.setEnabled(false);
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbInscribir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbInscribir.setForeground(new java.awt.Color(255, 255, 255));
        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

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
                        .addComponent(jbMateriasInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrMateriasInscriptas)
                        .addGap(43, 43, 43)
                        .addComponent(jbMateriasNoInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrMatNoInsc)))
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
                    .addComponent(jbMateriasInscriptas)
                    .addComponent(jrMatNoInsc)
                    .addComponent(jbMateriasNoInscriptas)
                    .addComponent(jrMateriasInscriptas))
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

    private void jrMatNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMatNoInscActionPerformed
        borrarFilasTabla();
        jrMateriasInscriptas.setSelected(false);
        cargarDatosNoInscriptos();
       jbInscribir.setEnabled(true);
       jbAnularInscripcion.setEnabled(false);
    }//GEN-LAST:event_jrMatNoInscActionPerformed

    private void jrMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMateriasInscriptasActionPerformed
       borrarFilasTabla();
       jrMatNoInsc.setSelected(false);
       cargarDatosInscriptas();
       jbAnularInscripcion.setEnabled(true);
       jbInscribir.setEnabled(false);
       
    }//GEN-LAST:event_jrMateriasInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
      
        int filaSeleccionada=jtTablaInscripcion.getSelectedRow();
        if(filaSeleccionada !=-1){
        Alumno a =(Alumno) jcbListaAlumnosInscripcion.getSelectedItem();
        
        int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
        String nombremateria=(String)modelo.getValueAt(filaSeleccionada, 1);
        int anio=(Integer)modelo.getValueAt(filaSeleccionada, 2);
        Materia m=new Materia(idMateria,nombremateria,anio,true);
        Inscripcion ins=new Inscripcion(a,m,0);
        inscripcionDB.nuevoInscripcion(ins);
        borrarFilasTabla();
        
        }
     

     
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jtTablaInscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaInscripcionMouseClicked
        
        
    }//GEN-LAST:event_jtTablaInscripcionMouseClicked

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
      int filasSeleccionada=jtTablaInscripcion.getSelectedRow();
      if(filasSeleccionada!=-1){
      Alumno a= (Alumno)jcbListaAlumnosInscripcion.getSelectedItem();
      int idMateria=(Integer)modelo.getValueAt(filasSeleccionada, 0);
     inscripcionDB.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
     borrarFilasTabla();
      }
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JLabel jbMateriasInscriptas;
    private javax.swing.JLabel jbMateriasNoInscriptas;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnosInscripcion;
    private javax.swing.JCheckBox jrMatNoInsc;
    private javax.swing.JCheckBox jrMateriasInscriptas;
    private javax.swing.JTable jtTablaInscripcion;
    // End of variables declaration//GEN-END:variables
   private void borrarFilasTabla(){
   int indice= modelo.getRowCount()-1;
   for(int i=indice;i>0;i--){
   modelo.removeRow(i);
   }
   
   
   }
    public void cargarAlumnos() {
        List <Alumno> listarAl= alumnoDB.listarAlumnos();
        for(Alumno alumno:listarAl){
         jcbListaAlumnosInscripcion.addItem(alumno);
        }
    }
    private void cargarDatosNoInscriptos(){
    //borrarFilas();
    Alumno selec=(Alumno)jcbListaAlumnosInscripcion.getSelectedItem();
    mat=(ArrayList)inscripcionDB.obtenerMateriasNoCursadas(selec.getIdAlumno());
    for(Materia m: mat){
     modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
    }
    }
    private void cargarDatosInscriptas(){
    //borrarFilasTabla();
    Alumno selec =(Alumno)jcbListaAlumnosInscripcion.getSelectedItem();
    mat=(ArrayList)inscripcionDB.obtenerMateriasCursadas(selec.getIdAlumno());
    for(Materia m:mat){
    modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
    }
    }
    

    public void mostrarTabla() {
        ArrayList <Object>filaCabecera =new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("NOMBRE");
        filaCabecera.add("AÑO");
        for(Object at :filaCabecera){
        modelo.addColumn(at);
        }
        jtTablaInscripcion.setModel(modelo);
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
