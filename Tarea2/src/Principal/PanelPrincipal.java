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

        exp = new PanelExpendedor(640, 50);
        com = new PanelComprador(exp);

        EmptyBorder espacio = new EmptyBorder(50,0,0,800);
        com.setBorder(espacio);
        this.add(com);

        this.add(exp);

        setVisible(true);
    }


    public void paint(Graphics g) {
        super.paint(g);
        exp.paint(g);
        updateUI();
    }
}

