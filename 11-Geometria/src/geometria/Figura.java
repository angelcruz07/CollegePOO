package geometria;

import java.awt.Color;
import java.awt.Graphics;

public class Figura extends Operation {
    
  public Figura() {

  }
 
  public void drawLine(Graphics line, int x1, int x2, int y1, int y2, int R, int G, int B) {
    line.setColor(new Color(R, G, B));
    line.drawLine(x1, x2, y1, y2);
  }
  
  public void circle(Graphics graphic,int x, int y, int r, int g, int b, int width) {
      graphic.setColor(new Color(r,g,b));
      graphic.fillOval(x, y, width, width);
  }

}
