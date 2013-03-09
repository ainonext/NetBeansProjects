
package applet;
import java.applet.*;
import java.awt.*;

/*
 <applet code="SimpleApplet" width=200 height=60>
 * </applet>
 */
/**
 *
 * @author Aiharo
 */
public class SimpleApplet extends Applet {
  
    @Override
         public void paint(Graphics g) {
        g.drawString("Java makes applets easy", 20,20);
    }}
