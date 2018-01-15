
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class Diagrama extends javax.swing.JFrame {

    /**
     * Creates new form Diagrama
     */
    public Diagrama() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 192, 205));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Opreste aplicatia");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Connection conn=null;
        try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName="localhost";
            String serverPort="1521";
            String sid="ORCL";
            String url="jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username="andree1";
            String password="andree1";
            conn=DriverManager.getConnection(url,username,password);
           //  System.out.println("Successfully Connected to the database");
           
        }catch (ClassNotFoundException e){
            System.out.println("Could not find database driver" + e.getMessage());
        }catch(SQLException e){
            System.out.println("Could not connect to the database " +e.getMessage());
        }
        
        
          try{
         
              
            String sqlQuery1 = "DELETE FROM Calcule";
            PreparedStatement st1 = conn.prepareStatement(sqlQuery1);
            ResultSet res1= st1.executeQuery();
            
            String sqlQuery2 = "DELETE FROM Rezultate";
            PreparedStatement st2 = conn.prepareStatement(sqlQuery2);
            ResultSet res2 = st2.executeQuery();
            
            String sqlQuery3 = "DELETE FROM DIAGRAMA";
            PreparedStatement st3 = conn.prepareStatement(sqlQuery3);
            ResultSet res3 = st3.executeQuery();
       
          }
          catch(Exception e){
            e.printStackTrace();
        }
          
        try {
            PrintWriter writer=new PrintWriter("D:\\Programare\\NetBeans\\Projects\\FizicaConstructiilor\\myfile.txt");
            writer.print("Denumire material , Conductivitate termica de calcul , Grosime strat"
                    + "\n");
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Diagrama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        close();
          
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
            java.util.logging.Logger.getLogger(Diagrama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagrama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagrama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagrama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Connection conn=null;
        try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName="localhost";
            String serverPort="1521";
            String sid="ORCL";
            String url="jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username="andree1";
            String password="andree1";
            conn=DriverManager.getConnection(url,username,password);
             //System.out.println("Successfully Connected to the database");
           
        }catch (ClassNotFoundException e){
            System.out.println("Could not find database driver" + e.getMessage());
        }catch(SQLException e){
            System.out.println("Could not connect to the database " +e.getMessage());
        }
        
        
          try{
         
              
              
       
          }
          catch(Exception e){
            e.printStackTrace();
        }
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagrama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

private void close() {
        WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
    }}