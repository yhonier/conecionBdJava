/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 505
 */
public class ModeloBd {
    
    private final String servidor="jdbc:mysql://localhost/formula1";
    private String usuario="root";
    private String password="";
    


    public ModeloBd() {
    }
       
    
    
public Connection conectarBd(){
    
    Connection conexion=null;
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); //Trae el driver (sin importar el proyecto siempre debe ir asi)
        conexion=DriverManager.getConnection(servidor,usuario,password); 
        System.out.println("Exito conectandonos");
        return conexion;
    }
    
    catch(Exception error){
    
        System.out.println("upss....."+error);
        return null;
    }
        

}
    
}

