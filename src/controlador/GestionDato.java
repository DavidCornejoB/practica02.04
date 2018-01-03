package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Boleto;
import modelo.Compania;
import modelo.Pasajero;
import modelo.Persona;
import modelo.Terminal;
import modelo.Viaje;

import vista.VentanaPrincipal;

public class GestionDato {

    private List<Terminal> terminalList;
    private List<Boleto> boletoList;
    private List<Compania> companiaList;
    private List<Pasajero> pasajeroList;
    private List<Viaje> viajeList;
    private VentanaPrincipal vPrincipal;

    public GestionDato(List<Terminal> terminalList, List<Compania> companiaList, List<Pasajero> pasajeroList, List<Viaje> viajeList, List<Boleto> boletoList) {
        this.terminalList = terminalList;
        this.companiaList = companiaList;
        this.pasajeroList = pasajeroList;
        this.viajeList = viajeList;
        this.boletoList = boletoList;
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

    public boolean addBoleto(Boleto b) {
        return this.boletoList.add(b);
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

    public List<Boleto> getBoletoList() {
        return boletoList;
    }

    public void setBoletoList(List<Boleto> boletoList) {
        this.boletoList = boletoList;
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

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Practica0204PU");

    public boolean insertarTerminal(Terminal t) {
        boolean retorno = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        retorno = true;
        return retorno;
    }

    public List<Terminal> leerTerminal() {
        List<Terminal> retorno = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno = em.createQuery("SELECT t FROM Terminal t ORDER BY t.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    }

    public boolean insertarViaje(Viaje v) {
        boolean retorno = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(v);
        em.getTransaction().commit();
        retorno = true;
        return retorno;
    }

    public List<Viaje> leerViaje() {
        List<Viaje> retorno = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno = em.createQuery("SELECT t FROM Viaje v ORDER BY t.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    }

    public boolean insertarPasajero(Pasajero p) {
        boolean retorno = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        retorno = true;
        return retorno;
    }

    public List<Pasajero> leerPasajero() {
        List<Pasajero> retorno = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno = em.createQuery("SELECT t FROM Terminal t ORDER BY t.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    }

    public boolean insertarCompania(Compania c) {
        boolean retorno = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        retorno = true;
        return retorno;
    }

    public List<Compania> leerCompania() {
        List<Compania> retorno = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno = em.createQuery("SELECT t FROM Terminal t ORDER BY t.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    }

    public boolean insertarBoleto(Boleto b) {
        boolean retorno = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(b);
        em.getTransaction().commit();
        retorno = true;
        return retorno;
    }

    public List<Boleto> leerBoleto() {
        List<Boleto> retorno = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno = em.createQuery("SELECT t FROM Terminal t ORDER BY t.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    }


}
