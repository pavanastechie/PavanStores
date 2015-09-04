
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.Event.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;


            public class maketransworker extends javax.swing.JFrame {
                
                 Connection conn=null;
     ResultSet rs=null;
     PreparedStatement pst=null;
              
     public maketransworker(String text, String text1, String text2, String text3, String text4, String text5){
         conn=javaconnect.ConnecrDb();
          initComponents();
          date();
           
       itemid.setText(text);
        itemid.setEditable(false);
         itemname.setText(text1);
        itemname.setEditable(false);
         cost.setText(text2);
        cost.setEditable(false);
         userid.setText(text3);
        userid.setEditable(false);
         role.setText(text4);
       role.setEditable(false);
        branch.setText(text5);
        branch.setEditable(false);
                    
    setTitle("WELCOME TO MONEY TRANSACTION PAGE");
                }

    private maketransworker() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    private void sub()
                {
try {
                    int a = Integer.parseInt(cashreceived.getText());
                    int b = Integer.parseInt(cost.getText());
                     int ans = a-b;
                   changereturn.setText(" " +ans+ " "); 
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please Input a Integer","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }

   public void update()
                {
        try{
        String sql="select * from stock where itemid=?";
        pst=conn.prepareStatement(sql);
         pst.setString(1,itemid.getText());
        rs=pst.executeQuery();
        while(rs.next()){
            String name=rs.getString("itemname");
           itemname.setText(name);
           itemname.setEditable(false);
           String name1=rs.getString("cost");
           cost.setText(name1);
           cost.setEditable(false);

        String sql1="select * from employeeinfo where userid=?";
        pst=conn.prepareStatement(sql1);
         pst.setString(1,userid.getText());
        rs=pst.executeQuery();
        while(rs.next()){
            String name3=rs.getString("role");
           role.setText(name3);
           role.setEditable(false);
           String name4=rs.getString("branch");
          branch.setText(name4);
          branch.setEditable(false);
        }

                        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }

   }
private void  date()
                {
     Calendar cal=new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
    int year=cal.get(Calendar.YEAR);
    int day=cal.get(Calendar.DAY_OF_MONTH);
    date.setText(day+"/"+(month+1)+"/"+year);
    int hour=cal.get(Calendar.HOUR);
    int minute=cal.get(Calendar.MINUTE);
    int sec=cal.get(Calendar.SECOND);
    int ms=cal.get(Calendar.MILLISECOND);
    time.setText(hour+":"+(minute)+":"+(sec)+":"+ms);
}
   public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
     
                 private void formPropertyChange(java.beans.PropertyChangeEvent evt) {
         if (evt.getPropertyName().equals("textchange")){
           itemid.setText((String)evt.getNewValue());
           itemname.setText((String)evt.getNewValue());
           cost.setText((String)evt.getNewValue());
           userid.setText((String)evt.getNewValue());
           role.setText((String)evt.getNewValue());
           branch.setText((String)evt.getNewValue());

    }
    }
                 
            
                @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        itemid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        itemname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cashreceived = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        changereturn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        branch = new javax.swing.JTextField();
        maketransaction = new javax.swing.JButton();
        deletetransaction = new javax.swing.JButton();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        date = new javax.swing.JMenu();
        time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("itemid");

        itemid.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("itemname");

        itemname.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("cost");

        cost.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("cash recieved");

        cashreceived.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("change return");

        changereturn.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("userid");

        userid.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("role");

        role.setForeground(new java.awt.Color(102, 102, 102));

        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("branch");

        branch.setForeground(new java.awt.Color(102, 102, 102));

        maketransaction.setForeground(new java.awt.Color(153, 0, 153));
        maketransaction.setText("MAKE TRANSACTION");
        maketransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maketransactionActionPerformed(evt);
            }
        });

        deletetransaction.setForeground(new java.awt.Color(204, 0, 204));
        deletetransaction.setText("DELETE TRANSACTION");
        deletetransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletetransactionActionPerformed(evt);
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

        date.setForeground(new java.awt.Color(0, 51, 255));
        date.setText("date");
        jMenuBar1.add(date);

        time.setForeground(new java.awt.Color(0, 51, 255));
        time.setText("time");
        jMenuBar1.add(time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(branch, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(role, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(userid, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(changereturn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(cashreceived, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(cost, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(itemname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(itemid, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(maketransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(deletetransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cashreceived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(changereturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maketransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletetransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                private void maketransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maketransactionActionPerformed

                    try{
                    String save="Insert into trans (itemid,itemname,cost,cashreceived,changereturn,userid,role,branch,date,time) values(?,?,?,?,?,?,?,?,?,?)";



           pst=conn.prepareStatement(save);
                pst.setString(1,itemid.getText());
                
               pst.setString(2,itemname.getText());
               pst.setString(3,cost.getText());

               pst.setString(4,cashreceived.getText());
               pst.setString(5,changereturn.getText());

               pst.setString(6,userid.getText());
               pst.setString(7,role.getText());

               pst.setString(8,branch.getText());
               pst.setString(9,date.getText());

               pst.setString(10,time.getText());
                
                
 
       pst.execute();







JOptionPane.showMessageDialog(null,"transaction processing... press ok");



 String sql1="delete from stock  where itemid in(select itemid from trans)";


            pst=conn.prepareStatement(sql1);

               pst.execute();

JOptionPane.showMessageDialog(null,"transaction successful....,deliver to customer..");

                
              
                
                    }

                catch(Exception e){
            JOptionPane.showMessageDialog(null,e );



    }finally{
            try{
                rs.close();
                pst.close();

            } catch(Exception e){
            }
}

                }//GEN-LAST:event_maketransactionActionPerformed

                private void deletetransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletetransactionActionPerformed
                    try{
                String sql="Insert into stock (itemid,itemname,cost,userid,role,branch,date,time) values(?,?,?,?,?,?,?,?)";



           pst=conn.prepareStatement(sql);
                pst.setString(1,itemid.getText());
                pst.setString(2,itemname.getText());
                pst.setString(3,cost.getText());

              pst.setString(4, userid.getText());
                pst.setString(5,  role.getText());
                pst.setString(6, branch.getText());
                pst.setString(7, date.getText());
                 pst.setString(8, time.getText());


       pst.execute();

JOptionPane.showMessageDialog(null,"canceling...transaction...press ok");



             String sql1="delete from trans  where itemid in(select itemid from stock)";


            pst=conn.prepareStatement(sql1);

               pst.execute();

JOptionPane.showMessageDialog(null,"transaction recovered successfully........");

                
          



            }



        catch (Exception e){
            JOptionPane.showMessageDialog(null,e );



    }finally{
            try{
                rs.close();
                pst.close();

            } catch(Exception e){
            }
}
                }//GEN-LAST:event_deletetransactionActionPerformed

                private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
                    close();
                    login s=new login();
                    s.setVisible(true);
}//GEN-LAST:event_logoutActionPerformed

                private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
                   close();
                    workertransconfirm s=new workertransconfirm(this.userid.getText(),this.branch.getText());
                   s.setVisible(true);
                }//GEN-LAST:event_backActionPerformed
                
                /**
                 * @param args the command line arguments
                 */
                public static void main(String args[]) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new maketransworker().setVisible(true);
                        }
                    });
                }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField branch;
    private javax.swing.JTextField cashreceived;
    private javax.swing.JTextField changereturn;
    private javax.swing.JTextField cost;
    private javax.swing.JMenu date;
    private javax.swing.JButton deletetransaction;
    private javax.swing.JTextField itemid;
    private javax.swing.JTextField itemname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton logout;
    private javax.swing.JButton maketransaction;
    private javax.swing.JTextField role;
    private javax.swing.JMenu time;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
                
            }
