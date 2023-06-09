package graficos;

import javax.swing.*;
import java.awt.*;

public class Generales {

}

// Mi idea es tener las clases predefinidas ya para que sea mas rapido anhadir un marco
// una capa o cualquier componente que necesite

class MarcoCentradoPcCasa extends JFrame {
    public MarcoCentradoPcCasa(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = miPantalla.getScreenSize();
        setSize(500,500);
        setBounds(pantalla.width/4, pantalla.height/4,
	      pantalla.width/2,pantalla.height/2);

    }
}

class Lamina extends JPanel{

}