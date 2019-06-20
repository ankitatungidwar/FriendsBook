/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kotla
 */
public class Profile 
{
    String f_name;
    String f_gender;
    String f_bday;
    String f_school;
    
    Profile(String fn,String fg,String fs,String fb)
    {
        f_name=fn;
        f_gender = fg;
        f_school = fs;
        f_bday = fb;
        
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getF_gender() {
        return f_gender;
    }

    public void setF_gender(String f_gender) {
        this.f_gender = f_gender;
    }

    public String getF_bday() {
        return f_bday;
    }

    public void setF_bday(String f_bday) {
        this.f_bday = f_bday;
    }

    public String getF_school() {
        return f_school;
    }

    public void setF_school(String f_school) {
        this.f_school = f_school;
    }
    
}
