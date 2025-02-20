package figura;

import java.awt.Color;
import java.awt.Graphics;

public class Figura extends Operation {
    
    public Figura(){
        
    }
    
    public void drawCircle(Graphics graphic,int x, int y, int r, int g, int b, int width) {
      graphic.setColor(new Color(r,g,b));
      graphic.fillOval(x, y, width, width);
    }
    
}
