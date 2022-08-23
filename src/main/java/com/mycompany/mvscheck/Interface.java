/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

// -> Pacote
//

package com.mycompany.mvscheck;

// -> "Buscando" o Java JOptionPane e ImageIcon para a criação da execução e interface do programa
//

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/* -> Autor do projeto
 *
 * @author Vent
 */

// -> Declarando a classe da interface, definindo sua visibilidade importando o JFrame
//

public class Interface extends javax.swing.JFrame {

    // -> Método construtor
    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupCheck = new javax.swing.ButtonGroup();
        label1 = new javax.swing.JLabel();
        checkAction = new javax.swing.JCheckBox();
        checkAnimat = new javax.swing.JCheckBox();
        checkComedy = new javax.swing.JCheckBox();
        checkFic = new javax.swing.JCheckBox();
        checkRomance = new javax.swing.JCheckBox();
        checkSuspense = new javax.swing.JCheckBox();
        checkTerr = new javax.swing.JCheckBox();
        buttonOk = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        label1.setText("SELEÇÃO DE FILMES");

        groupCheck.add(checkAction);
        checkAction.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkAction.setText("Ação");

        groupCheck.add(checkAnimat);
        checkAnimat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkAnimat.setText("Animação");

        groupCheck.add(checkComedy);
        checkComedy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkComedy.setText("Comédia");

        groupCheck.add(checkFic);
        checkFic.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkFic.setText("Ficção");

        groupCheck.add(checkRomance);
        checkRomance.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkRomance.setText("Romance");

        groupCheck.add(checkSuspense);
        checkSuspense.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkSuspense.setText("Supense");

        groupCheck.add(checkTerr);
        checkTerr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkTerr.setText("Terror");

        buttonOk.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonOk.setText("OK");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        buttonExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonExit.setText("Sair");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkComedy)
                    .addComponent(checkAnimat)
                    .addComponent(checkAction)
                    .addComponent(checkTerr)
                    .addComponent(checkSuspense)
                    .addComponent(checkRomance)
                    .addComponent(checkFic))
                .addContainerGap(277, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonOk)
                        .addGap(18, 18, 18)
                        .addComponent(buttonExit)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkAction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkAnimat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkComedy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkFic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkRomance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSuspense)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkTerr)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOk)
                    .addComponent(buttonExit))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        ImageIcon acao = new ImageIcon("Ação.jpg");
        ImageIcon animacao = new ImageIcon("Animação.png");
        ImageIcon comedia = new ImageIcon("Comédia.jpg");
        ImageIcon ficcao = new ImageIcon("Ficção.jpg");
        ImageIcon romance = new ImageIcon("Romance.jpg");
        ImageIcon suspense = new ImageIcon("Suspense.jpg");
        ImageIcon terror = new ImageIcon("Terror.png");
        
        // -> Denominando a funcionalidade das caixas (CheckBox) por meios do button "Ok" com if & Else
        //
        
        if (checkAction.isSelected()) {
            JOptionPane.showMessageDialog(null,"", "Kill Bill - Volume I", JOptionPane.OK_OPTION, acao);
        } else
            if (checkAnimat.isSelected()) {
                JOptionPane.showMessageDialog(null, "", "Ratattouille", JOptionPane.OK_OPTION, animacao);
            } else
                if (checkComedy.isSelected()) {
                    JOptionPane.showMessageDialog(null, "", "The Green Book: O Guia", JOptionPane.OK_OPTION, comedia);
                } else
                    if (checkFic.isSelected()) {
                        JOptionPane.showMessageDialog(null, "", "Interestelar", JOptionPane.OK_OPTION, ficcao);
                    } else
                        if (checkRomance.isSelected()) {
                            JOptionPane.showMessageDialog(null, "", "Brilho eterno de uma mente sem lembranças", JOptionPane.OK_OPTION, romance);
                        } else
                            if (checkSuspense.isSelected()) {
                                JOptionPane.showMessageDialog(null, "", "O Abutre", JOptionPane.OK_OPTION, suspense);
                            } else 
                                if (checkTerr.isSelected()) {
                                JOptionPane.showMessageDialog(null, "", "O Iluminado", JOptionPane.OK_OPTION, terror);
                                }
    }//GEN-LAST:event_buttonOkActionPerformed

    // -> Definindo a funcionalidade do button "Exit", no qual é fechar o programa
    //
    
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
        
        JOptionPane.showMessageDialog(null, "JOÃO E MARIA: CAÇADORES DE BRUXAS");
    }//GEN-LAST:event_buttonExitActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // -> Núcleo do java
    //
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonOk;
    private javax.swing.JCheckBox checkAction;
    private javax.swing.JCheckBox checkAnimat;
    private javax.swing.JCheckBox checkComedy;
    private javax.swing.JCheckBox checkFic;
    private javax.swing.JCheckBox checkRomance;
    private javax.swing.JCheckBox checkSuspense;
    private javax.swing.JCheckBox checkTerr;
    private javax.swing.ButtonGroup groupCheck;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
