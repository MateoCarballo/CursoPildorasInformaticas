package graficos;
import java.awt.*;
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