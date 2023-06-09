package graficos;

import javax.swing.*;

public class PruebaFuentes {
    public static void main(String[] args) {
        Marco miMarco = new Marco();
    }

}
class Marco extends JFrame{
    public Marco(){
        setTitle("Prueba Fuentes");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaFuentes miLamina = new LaminaFuentes();
        add(miLamina);
    }
}

class LaminaFuentes extends JPanel{

}
