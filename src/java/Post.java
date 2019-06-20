/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kotlah0033
 */
public class Post 
{
    String post_id;
    String user_id;
    String  p_content;
    String p_type;

    public Post(String pd, String ud, String pc, String pty) 
    {
        post_id = pd;
        user_id = ud;
        p_content = pc;
        p_type = pty;
    }
    
    

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getP_content() {
        return p_content;
    }

    public void setP_content(String p_content) {
        this.p_content = p_content;
    }

    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }
    
}
