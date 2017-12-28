/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Compania;


/**
 *
 * @author User
 */
public class VentanaCompania extends JInternalFrame {

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
    private JComboBox comboBox;

    public VentanaCompania(String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        this.setBounds(440, 0, 400, 300);
        this.setVisible(true);
        this.iniciaComponentes();
    }

    public void iniciaComponentes() {

        this.panel = new JPanel();
        JPanel panelCampos = new JPanel(new GridLayout(3, 2));
        JPanel pBotones = new JPanel(new BorderLayout(0, 0));

        this.lblList = new ArrayList();
        this.lblList.add(new JLabel("Nombre:"));
        this.lblList.add(new JLabel("Numero Unidades:"));
        this.lblList.add(new JLabel("Terminal:"));

        this.txtList = new ArrayList();
        this.txtList.add(new JTextField(15));
        this.txtList.add(new JTextField(15));

        this.comboBox=new JComboBox();
        
        this.bGuardar = new JButton("Guardar");
        //this.bGuardar.addActionListener(new EventoVentanaDocente(this));

        //this.bGenerar.addActionListener(new EventoVentanaDocente(this));
        this.encabezado = new Object[3];
        this.encabezado[0] = "Nombre";
        this.encabezado[1] = "N° Unidades";
        this.encabezado[2] = "Terminal";

        //this.cargaTerminal(this.gd.getTerminalList().size(), 3);

        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);

        panelCampos.add(this.lblList.get(0));
        panelCampos.add(this.txtList.get(0));
        panelCampos.add(this.lblList.get(1));
        panelCampos.add(this.txtList.get(1));
        panelCampos.add(this.lblList.get(2));
        panelCampos.add(this.comboBox);
        panel.add(panelCampos);
        panel.add(this.bGuardar);

        this.panel.add(this.scroll);
        this.add(this.panel);

    }

    public Object[][] cargaTerminal(int f, int c) {
        Object[][] retorno = new Object[f][c];
        int i = 0;
        for (Compania com : this.gd.getCompaniaList()) {
            retorno[i][0] = com.getNombre();
            retorno[i][1] = com.getNumUnidades();
            retorno[i][2] = com.getTerminal().getNombre();

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



}
