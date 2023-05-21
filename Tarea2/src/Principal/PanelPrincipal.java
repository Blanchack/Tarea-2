package Principal;

import Wrappers.PanelExpendedor;
import Wrappers.PanelComprador;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class PanelPrincipal extends JPanel {

    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){

        exp = new PanelExpendedor();
        com = new PanelComprador();

        EmptyBorder espacio = new EmptyBorder(50,0,0,800);
        com.setBorder(espacio);
        this.add(com);

        this.add(exp);

        this.setSize(800,550);

    }

    public void paint(Graphics g) {
        super.paint(g);
        exp.paint(g);
    }
}

