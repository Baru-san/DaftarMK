package GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author baru_san
 */
public class PopUp extends javax.swing.JFrame {

    /**
     * Creates new form PopUp
     */
    public PopUp(int kondisi) {

        if (kondisi == 1){
            initComponents();
        }
        else if(kondisi == 2){
            initComponents();
            labelKeteranganpop.setText("Akun berhasil dibuat");
            Login lg = new Login();
            lg.setLocationRelativeTo(null);
            lg.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPop = new javax.swing.JButton();
        labelKeteranganpop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonPop.setBackground(new java.awt.Color(0, 200, 255));
        buttonPop.setText("OK");
        buttonPop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPopActionPerformed(evt);
            }
        });

        labelKeteranganpop.setText("Barang berhasil ditambahkan!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonPop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 111, Short.MAX_VALUE)
                .addComponent(labelKeteranganpop, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(labelKeteranganpop, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPop))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPopActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonPopActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPop;
    private javax.swing.JLabel labelKeteranganpop;
    // End of variables declaration//GEN-END:variables
}
