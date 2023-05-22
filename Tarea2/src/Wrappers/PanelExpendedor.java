package Wrappers;

import Tarea1.*;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel{
    Point pos;
    Expendedor exp;

    PanelDepositos dCoca;
    PanelDepositos dSprite;
    PanelDepositos dSnickers;
    PanelDepositos dSuper8;
    PanelDepositos dVuelto;

    PanelProducto compra;

    public PanelExpendedor(int x, int y){
        pos = new Point(x, y);

        exp = new Expendedor(4, 500, 500);

        dCoca = new PanelDepositos(Expendedor.COCA, pos.x, pos.y);
        dSprite = new PanelDepositos(Expendedor.SPRITE, pos.x+110, pos.y);
        dSnickers = new PanelDepositos(Expendedor.SNICKERS, pos.x + 220, pos.y);
        dSuper8 = new PanelDepositos(Expendedor.SUPER8, pos.x + 330, pos.y);

        dVuelto = new PanelDepositos(100, pos.x + 440, pos.y);

        compra = null;


        this.setBackground(Color.white);
        setVisible(true);
    }

    private void setSizes(){
        int sizeCoca = exp.getDepositSize(Expendedor.COCA);
        dCoca.setSize(sizeCoca);
        int sizeSprite = exp.getDepositSize(Expendedor.SPRITE);
        dSprite.setSize(sizeSprite);
        int sizeSnickers = exp.getDepositSize(Expendedor.SNICKERS);
        dSnickers.setSize(sizeSnickers);
        int sizeSuper8 = exp.getDepositSize(Expendedor.SUPER8);
        dSuper8.setSize(sizeSuper8);

        int sizeVuelto = exp.getSizeVuelto();
        dVuelto.setSize(sizeVuelto);
    }

    public void getProducto(){
        Producto producto =  exp.getCompra();
        int type = 0;
        if(producto instanceof CocaCola){
            type = Expendedor.COCA;
        }
        else if(producto instanceof Sprite){
            type = Expendedor.SPRITE;
        }
        else if(producto instanceof Snickers){
            type = Expendedor.SNICKERS;
        }
        else if(producto instanceof Super8){
            type = Expendedor.SUPER8;
        }
        compra = new PanelProducto(1000,550, type);
    }

    public void sacarProducto(){
        exp.getProducto();
        compra = null;
    }

    public Expendedor getExp(){return exp;}

    public void paint (Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(pos.x, pos.y, 430,430);

        setSizes();

        dCoca.paint(g);
        dSprite.paint(g);
        dSnickers.paint(g);
        dSuper8.paint(g);

        g.drawString("Tu vuelto!", pos.x + 440 , pos.y-20);
        dVuelto.paint(g);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1000, 550, 100,100);

        if(compra != null){
            compra.paint(g);
        }
    }

}
