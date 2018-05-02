/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thbuoi04;

/**
 *
 * @author Windows 10
 */
public class NhanVien {

    /**
     * @param args the command line arguments
     */
    private String manv,phanxuong;
    private int soSP,dongia;
    private double luong;
        
        public NhanVien(String manv, String phanxuong, int soSP,int dongia, double luong)
        {
            this.manv = manv;
            this.phanxuong = phanxuong;
            this.soSP = soSP;
            this.dongia = dongia;
            this.luong = luong;
        }

    NhanVien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        public String getmanv()
        {
            return manv;
        }
        public String getphanxuong()
        {
            return phanxuong;
        }
        public int getsoSP()
        {
            return soSP;
        }
        public void setmanv(String manv)
        {
            this.manv=manv;
        }
        public void setphanxuong(String phanxuong)
        {
            this.phanxuong=phanxuong;
        }
        public void setsoSP(int soSP)
        {
            this.soSP=soSP;
        }
        public int getdongia()
        {
            return dongia;
        }
        public double getluong()
        {
            return luong;
        }
        public void setdongia(int dongia)
        {
            this.dongia = dongia;
        }
        public void setluong(double luong)
        {
            this.luong = luong;
        }
        public int getChuan()
        {
            if(this.phanxuong=="A")
            return 300;
            else
            return 500;
        }
        public boolean VuotChuan()
        {
            if(this.soSP > getChuan())
                return true;
            return false;
        }
        public float tinhluong()
        {
            return this.VuotChuan()? (this.getChuan()*20000+(this.soSP-this.getChuan())*30000):this.soSP*20000;
        }
        public String toString()
        {
            return this.manv;
        }
}
