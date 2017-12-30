/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Compania;
import modelo.Pasajero;
import modelo.Terminal;
import modelo.Viaje;

import vista.VentanaPrincipal;

/**
 *
 * @author Administrador
 */
public class GestionDato {

    private List<Terminal> terminalList;
    private List<Compania> companiaList;
    private List<Pasajero> pasajeroList;
    private List<Viaje> viajeList;
    private VentanaPrincipal vPrincipal;

    public GestionDato(List<Terminal> terminalList, List<Compania> companiaList, List<Pasajero> pasajeroList, List<Viaje> viajeList) {
        this.terminalList = terminalList;
        this.companiaList = companiaList;
        this.pasajeroList = pasajeroList;
        this.viajeList = viajeList;
    }

    public boolean addTerminal(Terminal t) {
        return this.terminalList.add(t);
    }

    public boolean addCompania(Compania c) {
        return this.companiaList.add(c);
    }

    public boolean addPasajero(Pasajero p) {
        return this.pasajeroList.add(p);
    }

    public boolean addViaje(Viaje v) {
        return this.viajeList.add(v);
    }

    public List<Terminal> getTerminalList() {
        return terminalList;
    }

    public void setTerminalList(List<Terminal> terminalList) {
        this.terminalList = terminalList;
    }

    public List<Compania> getCompaniaList() {
        return companiaList;
    }

    public void setCompaniaList(List<Compania> companiaList) {
        this.companiaList = companiaList;
    }

    public List<Pasajero> getPasajeroList() {
        return pasajeroList;
    }

    public void setPasajeroList(List<Pasajero> pasajeroList) {
        this.pasajeroList = pasajeroList;
    }

    public List<Viaje> getViajeList() {
        return viajeList;
    }

    public void setViajeList(List<Viaje> viajeList) {
        this.viajeList = viajeList;
    }

    public VentanaPrincipal getvPrincipal() {
        return vPrincipal;
    }

    public void setvPrincipal(VentanaPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }
    
    public Terminal buscarTerminal(String txt) {
        Terminal retorno = null;
        int i = 0;
        for (Terminal d : this.terminalList) {
            if (d.getNombre().equals(txt)) {
                i++;
                return d;
            }
        }
        return retorno;
    }

    public Compania buscarCompania(String txt) {
        Compania retorno = null;
        int i = 0;
        for (Compania m : this.companiaList) {
            if (m.getNombre().equals(txt)) {
                i++;
                return m;
            }
        }
        return retorno;
    }

}
