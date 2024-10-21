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
public class StaffMemberDeleteController {
    
        public static void DeleteStaffDetails(String id){
            new Model.DeleteRecord().Form1(id);
            JOptionPane.showMessageDialog(null, " Record has been deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
