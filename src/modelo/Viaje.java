

package modelo;

import java.io.Serializable;


@Entity
public class Viaje implements Serializable {
    
    @Id
    private long id;
    private Compania compania;
    private String destino;

    public Viaje(long id, Compania compania, String destino) {
        this.id = id;
        this.compania = compania;
        this.destino = destino;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return id + " | " + compania + " | " + destino ;
    }
    
}
