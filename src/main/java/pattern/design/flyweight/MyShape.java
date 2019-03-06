package pattern.design.flyweight;

import java.awt.Color;

public interface MyShape {
  
  public void draw(int x,int y,int width, int height,boolean fill,String font,Color color);

}
