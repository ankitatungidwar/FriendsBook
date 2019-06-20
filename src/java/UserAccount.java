
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankita
 */
//@Named(value="userAccount")
@ManagedBean
@SessionScoped
public class UserAccount {
    
    private  String user_id;
    private  String password;
    private  String fid;
    private  ArrayList<String> friends;
    private ArrayList<String> profiles;
    private  ArrayList<String> friendsProfile;
    private  ArrayList<String> tags;
    private  ArrayList<Post> post = new ArrayList<Post>();
    private  ArrayList<String> show_post = new ArrayList<String>();
    private  ArrayList<String> hashtags;
    private ArrayList<String> postid = new ArrayList<String>();
    private ArrayList<String> comments = new ArrayList<String>();
    private String name;
    private String PContent;

    public String getPContent() {
        return PContent;
    }

    public void setPContent(String PContent) {
        this.PContent = PContent;
    }
    String fp;
    int notificationcount=0;
    
    int count;
    int c1;
    int v_num;
    private String gender;
    private String school;
    private String birthday;
    String mst = "unread";
    String s = "accepted";
    String t = "read";
    String d = "denied";
    String ty = "M";
    String vc;
    String m_reply;
    String s_msg;
    int p_num;
    String p_comment;
    String postID="";
    ArrayList<String> view_pro = new ArrayList<String>();

    public int getNotificationcount() {
        return notificationcount;
    }

    public void setNotificationcount(int notificationcount) {
        this.notificationcount = notificationcount;
    }

    public ArrayList<String> getView_pro() {
        return view_pro;
    }

    public void setView_pro(ArrayList<String> view_pro) {
        this.view_pro = view_pro;
    }
    public String getFp() {
        return fp;
    }

    public void setFp(String fp) {
        this.fp = fp;
    }

    public ArrayList<String> getShow_post() {
        return show_post;
    }

    public void setShow_post(ArrayList<String> show_post) {
        this.show_post = show_post;
    }

    public String getP_comment() {
        return p_comment;
    }

    public void setP_comment(String p_comment) {
        this.p_comment = p_comment;
    }

    public ArrayList<notifications> getNotif() {
        return notif;
    }

    public void setNotif(ArrayList<notifications> notif) {
        this.notif = notif;
    }
    
    public int getP_num() {
        return p_num;
    }

