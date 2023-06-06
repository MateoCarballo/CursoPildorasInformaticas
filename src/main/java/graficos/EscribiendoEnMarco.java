package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setVisible(true);
        // Unifica setSize y setLocation
        //↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
        setBounds(400,200,600,450);
        setTitle("Primer texto");
        //Instanciamos una lamina de trabajo
        Lamina miLamina = new Lamina();
        // La anadimos al marco
        add(miLamina);
    }
}

class Lamina extends JPanel{

    public void paintComponent(Graphics g){
        // Aqui le decimos que haga su trabajo default ↓
        super.paintComponent(g);
        // y ademas esta instruccion ↓
        //Distancias desde la esquina superior izquierda ↓      ↓
        g.drawString("Estamos aprendiendo SWING",100,100);
    }
}