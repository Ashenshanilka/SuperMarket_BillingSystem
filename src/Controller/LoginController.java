/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author M
 */
public class LoginController {
    
    public static void Form(String fName,String lName,String uName ,String pNumber,String eMail, String nIC) {
        new Model.AddRecord().login(fName, lName , uName , pNumber ,eMail,nIC);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
}
//     public static void login(String usName, String pass) {
//       try {
//            String username = null; // initial value of the username
//            String password = null; // initial value of the password
//            ResultSet rs = new DBSearch().searchLogin(usName);
////Process the Query
//            while (rs.next()) {
//                username = rs.getString("name"); 
//                password = rs.getString("password"); 
//            }
//        if (username != null && password != null) {
//            if (password.equals(pass)) {
//                JOptionPane.showMessageDialog(null,"Login Successfull!"); 
//                Main.getFrames()[0].dispose();
//                new View.DashBoard().setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
// }
//    DBConnection.closeCon();
//            } catch (SQLException ex) { 
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
// }
// }
//      
//     public static void studentLogin(String id , String nic){
//         
//         
//         try {
//            String ID = null; // initial value of the username
//            String NIC = null; // initial value of the password
//            String nameW = null;
//           
//            ResultSet rs = new DBSearch().loginStudents(id);
////Process the Query
//            while (rs.next()) {
//                ID = rs.getString("indexNumber"); 
//                NIC = rs.getString("nIC");
//                nameW = rs.getString("nameWithInitials");
//
//            }
//        if (ID != null && NIC != null) {
//            if (NIC.equals(nic)) {
//                JOptionPane.showMessageDialog(null,"Hello, "+ nameW); 
//                Main.getFrames()[0].dispose();
//                
//                
//                
//            } else {
//                JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
// }
//        
//    DBConnection.closeCon();
//            } catch (SQLException ex) { 
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
// }
         
         
     //}
}
    
    

