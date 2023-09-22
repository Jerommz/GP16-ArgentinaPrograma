
package universidadulp.Vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.HTML;
import universidadulp.AccesoADatos.MateriaData;

public class Interfaz extends javax.swing.JFrame {
    
    MateriaData mat=new MateriaData();
    DefaultTableModel modelo=new DefaultTableModel();

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/fondo.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/logo1term.png"));
        Image image2 = icon2.getImage();
        jPanel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image2,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/logo2term.png"));
        Image image3 = icon3.getImage();
        jPanel3 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image3,0,0,getWidth(),getHeight(),this);
            }
        };
        linkdinGiorgina = new javax.swing.JLabel();
        gitGiorgina = new javax.swing.JLabel();
        linkdinHernan = new javax.swing.JLabel();
        gitHernan = new javax.swing.JLabel();
        linkdinJero = new javax.swing.JLabel();
        gitJero = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mFormularioAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mFormularioMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mManejoInscripciones = new javax.swing.JMenuItem();
        mManejoNotas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mAlumnosMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0,0,0,64));

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Alumnos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Jeronimo Manabella");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Giorgina Corvalan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Hernan Lopez");

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        linkdinGiorgina.setBackground(new Color(255, 0, 0, 0));
        linkdinGiorgina.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        linkdinGiorgina.setForeground(java.awt.Color.white);
        linkdinGiorgina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linkdinGiorgina.setText("Linkedin/Giorgina");
        linkdinGiorgina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkdinGiorgina.setOpaque(true);
        linkdinGiorgina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkdinGiorginaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkdinGiorginaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkdinGiorginaMouseExited(evt);
            }
        });

        gitGiorgina.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        gitGiorgina.setForeground(java.awt.Color.white);
        gitGiorgina.setText("GitHub/York-Andy");
        gitGiorgina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gitGiorgina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gitGiorginaMouseClicked(evt);
            }
        });

        linkdinHernan.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        linkdinHernan.setForeground(java.awt.Color.white);
        linkdinHernan.setText("Linkedin/Hernan");
        linkdinHernan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkdinHernan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkdinHernanMouseClicked(evt);
            }
        });

        gitHernan.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        gitHernan.setForeground(java.awt.Color.white);
        gitHernan.setText("GitHub/HernanL22");
        gitHernan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gitHernan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gitHernanMouseClicked(evt);
            }
        });

        linkdinJero.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        linkdinJero.setForeground(java.awt.Color.white);
        linkdinJero.setText("Linkedin/Jeronimo");
        linkdinJero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkdinJero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkdinJeroMouseClicked(evt);
            }
        });

        gitJero.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        gitJero.setForeground(java.awt.Color.white);
        gitJero.setText("GitHub/Jerommz");
        gitJero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gitJero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gitJeroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(linkdinGiorgina))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(linkdinHernan)
                                    .addComponent(gitGiorgina)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gitHernan)
                                        .addComponent(linkdinJero))
                                    .addComponent(gitJero))))
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(linkdinGiorgina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gitGiorgina)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(linkdinHernan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(linkdinJero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gitHernan)
                        .addGap(72, 72, 72)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gitJero)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(592, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

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

        jMenuItem1.setText("Administracion de alumnos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

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
        Alumnos ga=new Alumnos();
        frameCentrado(ga);
        escritorio.moveToFront(ga);
    }//GEN-LAST:event_mFormularioAlumnoActionPerformed

    private void mFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFormularioMateriaActionPerformed
        // TODO add your handling code here:
        Materias gm=new Materias();
        frameCentrado(gm);
        escritorio.moveToFront(gm);
    }//GEN-LAST:event_mFormularioMateriaActionPerformed

    private void mManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mManejoInscripcionesActionPerformed
        // TODO add your handling code here:
        Inscripciones gi=new Inscripciones();
        frameCentrado(gi);
        escritorio.moveToFront(gi);
    }//GEN-LAST:event_mManejoInscripcionesActionPerformed

    private void mManejoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mManejoNotasActionPerformed
        // TODO add your handling code here:
        Notas gn=new Notas();
        frameCentrado(gn);
        escritorio.moveToFront(gn);
    }//GEN-LAST:event_mManejoNotasActionPerformed

    private void mAlumnosMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnosMateriaActionPerformed
        // TODO add your handling code here:
        AlumnosPorMateria gam=new AlumnosPorMateria();
        frameCentrado(gam);
        escritorio.moveToFront(gam);
    }//GEN-LAST:event_mAlumnosMateriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void linkdinGiorginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdinGiorginaMouseClicked
        // TODO add your handling code here:
        try{
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI("https://www.linkedin.com/in/giorgina-corvalan-83b167281/"));
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_linkdinGiorginaMouseClicked

    private void linkdinHernanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdinHernanMouseClicked
        // TODO add your handling code here:
//        try{
//            if(Desktop.isDesktopSupported()){
//                Desktop desktop = Desktop.getDesktop();
//                if(desktop.isSupported(Desktop.Action.BROWSE)){
//                    desktop.browse(new URI("https://www.linkedin.com/in/jeronimo-manabella/"));
//                }
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
    }//GEN-LAST:event_linkdinHernanMouseClicked

    private void linkdinJeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdinJeroMouseClicked
        // TODO add your handling code here:
        try{
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI("https://www.linkedin.com/in/jeronimo-manabella/"));
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_linkdinJeroMouseClicked

    private void gitGiorginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitGiorginaMouseClicked
        // TODO add your handling code here:
        try{
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI("https://github.com/York-Andy"));
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_gitGiorginaMouseClicked

    private void gitHernanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitHernanMouseClicked
        // TODO add your handling code here:
        try{
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI("https://github.com/hernanl22"));
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_gitHernanMouseClicked

    private void gitJeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitJeroMouseClicked
        // TODO add your handling code here:
        try{
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI("https://github.com/Jerommz"));
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_gitJeroMouseClicked

    private void linkdinGiorginaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdinGiorginaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_linkdinGiorginaMouseEntered

    private void linkdinGiorginaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdinGiorginaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_linkdinGiorginaMouseExited

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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel linkdinGiorgina;
    private javax.swing.JLabel linkdinHernan;
    private javax.swing.JLabel linkdinJero;
    private javax.swing.JMenuItem mAlumnosMateria;
    private javax.swing.JMenuItem mFormularioAlumno;
    private javax.swing.JMenuItem mFormularioMateria;
    private javax.swing.JMenuItem mManejoInscripciones;
    private javax.swing.JMenuItem mManejoNotas;
    // End of variables declaration//GEN-END:variables

    public void frameCentrado(Component frameCentrado){
        escritorio.add(frameCentrado);
        frameCentrado.setLocation((escritorio.getWidth()-frameCentrado.getWidth())/2, (escritorio.getHeight()-frameCentrado.getHeight())/2);
        frameCentrado.setVisible(true);
    }
    
}
