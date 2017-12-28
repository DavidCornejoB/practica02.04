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

import vista.VentanaPrincipal;

/**
 *
 * @author Administrador
 */
public class GestionDato {

    private List<Terminal> terminalList;
    private List<Compania> companiaList;
    private List<Pasajero> pasajeroList;
    private VentanaPrincipal vPrincipal;


    public GestionDato(List<Terminal> terminalList, List<Compania> companiaList, List<Pasajero> pasajeroList) {
        this.terminalList = terminalList;
        this.companiaList = companiaList;
        this.pasajeroList = pasajeroList;
    }

   

    public boolean addTerminal(Terminal t) {
        return this.terminalList.add(t);
    }

    public boolean addMateria(Compania c) {
        return this.companiaList.add(c);
    }

    public boolean addCurso(Pasajero p) {
        return this.pasajeroList.add(p);
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
