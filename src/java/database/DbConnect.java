package database;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;
public class DbConnect {
public static Connection connect()
{
    try
    {
        String user="system",url="jdbc:oracle:thin:@localhost:1521:xe",password="anand";
        DriverManager.registerDriver(new OracleDriver());//Load the database driver
        return DriverManager.getConnection(url, user, password);//return the stored data from database
    }
    catch(Exception ex)//runtime exception control
    {
        System.out.println(ex);
        return null;
    }
}
}
