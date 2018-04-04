/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thbuoi01;

import java.awt.*;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Windows 10
 */
public class THBuoi01 extends Frame{

    /**
     * @param args the command line arguments
     */
    public THBuoi01(){
        setTitle("Caculator");
        setSize(300,300);
        setLayout(new GridLayout(4,2));        
        lblA = new Label("a=");
        add(lblA);        
        txtA = new TextField(20);
        add(txtA);        
        lblB = new Label("b=");
        add(lblB);        
        txtB = new TextField(20);
        add(txtB);
        lbnull = new Label("");
        add(lbnull);
        p = new Panel();
        p.setLayout(new FlowLayout());
        btnTinhTong = new Button ("+");
        btnTinhTong.addActionListener(new TinhTong());
        p.add(btnTinhTong);
        
        btnTinhHieu = new Button ("-");
        btnTinhHieu.addActionListener(new TinhHieu());
        p.add(btnTinhHieu);
        
        btnTinhTich = new Button ("*");
        btnTinhTich.addActionListener(new TinhTich());
        p.add(btnTinhTich);
        
        btnTinhThuong = new Button ("/");
        btnTinhThuong.addActionListener(new TinhThuong());
        p.add(btnTinhThuong); 
        
        add(p);
        lblKQ = new Label ("KQ=");
        add(lblKQ);
        txtKQ = new TextField(20);
        add(txtKQ);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });   
        
        
        setVisible(true);

    }
    public static void main(String[] args) {
        // TODO code application logic here
        new THBuoi01();
    }
    
    class TinhTong implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            int a= Integer.parseInt(txtA.getText());
            int b= Integer.parseInt(txtB.getText());
            Tong = a+b;      
            txtKQ.setText(String.valueOf(Tong));
        }
    }
    
    class TinhHieu implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            int a= Integer.parseInt(txtA.getText());
            int b= Integer.parseInt(txtB.getText());
            Hieu = a-b;      
            txtKQ.setText(String.valueOf(Hieu));
        }    
    }   
    class TinhTich implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            int a= Integer.parseInt(txtA.getText());
            int b= Integer.parseInt(txtB.getText());
            Tich = a*b;      
            txtKQ.setText(String.valueOf(Tich));
        }
    }
    class TinhThuong implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            int a= Integer.parseInt(txtA.getText());
            int b= Integer.parseInt(txtB.getText());
            Thuong = a/b;      
            txtKQ.setText(String.valueOf(Thuong));
        }
    }  
    
    Label lblA, lblB,lblKQ,lbnull;
    TextField txtA, txtB, txtKQ;
    Button btnTinhTong,btnTinhHieu,btnTinhTich,btnTinhThuong;
    float Tong,Tich,Hieu,Thuong;
    Panel p;
}
