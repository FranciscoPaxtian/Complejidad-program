/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejidad;

import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Paxtian
 */
public class Uno extends javax.swing.JFrame {

        int a, b, res;
        int c=2;
    /**
     * Creates new form Uno
     */
    public Uno() {
        initComponents();
        setLocationRelativeTo(null);
        Resultado.setEditable(false);
        Codigo.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Aristas = new javax.swing.JTextField();
        Nodos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        BtAyuda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        BtVolver.setBackground(new java.awt.Color(102, 102, 102));
        BtVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VOLVER 40x40.png"))); // NOI18N
        BtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Primera forma");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aristas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad de");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nodos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 60, -1));

        Aristas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Aristas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, 40));

        Nodos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Nodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 60, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Resultado");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 90, -1));

        Resultado.setBackground(new java.awt.Color(204, 204, 204));
        Resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 60, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de codigo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, -1));

        Codigo.setBackground(new java.awt.Color(204, 204, 204));
        Codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 160, 50));

        BtAyuda.setBackground(new java.awt.Color(102, 102, 102));
        BtAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AYUDA 40x40.png"))); // NOI18N
        BtAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(BtAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 50, 50));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LARANA RENE (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Proceso(){
        
        a = Integer.parseInt(Aristas.getText());
        b = Integer.parseInt(Nodos.getText());
        
        res=(a-b)+c;

        Resultado.setText(String.valueOf(res));
        Opcion();   
    
    }
 
    private void Opcion(){
        if((res>=1)&& (res<=10)){
            Codigo.setText("Simple ");
        }
        else if((res>=11 )&&( res<=20)){
            Codigo.setText("Algo complejo ");
        }
        else if((res>=21 )&&( res<=50)){
            Codigo.setText("Complejo ");
        }        
        else if(res>=51){
            Codigo.setText("No testeable ");
        }       
        else if(res == 0){
            Codigo.setText("No Ejecutable ");            
        }
        else if(res <= 0){
            Codigo.setText("No Ejecutable ");            
        }
    }
    private void BtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVolverActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BtVolverActionPerformed

    private void BtAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAyudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "★Tipo de codigo★ \n ☛ 1 - 10 Simple "
            + "\n ☛ 11 - 20 Algo complejo \n ☛ 21 - 50 Complejo \n ☛ 51+ No testeable \n");
        JOptionPane.showMessageDialog(rootPane, "Para mas ayuda y asistencia tecnica contactame \n ✉ Correo: fpaxtian@hotmail.com \n "
            + "☎ Telefono: 9621848035");
    }//GEN-LAST:event_BtAyudaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Proceso();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aristas;
    private javax.swing.JButton BtAyuda;
    private javax.swing.JButton BtVolver;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Nodos;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
