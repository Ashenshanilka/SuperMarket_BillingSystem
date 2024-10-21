/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author M
 */
public class ViewBillHistory {
    Statement stmt;
    ResultSet rs;
    public ResultSet searchBilHistory(){
    try{
        stmt = DBConnection.getStatementConnection();
        rs = stmt.executeQuery("SELECT * FROM billhistory");
    }
        catch(Exception e){
 
        }
    return rs;
    
}
}
