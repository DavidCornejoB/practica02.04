/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Compania;
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
            long id = 0;
            
            int numUnidades = Integer.parseInt(nUnidades);
            
            this.vCompania.getGd().addCompania(new Compania(id, nombre, numUnidades, this.vCompania.getGd().getTerminalList().get(terminal)));
            this.vCompania.getModeloTabla().setDataVector(this.cargaCompania(this.vCompania.getGd().getCompaniaList().size(), 4), this.vCompania.getEncabezado());

            this.vCompania.getTxtList().get(0).setText("");
            this.vCompania.getTxtList().get(1).setText("");
            this.vCompania.getComboBox().setSelectedIndex(-1);
             
        }
    }

    private Object[][] cargaCompania(int f, int c) {
        
        Object[][] retorno = new Object[f][c];
        int i = 0;
        for(Compania com: vCompania.getGd().getCompaniaList()){
            
            retorno[i][0] = i + 1;
            retorno[i][1] = com.getNombre();
            retorno[i][2] = com.getNumUnidades();
            retorno[i][3] = com.getTerminal().getNombre();
            i++;
        }
        
        return retorno;
    } 
}