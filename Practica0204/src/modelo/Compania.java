/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author David Cornejo
 */
public class Compania {
    
    private String nombre;
    private int numUnidades;
    private Terminal terminal;

    public Compania(String nombre, int numUnidades, Terminal terminal) {
        this.nombre = nombre;
        this.numUnidades = numUnidades;
        this.terminal = terminal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "Companias{" + "nombre=" + nombre + ", numUnidades=" + numUnidades + ", terminal=" + terminal + '}';
    }
    
    
    
}
