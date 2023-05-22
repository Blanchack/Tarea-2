package Principal;

import javax.swing.*;
import java.awt.*;
class Ventana extends JFrame {
    private PanelPrincipal Pp;//un panel para objetos gráficos
    private PanelBotones Pb;//un panel para objetos gráficos
    Ventana(){
        this.setLayout(new BorderLayout());
        this.setTitle("Máquina Expendedora");
        Pp=new PanelPrincipal();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(Pp,BorderLayout.CENTER);
        Pb = new PanelBotones();
        this.setSize(1280,720);
        this.setVisible(true);
    }
}
