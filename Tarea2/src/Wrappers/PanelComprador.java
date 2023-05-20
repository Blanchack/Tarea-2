package Wrappers;

import Principal.BotonesItems;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel{
    PanelMonedas pm;
    BotonesItems bi;
    JButton comprarButton;

    public PanelComprador(){
        pm = new PanelMonedas();
        bi = new BotonesItems();
        comprarButton = new JButton("Comprar");

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(bi);
        this.add(new JPanel());
        this.add(pm);
        this.add(comprarButton);


        this.setSize(350,400);

    }
}
