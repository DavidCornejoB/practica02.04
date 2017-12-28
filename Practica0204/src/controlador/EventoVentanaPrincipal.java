/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaCompania;
import vista.VentanaPasajero;
import vista.VentanaPrincipal;
import vista.VentanaTerminal;

/**
 *
 * @author Administrador
 */
public class EventoVentanaPrincipal implements ActionListener {

    private VentanaPrincipal vPrincipal;
    //private GestionDato gD;

    public EventoVentanaPrincipal(VentanaPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vPrincipal.getItemMenuList().get(0))) {
            this.vPrincipal.setvT(new VentanaTerminal ("Nueva Terminal", true, true, true, true));
            this.vPrincipal.getEscritorio().add(this.vPrincipal.getvT());
        }
        if (e.getSource().equals(this.vPrincipal.getItemMenuList().get(1))) {
        this.vPrincipal.setvC(new VentanaCompania("Nuevo Docente", true, true, true, true));
        this.vPrincipal.getEscritorio().add(this.vPrincipal.getvC());
        }
        if (e.getSource().equals(this.vPrincipal.getItemMenuList().get(2))) {
        this.vPrincipal.setvP(new VentanaPasajero("Nueva Materia", true, true, true, true));
        this.vPrincipal.getEscritorio().add(this.vPrincipal.getvP());
        }


    }

}
