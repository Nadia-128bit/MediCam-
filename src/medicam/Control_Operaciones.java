/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicam;

import static java.awt.Frame.MAXIMIZED_BOTH;
import vistas.*;

/**
 *
 * @author Nadia
 */
public class Control_Operaciones {
    
    public static void btn_reg_paciente(){
        Reg_Pacientes  op_pacient = new Reg_Pacientes();
        
        op_pacient.setVisible(true);
        op_pacient.setResizable(true);
        op_pacient.setExtendedState(MAXIMIZED_BOTH);
        
        Conexion conexion = new Conexion();
        conexion.getConexion();
    }
    
    public static void btn_reg_medico(){
        Reg_Doctores op_doctor = new Reg_Doctores();
        
        op_doctor.setVisible(true);
        op_doctor.setResizable(true);
        op_doctor.setExtendedState(MAXIMIZED_BOTH);
        
        Conexion conexion = new Conexion();
        conexion.getConexion();
        
    }
    
    public static void btn_reg_ingreso(){
        Reg_Ingresos op_ingreso = new Reg_Ingresos();
        
        op_ingreso .setVisible(true);
        op_ingreso .setResizable(true);
        op_ingreso .setExtendedState(MAXIMIZED_BOTH);
        
        Conexion conexion = new Conexion();
        conexion.getConexion();
        
    }
    
    public static void btn_pizarra(){
        Pizarra op_pizarra = new Pizarra();
        
        op_pizarra .setVisible(true);
        op_pizarra .setResizable(true);
        op_pizarra .setExtendedState(MAXIMIZED_BOTH);
        
        Conexion conexion = new Conexion();
        conexion.getConexion();
        
    }
    
    public static void btn_reportes(){
        Repotes op_reporte = new Repotes();
        
        op_reporte .setVisible(true);
        op_reporte .setResizable(true);
        op_reporte .setExtendedState(MAXIMIZED_BOTH);
        
        Conexion conexion = new Conexion();
        conexion.getConexion();
    
    }
    
    public static void btn_costos(){
        Costos op_costos = new Costos();
        
        op_costos .setVisible(true);
        op_costos .setResizable(true);
        op_costos .setExtendedState(MAXIMIZED_BOTH);
        
        Conexion conexion = new Conexion();
        conexion.getConexion();
    
    }
    
    public static void btn_egresos(){
        Bitacora_Egresos op_egresos = new Bitacora_Egresos();
        
        op_egresos .setVisible(true);
        op_egresos .setResizable(true);
        op_egresos .setExtendedState(MAXIMIZED_BOTH);
        
        Conexion conexion = new Conexion();
        conexion.getConexion();
    
    }
    
}
