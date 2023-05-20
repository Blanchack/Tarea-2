package Principal;

import Wrappers.PanelExpendedor;
import Wrappers.PanelComprador;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){
        this.setLayout(null);
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBounds(0,0,970,550);
        this.add(exp);
        this.add(com);
        this.setBackground(Color.BLUE);
    }
    public void paint (Graphics g){
        super.paint(g);
        

        exp.paint(g);
        com.paint(g);
    }

    public JPanel getPC(){

        return com;
    }

}
