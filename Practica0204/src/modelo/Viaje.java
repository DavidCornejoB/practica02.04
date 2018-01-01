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
public class Viaje {
    
    private Compania compania;
    private String destino;

    public Viaje(Compania compania, String destino) {
        this.compania = compania;
        this.destino = destino;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Viaje{" + "compania=" + compania + ", destino=" + destino + '}';
    }  
}
