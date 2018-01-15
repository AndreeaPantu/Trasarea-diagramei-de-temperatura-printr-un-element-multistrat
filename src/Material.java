


import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class Material extends javax.swing.JFrame {

    /**
     * Creates new form Material
     */
    public Material() {
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 0));

        jPanel1.setBackground(new java.awt.Color(204, 192, 205));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Material");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Beton simplu cu agregate naturale", "Beton cu zgura de cazan", "Beton cu zgura granulata", "Beton cu zgura expandata", "Beton cu perlit", "Beton cu granulit", "Beton celular autoclavizat", "Saltele din vata minerala", "Pin si brad perpendicular pe fibre", "Pin si brad in lungul fibrelor", "Stejar si fag perdendicular pe fibre", "Stejar si fag in lungul fibrelor", "Placaj incleiat", "Rumegus", "Placi termoizolante din talas", "Beton cu agregate vegetale", "Placi termoizolante din coaja de rasinoase", "Placi din fibre de lemn", "Placi aglomerate fibrolemnoase", "Placi din aschii de lemn", "Placi aglomerate din puzderie", "Stufit", "Placi de paie", "Saltele din deseuri textile sintetice", "Zidarie din pietre de forma regulata", "Zidarie din pietre de forma neregulata", "Zidarie din caramizi cu gauri verticale", "Zidarie din caramizi de diatomit", "Zidarie din blocuri mici pline din beton", "Zidarie din blocuri de beton celular autoclavizat", "Fasii armate din beton celular autoclavizat", "Beton armat", "Vata minerala", "Placi si foi de azbociment", "Placi termoizolante de azbest", "Mortar asfaltic", "Beton asfaltic", "Bitum", "Mortar de ciment", "Mortar de ciment si var", "Mortar de var", "Mortar de zgura cu ciment", "Pasla minerala", "Placi de vata minerala", "Sticla", "Sticla spongioasa", "Vata de sticla", "Placi de ipsos", "Ipsos celular", "Sapa de ipsos", "Produse termoizolante din diatomit", "Pamant vegetal in stare umeda", "Umplutura din nisip", "Umplutura din pietris", "Zgura de cazan", "Zgura granulata", "Zgura expandata", "Cenusa si zgura de termocentrala", "Granulit", "Perlit", "Diatomit", "Scorie bazaltica", "Marmura, granit, bazalt", "Gresie si cuartite", "Pietre calcaroase", "Tuf calcaros", "Zidarie din caramizi pline", "Otel de constructii", "Fonta", "Aluminiu", "Polistiren celular", "Spume de policlorura de vinii", "Poliuretan celular", "Covor PVC fara suport textil", "Covor PVC cu suport textil", "Panza bitumata", "Placi termoizolante din perlit liate cu ciment", "Alt material" }));
        jComboBox1.setToolTipText(" ");
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numar strat");

        jTextField4.setBackground(new java.awt.Color(188, 148, 187));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(188, 148, 187));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(188, 148, 187));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nume material");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Conductivitatea termina de calcul λ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Grosime strat in cm");

        jTextField1.setBackground(new java.awt.Color(188, 148, 187));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Ok");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Inapoi");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(207, 207, 207)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(67, 67, 67))
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        close();
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String material;
        material=jComboBox1.getSelectedItem().toString();
        //System.out.println(material);
        if(material=="Alt material"){
            jTextField2.setEditable(true);
            jTextField3.setEditable(true);
        }
        else {
            jTextField2.setEditable(false);
            jTextField3.setEditable(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    public void ButtonClick(){
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
           // System.out.println("Successfully Connected to the database");
           
        }catch (ClassNotFoundException e){
            System.out.println("Could not find database driver" + e.getMessage());
        }catch(SQLException e){
            System.out.println("Could not connect to the database " +e.getMessage());
        }
        
        
        //File file = new File("out.txt");
        
        try{
            String s=jComboBox1.getSelectedItem().toString();
            String distance = jTextField1.getText();
            String ID=jTextField4.getText();
            float d= Float.parseFloat(distance)/100;
            int id=Integer.parseInt(ID);
            int i=1;
            
            if(s!="Alt material"){
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM Materiale WHERE MATERIAL='"+s+"'");
            while(rs.next()){
                float lambda=rs.getFloat(2);
                String material=rs.getString(1).toString();
                
               
           
                 //System.out.println(material+" |"+lambda+" |"+d);
            /*FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println(material+" |"+lambda+" |"+d);*/
                
                
                try(FileWriter fw = new FileWriter("myfile.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
            {
                out.println(material+","+lambda+","+d);
    //more code
    
    //more code
            } catch (IOException e) {
    //exception handling left as an exercise for the reader
            }
         
    String sqlQuery2 = "INSERT INTO Calcule (ID,MATERIAL,LAMBDA,GROSIME) VALUES(?,?,?,?)";
            PreparedStatement st1 = conn.prepareStatement(sqlQuery2);
            st1.setInt(1,id);
            st1.setString(2,material);
            st1.setFloat(3, lambda);
            st1.setFloat(4,d);
           
            //conn.commit();
                ResultSet res = st1.executeQuery();
               
            }
            rs.close();}
            else{
            String  material=jTextField2.getText();
            String l=jTextField3.getText();
            float lambda=Float.parseFloat(l);
            //System.out.println(material+" |"+lambda+" |"+d);
            /*FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println(material+" |"+lambda+" |"+d);*/
              
             try(FileWriter fw = new FileWriter("myfile.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw))
{
    out.println(material+","+lambda+","+d);
    
    //more code
    
    //more code
} catch (IOException e) {
    //exception handling left as an exercise for the reader
}           //Statement st=conn.createStatement();
            //st.executeUpdate("INSERT INTO Table2 (MATERIAL,LAMBDA,GROSIME) "+"VALUES("+material+","+lambda+","+d+")");
            //ResultSet add=st.executeQuery("INSERT INTO Table2 (Material, Lambda, Grosime) VALUES("+material+", "+lambda+", "+d+");"); 
             
            String sqlQuery = "INSERT INTO Calcule (ID,MATERIAL,LAMBDA,GROSIME) VALUES(?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sqlQuery);
            st.setInt(1,id);
            st.setString(2,material);
            st.setFloat(3, lambda);
            st.setFloat(4,d);
            
            //conn.commit();
            ResultSet res = st.executeQuery();
            }
           
             
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
       
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        ButtonClick();
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
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Material().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

private void close() {
        WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
    }}