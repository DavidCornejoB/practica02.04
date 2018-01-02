/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Terminal;
import vista.VentanaTerminal;

/**
 *
 * @author David Cornejo
 */
public class EventoVentanaTerminal implements ActionListener {

    private VentanaTerminal vTerminal;

    public EventoVentanaTerminal(VentanaTerminal vTerminal) {
        this.vTerminal = vTerminal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vTerminal.getbGuardar())) {

            String nombre = this.vTerminal.getTxtList().get(0).getText();
            String direccion = this.vTerminal.getTxtList().get(0).getText();

            this.vTerminal.getGd().addTerminal(new Terminal(nombre, direccion));
            this.vTerminal.getModeloTabla().setDataVector(this.cargaTerminal(this.vTerminal.getGd().getTerminalList().size(), 3), this.vTerminal.getEncabezado());
            this.vTerminal.getTxtList().get(0).setText("");
            this.vTerminal.getTxtList().get(1).setText("");

        }
    }

    private Object[][] cargaTerminal(int f, int c) {

        Object[][] retorno = new Object[f][c];
        int i = 0;
        for (Terminal t : this.vTerminal.getGd().getTerminalList()) {
            retorno[i][0] = i + 1;
            retorno[i][1] = t.getNombre();
            retorno[i][2] = t.getDireccion();

            i++;
        }
        return retorno;
    }

}
