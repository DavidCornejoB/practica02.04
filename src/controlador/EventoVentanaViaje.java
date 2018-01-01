/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Viaje;
import vista.VentanaViaje;

/**
 *
 * @author David Cornejo
 */
public class EventoVentanaViaje implements ActionListener {

    private VentanaViaje vViaje;

    public EventoVentanaViaje(VentanaViaje vViaje) {
        this.vViaje = vViaje;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vViaje.getbGuardar())) {

            int compania = this.vViaje.getComboBox().getSelectedIndex();
            String destino = this.vViaje.getTxtList().get(0).getText();

            this.vViaje.getGd().addViaje(new Viaje(this.vViaje.getGd().getCompaniaList().get(compania), destino));
            this.vViaje.getModeloTabla().setDataVector(this.cargaViaje(this.vViaje.getGd().getViajeList().size(), 3), this.vViaje.getEncabezado());
            this.vViaje.getTxtList().get(0).setText("");
            this.vViaje.getComboBox().setSelectedIndex(-1);

        }
    }

    private Object[][] cargaViaje(int size, int i) {
        Object[][] retorno = new Object[size][i];
        int a = 0;
        for (Viaje v : this.vViaje.getGd().getViajeList()) {
            retorno[i][0] = a + 1;
            retorno[i][1] = v.getCompania().getNombre();
            retorno[i][2] = v.getDestino();
            i++;
        }
        return retorno;

    }

}
