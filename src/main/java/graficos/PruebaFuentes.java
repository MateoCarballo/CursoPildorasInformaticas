package graficos;

import javax.swing.*;
import java.awt.*;

public class PruebaFuentes {
    public static void main(String[] args) {
        Marco miMarco = new Marco();
    }

}
class Marco extends MarcoCentradoPcCasa{
    public Marco(){
        setTitle("Prueba Fuentes");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaFuentes miLamina = new LaminaFuentes();
        add(miLamina);
        miLamina.setForeground(Color.RED);
        /*
        Esta instruccion hace que t0do lo que escribamos lleve este color
        Si se setea mas adelante otro color lo cambiara hasta que lo volvamos
        a setear.
         */

    }
}

class LaminaFuentes extends JPanel{
public void paintComponent(Graphics g ){
    Graphics2D g2 = (Graphics2D) g;
    Font fuenteArial = new Font("Arial",Font.BOLD,20);
    Font fuenteCurier = new Font("Curier",Font.BOLD,25);

    g2.setFont(fuenteArial);
    g2.drawString("Escrito con Arial en 'Bolt' y color por defecto ",100,100);
    g2.setFont(fuenteCurier);
    g2.setColor(Color.RED.brighter());
    g2.drawString("Escrito con Curier en 'Bold' y color rojo ",100,200);
    g2.setFont(fuenteArial);
    g2.setColor(Color.BLACK.darker());
    g2.drawString("Escrito de nuevo en 'Bolt' y color por defecto ",100,300);
    g2.drawString("Escrito de nuevo en 'Bolt' y color por defecto ",100,300);




}
/*


 */
}
