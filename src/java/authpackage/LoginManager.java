package authpackage;

import database.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginManager {
    public static boolean isUsernameAndPasswordCorrect(String username,String password)//
    {
        try
        {
            PreparedStatement ps=DbConnect.connect().prepareStatement("select*from users where username=? and password=?");//A PreparedStatement is a pre-compiled SQL statement
            ps.setString(1, username);// is used to set SQL VARCHAR
            ps.setString(2, password);// is used to set SQL VARCHAR
            ResultSet rs=ps.executeQuery();//Accesing the data from table set
            return rs.next();//it check ResultSet contains any values or not
        }
        catch(Exception ex)//runtime exception control
        {
            System.out.println(ex);
            return false;
        }
    }
}