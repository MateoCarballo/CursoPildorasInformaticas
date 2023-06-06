package graficos;
import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {
    public static void main(String[] args) {
        MarcoCentrado miMarcoCentrado = new MarcoCentrado();
    }
}

    class  MarcoCentrado extends JFrame {

    public MarcoCentrado(){
        setTitle("Mi marco centrado");

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height/2;
        int anchoPantalla = tamanoPantalla.width/2;

        setSize(anchoPantalla,alturaPantalla);
        setLocation(tamanoPantalla.width/4,tamanoPantalla.height/4);
        Image miIcono= miPantalla.getImage("src//main//java//graficos//Prueba Icono.jpg");
        setIconImage(miIcono);
    }

    }
