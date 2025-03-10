/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kenor
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import panamahitek.Arduino.PanamaHitek_Arduino;
public class metodosArduino {
    
    PanamaHitek_Arduino Arduino= new PanamaHitek_Arduino();
    
    //Metodo para iniciar la conexion con arduino
        public void inicioConexion()
        {
          
             try {
                 Arduino.arduinoTX("COM9",9600);
            } catch (Exception ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
              
          } 
        }
        
        //Metodo para el boton de Toallas
        public void servoToallas()    
        { 
          try 
        {
        Arduino.sendData("m1");
        }catch (Exception ex )
        {
         Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE,null,ex);
        }
         //Metodo para el boton de Pastillas   
    }
         public void servoPastillas()    
        {
           try 
        {
        Arduino.sendData("m2");
        }catch (Exception ex )
        {
         Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE,null,ex);
        }
    
}       //Metodo para boton de tampones
          public void servoTampones()    
        {  
           try 
        {
        Arduino.sendData("m3");
        }catch (Exception ex )
        {
         Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE,null,ex);
        }
                 
       
}
          
          //Metodo para boton de parches
          public void servoParche()    
        {  
           try 
        {
        Arduino.sendData("m4");
        }catch (Exception ex )
        {
         Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE,null,ex);
        }
        }
          //Metodo detener conexion con arduino
          public void detener ()
          {
              try {
                 Arduino.killArduinoConnection();
            } catch (Exception ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
    
}
