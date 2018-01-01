
package modelo;

public class Compania {
    
    private long id;
    private String nombre;
    private int numUnidades;
    private Terminal terminal;

    public Compania(long id, String nombre, int numUnidades, Terminal terminal) {
        this.id = id;
        this.nombre = nombre;
        this.numUnidades = numUnidades;
        this.terminal = terminal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return  id + " | " + nombre + " | " + numUnidades + " | " + terminal ;
    }

    
}
