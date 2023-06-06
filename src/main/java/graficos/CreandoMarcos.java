package graficos;

import javax.swing.*;
// VIDEO SWING 
public class CreandoMarcos {
    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); }
} class miMarco extends JFrame {
    public miMarco() {
        setSize(500,300);
    }
}

/*
ESTE CODIGO FUNCIONA DE LA MISMA FORMA QUE EL DE ARRIBA ES
OTRA FORMA DE HACERLO


public class CreandoMarcos {
    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
         }
} class miMarco extends JFrame {
    public miMarco() {
        setSize(500,300);
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

 */