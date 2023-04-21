
package proyecto;
    import com.mysql.jdbc.Connection;
    import java.sql.*;
    import javax.swing.*;

public class Inventario extends javax.swing.JFrame {
    
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost/inventario";
    private static Connection cn;

    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/images/Yellow.png");
    }
    
    public void conectar(){
        cn = null;
        try{
            cn = (Connection) DriverManager.getConnection(url, user, pass);
            Class.forName(driver);
        } catch(Exception e){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_cant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_pre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 56, -1, -1));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 90, 71, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 56, -1, -1));
        getContentPane().add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 71, -1));
        getContentPane().add(txt_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 90, 71, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 56, -1, -1));
        getContentPane().add(txt_pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 90, 71, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 56, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 130, -1, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 130, -1, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 130, -1, -1));

        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 171, -1, -1));

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 171, 161, -1));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 171, -1, -1));

        estado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 241, -1, -1));

        jButton6.setText("Almacén");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 212, -1, -1));

        jButton7.setText("Menú");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 212, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel5.setText("Registro");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 410, 310));

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            conectar();
            PreparedStatement pst = cn.prepareStatement("insert into productos values(?,?,?,?)");
            
            pst.setString(1, txt_ID.getText().trim());
            pst.setString(2, txt_nom.getText().trim());
            pst.setString(3, txt_cant.getText().trim());
            pst.setString(4, txt_pre.getText().trim());
            pst.executeUpdate();
            
            txt_ID.setText("");
            txt_nom.setText("");
            txt_cant.setText("");
            txt_pre.setText("");
            txt_buscar.setText("");
            estado.setText("Registrado Correctamente");
        }catch(Exception e){
            
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            conectar();
            PreparedStatement pst = cn.prepareStatement("update productos set ID = ?, Nombre = ?, Cantidad = ?, Precio = ? where ID = " + txt_buscar.getText().trim());
            
            pst.setString(1, txt_ID.getText().trim());
            pst.setString(2,txt_nom.getText().trim());
            pst.setString(3, txt_cant.getText().trim());
            pst.setString(4, txt_pre.getText().trim());
            pst.executeUpdate();
            
            estado.setText("Modificado");
            
        }catch(Exception e ){
            
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            conectar();
            PreparedStatement pst = cn.prepareStatement("delete from productos where ID = ?");
            
            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();
            
            txt_ID.setText("");
            txt_nom.setText("");
            txt_cant.setText("");
            txt_pre.setText("");
            estado.setText("Eliminado");
            
        }catch(Exception e){
            
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            conectar();
            PreparedStatement pst = cn.prepareStatement("select* from productos where ID = ?");
            
            pst.setString(1, txt_buscar.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_ID.setText(rs.getString("ID"));
                txt_nom.setText(rs.getString("Nombre"));
                txt_cant.setText(rs.getString("Cantidad"));
                txt_pre.setText(rs.getString("Precio"));
            }else{
                JOptionPane.showMessageDialog(null, "Producto no encontrado:(");
            }
        }catch(Exception e){
            
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            txt_ID.setText("");
            txt_nom.setText("");
            txt_cant.setText("");
            txt_pre.setText("");
            txt_buscar.setText("");
            estado.setText("");
        }catch(Exception e){
            
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Almacen a = new Almacen();
        a.setVisible(true);
        this.setVisible(false);
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Menu a = new Menu();
        a.setVisible(true);
        this.setVisible(false);
    }                                        

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel estado;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_pre;
    // End of variables declaration                   
}
