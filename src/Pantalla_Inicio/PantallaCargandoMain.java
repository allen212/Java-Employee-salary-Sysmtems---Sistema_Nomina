
package Pantalla_Inicio;

import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;

public class PantallaCargandoMain {

  PantallaCargando_q screen;

  public PantallaCargandoMain() {
    inicioPantalla();
	screen.velocidadDeCarga();
  }

  private void inicioPantalla() {
    ImageIcon myImage = new ImageIcon("imagen/balan_terminado_copy.gif");
    screen = new PantallaCargando_q(myImage);
    screen.setLocationRelativeTo(null);
    screen.setProgresoMax(100);
    screen.setVisible(true);
  }

  public static void main(String[] args)
  {
    new PantallaCargandoMain();
  }
}