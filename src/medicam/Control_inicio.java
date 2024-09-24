/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicam;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import vistas.*;
/**
 *
 * @author Nadia
 */
public class Control_inicio {
    
    public static Inicio ventana_inicio = new Inicio();
    
    public static void mostrar(){ ventana_inicio.setVisible(true);}
    public static void ocultar(){ ventana_inicio.setVisible(false);}
    public static void ajustar(){ ventana_inicio.setResizable(true);}
    
    public static void btn_accesar(){
        String txt_contra = ventana_inicio.getTxt_contra().getText();
        String txt_usuario = ventana_inicio.getTxt_usuario().getText();
        String Usuario = "admin";
        String Contraseña = "123";
        
        String Pass =new String(txt_contra);
        
        if(txt_usuario .equals(Usuario)&& Pass.equals(Contraseña)){
            
            Operaciones op = new Operaciones();
        
            op.setVisible(true);
            op.setResizable(true);
            op.setExtendedState(MAXIMIZED_BOTH);
            //dispose();
        }
        else{
           // JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta");
        }
    
    }
}
