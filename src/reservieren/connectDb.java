/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservieren;
import java.sql.*;
/**
 *
 * @author X453SA
 */
public class connectDb {
    public void connectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "localhost:3306/trendbes","akar","akarpohon");  
            
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM zugsched");
        }catch(Exception e){
            System.out.println(e);
        }    
        
    }
}
