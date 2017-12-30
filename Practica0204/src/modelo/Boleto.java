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
public class Boleto {
    
    private Pasajero pasajero;
    private Viaje viaje;
    private int numBoletos;

    public Boleto(Pasajero pasajero, Viaje viaje, int numBoletos) {
        this.pasajero = pasajero;
        this.viaje = viaje;
        this.numBoletos = numBoletos;
    }

    public Boleto(Pasajero get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public int getNumBoletos() {
        return numBoletos;
    }

    public void setNumBoletos(int numBoletos) {
        this.numBoletos = numBoletos;
    }

    @Override
    public String toString() {
        return "Boleto{" + "pasajero=" + pasajero + ", viaje=" + viaje + ", numBoletos=" + numBoletos + '}';
    }
    
    
    
}
