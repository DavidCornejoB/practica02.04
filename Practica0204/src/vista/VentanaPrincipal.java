/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EventoVentanaPrincipal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author User
 */
public class VentanaPrincipal extends JFrame {
     private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private List<JMenu> menuList;
    private List<JMenuItem> itemMenuList;
   
    private VentanaTerminal vT;
    private VentanaCompania vC;
    private VentanaPasajero vP;
    
    public VentanaPrincipal(String title){
        super(title);
        this.setSize(950, 800);
        this.setDefaultCloseOperation(3);
        this.iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        this.escritorio = new JDesktopPane();
        this.barraMenu = new JMenuBar();
        
        this.menuList = new ArrayList();
        this.menuList.add(new JMenu("Crear"));
        
        
        this.itemMenuList = new ArrayList();
        this.itemMenuList.add(new JMenuItem("Terminal"));
        this.itemMenuList.add(new JMenuItem("Compañia"));
        this.itemMenuList.add(new JMenuItem("Pasajero"));
        this.itemMenuList.add(new JMenuItem("Nuevo Curso"));
 
        
        this.add(this.escritorio);
        this.setJMenuBar(this.barraMenu);
        
        this.barraMenu.add(this.menuList.get(0));
       
        
        
        this.menuList.get(0).add(this.itemMenuList.get(0));
        this.menuList.get(0).add(this.itemMenuList.get(1));
        this.menuList.get(0).add(this.itemMenuList.get(2));
        
        
        this.itemMenuList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.itemMenuList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        this.itemMenuList.get(2).addActionListener(new EventoVentanaPrincipal(this));
       
        
    }
    

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getItemMenuList() {
        return itemMenuList;
    }

    public void setItemMenuList(List<JMenuItem> itemMenuList) {
        this.itemMenuList = itemMenuList;
    }

    public VentanaTerminal getvT() {
        return vT;
    }

    public void setvT(VentanaTerminal vT) {
        this.vT = vT;
    }

    public VentanaCompania getvC() {
        return vC;
    }

    public void setvC(VentanaCompania vC) {
        this.vC = vC;
    }

    public VentanaPasajero getvP() {
        return vP;
    }

    public void setvP(VentanaPasajero vP) {
        this.vP = vP;
    }

    
    

}
