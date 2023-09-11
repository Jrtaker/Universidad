/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo78.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Joni
 */
public class PaginaInicial extends javax.swing.JFrame {

    /**
     * Creates new form PaginaInicial
     */
    public PaginaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("UniversidadGrupo78.jpg"));
        Image img=icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g)
            {
                g.drawImage(img,0,0,getWidth(),
                    getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMIFormularioDeAlumno = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMIFormularioDeMateria = new javax.swing.JMenuItem();
        jMAdministracion = new javax.swing.JMenu();
        jMIManejoDeInscripcion = new javax.swing.JMenuItem();
        jMIManipulacionDeNotas = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMIAlumnosPorMateria = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1153, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMIFormularioDeAlumno.setText("Formulario De Alumno");
        jMIFormularioDeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFormularioDeAlumnoActionPerformed(evt);
            }
        });
        jMAlumno.add(jMIFormularioDeAlumno);

        jMenuBar1.add(jMAlumno);

        jMMateria.setText("Materia");

        jMIFormularioDeMateria.setText("Formulario De Materia");
        jMIFormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFormularioDeMateriaActionPerformed(evt);
            }
        });
        jMMateria.add(jMIFormularioDeMateria);

        jMenuBar1.add(jMMateria);

        jMAdministracion.setText("Administracion");

        jMIManejoDeInscripcion.setText("Manejo De Inscripcion");
        jMIManejoDeInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManejoDeInscripcionActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMIManejoDeInscripcion);

        jMIManipulacionDeNotas.setText("Manipulacion De Notas");
        jMIManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManipulacionDeNotasActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMIManipulacionDeNotas);

        jMenuBar1.add(jMAdministracion);

        jMConsultas.setText("Consultas");

        jMIAlumnosPorMateria.setText("Alumnos Por Materia");
        jMIAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlumnosPorMateriaActionPerformed(evt);
            }
        });
        jMConsultas.add(jMIAlumnosPorMateria);

        jMenuBar1.add(jMConsultas);

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMIFormularioDeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFormularioDeAlumnoActionPerformed
        escritorio.repaint();
        FormularioDeAlumno temp = new FormularioDeAlumno();
        temp.setVisible(true);
        escritorio.add(temp);
        escritorio.moveToFront(temp);  // TODO add your handling code here:
    }//GEN-LAST:event_jMIFormularioDeAlumnoActionPerformed

    private void jMIFormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFormularioDeMateriaActionPerformed
        escritorio.repaint();
        FormularioDeMateria temp = new FormularioDeMateria();
        temp.setVisible(true);
        escritorio.add(temp);
        escritorio.moveToFront(temp);
    }//GEN-LAST:event_jMIFormularioDeMateriaActionPerformed

    private void jMIManejoDeInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManejoDeInscripcionActionPerformed
        escritorio.repaint();
        ManejoDeInscripcion temp = new ManejoDeInscripcion();
        temp.setVisible(true);
        escritorio.add(temp);
        escritorio.moveToFront(temp);// TODO add your handling code here:
    }//GEN-LAST:event_jMIManejoDeInscripcionActionPerformed

    private void jMIManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManipulacionDeNotasActionPerformed
        escritorio.repaint();
        ManipulacionDeNotas temp = new ManipulacionDeNotas();
        temp.setVisible(true);
        escritorio.add(temp);
        escritorio.moveToFront(temp);        // TODO add your handling code here:
    }//GEN-LAST:event_jMIManipulacionDeNotasActionPerformed

    private void jMIAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlumnosPorMateriaActionPerformed
        escritorio.repaint();
        AlumnosPorMateria temp = new AlumnosPorMateria();
        temp.setVisible(true);
        escritorio.add(temp);
        escritorio.moveToFront(temp); // TODO add your handling code here:
    }//GEN-LAST:event_jMIAlumnosPorMateriaActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void setNimbusFeel() {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMIAlumnosPorMateria;
    private javax.swing.JMenuItem jMIFormularioDeAlumno;
    private javax.swing.JMenuItem jMIFormularioDeMateria;
    private javax.swing.JMenuItem jMIManejoDeInscripcion;
    private javax.swing.JMenuItem jMIManipulacionDeNotas;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
