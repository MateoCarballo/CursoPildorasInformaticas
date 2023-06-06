package graficos;

import javax.swing.*;
// VIDEO SWING
public class CreandoMarcos {
    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
         }
} class miMarco extends JFrame {

    public miMarco() {
        //Visibilidad
        setVisible(true);
        // Permitir redimensionar la ventana
        // * setResizable(false); *

        //Permitir la apertura a pantalla completa equivalente al numero 6
        // setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Operacion a realizar al cerrar la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setBound engloba a setLocation y setSize
        setBounds(500,300,500,500);
        // Declaramos titulo para la ventana
        setTitle("Mi Programa");
    }
}