package pattern.design.flyweight;

import java.awt.Color;

public class MyOval implements MyShape {

  private String label;
  
  
  
  public MyOval(String label) {
    super();
    this.label = label;
  }



  @Override
  public void draw(int x, int y, int width, int height, boolean fill, String font, Color color) {
    System.out.println("Oval with values drawn :: "+ x+", "+y+" , "+ width+", "+height+" , "+fill+" , "+font+" , "+color );

  }

}
