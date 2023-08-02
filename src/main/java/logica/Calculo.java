/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author yonat
 */
public  class Calculo {
    public double PesoDolar(Double valor){
        return valor / 274.50; 
    }
    
      public double PesoEuro(Double valor){
    
        return valor / 303.213;
    }
      
      public double DolarPeso(Double valor){
        return valor * 274.50;
    }
      
       public double EuroPeso(Double valor){
        return valor * 303.213;
    }

    public Double celsiusFaren(Double valorInicial) {
        return  (valorInicial * 1.8) + 32;
    }

    public Double farenCelsius(Double valorInicial) {
      return (valorInicial - 32) / 1.8;
    }
    
    public boolean esNum(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if(!(Character.isDigit(cadena.charAt(i))))
             return false;
       }
        return true;
    }
    
        public void mostrarMensaje (String mensaje, String tipo, String titulo){
            JOptionPane optionPane = new JOptionPane(mensaje);
            
                if(tipo.equals("info")){
                    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                }
                else if (tipo.equals("Error")){
                    optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
                }
            JDialog dialog = optionPane.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
    }
    
    
}
