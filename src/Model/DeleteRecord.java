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
public class DeleteRecord {
    Statement stmt;
    public void Form1(String id) {
    try {
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate("DELETE from login WHERE nIC='"+id+"'");
        
    } catch (Exception e) {
        e.printStackTrace();
 } 
}
    
}
