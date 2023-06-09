package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class PruebaColores {
    public static void main(String[] args) {
        MarcoConDibujosColores miMarcoColores = new MarcoConDibujosColores();
        miMarcoColores.setVisible(true);
        miMarcoColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujosColores extends JFrame{
    public MarcoConDibujosColores(){
        setTitle("Prueba de Colores");
        setSize(400,400);
        LaminaColores miLamina = new LaminaColores();
        add(miLamina);
        //Cambia el color del fondo del marco
        //miLamina.setBackground(Color.DARK_GRAY);
        //Asi le dariamos los colores del sistema operativo
        miLamina.setBackground(SystemColor.window);
    }
}
class LaminaColores extends JPanel{
public void paintComponent (Graphics g){
    super.paintComponent(g);
    Color verdeAguaMarina =new Color (0,220,175);
    Graphics2D g2D = (Graphics2D) g;

    Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);

    g2D.setPaint(Color.CYAN);
    g2D.draw(rectangulo);
    g2D.setPaint(Color.WHITE);
    g2D.fill(rectangulo);



    Ellipse2D elipse = new Ellipse2D.Double();
    g2D.setPaint(Color.RED);
    elipse.setFrame(rectangulo);
    g2D.draw(elipse);

    g2D.setPaint(verdeAguaMarina);
    g2D.fill(elipse);

}
}