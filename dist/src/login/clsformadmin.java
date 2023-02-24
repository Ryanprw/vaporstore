package login;

import javax.swing.JOptionPane;
public class clsformadmin extends clsconnection{
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