    public void setP_num(int p_num) {
        this.p_num = p_num;
    }
    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }
    public ArrayList<String> getPostid() {
        return postid;
    }

    public void setPostid(ArrayList<String> postid) {
        this.postid = postid;
    }

    public ArrayList<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(ArrayList<String> hashtags) {
        this.hashtags = hashtags;
    }

    
    public ArrayList<Post> getPost() {
        return post;
    }

    public void setPost(ArrayList<Post> post) {
        this.post = post;
    }

    
    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
    

    public String getS_msg() {
        return s_msg;
    }

    public void setS_msg(String s_msg) {
        this.s_msg = s_msg;
    }
    String friend_id;
    private String type="R";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

 
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String content="Sent Friend Request";
    private String status="new";
    String pid;
    int nf_id;
    private ArrayList<notifications> notif = new  ArrayList<notifications>();
    private ArrayList<Messages> message = new ArrayList<Messages>();
    ArrayList<notifications>notif_num = new ArrayList<notifications>();
    ArrayList<String> friendsmsg = new ArrayList<String>();
    ArrayList<Profile> f_profile = new ArrayList<Profile>();
    String postag;
    String currentTime = new SimpleDateFormat("yyyy-MM-dd--HH:mm:ss").format(Calendar.getInstance().getTime());


    public String getPostag() {
        return postag;
    }

    public void setPostag(String postag) {
        this.postag = postag;
    }

    public ArrayList<Profile> getF_profile() {
        return f_profile;
    }

    public void setF_profile(ArrayList<Profile> f_profile) {
        this.f_profile = f_profile;
    }
    int cmsg_id=0;
    int nmsg_id=0;

    public ArrayList<String> getFriendsmsg() {
        return friendsmsg;
    }

    public void setFriendsmsg(ArrayList<String> friendsmsg) {
        this.friendsmsg = friendsmsg;
    }
    public String getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(String friend_id) {
        this.friend_id = friend_id;
    }
    public String getVc() {
        return vc;
    }

    public void setVc(String vc) {
        this.vc = vc;
    }

    public ArrayList<notifications> getNotif_num() {
        return notif_num;
    }

    public void setNotif_num(ArrayList<notifications> notif_num) {
        this.notif_num = notif_num;
    }

    public ArrayList<String> getNew_notif() {
        return new_notif;
    }

    public void setNew_notif(ArrayList<String> new_notif) {
        this.new_notif = new_notif;
    }
    private ArrayList<String> new_notif = new ArrayList<>();

    public ArrayList<notifications> getNotification() {
        return notif;
    }

    public void setNotification(ArrayList<notifications> notification) {
        this.notif = notification;
    }

    public ArrayList<Messages> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<Messages> message) {
        this.message = message;
    }
    public String getM_reply() {
        return m_reply;
    }

    public void setM_reply(String m_reply) {
        this.m_reply = m_reply;
    }
   public int getV_num() {
        return v_num;
    }

    public void setV_num(int v_num) {
        this.v_num = v_num;
    }
    
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }
    

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }

    public ArrayList<String> getFriendsProfile() {
        return friendsProfile;
    }

    public void setFriendsProfile(ArrayList<String> friendsProfile) {
        this.friendsProfile = friendsProfile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public UserAccount(String u,String p)
    {
        user_id = u;
        password = p;
        friends = new ArrayList<String>();
        profiles = new ArrayList<String>();
        hashtags= new ArrayList<String>();
        gender="";
        birthday="";
        name="";
        school="";
        fid="";
        
         final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
       
           Connection connection = null;
           Statement statement = null;
           ResultSet resultSet = null;
           Statement st = null;
           ResultSet rs = null;
           Connection con = null;
           
         try
         {  
             connection = DriverManager.getConnection(DATABASE_URL, 
                     "tungidwara1184", "1654451");
             statement = connection.createStatement();
             
             resultSet = statement.executeQuery("Select * from friend Where IDR ='"+user_id+"'or IDS = '"+user_id+"'");
             
             
            while(resultSet.next())
            {
            if(resultSet.getString(1).equals(user_id))
                {
                   friends.add(resultSet.getString(2));
                }
                else if(resultSet.getString(2).equals(user_id))
                {
                   friends.add(resultSet.getString(1));
                } 
            }      
           resultSet = statement.executeQuery("Select * from user where Id='"+user_id+"'");
            while(resultSet.next())
            {
                name=resultSet.getString(3);
                gender=(resultSet.getString(4));
                school=(resultSet.getString(5));
                birthday=(resultSet.getString(6));
                profiles.add(resultSet.getString(1));
                profiles.add(resultSet.getString(2));
                profiles.add(resultSet.getString(3));
                profiles.add(resultSet.getString(4));
                profiles.add(resultSet.getString(5));
                profiles.add(resultSet.getString(6));
            }  
            
         }
            catch(SQLException e)
         {
             
             e.printStackTrace();
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
             }
         }
      }
    
    
  public String seeFriends()
           
    {
        
        if(friends.size()<1)
        {        
            return ("no_friend");     
        }
        else
        {               
            for(String f: friends)
            {               
                return "friend";
            }    
                
        }
        return null;
    }
   public String updateProfile()
  {
      
         final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
       
           Connection connection = null;
           Statement statement = null;
           ResultSet resultSet = null;
           
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
          return ("SQLError");
        }
        try
         {  
             connection = DriverManager.getConnection(DATABASE_URL, 
                     "tungidwara1184", "1654451");
             statement = connection.createStatement();
             resultSet = statement.executeQuery("Select * from user Where ID ='"+user_id+"'");
             if(resultSet.next())
             {
                  int r=statement.executeUpdate("Update user set UserName='"+name+"', Gender='" + gender +"', Education ='"+ school +"', Birthday='"+ birthday+"' where Id='"+user_id+"'");
                if(!name.equals(profiles.get(2)))
                {
                    post();
                    int i=statement.executeUpdate("insert into post_update values ('"+pid+"','"+user_id+"','Updated UserName','U','"+currentTime+"')");
                }
                if(!gender.equals(profiles.get(3)))
                {
                    post();
                    int i=statement.executeUpdate("insert into post_update values ('"+pid+"','"+user_id+"','Updated Gender','U','"+currentTime+"')");
                }
                if(!school.equals(profiles.get(4)))
                {
                    post();
                    int i=statement.executeUpdate("insert into post_update values ('"+pid+"','"+user_id+"','Updated Education','U','"+currentTime+"')");
                }
                if(!birthday.equals(profiles.get(5)))
                {
                    post();
                    int i=statement.executeUpdate("insert into post_update values ('"+pid+"','"+user_id+"','Updated Birthday','U','"+currentTime+"')");
                }
                  return ("UPSuccessful.xhtml");
             } 
             else
             {
                 return("SQLError");
             }
             
         }
            catch(SQLException e)
         {
             e.printStackTrace();
              return ("SQLError");
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
                  return ("SQLError");
              
             }
         }
        
    }
  public void post()
  {
        final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        int nextnum=0;
        try
        {
             connection = DriverManager.getConnection(DATABASE_URL, 
                     "tungidwara1184", "1654451");
            st = connection.createStatement();
            rs=st.executeQuery("Select postID from nextpost");
            if(rs.next())
                {
                    pid= "" + rs.getInt(1);
                    nextnum = rs.getInt(1) + 1;
                }
                int u = st.executeUpdate("Update nextpost set postID = '" + nextnum + "'");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                connection.close();
                st.close();
                rs.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
  
   public String shownotification()
    {
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            notif.clear();
            rs = st.executeQuery("Select * from user_notification where receiver_id ='"+user_id+"' and (status = 'new' or status ='unread') ");
           
            while(c1<=notif.size())
           {
             if(rs.next())
            {
             notif.add(new notifications(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6)));
            }
             else
             {
                 break;
             }
             
         }  
          
            new_notif.clear();
      if(notif.isEmpty())
      {                
       return("No new notifications");
      }
      else
     {
        for(int i = 0; i<notif.size(); i++)
        {
           if(notif.get(i).getStatus().equals("unread")&& notif.get(i).getType().equals("M"))
            {
             new_notif.add(i+1+" "+ ". "+notif.get(i).s_id +" sent you a new message!");
            }
            if(notif.get(i).getStatus().equals("new")&& notif.get(i).getType().equals("R") )
            {                       
             new_notif.add(i+1+" "+ ". "+notif.get(i).getS_id()+" sent you a friend request!");                       
            }                    
        }
                 
        }
      }
        catch(SQLException e)
         {
             e.printStackTrace();
              return ("SQLError");
         }
         finally
         {
             try
             {
                 rs.close();
                 st.close();
                 con.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                  return ("SQLError");
              
             }
         }
      return("Checknotif");        
    }

  public int show()
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            rs = st.executeQuery("Select * from user_notification where receiver_id ='"+user_id+"' and (status = 'new' or status ='unread') ");
           if(count==0){
            while(count<=notif_num.size())
           {
             if(rs.next())
            {
               count++;
               
                notif_num.add(new notifications(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6)));
            }
             else
             {
                 break;
             }
             
         } 
               
           }
           else{
               return count;
           }
          
    }
        catch (SQLException e)
        {
            e.printStackTrace();
           
        }
        finally
        {
             //close the database
             try
             {
                 st.close();
                 rs.close();
                 con.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                 
             }
        }
        return(count);
        
    }

  
    public String view_notif()
  {
      if(v_num==0)
      {
          return("validnumber");
      }
      if(v_num>0&&v_num<=notif.size())
      {
          if(notif.get(v_num-1).getType().equals("R"))
          {
              vc =notif.get(v_num-1).getContent();
              return("Ad");
          }
          else
          {
             Connection con = null;
             Statement st = null;
               ResultSet rs = null;
        
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            message.clear();
            String vn = notif.get(v_num-1).getType();
            String vf = notif.get(v_num-1).getS_id();
            
            rs = st.executeQuery("Select * from user_notification where not_type ='"+vn+"' ");
            while(rs.next())
            {
                if( ((rs.getString(2).equals(vf))&& (rs.getString(3).equals(user_id)))||((rs.getString(2).equals(user_id))&& (rs.getString(3).equals(vf))) )
                {
                 message.add(new Messages(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
                }
            }     
            friendsmsg.clear();
        for(int i=0;i<message.size();i++)
        {
            
            friendsmsg.add(message.get(i).m_sid+" : "+message.get(i).m_cont);
                
        }
        
      }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                rs.close();
                st.close();
                con.close();
            }
            catch(SQLException e)
               {
                        
                   e.printStackTrace();
               
               }
        }
       
             
          }
      }
      
    return("sendreply");
  }
  
  public String accept()
  {
      Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            int r = notif.get(v_num-1).getN_id();
            st.executeUpdate("Update user_notification set status ='"+s+"' where not_id='"+r+"' ");
            String se = notif.get(v_num-1).getS_id();
            st.executeUpdate("Insert into friend values('"+se+"','"+ user_id +"') ");
           notif.remove(v_num-1);
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
           
        }
        finally
        {
             //close the database
             try
             {
                 st.close();
                 rs.close();
                 con.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                 
             }
        }
        return("requestaccpt");
  }
  
  public String deny()
  {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            int de = notif.get(v_num-1).getN_id();
            st.executeUpdate("Update user_notification set status ='"+d+"' where not_id='"+de+"' ");
             notif.remove(v_num-1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
           
        }
        finally
        {
             //close the database
             try
             {
                 st.close();
                 rs.close();
                 con.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                 
             }
        }
        return("denyrequest");
  }
  
  public String reply()
  {
        int cnotif = 0;
        int nnotif = 0;
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184","1654451");
            st = con.createStatement();
            
            rs = st.executeQuery("Select * from nextnotice");
            while(rs.next())
            {
                cnotif = rs.getInt(1);
                nnotif = rs.getInt(1)+1;
            }
            int mt = notif.get(v_num-1).getN_id();
            st.executeUpdate("Update user_notification set status ='"+t+"' where not_id='"+mt+"' ");
            String sm= notif.get(v_num-1).getS_id();
            int m = st.executeUpdate("Insert into user_notification values ('"+cnotif+"' , '"+user_id+"' , '"+sm+"' , '"+ty+"' , '"+m_reply+"' , 'unread' )");
            st.executeUpdate("Update nextnotice set next_notice = '"+nnotif+"' ");
            notif.remove(v_num-1);
        }
             
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
             //close the database
             try
             {
                 st.close();
                 rs.close();
                 con.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                 
             }
        }
      return("msgreplied");  
    }
  
  public String friendrequest()
    {
        String ct ="Sent you Friend request";
           Connection con = null;
           Statement st = null;
           Statement st1 = null;
           ResultSet rs = null;
           try
           {
               final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
               con = DriverManager.getConnection(DB_URL,"tungidwara1184","1654451");
               st =  con.createStatement();
               rs = st.executeQuery("Select * from friend");
               while(rs.next())
               {
                   if((friend_id.equals(rs.getString(2))&& (rs.getString(1).equals(user_id))))
                   {
                       return("AlreadyFriends");
                   }
                   if((friend_id.equals(rs.getString(1)))&& (rs.getString(2).equals(user_id)))
                   {
                       return("AlreadyFriends");
                   }
               }
               rs = st.executeQuery("select * from user_notification where not_type='R' ");
               while(rs.next())
               {
                   if((rs.getString(2).equals(user_id)) && (friend_id.equals(rs.getString(3))))
                   {
                       return("RequestAlreadySent");
                   }
               }
               int n_noid =0;
               rs = st.executeQuery("Select * from nextnotice");
               while(rs.next())
               {
                   nf_id = rs.getInt(1);
                   n_noid = rs.getInt(1) +1 ;
               }
               st.executeUpdate("Insert into user_notification values('"+nf_id+"' ,'"+user_id+"' ,'"+friend_id+"','"+type+"' , '"+ct+"' , '"+status+"' )");
               st.executeUpdate("Update nextnotice set next_notice ='"+n_noid+"' ");

               return("FrndRsuccess");
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
                   st.close();
                   
                   rs.close();
                  con.close();
                   
                   
               }
               catch(SQLException e)
               {
                   e.printStackTrace();
               }
           
           
      }
    } 
   
    public String Sendmessage()
    {
        
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184","1654451");
            st = con.createStatement();
            
            rs = st.executeQuery("Select * from nextnotice");
            while(rs.next())
            {
                 cmsg_id = rs.getInt(1);
                 nmsg_id = rs.getInt(1)+1;
            }
            rs = st.executeQuery("Select * from friend where IDR = '"+friend_id+"' or IDS='"+friend_id+"' ");
            if(rs.next())
            {
            int m = st.executeUpdate("Insert into user_notification values ('"+cmsg_id+"' , '"+user_id+"' , '"+friend_id+"' , '"+ty+"' ,'"+s_msg+"' , '"+mst+"' )");
            
            st.executeUpdate("Update nextnotice set next_notice = '"+nmsg_id+"'");
            }
            
             rs = st.executeQuery("Select * from user_notification where not_type ='"+ty+"' ");
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return("SQLError");
        }
        finally
        {
             //close the database
             try
             {
                 st.close();
                 rs.close();
                 con.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                 
             }
        }
        return("MessageSent");
    }

    
     public String createPost()
  {
      String currentTime = new SimpleDateFormat("yyyy-MM-dd--HH:mm:ss").format(Calendar.getInstance().getTime());
  
       final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
          
           Connection connection = null;
           Statement statement = null;
           ResultSet resultSet = null;
      
           
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
          return ("SQLError");
        }
        try
         {  
             connection = DriverManager.getConnection(DATABASE_URL, 
                     "tungidwara1184", "1654451");
             statement = connection.createStatement();
              resultSet=statement.executeQuery("Select postID from nextpost");
                  int nextNum=0;
                 while(resultSet.next())
                      {
                         postID= ""+resultSet.getInt(1);
                         nextNum = resultSet.getInt(1) + 1;
                      }
                   int t = statement.executeUpdate("Update nextpost set "
                             + "postID = '"+nextNum+"'");
            int r = statement.executeUpdate("insert into post_update values "
                             + "('"+postID+"','"+user_id+"', '"+PContent+"','P', '"+currentTime+"')");

            
          
            tag(PContent);
            
           PContent="";
         }
            catch(SQLException e)
         {
             e.printStackTrace();
              return ("SQLError");
         }
         finally
         {
             try
             {
                 resultSet.close();
                 statement.close();
                 connection.close();
             }
             catch(SQLException e)
             {
                 e.printStackTrace();
             }

        }
        return ("successfull");
  } 
     public String tag(String t)
    {
          
        final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
        tags = new ArrayList<String>();
        Connection conn = null;
        ResultSet rs = null;
        Statement st = null;
        ResultSet rs1 = null;
        Statement st1 = null;
            
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
          return ("SQLError");
        }
        try
        {
           String[] w = t.split(" ");
         
          conn = DriverManager.getConnection(DATABASE_URL, 
                         "tungidwara1184", "1654451");
            st=conn.createStatement();
            rs = st.executeQuery("Select * from user_hashtag");
            st1=conn.createStatement();
            rs1 = st1.executeQuery("Select * from user_hashtag");
            while(rs.next())
            {
                tags.add(rs.getString(1));
            }
            for(String s: w)
            {
                if(s.startsWith("#"))
                {
                    if(tags.contains(s))
                    {
               
                    int u = st.executeUpdate("Update user_hashtag set Count = Count+1 where Hashtag='"+s+"'");
                }
                    else
                    {
                          int r = st.executeUpdate("insert into user_hashtag values ('"+s+"','"+1+"')");
                    }
                }
            }
          
            
            return ("successfull");
        }
        catch(SQLException e)
        {
           
            e.printStackTrace();
            return ("SQLError");
        }
        finally
        {
            try
            {
                rs.close();
                st.close();
                 rs1.close();
                st1.close();
                conn.close();
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return ("SQLError");
            }
  
}
    }
     
     public String showHashtags()
     {
          final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
        
           Connection connection = null;
           Statement statement = null;
           ResultSet resultSet = null;
           
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
          return ("SQLError");
        }
        try
         {  
             connection = DriverManager.getConnection(DATABASE_URL, 
                     "tungidwara1184", "1654451");
             statement = connection.createStatement();
             resultSet=statement.executeQuery("Select * from user_hashtag where Count >=1 order by count desc limit 3");
             while(resultSet.next())
             {
                 hashtags.add(resultSet.getString(1));
                 
             }
         
          return("hashtagsTable");    
     }
          catch(SQLException e)
         {
             e.printStackTrace();
              return ("SQLError");
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
                  return ("SQLError");
             }
         }
              
}
     
      public String showUpdateandpost()
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            post.clear();
            rs = st.executeQuery("Select * from post_update");
            while(rs.next())
            {
                post.add(new Post(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        
        int cpost=0;
        show_post.clear();
        for(int i = 0; i<post.size(); i++)
        {
          if(cpost<=5)
          {
              show_post.add(i+1+"."+ post.get(i).user_id+":"+post.get(i).p_content);
          }
        }
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return("SQLError");
        }
        finally
        {
             //close the database
             try
             {
                 st.close();
                 rs.close();
                 con.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                 
             }
        }
        return("postUpdate");
    }
     
     public String showcomment()
     {
         Connection con = null;
         Statement st = null;
         ResultSet rs = null;
         try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            comments.clear();
            rs = st.executeQuery("Select * from user_comment");
            
            while(rs.next())
            {
                     if(p_num==0)
                     {
                         return("validnumber");
                     }
                    if(p_num>0&&p_num<=post.size())
                    {
                        
                       if(post.get(p_num-1).getPost_id().equals(rs.getString(1)))
                        {
                         comments.add(rs.getString(2)+"\t:"+rs.getString(3));
                        }
                       if(!post.get(p_num-1).getPost_id().equals(rs.getString(1)))
                        {
                         return("Nocomment"); 
                         
                       }
                    }      
                } 
            
         }
          catch (SQLException e)
         {
            e.printStackTrace();
            return("SQLError");
         }
        finally
        {
             //close the database
             try
             {
                 st.close();
                 rs.close();
                 con.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                 
             }
        }
         return("showcomment");
    }
     
     public String comment()
     {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            String py = post.get(p_num-1).getPost_id();
            int cmt = st.executeUpdate("Insert into user_comment values('"+py+"' ,'"+user_id+"', '"+m_reply+"') ");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //rs.close();
                st.close();
                con.close();
            }
            catch(SQLException e)
               {
                        
                   e.printStackTrace();
               
               }
        }
        return("comment");
     }
     
 public String displaymessages()
    {
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            rs = st.executeQuery("Select * from user_notification where not_type ='"+ty+"' ");
            while(rs.next())
            {
             if(((rs.getString(2).equals(friend_id))&& (rs.getString(3).equals(user_id))) || (rs.getString(2).equals(user_id))&& (rs.getString(3).equals(friend_id)))
                {
  
                 message.add(new Messages(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
                }
              if(message.isEmpty())
              {
                   return("no_newmsg");
              }
            }  
         for(int i=0;i<message.size();i++)
            {
              
              friendsmsg.add(message.get(i).m_sid+" : "+message.get(i).m_cont);
              
               
            }
        
      }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                rs.close();
                st.close();
                con.close();
            }
            catch(SQLException e)
               {
                        
                   e.printStackTrace();
               
               }
        }
       return ("viewmsg"); 
    }
 
 public String showprofile()
 {
     Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            f_profile.clear();
            rs = st.executeQuery("Select * from user where ID='"+fp+"' ");
            if(rs.next())
            {
                f_profile.add(new Profile(rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
            view_pro.clear();
            for(Profile p: f_profile)
            {
                
                view_pro.add("Name:"+p.f_name);
                view_pro.add ("Gender:"+p.f_gender);
                view_pro.add ("Birthday:"+p.f_bday);
                view_pro.add("Education:"+p.f_school);
                
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                rs.close();
                st.close();
                con.close();
            }
            catch(SQLException e)
               {
                        
                   e.printStackTrace();
               
               }
        }
    return("viewprofile");
  }
 
 public String postwithtag()
 {
     Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try
        {
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/tungidwara1184";
            con = DriverManager.getConnection(DB_URL, "tungidwara1184", "1654451");
            st = con.createStatement();
            rs = st.executeQuery("Select * from post_update");
            while(rs.next())
            {
                String pt = rs.getString(3);
                if(pt.indexOf(postag)!= -1)
                {
                    return pt;
                }
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                rs.close();
                st.close();
                con.close();
            }
            catch(SQLException e)
               {
                        
                   e.printStackTrace();
               
               }
        }
        return("tagpost");
 }
 
}