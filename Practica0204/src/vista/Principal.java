/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import modelo.Boleto;
import modelo.Compania;
import modelo.Pasajero;
import modelo.Persona;
import modelo.Terminal;
import modelo.Viaje;

/**
 *
 * @author Administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Boleto> boletoList = new ArrayList();
        List<Compania> companiaList = new ArrayList();
        List<Pasajero> pasajeroList = new ArrayList();
        List<Persona> personaList = new ArrayList();
        List<Terminal> terminalList = new ArrayList();
        List<Viaje> viajeList = new ArrayList();
        
        GestionDato gd = new GestionDato(terminalList, companiaList, pasajeroList, viajeList);
        VentanaPrincipal vP= new VentanaPrincipal("Ventana", gd);
        vP.setVisible(true);
    }
    
}
