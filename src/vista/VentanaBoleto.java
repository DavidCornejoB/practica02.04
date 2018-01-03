/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EventoVentanaBoleto;
import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Boleto;
import modelo.Pasajero;
import modelo.Viaje;

/**
 *
 * @author User
 */
public class VentanaBoleto extends JInternalFrame {

    private JPanel panel;
    private List<JLabel> lblList;
    private List<JTextField> txtList;
    private JButton bGuardar;
    private JButton bGenerar;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private Object encabezado[];
    private Object datos[][];
    private GestionDato gd;
    private List<JComboBox> comboBox;

    public VentanaBoleto(GestionDato gd, String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        this.setBounds(440, 0, 400, 300);
        this.gd = gd;
        this.setVisible(true);
        this.iniciaComponentes();
    }

    public void iniciaComponentes() {

        this.panel = new JPanel();
        JPanel panelCampos = new JPanel(new GridLayout(3, 2));
        JPanel pBotones = new JPanel(new BorderLayout(0, 0));

        this.lblList = new ArrayList();
        this.lblList.add(new JLabel("Pasajero:"));
        this.lblList.add(new JLabel("Viaje:"));
        this.lblList.add(new JLabel("N° Boletos:"));

        this.txtList = new ArrayList();
        this.txtList.add(new JTextField(15));

        this.comboBox = new ArrayList<>();
        this.comboBox.add(new JComboBox(this.cargaComboPasajero(this.getGd().getPasajeroList().size())));
        this.comboBox.add(new JComboBox(this.cargaComboViaje(this.getGd().getViajeList().size())));

        this.bGuardar = new JButton("Guardar");
        this.bGuardar.addActionListener(new EventoVentanaBoleto(this));

        this.encabezado = new Object[3];
        this.encabezado[0] = "Pasajero";
        this.encabezado[1] = "Viaje";
        this.encabezado[2] = "N° Boletos";

        this.cargaBoleto(this.gd.getBoletoList().size(), 3);

        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);

        panelCampos.add(this.lblList.get(0));
        panelCampos.add(this.comboBox.get(0));
        panelCampos.add(this.lblList.get(1));
        panelCampos.add(this.comboBox.get(1));
        panelCampos.add(this.lblList.get(2));
        panelCampos.add(this.txtList.get(0));

        panel.add(panelCampos);
        panel.add(this.bGuardar);

        this.panel.add(this.scroll);
        this.add(this.panel);

    }

    public Object[][] cargaBoleto(int f, int c) {
        Object[][] retorno = new Object[f][c];
        int i = 0;
        for (Boleto b : this.gd.getBoletoList()) {
            retorno[i][0] = b.getPasajero().getNombre() + " " + b.getPasajero().getApellido();
            retorno[i][1] = b.getViaje().getDestino();
            retorno[i][2] = b.getNumBoletos();

            i++;
        }
        return retorno;
    }

    private Object[] cargaComboPasajero(int size) {

        Object[] retorno = new Object[size];
        int i = 0;

        for (Pasajero p : this.gd.getPasajeroList()) {
            retorno[i] = p.getNombre() + " " + p.getApellido();
            i++;
        }

        return retorno;
    }

    private Object[] cargaComboViaje(int size) {

        Object[] retorno = new Object[size];
        int i = 0;

        for (Viaje v : this.gd.getViajeList()) {
            retorno[i] = v.getDestino();
            i++;
        }

        return retorno;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public List<JLabel> getLblList() {
        return lblList;
    }

    public void setLblList(List<JLabel> lblList) {
        this.lblList = lblList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public JButton getbGuardar() {
        return bGuardar;
    }

    public void setbGuardar(JButton bGuardar) {
        this.bGuardar = bGuardar;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public JButton getbGenerar() {
        return bGenerar;
    }

    public void setbGenerar(JButton bGenerar) {
        this.bGenerar = bGenerar;
    }

    public GestionDato getGd() {
        return gd;
    }

    public void setGd(GestionDato gd) {
        this.gd = gd;
    }

    public List<JComboBox> getComboBox() {
        return comboBox;
    }

    public void setComboBox(List<JComboBox> comboBox) {
        this.comboBox = comboBox;
    }

}
