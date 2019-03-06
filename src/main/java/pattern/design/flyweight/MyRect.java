package pattern.design.flyweight;

import java.awt.Color;

public class MyRect implements MyShape {
  
  private String label;
  
  

  public MyRect(String label) {
    super();
    this.label = label;
  }



  @Override
  public void draw(int x, int y, int width, int height, boolean fill, String font, Color color) {
    System.out.println("Rectangle with values drawn :: "+ x+", "+y+" , "+ width+", "+height+" , "+fill+" , "+font+" , "+color );
  }

}
