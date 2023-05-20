package Principal;

import Tarea1.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ventana extends JFrame {
    private PanelPrincipal Pp;
    private PanelBotones Pb;

    private Expendedor exp;
    Ventana(){
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setTitle("Máquina Expendedora");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        establecerPaneles();
        JLabel comp = new JLabel("Comprador");
        comp.setBounds(600,80,100,30);
        this.setSize(970,550);
        this.setVisible(true);
        exp = new Expendedor(100,1000,700);


        //JPanel PC = Pp.getPC();
        Pp.add(comp);
        establecerBotones(Pp);

    }

    private void establecerPaneles(){

        Pp=new PanelPrincipal();
        this.getContentPane().add(Pp);

    }

    private void establecerBotones(JPanel Pp){

        Pb = new PanelBotones();
        Pp.add(Pb.m1);
        Pp.add(Pb.m2);
        Pp.add(Pb.m3);
        Pp.add(Pb.m4);
        Pp.add(Pb.p1);
        Pp.add(Pb.p2);
        Pp.add(Pb.p3);
        Pp.add(Pb.p4);
        Pp.add(Pb.comp);
        Pp.add(Pb.ret);

        ActionListener click100 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.m1.setEnabled(false);
                Pb.m2.setEnabled(false);
                Pb.m3.setEnabled(false);
                Pb.m4.setEnabled(false);
                Pb.p1.setEnabled(true);
                Pb.p2.setEnabled(true);
                Pb.p3.setEnabled(true);
                Pb.p4.setEnabled(true);

            }
        };

        ActionListener click500 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.m1.setEnabled(false);
                Pb.m2.setEnabled(false);
                Pb.m3.setEnabled(false);
                Pb.m4.setEnabled(false);
                Pb.p1.setEnabled(true);
                Pb.p2.setEnabled(true);
                Pb.p3.setEnabled(true);
                Pb.p4.setEnabled(true);

            }
        };

        ActionListener click1000 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.m1.setEnabled(false);
                Pb.m2.setEnabled(false);
                Pb.m3.setEnabled(false);
                Pb.m4.setEnabled(false);
                Pb.p1.setEnabled(true);
                Pb.p2.setEnabled(true);
                Pb.p3.setEnabled(true);
                Pb.p4.setEnabled(true);

            }
        };

        ActionListener click1500 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.m1.setEnabled(false);
                Pb.m2.setEnabled(false);
                Pb.m3.setEnabled(false);
                Pb.m4.setEnabled(false);
                Pb.p1.setEnabled(true);
                Pb.p2.setEnabled(true);
                Pb.p3.setEnabled(true);
                Pb.p4.setEnabled(true);

            }
        };

        ActionListener clickCC = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.p1.setEnabled(false);
                Pb.p2.setEnabled(false);
                Pb.p3.setEnabled(false);
                Pb.p4.setEnabled(false);
                Pb.comp.setEnabled(true);
            }
        };

        ActionListener clickSpr = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.p1.setEnabled(false);
                Pb.p2.setEnabled(false);
                Pb.p3.setEnabled(false);
                Pb.p4.setEnabled(false);
                Pb.comp.setEnabled(true);
            }
        };

        ActionListener clickSnick = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.p1.setEnabled(false);
                Pb.p2.setEnabled(false);
                Pb.p3.setEnabled(false);
                Pb.p4.setEnabled(false);
                Pb.comp.setEnabled(true);
            }
        };

        ActionListener clickS8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.p1.setEnabled(false);
                Pb.p2.setEnabled(false);
                Pb.p3.setEnabled(false);
                Pb.p4.setEnabled(false);
                Pb.comp.setEnabled(true);
            }
        };

        ActionListener clickComp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.comp.setEnabled(false);
                Pb.ret.setEnabled(true);

                /* Caso de compra no exitosa
                Pb.comp.setEnabled(false);
                Pb.m1.setEnabled(true);
                Pb.m2.setEnabled(true);
                Pb.m3.setEnabled(true);
                Pb.m4.setEnabled(true);
                */

            }
        };

        ActionListener clickRet = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Pb.comp.setEnabled(false);
                Pb.ret.setEnabled(false);
                Pb.m1.setEnabled(true);
                Pb.m2.setEnabled(true);
                Pb.m3.setEnabled(true);
                Pb.m4.setEnabled(true);
            }
        };

        Pb.m1.addActionListener(click100);
        Pb.m2.addActionListener(click500);
        Pb.m3.addActionListener(click1000);
        Pb.m4.addActionListener(click1500);
        Pb.p1.addActionListener(clickCC);
        Pb.p2.addActionListener(clickSpr);
        Pb.p3.addActionListener(clickSnick);
        Pb.p4.addActionListener(clickS8);
        Pb.comp.addActionListener(clickComp);
        Pb.ret.addActionListener(clickRet);
    }


}
