/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Boleto;
import vista.VentanaBoleto;

/**
 *
 * @author David Cornejo
 */
public class EventoVentanaBoleto implements ActionListener {

    private VentanaBoleto vBoleto;
    
    public EventoVentanaBoleto(VentanaBoleto vBoleto) {
        this.vBoleto = vBoleto;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(vBoleto.getbGuardar())) {

            try {

                int pasajero = this.vBoleto.getComboBox().get(0).getSelectedIndex();
                int viaje = this.vBoleto.getComboBox().get(1).getSelectedIndex();
                String nBoletos = this.vBoleto.getTxtList().get(0).getText();
                int numBoletos = Integer.parseInt(nBoletos);
                long id = 0;
                
                Boleto b = new Boleto(id, this.vBoleto.getGd().getPasajeroList().get(pasajero), this.vBoleto.getGd().getViajeList().get(viaje), numBoletos);
                this.vBoleto.getGd().insertarBoleto(b);
                this.vBoleto.getGd().leerBoleto();
                
                this.vBoleto.getGd().addBoleto(new Boleto(id, this.vBoleto.getGd().getPasajeroList().get(pasajero), this.vBoleto.getGd().getViajeList().get(viaje), numBoletos));
                this.vBoleto.getModeloTabla().setDataVector(this.cargaBoleto(this.vBoleto.getGd().getBoletoList().size(), 4), this.vBoleto.getEncabezado());

            } catch (NumberFormatException err) {

                JOptionPane.showInternalMessageDialog(vBoleto, "Ingresar solo numeros en el parametro Numero Boleto", "Error", JOptionPane.ERROR_MESSAGE);

            }

            this.vBoleto.getTxtList().get(0).setText("");
            this.vBoleto.getComboBox().get(0).setSelectedIndex(-1);
            this.vBoleto.getComboBox().get(1).setSelectedIndex(-1);

        }
    }

    private Object[][] cargaBoleto(int f, int c) {
        Object[][] retorno = new Object[f][c];
        int i = 0;

        for (Boleto b : this.vBoleto.getGd().getBoletoList()) {

            retorno[i][0] = i + 1;
            retorno[i][1] = b.getPasajero().getNombre() + " " + b.getPasajero().getApellido();
            retorno[i][2] = b.getViaje().getDestino();
            retorno[i][3] = b.getNumBoletos();
            i++;

        }

        return retorno;

    }

}
