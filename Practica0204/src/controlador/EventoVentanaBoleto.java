/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaBoleto;

/**
 *
 * @author Administrador
 */
public class EventoVentanaBoleto implements ActionListener{
    
    private VentanaBoleto vBoleto;

    public EventoVentanaBoleto(VentanaBoleto vBoleto) {
        this.vBoleto = vBoleto;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource().equals(vBoleto.getbGuardar())){
            
        }
    }
    
}
