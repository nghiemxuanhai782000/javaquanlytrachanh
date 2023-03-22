/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquantrachanh;

import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Dell
 */
public class Quanliquantrachanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws SQLException, ClassNotFoundException{
        // TODO code application logic here
        Connection conn = Ketnoi.getConnection();
    }
    
}
