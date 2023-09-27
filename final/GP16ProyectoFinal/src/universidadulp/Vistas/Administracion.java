package universidadulp.Vistas;

//imports de paquetes y clases necesarios
import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import java.util.List;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.*;
import universidadulp.AccesoADatos.*;
import universidadulp.Entidades.*;

public class Administracion extends javax.swing.JPanel {

    //atributos necesarios para los metodos utilizados
    private Connection con;
    boolean editable = false;
    private AlumnoData alumnoDB = new AlumnoData();
    private InscripcionData inscripcionDB = new InscripcionData();
    private MateriaData materiaDB = new MateriaData();

    //modelo para tabla inscripciones usada en el metodo mostrar tabla inscripciones
    String[] col = {"ID", "Nombre", "Año"};
    DefaultTableModel modeloInscripciones = new DefaultTableModel(null, col) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return editable;
        }
    };

    //modelo para tabla notas usada en el metodo mostrar tabla notas
    String[] col2 = {"ID", "Nombre", "Nota"};
    DefaultTableModel modeloNotas = new DefaultTableModel(null, col2) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return editable;
        }
    };

    //modelo para tabla alumno usada en el metodo mostrar tabla alumno
    String[] col3 = {"ID", "Dni", "Alumno", "Estado"};
    DefaultTableModel modeloAlumno = new DefaultTableModel(null, col3) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return editable;
        }
    };

    //constructor vacio
    public Administracion() {
        initComponents();
        con = Conexion.getConnection();
        jcMateriasInscriptas.setSelected(true);
        mostrarComboBoxInscripciones();
        mostrarComboBoxNotas();
        jbInscribir.setEnabled(false);
        mostrarTablaAlumno();
        checkBoxColumn(3, jtTablaAlumnos);

        //array con cada boton para que tengan un hover
        JButton btns[] = {jbAnularInscripcion, jbInscribir, jbBotonGuardarNotas, jbBotonBaja, jbBotonAlta};

        //loop for para recorrer el array y que realice los cambios a cada boton
        for (JButton btn : btns) {

            //seteo el color default
            btn.setBackground(new Color(60, 63, 65));

            //seteo el look and feel basico de los botones
            btn.setUI(new BasicButtonUI());

            //mouse listener para que me detecte al apretar cada boton
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

                //override al evento mouseEntered para que cuando pase el mouse por arriba cambie al color elegido
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

        panelInscripciones = new javax.swing.JPanel();
        panelTop1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMid1 = new javax.swing.JPanel();
        panelTopHalf1 = new javax.swing.JPanel();
        panelCB = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcbListaAlumnosInscripcion = new javax.swing.JComboBox<>();
        panelSeleccion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcMateriasInscriptas = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jcMateriasNoInscriptas = new javax.swing.JCheckBox();
        panelPalabra = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelTopHalf2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaInscripcion = new javax.swing.JTable();
        panelBot1 = new javax.swing.JPanel();
        jbAnularInscripcion = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        panelNotas = new javax.swing.JPanel();
        panelTop2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelMid2 = new javax.swing.JPanel();
        panelMidSeleccion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbListaNotas = new javax.swing.JComboBox<>();
        panelMidTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaNotas = new javax.swing.JTable();
        panelBot2 = new javax.swing.JPanel();
        jbBotonGuardarNotas = new javax.swing.JButton();
        panelAlumnos = new javax.swing.JPanel();
        paelTop3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelMid3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTablaAlumnos = new javax.swing.JTable();
        panelBot3 = new javax.swing.JPanel();
        jbBotonBaja = new javax.swing.JButton();
        jbBotonAlta = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelInscripciones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(21, 39, 43)));
        panelInscripciones.setPreferredSize(new java.awt.Dimension(428, 0));
        panelInscripciones.setLayout(new java.awt.BorderLayout());

        panelTop1.setPreferredSize(new java.awt.Dimension(0, 60));
        panelTop1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario inscripcion");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        panelTop1.add(jLabel1, java.awt.BorderLayout.CENTER);

        panelInscripciones.add(panelTop1, java.awt.BorderLayout.NORTH);

        panelMid1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        panelMid1.setLayout(new java.awt.BorderLayout());

        panelTopHalf1.setPreferredSize(new java.awt.Dimension(100, 240));
        panelTopHalf1.setLayout(new java.awt.BorderLayout());

        panelCB.setPreferredSize(new java.awt.Dimension(0, 80));
        panelCB.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Seleccione un alumno:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        panelCB.add(jLabel2, gridBagConstraints);

        jcbListaAlumnosInscripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jcbListaAlumnosInscripcion.setForeground(java.awt.Color.white);
        jcbListaAlumnosInscripcion.setPreferredSize(new java.awt.Dimension(180, 40));
        jcbListaAlumnosInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosInscripcionActionPerformed(evt);
            }
        });
        panelCB.add(jcbListaAlumnosInscripcion, new java.awt.GridBagConstraints());

        panelTopHalf1.add(panelCB, java.awt.BorderLayout.NORTH);

        panelSeleccion.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Materias inscriptas");
        panelSeleccion.add(jLabel3, new java.awt.GridBagConstraints());

        jcMateriasInscriptas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jcMateriasInscriptas.setForeground(java.awt.Color.white);
        jcMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriasInscriptasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 14);
        panelSeleccion.add(jcMateriasInscriptas, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Materias no inscriptas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        panelSeleccion.add(jLabel4, gridBagConstraints);

        jcMateriasNoInscriptas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jcMateriasNoInscriptas.setForeground(java.awt.Color.white);
        jcMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriasNoInscriptasActionPerformed(evt);
            }
        });
        panelSeleccion.add(jcMateriasNoInscriptas, new java.awt.GridBagConstraints());

        panelTopHalf1.add(panelSeleccion, java.awt.BorderLayout.CENTER);

        panelPalabra.setPreferredSize(new java.awt.Dimension(428, 80));
        panelPalabra.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Listado de materias");
        panelPalabra.add(jLabel8, java.awt.BorderLayout.CENTER);

        panelTopHalf1.add(panelPalabra, java.awt.BorderLayout.SOUTH);

        panelMid1.add(panelTopHalf1, java.awt.BorderLayout.NORTH);

        panelTopHalf2.setPreferredSize(new java.awt.Dimension(428, 340));
        panelTopHalf2.setLayout(new java.awt.BorderLayout());

        jtTablaInscripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTablaInscripcion.setForeground(java.awt.Color.white);
        jtTablaInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTablaInscripcion.setRowHeight(32);
        jScrollPane1.setViewportView(jtTablaInscripcion);

        panelTopHalf2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelMid1.add(panelTopHalf2, java.awt.BorderLayout.CENTER);

        panelInscripciones.add(panelMid1, java.awt.BorderLayout.CENTER);

        panelBot1.setPreferredSize(new java.awt.Dimension(428, 80));
        panelBot1.setLayout(new java.awt.GridLayout(1, 0));

        jbAnularInscripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAnularInscripcion.setForeground(java.awt.Color.white);
        jbAnularInscripcion.setText("Anular inscripcion");
        jbAnularInscripcion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(21, 39, 43)));
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });
        panelBot1.add(jbAnularInscripcion);

        jbInscribir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbInscribir.setForeground(java.awt.Color.white);
        jbInscribir.setText("Inscribir");
        jbInscribir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(21, 39, 43)));
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        panelBot1.add(jbInscribir);

        panelInscripciones.add(panelBot1, java.awt.BorderLayout.SOUTH);

        add(panelInscripciones, java.awt.BorderLayout.WEST);

        panelNotas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(21, 39, 43)));
        panelNotas.setPreferredSize(new java.awt.Dimension(426, 0));
        panelNotas.setLayout(new java.awt.BorderLayout());

        panelTop2.setPreferredSize(new java.awt.Dimension(0, 60));
        panelTop2.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Carga de notas");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        panelTop2.add(jLabel5, java.awt.BorderLayout.CENTER);

        panelNotas.add(panelTop2, java.awt.BorderLayout.NORTH);

        panelMid2.setLayout(new java.awt.BorderLayout());

        panelMidSeleccion.setPreferredSize(new java.awt.Dimension(0, 80));
        panelMidSeleccion.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Seleccione un alumno:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        panelMidSeleccion.add(jLabel6, gridBagConstraints);

        jcbListaNotas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jcbListaNotas.setForeground(java.awt.Color.white);
        jcbListaNotas.setPreferredSize(new java.awt.Dimension(170, 40));
        jcbListaNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaNotasActionPerformed(evt);
            }
        });
        panelMidSeleccion.add(jcbListaNotas, new java.awt.GridBagConstraints());

        panelMid2.add(panelMidSeleccion, java.awt.BorderLayout.NORTH);

        panelMidTable.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        panelMidTable.setPreferredSize(new java.awt.Dimension(0, 500));
        panelMidTable.setLayout(new java.awt.BorderLayout());

        jtTablaNotas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTablaNotas.setForeground(java.awt.Color.white);
        jtTablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTablaNotas.setRowHeight(32);
        jtTablaNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaNotasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtTablaNotas);

        panelMidTable.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelMid2.add(panelMidTable, java.awt.BorderLayout.SOUTH);

        panelNotas.add(panelMid2, java.awt.BorderLayout.CENTER);

        panelBot2.setPreferredSize(new java.awt.Dimension(0, 80));
        panelBot2.setLayout(new java.awt.BorderLayout());

        jbBotonGuardarNotas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbBotonGuardarNotas.setForeground(java.awt.Color.white);
        jbBotonGuardarNotas.setText("Guardar");
        jbBotonGuardarNotas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(21, 39, 43)));
        jbBotonGuardarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonGuardarNotasActionPerformed(evt);
            }
        });
        panelBot2.add(jbBotonGuardarNotas, java.awt.BorderLayout.CENTER);

        panelNotas.add(panelBot2, java.awt.BorderLayout.SOUTH);

        add(panelNotas, java.awt.BorderLayout.CENTER);

        panelAlumnos.setPreferredSize(new java.awt.Dimension(426, 0));
        panelAlumnos.setLayout(new java.awt.BorderLayout());

        paelTop3.setPreferredSize(new java.awt.Dimension(0, 60));
        paelTop3.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Alta de alumnos");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        paelTop3.add(jLabel7, java.awt.BorderLayout.CENTER);

        panelAlumnos.add(paelTop3, java.awt.BorderLayout.NORTH);

        panelMid3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 39, 43)));
        panelMid3.setPreferredSize(new java.awt.Dimension(0, 100));
        panelMid3.setLayout(new java.awt.BorderLayout());

        jtTablaAlumnos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTablaAlumnos.setForeground(java.awt.Color.white);
        jtTablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTablaAlumnos.setRowHeight(32);
        jScrollPane3.setViewportView(jtTablaAlumnos);

        panelMid3.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        panelAlumnos.add(panelMid3, java.awt.BorderLayout.CENTER);

        panelBot3.setPreferredSize(new java.awt.Dimension(0, 80));
        panelBot3.setLayout(new java.awt.GridLayout(1, 0));

        jbBotonBaja.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbBotonBaja.setForeground(java.awt.Color.white);
        jbBotonBaja.setText("Baja");
        jbBotonBaja.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(21, 39, 43)));
        jbBotonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonBajaActionPerformed(evt);
            }
        });
        panelBot3.add(jbBotonBaja);

        jbBotonAlta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbBotonAlta.setForeground(java.awt.Color.white);
        jbBotonAlta.setText("Alta");
        jbBotonAlta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(21, 39, 43)));
        jbBotonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonAltaActionPerformed(evt);
            }
        });
        panelBot3.add(jbBotonAlta);

        panelAlumnos.add(panelBot3, java.awt.BorderLayout.SOUTH);

        add(panelAlumnos, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    //action checkbox materias isncriptas de panel inscripciones
    private void jcMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriasInscriptasActionPerformed
        // TODO add your handling code here:
        if (jcMateriasInscriptas.isSelected()) {
            jbInscribir.setEnabled(false);
            jbAnularInscripcion.setEnabled(true);
        }

        //deseleccionar checkbox no inscriptas
        jcMateriasNoInscriptas.setSelected(false);

        //metodo limpar tabla
        actualizarTablaInscripciones();

        //declaracion de variable para enviar al metodo mostrarTablaInscripciones
        String nombre = jcbListaAlumnosInscripcion.getSelectedItem().toString();

        //metodo para mostrar tabla inscripciones
        mostrarTablaInscripciones(inscripcionDB.obtenerMateriasCursadas(buscarAlumno(nombre)));
    }//GEN-LAST:event_jcMateriasInscriptasActionPerformed

    //action checkbox materias no isncriptas de panel inscripciones
    private void jcMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriasNoInscriptasActionPerformed
        // TODO add your handling code here:
        if (jcMateriasNoInscriptas.isSelected()) {
            jbInscribir.setEnabled(true);
            jbAnularInscripcion.setEnabled(false);
        }

        //deseleccionar checkbox inscriptas
        jcMateriasInscriptas.setSelected(false);

        //metodo limpar tabla
        actualizarTablaInscripciones();

        //declaracion de variable para enviar al metodo mostrarTablaInscripciones
        String nombre = jcbListaAlumnosInscripcion.getSelectedItem().toString();

        //metodo para mostrar tabla no inscripciones
        mostrarTablaInscripciones(inscripcionDB.obtenerMateriasNoCursadas(buscarAlumno(nombre)));
    }//GEN-LAST:event_jcMateriasNoInscriptasActionPerformed

    //action anular inscripcion de panel inscripciones
    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        // TODO add your handling code here:
        //seleccion de fila
        int fila = jtTablaInscripcion.getSelectedRow();
        if (fila != -1) {

            //declaracion de variables para enviar al metodo mostrarTablaInscripciones
            String nombre = jcbListaAlumnosInscripcion.getSelectedItem().toString();
            int idAlumno = buscarAlumno(nombre);
            String idMateria = jtTablaInscripcion.getValueAt(fila, 0).toString();

            //metodo para eliminar inscripcion a una materia
            inscripcionDB.borrarInscripcionMateriaAlumno(idAlumno, Integer.valueOf(idMateria));

            //metodo para actualizar la tabla inscripciones
            actualizarTablaInscripciones();
            
            //metodo para actualizar tabla notas
            actualizarTablaNotas();
            
            //metodo para mostrar tabla notas
            mostrarTablaNotas();

            //metodo para mostrar la tabla inscripciones
            mostrarTablaInscripciones(inscripcionDB.obtenerMateriasCursadas(buscarAlumno(nombre)));
        } else {
            JOptionPane.showMessageDialog(null, "Primero seleccione una materia.");
        }
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed

    //action inscribir de panel inscripciones
    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        //seleccion de fila
        int fila = jtTablaInscripcion.getSelectedRow();
        if (fila != -1) {

            //declaracion de variables para enviar al metodo mostrarTablaInscripciones
            String nombre = jcbListaAlumnosInscripcion.getSelectedItem().toString();
            int idAlumno = buscarAlumno(nombre);
            String idMateria = jtTablaInscripcion.getValueAt(fila, 0).toString();

            //invocacion de metodo buscarAlumno para obtener un alumno y enviarlo al constructor de inscripcion
            Alumno alum = alumnoDB.buscarAlumno(idAlumno);

            //invocacion de metodo buscarMateria para obtener una materia y enviarla al constructor de inscripcion
            Materia mate = materiaDB.buscarMateria(Integer.valueOf(idMateria));
            double nota = 1;

            //constructor de inscripcion para enviar al metodo obtenerMateriasCursadas
            Inscripcion insc = new Inscripcion(alum, mate, nota);

            //invocacion de metodo nuevoInscripcion para agregar una inscripcion nueva
            inscripcionDB.nuevoInscripcion(insc);

            //metodo para actualizar la tabla inscripciones
            actualizarTablaInscripciones();
            
            //metodo para actualizar tabla notas
            actualizarTablaNotas();
            
            //metodo para mostrar tabla notas
            mostrarTablaNotas();

            //metodo para mostrar la tabla inscripciones
            mostrarTablaInscripciones(inscripcionDB.obtenerMateriasNoCursadas(buscarAlumno(nombre)));
        } else {
            JOptionPane.showMessageDialog(null, "Primero seleccione una materia.");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    //action combobox listar panel inscripciones
    private void jcbListaAlumnosInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosInscripcionActionPerformed
        // TODO add your handling code here:
        //comprobacion de checkbox para decidir que metodo utilizar y que datos mostrar en tabla inscripcion
        if (jcMateriasInscriptas.isSelected()) {

            //declaracion de variable para obtener nombre de alumno dentro del combobox
            String nombre = jcbListaAlumnosInscripcion.getSelectedItem().toString();

            //metodo para actualizar la tabla inscripciones
            actualizarTablaInscripciones();

            //metodo para mostrar la tabla inscripciones con materias cursadas
            mostrarTablaInscripciones(inscripcionDB.obtenerMateriasCursadas(buscarAlumno(nombre)));
        } else if (jcMateriasNoInscriptas.isSelected()) {

            //declaracion de variable para obtener nombre de alumno dentro del combobox
            String nombre = jcbListaAlumnosInscripcion.getSelectedItem().toString();

            //metodo para actualizar la tabla inscripciones
            actualizarTablaInscripciones();

            //metodo para mostrar la tabla inscripciones con materias no cursadas
            mostrarTablaInscripciones(inscripcionDB.obtenerMateriasNoCursadas(buscarAlumno(nombre)));
        }
    }//GEN-LAST:event_jcbListaAlumnosInscripcionActionPerformed

    //action combobox listar panel notas
    private void jcbListaNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaNotasActionPerformed
        // TODO add your handling code here:
        //metodo para actualizar la tabla notas
        actualizarTablaNotas();

        //metodo para mostrar tabla notas
        mostrarTablaNotas();
    }//GEN-LAST:event_jcbListaNotasActionPerformed

    //action table setear columna como no editable
    private void jtTablaNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaNotasMouseClicked
        // TODO add your handling code here:
        if (jtTablaNotas.getSelectedColumn() == 2) {
            editable = true;
        } else {
            editable = false;
        }
    }//GEN-LAST:event_jtTablaNotasMouseClicked

    //action guardar panel notas
    private void jbBotonGuardarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonGuardarNotasActionPerformed
        // TODO add your handling code here:
        //seleccion de fila
        int fila = jtTablaNotas.getSelectedRow();
        if (fila != -1) {

            //declaracion de variables para enviar al metodo actualizar nota
            int i = jtTablaNotas.getSelectedRow();
            double nota = Double.parseDouble(jtTablaNotas.getModel().getValueAt(i, 2).toString());

            //if para que la nota este entre 1 y 10
            if (nota < 1 || nota > 10) {
                JOptionPane.showMessageDialog(null, "La nota debe ser entre 1 y 10.");
            } else {

                //declaracion de variables para enviar al metodo actualizar nota
                String nombre = jcbListaNotas.getSelectedItem().toString();
                int idAlumno = buscarAlumno(nombre);
                int idMateria = Integer.parseInt(jtTablaNotas.getModel().getValueAt(i, 0).toString());

                //metodo para actualizar nota
                inscripcionDB.actualizarNota(idAlumno, idMateria, nota);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno.");
        }
    }//GEN-LAST:event_jbBotonGuardarNotasActionPerformed

    //action baja alumno
    private void jbBotonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonBajaActionPerformed
        // TODO add your handling code here:
        //seleccion de fila
        int fila = jtTablaAlumnos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un alumno.");
        } else {

            //if para detectar si el alumno ya ha sido eliminado
            if ((Boolean) jtTablaAlumnos.getValueAt(fila, 3) == false) {
                JOptionPane.showMessageDialog(null, "El alumno seleccionado ya ha sido eliminado.");
            } else {

                //declaracion de variables para enviar al metodo eliminar alumno
                String idAlumno = jtTablaAlumnos.getValueAt(fila, 0).toString();

                //metodo para eliminar alumno
                alumnoDB.eliminarAlumno(Integer.valueOf(idAlumno));

                //seteo de checkbox en negativo para el alumno eliminado
                jtTablaAlumnos.setValueAt(false, fila, 3);
            }
        }
    }//GEN-LAST:event_jbBotonBajaActionPerformed

    //action alta alumno
    private void jbBotonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotonAltaActionPerformed
        // TODO add your handling code here:
        //seleccion de fila
        int fila = jtTablaAlumnos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un alumno.");
        } else {

            //if para detectar si el alumno esta activo
            if ((Boolean) jtTablaAlumnos.getValueAt(fila, 3) == true) {
                JOptionPane.showMessageDialog(null, "El alumno seleccionado esta activo.");
            } else {

                //query para updatear el estado del alumno
                String sql = "update alumno set estado = true "
                        + "where idAlumno = ?";

                //declaracion de variables para enviar al metodo eliminar alumno
                String idAlumno = jtTablaAlumnos.getValueAt(fila, 0).toString();
                try {

                    //envio de query a la base de datos
                    PreparedStatement ps = con.prepareStatement(sql);
                    
                    //seteo de valores de query sacados del parametro
                    ps.setInt(1, Integer.valueOf(idAlumno));
                    ps.executeUpdate();

                    //seteo de checkbox en positivo para el alumno activado
                    jtTablaAlumnos.setValueAt(true, fila, 3);
                    JOptionPane.showMessageDialog(null, "Alumno agregado.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos./altaBoton");
                }
            }
        }
    }//GEN-LAST:event_jbBotonAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbBotonAlta;
    private javax.swing.JButton jbBotonBaja;
    private javax.swing.JButton jbBotonGuardarNotas;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JCheckBox jcMateriasInscriptas;
    private javax.swing.JCheckBox jcMateriasNoInscriptas;
    private javax.swing.JComboBox<String> jcbListaAlumnosInscripcion;
    private javax.swing.JComboBox<String> jcbListaNotas;
    private javax.swing.JTable jtTablaAlumnos;
    private javax.swing.JTable jtTablaInscripcion;
    private javax.swing.JTable jtTablaNotas;
    private javax.swing.JPanel paelTop3;
    private javax.swing.JPanel panelAlumnos;
    private javax.swing.JPanel panelBot1;
    private javax.swing.JPanel panelBot2;
    private javax.swing.JPanel panelBot3;
    private javax.swing.JPanel panelCB;
    private javax.swing.JPanel panelInscripciones;
    private javax.swing.JPanel panelMid1;
    private javax.swing.JPanel panelMid2;
    private javax.swing.JPanel panelMid3;
    private javax.swing.JPanel panelMidSeleccion;
    private javax.swing.JPanel panelMidTable;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JPanel panelPalabra;
    private javax.swing.JPanel panelSeleccion;
    private javax.swing.JPanel panelTop1;
    private javax.swing.JPanel panelTop2;
    private javax.swing.JPanel panelTopHalf1;
    private javax.swing.JPanel panelTopHalf2;
    // End of variables declaration//GEN-END:variables

    //metodo para mostrar combobox de inscripciones
    public void mostrarComboBoxInscripciones() {

        //query para obtener nombre y apellido
        String sql = "select nombre, apellido from alumno order by idAlumno ASC";

        try {

            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //declaracion de variables que seran mostrados en el combobox
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String dato[] = {nombre + " " + apellido};
                for (String datos : dato) {
                    jcbListaAlumnosInscripcion.addItem(datos);
                }
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        }
    }

    //metodo para mostrar combobox de inscripciones
    public int mostrarComboBoxNotas() {

        //query para obtener nombre y apellido
        String sql = "select nombre, apellido from alumno order by idAlumno ASC";
        int id = 0;
        try {

            //declaracion de variables que seran mostrados en el combobox
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //declaracion de variables que seran mostrados en el combobox
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String dato[] = {nombre + " " + apellido};
                for (String datos : dato) {
                    jcbListaNotas.addItem(datos);
                }
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return id;
    }

    //metodo para rellenar la tabla inscripciones con los datos requeridos
    public void mostrarTablaInscripciones(List<Materia> materias) {
        //seteo de modelo de la tabla inscripciones
        jtTablaInscripcion.setModel(modeloInscripciones);

        //codigo para obtener el modelo de las columnas y cambiar su tamaño
        TableColumnModel columna = jtTablaInscripcion.getColumnModel();
        columna.getColumn(0).setMaxWidth(30);
        try {

            //declaracion de variables que seran mostradas en cada fila de la tabla
            for (int i = 0; i < materias.size(); i++) {
                String idMateria = materias.get(i).getIdMateria() + "";
                String nombreMateria = materias.get(i).getNombre();
                String anioMateria = materias.get(i).getAnioMateria() + "";
                String[] dataM = {idMateria, nombreMateria, anioMateria};
                modeloInscripciones.addRow(dataM);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos./tablaInscripciones");
        }

    }

    //metodo para rellenar la tabla notas con los datos requeridos
    public void mostrarTablaNotas() {
        //seteo de modelo de la tabla inscripciones
        jtTablaNotas.setModel(modeloNotas);

        //declaracion de variable para invocar metodo buscarAlumno
        String nombreLista = jcbListaNotas.getSelectedItem().toString();
        int id = buscarAlumno(nombreLista);

        //codigo para obtener el modelo de las columnas y cambiar su tamaño
        TableColumnModel columna = jtTablaNotas.getColumnModel();
        columna.getColumn(0).setMaxWidth(30);
        columna.getColumn(2).setMaxWidth(60);

        //query para obtener idMateria y nombre y nota
        String sql = "select materia.idMateria, materia.nombre, inscripcion.nota "
                + "from materia "
                + "inner join inscripcion on inscripcion.idMateria = materia.idMateria "
                + "inner join alumno on alumno.idAlumno = inscripcion.idAlumno "
                + "where inscripcion.idAlumno = ? order by idMateria ASC";
        try {
            //declaracion de variables que seran mostrados en la tabla notas
            PreparedStatement ps = con.prepareStatement(sql);
            
            //seteo de valores de query sacados del parametro
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //declaracion de variables que seran mostrados en la tabla notas
                String idMateria = String.valueOf(rs.getInt("materia.idMateria"));
                String nombre = rs.getString("materia.nombre");
                String nota = rs.getString("inscripcion.nota");
                String dataM[] = {idMateria, nombre, nota};
                modeloNotas.addRow(dataM);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos./tablaNotas");
        }
    }

    //metodo para rellenar la tabla alumno con los datos requeridos
    public void mostrarTablaAlumno() {
        //seteo de modelo de la tabla inscripciones
        jtTablaAlumnos.setModel(modeloAlumno);

        //codigo para obtener el modelo de las columnas y cambiar su tamaño
        TableColumnModel columna = jtTablaAlumnos.getColumnModel();
        columna.getColumn(0).setMaxWidth(30);
        columna.getColumn(3).setMaxWidth(50);

        //query para obtener idAlumno, dni, apellido, nombre y estado
        String sql = "select idAlumno, dni, apellido, nombre, estado "
                + "from alumno";
        try {

            //declaracion de variables que seran mostrados en la tabla notas
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //declaracion de variables que seran mostrados en la tabla alumno
                String idMateria = String.valueOf(rs.getInt("idAlumno"));
                String dni = String.valueOf(rs.getInt("dni"));
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                String alumno = nombre + " " + apellido;
                boolean estado = rs.getBoolean("estado");
                Object dataM[] = {idMateria, dni, alumno, estado};
                modeloAlumno.addRow(dataM);
                int fil = jtTablaAlumnos.getSelectedRow();
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos./tablaAlumnos");
        }
    }

    //metodo para actualizar la tabla inscripciones
    public void actualizarTablaInscripciones() {
        //declaracion de nuevo modelo copiando el modelo actual de la tabla
        DefaultTableModel mod = (DefaultTableModel) jtTablaInscripcion.getModel();
        
        //eliminacion de filas
        mod.setRowCount(0);
    }

    //metodo para actualizar la tabla notas
    public void actualizarTablaNotas() {
        //declaracion de nuevo modelo copiando el modelo actual de la tabla
        DefaultTableModel mod = (DefaultTableModel) jtTablaNotas.getModel();
        
        //eliminacion de filas
        mod.setRowCount(0);
    }

    //metodo para buscar un alumno y retornar su idAlumno
    public int buscarAlumno(String nombre) {
        //declaracion de variables
        String[] valores = nombre.split(" ");
        String nombreSQL = valores[0];

        //query para obtener idAlumno
        String sql = "select idAlumno from alumno where nombre = ?";
        int id = 0;
        try {

            //declaracion de variables que seran mostrados en la tabla notas
            PreparedStatement ps = con.prepareStatement(sql);
            
            //seteo de valores de query sacados del parametro
            ps.setString(1, nombreSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("idAlumno");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error..");
        }
        return id;
    }

    //metodo para setear una columna como Boolean para que contenga checkbox
    public void checkBoxColumn(int col, JTable table) {
        TableColumn colum = table.getColumnModel().getColumn(col);
        colum.setCellEditor(table.getDefaultEditor(Boolean.class));
        colum.setCellRenderer(table.getDefaultRenderer(Boolean.class));
    }
}
