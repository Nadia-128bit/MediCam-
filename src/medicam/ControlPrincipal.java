/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicam;
import static java.awt.Frame.MAXIMIZED_BOTH;
import vistas.Inicio;

/**
 *
 * @author Nadia
 */
public class ControlPrincipal {
    public static Inicio ventana_inicio = new Inicio();
    public static void mostrar(){ ventana_inicio.setVisible(true);}
    public static void ocultar(){ ventana_inicio.setVisible(false);}
    public static void ajustar(){ ventana_inicio.setResizable(true);}
    
}
