/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author M
 */
public class AddRecord {
    
    Statement stmt;
    
 public void login(String fName, String lName, String uName, String pNumber, String eMail, String nIc ){
     try {
                stmt = DBConnection.getStatementConnection();
                stmt.executeUpdate
                ("INSERT INTO login VALUES('"+fName+"', '"+lName+"', '"+uName+"', '"+pNumber+"', '"+eMail+"', '"+nIc+"')");
                } catch (Exception e) {
                    e.printStackTrace();
                }
 }
    
}
