
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankita
 */
@ManagedBean
@SessionScoped
public class login implements Serializable
{
     private  String ID="";
     private  String Password="";
     private UserAccount theLoginAccount;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public UserAccount getTheLoginAccount() {
        return theLoginAccount;
    }

    public void setTheLoginAccount(UserAccount theLoginAccount) {
        this.theLoginAccount = theLoginAccount;
    }
       
    
    public  String Login()
    {
      try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
            return ("internalError");
        }
     
      final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
       
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
         
         try
         {
            connection = DriverManager.getConnection(DATABASE_URL, 
                     "tungidwara1184", "1654451");
             
             statement = connection.createStatement();
           
             resultSet = statement.executeQuery("Select * from user Where ID ='"+ID+"'and Password ='"+Password+"'");
            
             if(resultSet.next())
             {
               theLoginAccount  = new UserAccount(ID,Password);
               
               return("newmenu");
             
             }
             else 
                 
             {
                 return("SQLError");
             }
         }
             catch(SQLException e)
             {
                e.printStackTrace();
                     return("SQLError");
             }
             finally
             {
                 try
                 {
                     resultSet.close();
                     statement.close();
                     connection.close();
                 }
                 catch(Exception e)
                 {
                     e.printStackTrace();
                      return("SQLError");
                 }
         }
    }
    
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index.xhtml";
    }
}
