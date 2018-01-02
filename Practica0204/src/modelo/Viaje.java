/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author David Cornejo
 */

@Entity
public class Viaje implements Serializable{
    
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
