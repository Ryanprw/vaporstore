/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JOptionPane;
/**
 *
 * @author Ryan
 */
public class frmAdmin extends clsconnection{
    String id_admin;
    String Username;
    String nama;
    String Password;
    String Alamat;
    String no_hp;
    
    public void tampildata(){
        sql="select * from admin";
    }
    
    public void edit(){
        try{
            sql="update admin set id_admin= '"+id_admin+",nama= '"+nama+"',alamat='"+Alamat+"', no_hp= '"+no_hp+"', password='"+Password+"' where username='"+Username+"'";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void hapus(){
        try{
            sql="delete from admin where = '"+Username+"'";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }

    

    
}
