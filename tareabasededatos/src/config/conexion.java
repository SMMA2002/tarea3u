
package config;

import com.mysql.jdbc.Connection;


public class conexion {
    Connection con;
    public conexion(){
        
       // try {
            //Class.forName("con.mysql.jdbc.Driver");
            con=DriverManager.getConnetion("jdbc:mysql://local:3306/bdtarea","root","root");
        //}catch (ClassNotFoundException e){
        //  System.err.print("No se pudo establecer conexion con la Base de Datos. Error: "+e);
        // }
int a =3;
    }
    public Connection getConnection() {
        
        return con;
        
    }

    private static class DriverManager {

        private static Connection getConnetion(String jdbcmysqllocal3306bdtarea, String root, String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }
}
