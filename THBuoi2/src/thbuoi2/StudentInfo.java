/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thbuoi2;

/**
 *
 * @author Windows 10
 */
public class StudentInfo {
    private int stt;
    private String name;
    private String year;
    private String gT;
    
    int getStt(){
		return this.stt;
	}
    public String getname()
    {
        return this.name;
    }
    public String getyear()
    {
        return this.year;
    }
    public String getgt()
    {
        return this.gT;
    }
    
    public void setStt(int stt){
		this.stt=stt;
	}
    public void setname(String _name)
    {
       this.name = _name;
    }
    public void setyear(String _year)
    {
        this.year = _year;
    }
    public void setgt(String _gt)
    {
        this.gT = _gt;
    }
}
