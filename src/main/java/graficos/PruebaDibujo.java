package graficos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoConDibujos extends JFrame{
    public MarcoConDibujos(){
        setTitle("Prueba de Dibujo");

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = miPantalla.getScreenSize();

        setBounds(pantalla.width/4, pantalla.height/4,
                pantalla.width/2,pantalla.height/2);
        LaminaConFiguras miLamina =new LaminaConFiguras();
        add(miLamina);
    }
}
class LaminaConFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        /*
        Graphics 2D es abstracta casteamos hacia Graphics2D e intanciamos
         como Rectangle2D
         */
        Graphics2D g2 = (Graphics2D) g;
        //No instanciamos directamente la clase Rectangle2D sino la clase Rectangle2D.Double
        //                                           POS. EN PANTALLA--DIMENSIONES DEL RECTANGULO
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        // Esta libreria es mas potente que la anterior. Tiene mas funciones.
        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        //Podemos instanciar directamente para ahorrar lineas de codigo
        g2.draw(new Line2D.Double(100,100,300,250 ));

        double centroX= rectangulo.getCenterX();
        double centroY= rectangulo.getCenterY();
        double radio = 150;

        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX,centroY,
                centroX+radio,centroY+radio);
        g2.draw(circulo);
        /* USADO EN EL VIDEO ANTERIOR
        //Dibuja un rectangulo
        g.drawRect(50,50,200,200);
        //Dibuja una linea
        g.drawLine(50,400,600,100);
        //Dibuja un arco abierto abajo
        g.drawArc(50,50,200,200,0,180);
        //Arco abierto arriba
        g.drawArc(50,50,200,200,180,180);
         */
    }
}

/*
public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoConDibujos extends JFrame{
    public MarcoConDibujos(){
        setTitle("Prueba de Dibujo");
        // instanciando este objeto podemos trabajar con las medidas de la pantalla
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = miPantalla.getScreenSize();

        setBounds(pantalla.width/4, pantalla.height/4,
                pantalla.width/2,pantalla.height/2);
        LaminaConFiguras miLamina =new LaminaConFiguras();
        add(miLamina);
    }
}
class LaminaConFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Dibuja un rectangulo
        g.drawRect(50,50,200,200);
        //Dibuja una linea
        g.drawLine(50,400,600,100);
        //Dibuja un arco abierto abajo
        g.drawArc(50,50,200,200,0,180);
        //Arco abierto arriba
        g.drawArc(50,50,200,200,180,180);
    }
}
 */