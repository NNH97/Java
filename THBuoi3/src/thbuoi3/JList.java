/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thbuoi3;

import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Windows 10
 */
public class JList extends javax.swing.JFrame {

    DefaultListModel model11;
    DefaultListModel model12;
    public JList() {
        initComponents();
        model11=new DefaultListModel();
        model11.addElement("Bóng Đá");
        model11.addElement("Bóng Chuyền");
        model11.addElement("Cầu Lông");
        model11.addElement("Bơi Lội");
        model12=new DefaultListModel();
        jListtrai.setModel(model11);
        jListphai.setModel(model12);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListtrai = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListphai = new javax.swing.JList<>();
        btnphai = new javax.swing.JButton();
        btnallphai = new javax.swing.JButton();
        btntrai = new javax.swing.JButton();
        btnalltrai = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListtrai);

        jScrollPane2.setViewportView(jListphai);

        btnphai.setText(">");
        btnphai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphaiActionPerformed(evt);
            }
        });

        btnallphai.setText(">>");
        btnallphai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallphaiActionPerformed(evt);
            }
        });

        btntrai.setText("<");
        btntrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntraiActionPerformed(evt);
            }
        });

        btnalltrai.setText("<<");
        btnalltrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalltraiActionPerformed(evt);
            }
        });

        btnthem.setText("+");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sach Mon The Thao");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mon Yeu Thich");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnthem)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnphai, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btntrai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnalltrai, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnallphai, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnphai)
                                .addGap(36, 36, 36)
                                .addComponent(btnallphai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btntrai)
                                .addGap(42, 42, 42)
                                .addComponent(btnalltrai))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnthem)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnphaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphaiActionPerformed
        // TODO add your handling code here:
        int[] indexs = jListtrai.getSelectedIndices();
        for(int i = indexs.length-1; i>=0;i--)
        {
            model12.addElement(model11.get(indexs[i]));
            model11.remove(indexs[i]);
        }
    }//GEN-LAST:event_btnphaiActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        String sTheThao=JOptionPane.showInputDialog(this,"Nhap mon the thao");
        model11.addElement(sTheThao);
     /*   //Thêm vào jList
        ListModel mTrai=jListtrai.getModel();
        
        //Chuyển sang dạng List để xử lý
       List<String> lstTrai = new ArrayList<>();
        for(int i=0 ; i < mTrai.getSize();i++)
        {
            
            lstTrai.add((String) mTrai.getElementAt(i));
        }
        //Thêm data vào input
        lstTrai.add(sTheThao);
        //Đưa ra hiển thị
        String[] arData=lstTrai.toArray(new String[0]);
        jListtrai.setListData((String[]) arData);
        */
    }//GEN-LAST:event_btnthemActionPerformed

    private void btntraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntraiActionPerformed
        // TODO add your handling code here:
        int[] indexs = jListphai.getSelectedIndices();
        for(int i = indexs.length-1; i>=0;i--)
        {
            model11.addElement(model12.get(indexs[i]));
            model12.remove(indexs[i]);
        }
    }//GEN-LAST:event_btntraiActionPerformed

    private void btnallphaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallphaiActionPerformed
        // TODO add your handling code here:
        int rt = model11.getSize();
        for(int i = 0; i < rt ; i++)
        {
            model12.addElement(model11.get(i));
        }
        model11.clear();
    }//GEN-LAST:event_btnallphaiActionPerformed

    private void btnalltraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalltraiActionPerformed
        // TODO add your handling code here:
        int rp = model12.getSize();
        for(int i = 0; i < rp ; i++)
        {
            model11.addElement(model12.get(i));
        }
        model12.clear();
    }//GEN-LAST:event_btnalltraiActionPerformed

    
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
            java.util.logging.Logger.getLogger(JList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnallphai;
    private javax.swing.JButton btnalltrai;
    private javax.swing.JButton btnphai;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntrai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListphai;
    private javax.swing.JList<String> jListtrai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
