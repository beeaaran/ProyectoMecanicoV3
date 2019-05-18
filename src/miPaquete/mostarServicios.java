/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPaquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author jaime
 */
public class mostarServicios extends javax.swing.JFrame {

    /**
     * Creates new form mostarServicios
     */
    public mostarServicios() {
        initComponents();
        cargarRegistros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Servicios Registrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        new VistaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void cargarRegistros(){
        File file = new File ("miArchivo2.txt");
        BufferedReader reader = null;
        
        
 try {
            // FileReader reads text files in the default encoding.
            FileReader fl = new FileReader(file);

            // Always wrap FileReader in BufferedReader.
            reader = new BufferedReader(fl);
            String text;

            while((text = reader.readLine()) != null) {
                
             StringTokenizer st1 = new StringTokenizer(text, "%");
             int contador = 0;
             while(st1.hasMoreElements()){
                switch(contador){
                     case 0: jTextArea1.setText( jTextArea1.getText() + "\n" + "Id:   " + (String)st1.nextElement() + "\n");break;
                     case 1: jTextArea1.setText( jTextArea1.getText() + "\n" + "Nombre del servicio:   " + (String)st1.nextElement() + "\n");break;
                     case 2: jTextArea1.setText( jTextArea1.getText() + "\n" + "Costo:   " + (String)st1.nextElement() + "\n");break;
                     case 3: jTextArea1.setText( jTextArea1.getText() + "\n" + "Mecanico Asignado:  " + (String)st1.nextElement() + "\n");break;
                     
                     case 4: jTextArea1.setText(jTextArea1.getText() + "\n" + "Fecha llegada:   " + (String)st1.nextElement() + "\n");break;
                     case 5: jTextArea1.setText(jTextArea1.getText() + "\n" + "Fecha de entrega:    " + (String)st1.nextElement() + "\n");break;
                     case 6: jTextArea1.setText(jTextArea1.getText() + "\n" + "Modelo:    " + (String)st1.nextElement() + "\n");break;
                     case 7: jTextArea1.setText(jTextArea1.getText() + "\n" + "Marca:     " + (String)st1.nextElement() + "\n");break;
                     case 8: jTextArea1.setText(jTextArea1.getText() + "\n" + "Color:     " +(String)st1.nextElement() + "\n");break;
                     case 9: jTextArea1.setText(jTextArea1.getText() + "\n" + "Submarca:    " + (String)st1.nextElement() + "\n");break;
                     case 10: jTextArea1.setText(jTextArea1.getText() + "\n" + "Placas:      " + (String)st1.nextElement() + "\n");break;
                     case 11: jTextArea1.setText(jTextArea1.getText() + "\n" + "Kilometraje:     " + (String)st1.nextElement() + "\n");break;
                     case 12: jTextArea1.setText(jTextArea1.getText() + "\n" + "Numero De Serie:    " + (String)st1.nextElement() + "\n");break;
                     case 13: jTextArea1.setText(jTextArea1.getText() + "\n" + "Nombre Cliente:     " + (String)st1.nextElement() + "\n");break;
                     case 14: jTextArea1.setText(jTextArea1.getText() + "\n" + "Direccion Cliente:    " + (String)st1.nextElement() + "\n");break;
                     case 15: jTextArea1.setText(jTextArea1.getText() + "\n" + "Telefono Cliente:   " +(String)st1.nextElement() + "\n");break;
                     case 16: jTextArea1.setText(jTextArea1.getText() + "\n" + "Correo:   " + (String)st1.nextElement() + "\n");break;
                     case 17: jTextArea1.setText(jTextArea1.getText() + "\n" +  "Ultima Visita:   " +(String)st1.nextElement() + "\n");break;
                     case 18: jTextArea1.setText(jTextArea1.getText() + "\n" + "Observaciones Mecanico:    " +(String)st1.nextElement() + "\n");break;
                     
                    case 19: jTextArea1.setText(jTextArea1.getText() + "\n" + "Observaciones Cliente:   " + (String)st1.nextElement() + "\n");break;
                 }
                 contador++;
                     
                     
                   
                     
                     
                     
                     
                
             }
            }
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch(IOException e) {
                    e.printStackTrace();
               
                }finally{
                    try{
                 if(reader!= null){

                 reader.close();}
                 
                 }catch (IOException e){}
                        }
                       }
    
    
    
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
            java.util.logging.Logger.getLogger(mostarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostarServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
