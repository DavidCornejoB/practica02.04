

package modelo;

public class Pasajero extends Persona{
    
    private Persona persona;

    public Pasajero(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "persona=" + persona + '}';
    } 
}
