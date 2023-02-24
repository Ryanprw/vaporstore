package login;

import javax.swing.JOptionPane;
import koneksi.connection;
public class clsReg extends connection{
    int id_admin;
    String nama;
    String Password;
    String alamat;
    String No_HP;
    String Username;
    String Alamat;
    
    public void daftar(){
        try{
            String sql = "insert into admin values ('"+id_admin+"','"+nama+"','"+Username+"','"+Password+"','"+Alamat+"','"+No_HP+"')";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void cancel(){
        try{
            JOptionPane.showMessageDialog(null,"Tidak Jadi Register");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Login(){
        try{
            JOptionPane.showMessageDialog(null,"Silahka Login");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }

    

    
    
}
