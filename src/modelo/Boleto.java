
package modelo;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Boleto implements Serializable{
    @Id
    private long id;
    private Pasajero pasajero;
    private Viaje viaje;
    private int numBoletos;

    public Boleto(long id, Pasajero pasajero, Viaje viaje, int numBoletos) {
        this.id = id;
        this.pasajero = pasajero;
        this.viaje = viaje;
        this.numBoletos = numBoletos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return  id + " | " + pasajero + " | " + viaje + " | " + numBoletos ;
    }

    
}
