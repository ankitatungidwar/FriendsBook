
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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
@RequestScoped
public class registerUser {

    /**
     * Creates a new instance of RegisterUser
     */
 
 
       
       private  String ID="";
       private  String Password="";
       private  String UserName="";
       private  String Gender="";
       private  String Education="";
       private  String Birthday="";

    public  String getID() {
        return ID;
    }

    public  void setID(String ID) {
        this.ID = ID;
    }

    public  String getPassword() {
        return Password;
    }

    public  void setPassword(String Password) {
        this.Password = Password;
    }

    public  String getUserName() {
        return UserName;
    }

    public  void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public  String getGender() {
        return Gender;
    }

    public  void setGender(String Gender) {
        this.Gender = Gender;
    }

    public  String getEducation() {
        return Education;
    }

    public  void setEducation(String Education) {
       this.Education = Education;
    }

    public  String getBirthday() {
        return Birthday;
    }

    public  void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }
       
    /**
     *
     * @return
     */
    public String registerU()
    {
       final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
       
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch (Exception e)
        {
           
            return ("internalError");
           
        }
       try
         {
             connection = DriverManager.getConnection(DATABASE_URL, 
                     "tungidwara1184", "1654451");
             statement = connection.createStatement();
           


                resultSet= statement.executeQuery("Select * "
                     + "from User where ID='"+ID+"'");
                if(resultSet.next())
                {
                    return("Idexist");
                }
                 else
                {
                    int r = statement.executeUpdate("Insert into user values ('"+ID+"', '"+Password+"' , '"+UserName+"' ,'"+Gender+"', '"+Education+"' ,'"+Birthday+"')");
             
             
                    return("login.xhtml");
            
          
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
    
    
    
}


