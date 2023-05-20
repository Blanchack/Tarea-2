package Principal;

import javax.swing.*;
public class PanelBotones extends JPanel{

    JButton m1;
    JButton m2;
    JButton m3;
    JButton m4;
    JButton p1;
    JButton p2;
    JButton p3;
    JButton p4;
    JButton comp;
    JButton ret;


    public PanelBotones() {
        m1 = new JButton("100");
        m1.setBounds(470,210,100,30);
        m2 = new JButton("500");
        m2.setBounds(590,210,100,30);
        m3 = new JButton("1000");
        m3.setBounds(710,210,100,30);
        m4 = new JButton("1500");
        m4.setBounds(830,210,100,30);
        p1 = new JButton("CocaCola");
        p1.setBounds(470,350,100,30);
        p2 = new JButton("Sprite");
        p2.setBounds(590,350,100,30);
        p3 = new JButton("Snickers");
        p3.setBounds(710,350,100,30);
        p4 = new JButton("Super 8");
        p4.setBounds(830,350,100,30);
        comp = new JButton("Comprar");
        comp.setBounds(590,420,100,50);
        ret = new JButton("Retirar");
        ret.setBounds(710,420,100,50);

        p1.setEnabled(false);
        p2.setEnabled(false);
        p3.setEnabled(false);
        p4.setEnabled(false);
        comp.setEnabled(false);
        ret.setEnabled(false);
    }

}
