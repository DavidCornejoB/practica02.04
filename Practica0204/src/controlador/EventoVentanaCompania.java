/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaCompania;

/**
 *
 * @author David Cornejo
 */
public class EventoVentanaCompania implements ActionListener{
    
    private VentanaCompania vCompania;

    public EventoVentanaCompania(VentanaCompania vCompania) {
        this.vCompania = vCompania;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vCompania.getbGuardar())){
            
            String nombre = this.vCompania.getTxtList().get(0).getText();
            String nUnidades = this.vCompania.getTxtList().get(1).getText();
            int terminal = this.vCompania.getComboBox().getSelectedIndex();
            
            
        }
    }
    
}
