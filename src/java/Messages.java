/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kotla
 */
public class Messages 
{
    int m_id;
    String m_sid;
    String r_id;
    String m_type;
    String m_cont;

    public Messages(int md,String msd,String rd,String mt,String mcnt)
    {
        m_id = md;
        m_sid=msd;
        r_id = rd;
        m_type = mt;
        m_cont = mcnt;
        
    }
    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_sid() {
        return m_sid;
    }

    public void setM_sid(String m_sid) {
        this.m_sid = m_sid;
    }

    public String getR_id() {
        return r_id;
    }

    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    public String getM_type() {
        return m_type;
    }

    public void setM_type(String m_type) {
        this.m_type = m_type;
    }

    public String getM_cont() {
        return m_cont;
    }

    public void setM_cont(String m_cont) {
        this.m_cont = m_cont;
    }
    
}
