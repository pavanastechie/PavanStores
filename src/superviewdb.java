import java.awt.Event.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;
            public class superviewdb extends javax.swing.JFrame {
                
                /** Creates new form ${name} */
                public superviewdb(String text, String toString) {
                    initComponents();
                     userid.setText(text);
                       branch.setText(toString);
                       userid.setVisible(false);
                       branch.setVisible(false);
                       setTitle("WELCOME TO MONEY TRANSACTIONS AND STOCK DETAILS PAGE");
                }

    private superviewdb() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
                 private void formPropertyChange(java.beans.PropertyChangeEvent evt) {
         if (evt.getPropertyName().equals("textchange")){
           userid.setText((String)evt.getNewValue());
          branch.setText((String)evt.getNewValue());
                     }
                }
                /** This method is called from within the constructor to
                 * initialize the form.
                 * WARNING: Do NOT modify this code. The content of this method is
                 * always regenerated by the Form Editor.
                 */
                @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userid = new javax.swing.JTextField();
        branch = new javax.swing.JTextField();
        viewtransaction = new javax.swing.JButton();
        viewstock = new javax.swing.JButton();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        branch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                branchKeyReleased(evt);
            }
        });

        viewtransaction.setForeground(new java.awt.Color(153, 0, 153));
        viewtransaction.setText("VIEW TRANSACTIONS");
        viewtransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtransactionActionPerformed(evt);
            }
        });
        viewtransaction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                viewtransactionKeyReleased(evt);
            }
        });

        viewstock.setForeground(new java.awt.Color(153, 0, 153));
        viewstock.setText("VIEW STOCKDETAILS");
        viewstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstockActionPerformed(evt);
            }
        });

        back.setForeground(new java.awt.Color(153, 0, 153));
        back.setText("< BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setForeground(new java.awt.Color(153, 0, 153));
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(branch, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(viewtransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(viewstock, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewtransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewstock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                private void viewtransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtransactionActionPerformed
                  close();
                    supertransview s=new supertransview(this.userid.getText(),this.branch.getText());
                   s.setVisible(true);
                     this.addPropertyChangeListener((PropertyChangeListener) s);
                }//GEN-LAST:event_viewtransactionActionPerformed

                private void viewtransactionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewtransactionKeyReleased
                    firePropertyChange("textchange", "", userid.getText());
                }//GEN-LAST:event_viewtransactionKeyReleased

                private void branchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchKeyReleased
                    firePropertyChange("textchange", "", branch.getText());
                }//GEN-LAST:event_branchKeyReleased

                private void viewstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstockActionPerformed
close();
                    superstockview s=new superstockview(this.userid.getText(),this.branch.getText());
s.setVisible(true);
this.addPropertyChangeListener((PropertyChangeListener) s);
                }//GEN-LAST:event_viewstockActionPerformed

                private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
close();
                    supervisor s=new supervisor(this.userid.getText(),this.branch.getText());
                    s.setVisible(true);
                }//GEN-LAST:event_backActionPerformed

                private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
                    close();
                    login s=new login();
                    s.setVisible(true);
}//GEN-LAST:event_logoutActionPerformed
                
                /**
                 * @param args the command line arguments
                 */
                public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
                public static void main(String args[]) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new superviewdb().setVisible(true);
                        }
                    });
                }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField branch;
    private javax.swing.JButton logout;
    private javax.swing.JTextField userid;
    private javax.swing.JButton viewstock;
    private javax.swing.JButton viewtransaction;
    // End of variables declaration//GEN-END:variables
                
            }
