package Wrappers;

import Principal.BotonesItems;
import Tarea1.Expendedor;
import Tarea1.NoHayProductoException;
import Tarea1.PagoIncorrectoException;
import Tarea1.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel{
    PanelMonedas pm;
    BotonesItems bi;
    JButton comprarButton;

    public PanelComprador(Expendedor exp){
        pm = new PanelMonedas();
        bi = new BotonesItems();

        comprarButton = new JButton("Comprar");
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    exp.comprarProducto(pm.monedaSeleccionada(), bi.idDelProductoSeleccionado());
                } catch (PagoInsuficienteException ex) {
                    ex.printStackTrace();
                } catch (PagoIncorrectoException ex) {
                    ex.printStackTrace();
                } catch (NoHayProductoException ex) {
                    ex.printStackTrace();
                }
                repaint();
            }
        });

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(bi);
        this.add(new JPanel());
        this.add(pm);
        this.add(comprarButton);


        setVisible(true);
    }
}
