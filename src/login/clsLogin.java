package login;

import javax.swing.JOptionPane;
public class clsLogin extends clsconnection{
    String mUsername;
    String mPassword;
    
    public void Masuk(){
        try{
            sql="select * from admin where username= '"+mUsername+"' and password= '"+mPassword+"'";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Keluar(){
        try{
            JOptionPane.showMessageDialog(null, "Berhasil Keluar");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
}
