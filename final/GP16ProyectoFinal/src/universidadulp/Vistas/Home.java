
package universidadulp.Vistas;

//imports de paquetes y clases necesarios
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.net.URI;
import javax.swing.*;

public class Home extends javax.swing.JPanel {
    //constructor vacio
    public Home() {
        initComponents();
        clickLinks();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelG = new javax.swing.JPanel();
        panelG1 = new javax.swing.JPanel();
        panelGTop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelGBot = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        linkG = new javax.swing.JLabel();
        gitG = new javax.swing.JLabel();
        emailG = new javax.swing.JLabel();
        panelH = new javax.swing.JPanel();
        panelH1 = new javax.swing.JPanel();
        panelHTop = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelHBot = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        linkH = new javax.swing.JLabel();
        gitH = new javax.swing.JLabel();
        emailH = new javax.swing.JLabel();
        panelJ = new javax.swing.JPanel();
        panelJ1 = new javax.swing.JPanel();
        panelJTop = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        panelJBot = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        linkJ = new javax.swing.JLabel();
        gitJ = new javax.swing.JLabel();
        emailJ = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();

        setLayout(null);

        panelG.setBackground(new Color(0, 0, 0, 0));
        panelG.setPreferredSize(new java.awt.Dimension(428, 0));
        panelG.setLayout(new java.awt.GridBagLayout());

        panelG1.setBackground(new Color(255,255,255,95));
        panelG1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.white));
        panelG1.setPreferredSize(new java.awt.Dimension(360, 580));
        panelG1.setLayout(new java.awt.BorderLayout());

        panelGTop.setPreferredSize(new java.awt.Dimension(0, 150));
        panelGTop.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-usuario-de-género-neutro-100.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        panelGTop.add(jLabel2, java.awt.BorderLayout.CENTER);

        panelG1.add(panelGTop, java.awt.BorderLayout.NORTH);

        panelGBot.setPreferredSize(new java.awt.Dimension(0, 430));
        panelGBot.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Giorgina Corvalan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelGBot.add(jLabel3, gridBagConstraints);

        linkG.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        linkG.setForeground(java.awt.Color.white);
        linkG.setText("Linkedin/G");
        linkG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelGBot.add(linkG, gridBagConstraints);

        gitG.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        gitG.setForeground(java.awt.Color.white);
        gitG.setText("GitHub/G");
        gitG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelGBot.add(gitG, gridBagConstraints);

        emailG.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        emailG.setForeground(java.awt.Color.white);
        emailG.setText("Email/G");
        emailG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelGBot.add(emailG, gridBagConstraints);

        panelG1.add(panelGBot, java.awt.BorderLayout.SOUTH);

        panelG.add(panelG1, new java.awt.GridBagConstraints());

        add(panelG);
        panelG.setBounds(0, 16, 428, 704);

        panelH.setBackground(new Color(0, 0, 0, 0));

        panelH1.setBackground(new Color(255,255,255,95));
        panelH1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.white));
        panelH1.setPreferredSize(new java.awt.Dimension(360, 580));
        panelH1.setLayout(new java.awt.BorderLayout());

        panelHTop.setPreferredSize(new java.awt.Dimension(0, 150));
        panelHTop.setLayout(new java.awt.BorderLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-usuario-de-género-neutro-100.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        panelHTop.add(jLabel7, java.awt.BorderLayout.CENTER);

        panelH1.add(panelHTop, java.awt.BorderLayout.PAGE_START);

        panelHBot.setPreferredSize(new java.awt.Dimension(0, 430));
        panelHBot.setLayout(new java.awt.GridBagLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Hernan Lopez");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelHBot.add(jLabel8, gridBagConstraints);

        linkH.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        linkH.setForeground(java.awt.Color.white);
        linkH.setText("Linkedin/H");
        linkH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelHBot.add(linkH, gridBagConstraints);

        gitH.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        gitH.setForeground(java.awt.Color.white);
        gitH.setText("GitHub/H");
        gitH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelHBot.add(gitH, gridBagConstraints);

        emailH.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        emailH.setForeground(java.awt.Color.white);
        emailH.setText("Email/H");
        emailH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelHBot.add(emailH, gridBagConstraints);

        panelH1.add(panelHBot, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout panelHLayout = new javax.swing.GroupLayout(panelH);
        panelH.setLayout(panelHLayout);
        panelHLayout.setHorizontalGroup(
            panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelHLayout.setVerticalGroup(
            panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(panelH);
        panelH.setBounds(428, 16, 426, 704);

        panelJ.setBackground(new Color(0, 0, 0, 0));
        panelJ.setPreferredSize(new java.awt.Dimension(426, 0));

        panelJ1.setBackground(new Color(255,255,255,95));
        panelJ1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.white));
        panelJ1.setPreferredSize(new java.awt.Dimension(360, 580));
        panelJ1.setLayout(new java.awt.BorderLayout());

        panelJTop.setPreferredSize(new java.awt.Dimension(0, 150));
        panelJTop.setLayout(new java.awt.BorderLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-usuario-de-género-neutro-100.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.white));
        panelJTop.add(jLabel12, java.awt.BorderLayout.CENTER);

        panelJ1.add(panelJTop, java.awt.BorderLayout.NORTH);

        panelJBot.setPreferredSize(new java.awt.Dimension(0, 430));
        panelJBot.setLayout(new java.awt.GridBagLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Jeronimo Manabella");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelJBot.add(jLabel13, gridBagConstraints);

        linkJ.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        linkJ.setForeground(java.awt.Color.white);
        linkJ.setText("Linkedin/J");
        linkJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelJBot.add(linkJ, gridBagConstraints);

        gitJ.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        gitJ.setForeground(java.awt.Color.white);
        gitJ.setText("GitHub/J");
        gitJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelJBot.add(gitJ, gridBagConstraints);

        emailJ.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        emailJ.setForeground(java.awt.Color.white);
        emailJ.setText("Email/J");
        emailJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 35, 0);
        panelJBot.add(emailJ, gridBagConstraints);

        panelJ1.add(panelJBot, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout panelJLayout = new javax.swing.GroupLayout(panelJ);
        panelJ.setLayout(panelJLayout);
        panelJLayout.setHorizontalGroup(
            panelJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJLayout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(panelJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        panelJLayout.setVerticalGroup(
            panelJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJLayout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(panelJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        add(panelJ);
        panelJ.setBounds(854, 16, 426, 704);

        labelImagen.setBackground(new java.awt.Color(102, 204, 0));
        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/este.png"))); // NOI18N
        add(labelImagen);
        labelImagen.setBounds(0, 0, 1280, 720);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailG;
    private javax.swing.JLabel emailH;
    private javax.swing.JLabel emailJ;
    private javax.swing.JLabel gitG;
    private javax.swing.JLabel gitH;
    private javax.swing.JLabel gitJ;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel linkG;
    private javax.swing.JLabel linkH;
    private javax.swing.JLabel linkJ;
    private javax.swing.JPanel panelG;
    private javax.swing.JPanel panelG1;
    private javax.swing.JPanel panelGBot;
    private javax.swing.JPanel panelGTop;
    private javax.swing.JPanel panelH;
    private javax.swing.JPanel panelH1;
    private javax.swing.JPanel panelHBot;
    private javax.swing.JPanel panelHTop;
    private javax.swing.JPanel panelJ;
    private javax.swing.JPanel panelJ1;
    private javax.swing.JPanel panelJBot;
    private javax.swing.JPanel panelJTop;
    // End of variables declaration//GEN-END:variables

    //metodo loop para setear cada link y hacer el hover en los jLabel
    public void clickLinks() {
        //array con cada label para que tengan un hover
        JLabel lab[] = {linkG, gitG, emailG, linkH, gitH, emailH, linkJ, gitJ, emailJ};
        
        //loop for para recorrer el array y que realice los cambios a cada label
        for (JLabel labl : lab) {
            //seteo del color default
            labl.setForeground(Color.white);
            
            //mouse listener para que detecte al apretar cada label
            labl.addMouseListener(new MouseListener() {
                //override al evento mouseClicked para detectar cuando se haga click en cada label
                @Override
                public void mouseClicked(MouseEvent e) {
                    //declaracion de variables que seran enviadas a distintos metodos
                    String str = null;
                    String link = null;
                    
                    //switch para obtener texto de cada label
                    switch (labl.getText()) {
                        
                            //case si el texto coincide, setea variable link con un string del respectivo link
                        case "Linkedin/G":
                            link = "https://www.linkedin.com/in/giorgina-corvalan-83b167281/";
                            
                            //invocacion de metodo agregarLink
                            agregarLink(link);
                            break;
                        case "GitHub/G":
                            link = "https://github.com/York-Andy";
                            agregarLink(link);
                            break;
                        case "Linkedin/H":
                            link = "https://www.linkedin.com/in/hernanl/";
                            agregarLink(link);
                            break;
                        case "GitHub/H":
                            link = "https://github.com/hernanl22";
                            agregarLink(link);
                            break;
                        case "Linkedin/J":
                            link = "https://www.linkedin.com/in/jeronimo-manabella/";
                            agregarLink(link);
                            break;
                        case "GitHub/J":
                            link = "https://github.com/Jerommz";
                            agregarLink(link);
                            break;
                            
                            //case si el texto coincide, setea variable str con un string de un email
                        case "Email/G":
                            str = "Daryork43@gmail.com";
                            
                            //invocacion de metodo copiar
                            copiar(str);
                            break;
                        case "Email/H":
                            str = "Hernanl22@hotmail.com";
                            copiar(str);
                            break;
                        case "Email/J":
                            str = "jeronimomanabella971@gmail.com";
                            copiar(str);
                            break;
                    }
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
                    labl.setForeground(new Color(237, 126, 119));
                }

                //override al evento mouseExited para que cuando pase el mouse por arriba cambie al color elegido
                @Override
                public void mouseExited(MouseEvent e) {
                    labl.setForeground(Color.white);
                }
            });
        }
    }

    //metodo agregar link
    public void agregarLink(String link) {
        //try-catch para detectar si el enviroment actual es compatible con la clase Desktop
        //la clase Desktop habilita la interacion con el sistema operativo permitiendo realizar busquedas en navegador
        try {
            //comprobacion de compatibilidad
            if (Desktop.isDesktopSupported()) {
                //habilitacion de interaccion con sistema operativo
                Desktop desktop = Desktop.getDesktop();
                
                //if para detectar si el enviroment es compatible con Desktop.Action.BROWSE
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    //metodo browse, recibe parametro
                    desktop.browse(new URI(link));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //metodo para copiar al portapapeles al clickear un label
    public void copiar(String str){
        
        //declaracion de variable con acceso al portapapeles del sistema
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        //declaracion de variable con string obtenida por parametro
        StringSelection strsel = new StringSelection(str);
        
        //envio de string al portapapeles del sistema
        clip.setContents(strsel, strsel);
        JOptionPane.showMessageDialog(null, "Copiado.");
    }
}
