import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
            public class adminviewtrans extends javax.swing.JFrame {
                 Connection conn=null;
     ResultSet rs=null;
     PreparedStatement pst=null;
                /** Creates new form ${name} */
                public adminviewtrans(String text) {
                    initComponents();
                     conn=javaconnect.ConnecrDb();
                     
                     fillcombo();
                      fillcombo1();
                      userid.setText(text);
                      userid.setVisible(false);
                      setTitle("WELCOME TO MONEY TRANSACTION PAGE");
                }

    private adminviewtrans() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
                private void fillcombo(){
    try{
        String sql="select * from branch";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
            String name=rs.getString("branchname");
           branch.addItem(name);
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
                }
                 private void fillcombo1(){
    try{
        String sql="select * from branch";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
            String name=rs.getString("branchname");
           branch1.addItem(name);
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
                }
                  private void Update_table()
    {
    try{
    String sql="SELECT * FROM trans   order by date asc ";
    pst=conn.prepareStatement(sql);



    rs=pst.executeQuery( );
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        date = new javax.swing.JTextField();
        day = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        branch = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        date1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date2 = new javax.swing.JTextField();
        between = new javax.swing.JButton();
        branch1 = new javax.swing.JComboBox();
        viewalllll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        userid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DAY TRANSACTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        date.setForeground(new java.awt.Color(102, 102, 102));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        day.setForeground(new java.awt.Color(204, 0, 153));
        day.setText("VIEW");
        day.setFocusable(false);
        day.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        day.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("date");

        branch.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(day)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALL TRANSACTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        date1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("date:");

        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("TO");

        date2.setForeground(new java.awt.Color(102, 102, 102));

        between.setForeground(new java.awt.Color(204, 0, 153));
        between.setText("VIEW");
        between.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betweenActionPerformed(evt);
            }
        });

        branch1.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(between)
                .addGap(100, 100, 100))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(branch1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(between)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(branch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );

        viewalllll.setForeground(new java.awt.Color(204, 0, 153));
        viewalllll.setText("VIEW ALL");
        viewalllll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewalllllActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        back.setForeground(new java.awt.Color(204, 0, 153));
        back.setText("< BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setForeground(new java.awt.Color(204, 0, 153));
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(viewalllll, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(back)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                        .addComponent(logout)
                                        .addGap(18, 18, 18)))))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(logout))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(viewalllll)
                .addGap(24, 24, 24)
                .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
                private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
                    // TODO add your handling code here:
}//GEN-LAST:event_dateActionPerformed

                private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
                    try {
                        Object item =branch.getSelectedItem();
                        String sql3="SELECT * FROM trans WHERE date=? and branch='"+item+"' order by date asc";

                        pst = conn.prepareStatement(sql3);
                        pst.setString(1,date.getText());


                        rs=pst.executeQuery();


                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    } catch(Exception e){
                        JOptionPane.showMessageDialog(null,e );

                    }
}//GEN-LAST:event_dayActionPerformed

                private void betweenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betweenActionPerformed
                    Object item =date1.getText();
                    Object item1 =date2.getText();
                     Object item3 =branch1.getSelectedItem();
                    String sql="select * from trans where branch='"+item3+"' and date between '"+item+"' and '"+item1+"'order by date asc";
                    try{
                        pst=conn.prepareStatement(sql);




                        rs=pst.executeQuery();

                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    }catch(Exception e) {
                        JOptionPane.showMessageDialog(null,e );
                    }
}//GEN-LAST:event_betweenActionPerformed

                private void viewalllllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewalllllActionPerformed
                    try {

                        String sql3="SELECT * FROM trans  order by date asc";

                        pst = conn.prepareStatement(sql3);
                       

                        rs=pst.executeQuery();


                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    } catch(Exception e){
                        JOptionPane.showMessageDialog(null,e );

                    }
}//GEN-LAST:event_viewalllllActionPerformed

                private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
                    close();
                    adminviewdb s=new adminviewdb(this.userid.getText());
                    s.setVisible(true);
                     this.addPropertyChangeListener((PropertyChangeListener) s);
                }//GEN-LAST:event_backActionPerformed

                private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
                    close();
                    login s=new login();
                    s.setVisible(true);
                }//GEN-LAST:event_logoutActionPerformed
                
                /**
                 * @param args the command line arguments
                 */
                public static void main(String args[]) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new adminviewtrans().setVisible(true);
                        }
                    });
                }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton between;
    private javax.swing.JComboBox branch;
    private javax.swing.JComboBox branch1;
    private javax.swing.JTextField date;
    private javax.swing.JTextField date1;
    private javax.swing.JTextField date2;
    private javax.swing.JButton day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField userid;
    private javax.swing.JButton viewalllll;
    // End of variables declaration//GEN-END:variables
                
            }
