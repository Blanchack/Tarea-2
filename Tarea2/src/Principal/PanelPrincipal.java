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

        this.add(com);

        this.setSize(800,550);

    }
}

