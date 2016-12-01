/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.sql.SQLException;


public class Programa {
       
    public static void main(String[] args) throws SQLException {
        //Clientes cli = new Clientes();
        //cli.setVisible(true);  
        
        Menu cli = new Menu();
        cli.setVisible(true); 
    }    
}
