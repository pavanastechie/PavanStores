
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;


            public class adminviewdb extends javax.swing.JFrame {
                
                /** Creates new form ${name} */
                public adminviewdb(String text) {
                    initComponents();
                    userid.setText(text);
                    userid.setVisible(false);
                    setTitle("WELCOME TO MONEY TRANSACTIONS AND STOCK DETAILS PAGE");
                }

    private adminviewdb() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
                
                /** This method is called from within the constructor to
                 * initialize the form.
                 * WARNING: Do NOT modify this code. The content of this method is
                 * always regenerated by the Form Editor.
                 */
                @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewtrans = new javax.swing.JButton();
        stockdetails = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        userid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        viewtrans.setForeground(new java.awt.Color(204, 0, 153));
        viewtrans.setText("VIEW TRANSACTIONS");
        viewtrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtransActionPerformed(evt);
            }
        });

        stockdetails.setForeground(new java.awt.Color(204, 0, 153));
        stockdetails.setText("VIEW STOCK DETAILS");
        stockdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockdetailsActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(204, 0, 153));
        jButton1.setText("< BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        logout.setForeground(new java.awt.Color(204, 0, 153));
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(viewtrans, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(stockdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewtrans, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
                private void viewtransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtransActionPerformed
                   close();
                    adminviewtrans s=new adminviewtrans(this.userid.getText());
                   s.setVisible(true);
                }//GEN-LAST:event_viewtransActionPerformed

                private void stockdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockdetailsActionPerformed
                   close();
                    adminviewstock s=new adminviewstock(this.userid.getText());
                    s.setVisible(true);
                     this.addPropertyChangeListener((PropertyChangeListener) s);

                }//GEN-LAST:event_stockdetailsActionPerformed

                private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 close();
                    admin s=new admin(this.userid.getText());
                  s.setVisible(true);
                   this.addPropertyChangeListener((PropertyChangeListener) s);
                }//GEN-LAST:event_jButton1ActionPerformed

                private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed


                close();
                    login s=new login();
                    s.setVisible(true);
                   
}//GEN-LAST:event_logoutActionPerformed

                private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
                    // TODO add your handling code here:
                }//GEN-LAST:event_useridActionPerformed
                
                /**
                 * @param args the command line arguments
                 */
                public static void main(String args[]) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new adminviewdb().setVisible(true);
                        }
                    });
                }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton logout;
    private javax.swing.JButton stockdetails;
    private javax.swing.JTextField userid;
    private javax.swing.JButton viewtrans;
    // End of variables declaration//GEN-END:variables
                
            }
