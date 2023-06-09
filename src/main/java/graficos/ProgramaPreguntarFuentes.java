package graficos;

import javax.swing.*;
import java.awt.*;

public class ProgramaPreguntarFuentes {
    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        boolean estaLaFuente =false;
        String [] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String nombreFuente: nombreDeFuentes){
	  if (nombreFuente.equalsIgnoreCase(fuente)) {
	      estaLaFuente = true;
	      break;
	  }
        }
        if (estaLaFuente){
	  System.out.println("Fuente instalada");
        }else{
	  System.out.println("No esta la fuente");
        }
    }
}
