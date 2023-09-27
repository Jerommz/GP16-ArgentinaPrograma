package universidadulp.Vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import universidadulp.AccesoADatos.MateriaData;

public class Interfaz extends javax.swing.JFrame {

    MateriaData mat = new MateriaData();
    DefaultTableModel modelo = new DefaultTableModel();

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gitJero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        linkdinGiorgina = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gitGiorgina = new javax.swing.JLabel();
        linkdinHernan = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gitHernan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        linkdinJero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mFormularioAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mFormularioMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mManejoInscripciones = new javax.swing.JMenuItem();
        mManejoNotas = new javax.swing.JMenuItem();
        mAdminAlumnos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mAlumnosMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Alumnos");
        escritorio.add(jLabel2);
        jLabel2.setBounds(110, 90, 95, 15);

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        escritorio.add(jLabel1);
        jLabel1.setBounds(110, 110, 145, 1);

        gitJero.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        gitJero.setForeground(java.awt.Color.white);
        gitJero.setText("GitHub/Jerommz");
        gitJero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gitJeroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gitJeroMouseExited(evt);
            }
        });
        escritorio.add(gitJero);
        gitJero.setBounds(500, 370, 80, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Giorgina Corvalan");
        escritorio.add(jLabel4);
        jLabel4.setBounds(110, 140, 226, 31);

        linkdinGiorgina.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        linkdinGiorgina.setForeground(java.awt.Color.white);
        linkdinGiorgina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linkdinGiorgina.setText("Linkedin/Giorgina");
        linkdinGiorgina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escritorio.add(linkdinGiorgina);
        linkdinGiorgina.setBounds(500, 150, 81, 14);

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        escritorio.add(jLabel6);
        jLabel6.setBounds(110, 180, 471, 1);

        gitGiorgina.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        gitGiorgina.setForeground(java.awt.Color.white);
        gitGiorgina.setText("GitHub/York-Andy");
        gitGiorgina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escritorio.add(gitGiorgina);
        gitGiorgina.setBounds(490, 190, 86, 14);

        linkdinHernan.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        linkdinHernan.setForeground(java.awt.Color.white);
        linkdinHernan.setText("Linkedin/Hernan");
        linkdinHernan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escritorio.add(linkdinHernan);
        linkdinHernan.setBounds(500, 240, 77, 14);

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        escritorio.add(jLabel7);
        jLabel7.setBounds(110, 260, 471, 1);

        gitHernan.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        gitHernan.setForeground(java.awt.Color.white);
        gitHernan.setText("GitHub/HernanL22");
        gitHernan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escritorio.add(gitHernan);
        gitHernan.setBounds(490, 270, 88, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Hernan Lopez");
        escritorio.add(jLabel5);
        jLabel5.setBounds(110, 230, 172, 31);

        linkdinJero.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        linkdinJero.setForeground(java.awt.Color.white);
        linkdinJero.setText("Linkedin/Jeronimo");
        linkdinJero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escritorio.add(linkdinJero);
        linkdinJero.setBounds(490, 340, 85, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Jeronimo Manabella");
        escritorio.add(jLabel3);
        jLabel3.setBounds(110, 320, 254, 31);

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        escritorio.add(jLabel8);
        jLabel8.setBounds(110, 360, 471, 1);

        jMenuBar1.setForeground(java.awt.Color.black);
        jMenuBar1.setFocusCycleRoot(true);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.setOpaque(false);

        jMenu1.setText("Alumno");

        mFormularioAlumno.setText("Formulario de alumno");
        mFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFormularioAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(mFormularioAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        mFormularioMateria.setText("Formulario de materia");
        mFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFormularioMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(mFormularioMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        mManejoInscripciones.setText("Manejo de inscripciones");
        mManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(mManejoInscripciones);

        mManejoNotas.setText("Manipulacion de notas");
        mManejoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mManejoNotasActionPerformed(evt);
            }
        });
        jMenu3.add(mManejoNotas);

        mAdminAlumnos.setText("Administracion de alumnos");
        mAdminAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAdminAlumnosActionPerformed(evt);
            }
        });
        jMenu3.add(mAdminAlumnos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        mAlumnosMateria.setText("Alumnos por materia");
        mAlumnosMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlumnosMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(mAlumnosMateria);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleParent(escritorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        setSize(new java.awt.Dimension(1296, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFormularioAlumnoActionPerformed
        // TODO add your handling code here:
        Alumnos ga = new Alumnos();
        cerrarFrames();
        frameCentrado(ga);
        escritorio.moveToFront(ga);
    }//GEN-LAST:event_mFormularioAlumnoActionPerformed

    private void mFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFormularioMateriaActionPerformed
        // TODO add your handling code here:
        Materias gm = new Materias();
        cerrarFrames();
        frameCentrado(gm);
        escritorio.moveToFront(gm);
    }//GEN-LAST:event_mFormularioMateriaActionPerformed

    private void mManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mManejoInscripcionesActionPerformed
        // TODO add your handling code here:
        Inscripciones gi = new Inscripciones();
        cerrarFrames();
        frameCentrado(gi);
        escritorio.moveToFront(gi);
    }//GEN-LAST:event_mManejoInscripcionesActionPerformed

    private void mManejoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mManejoNotasActionPerformed
        // TODO add your handling code here:
        Notas gn = new Notas();
        cerrarFrames();
        frameCentrado(gn);
        escritorio.moveToFront(gn);
    }//GEN-LAST:event_mManejoNotasActionPerformed

    private void mAlumnosMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnosMateriaActionPerformed
        // TODO add your handling code here:
        AlumnosPorMateria gam = new AlumnosPorMateria();
        cerrarFrames();
        frameCentrado(gam);
        escritorio.moveToFront(gam);
    }//GEN-LAST:event_mAlumnosMateriaActionPerformed

    private void mAdminAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAdminAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAdminAlumnosActionPerformed

    private void gitJeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitJeroMouseEntered
        // TODO add your handling code here:
        gitJero.setForeground(Color.RED);
    }//GEN-LAST:event_gitJeroMouseEntered

    private void gitJeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitJeroMouseExited
        // TODO add your handling code here:
        gitJero.setForeground(Color.WHITE);
    }//GEN-LAST:event_gitJeroMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel gitGiorgina;
    private javax.swing.JLabel gitHernan;
    private javax.swing.JLabel gitJero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel linkdinGiorgina;
    private javax.swing.JLabel linkdinHernan;
    private javax.swing.JLabel linkdinJero;
    private javax.swing.JMenuItem mAdminAlumnos;
    private javax.swing.JMenuItem mAlumnosMateria;
    private javax.swing.JMenuItem mFormularioAlumno;
    private javax.swing.JMenuItem mFormularioMateria;
    private javax.swing.JMenuItem mManejoInscripciones;
    private javax.swing.JMenuItem mManejoNotas;
    // End of variables declaration//GEN-END:variables

    public void frameCentrado(Component frameCentrado) {
        escritorio.add(frameCentrado);
        frameCentrado.setLocation((escritorio.getWidth() - frameCentrado.getWidth()) / 2, (escritorio.getHeight() - frameCentrado.getHeight()) / 2);
        frameCentrado.setVisible(true);
    }

    public void cerrarFrames() {
        Component comps[] = escritorio.getComponents();

        for (Component comp : comps) {
            if (!(comp instanceof JPanel) && !(comp instanceof JLabel)) {
                if (comp instanceof JInternalFrame) {
                    ((JInternalFrame) comp).dispose();
                } else {
                    escritorio.remove(comp);
                }
            }
        }

    }
}
