package Principal;

import Wrappers.PanelExpendedor;
import Wrappers.PanelComprador;

import javax.swing.*;
import java.awt.*;

class PanelPrincipal extends JPanel {

    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){

        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setSize(800,550);
        this.setBackground(Color.GRAY);
    }
    public void paint (Graphics g){
        super.paint(g);
        

        exp.paint(g);
        //com.paint(g);
    }
}

