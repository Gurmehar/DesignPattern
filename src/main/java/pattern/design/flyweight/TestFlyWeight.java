package pattern.design.flyweight;

import java.awt.Color;

public class TestFlyWeight {
  
  public static void main(String[] args) {
    MyShape  myshape = ShapeFactory.getShape("O");
    MyShape  myshape2 = ShapeFactory.getShape("R");
    MyShape  myshape3 = ShapeFactory.getShape("O");
    
    System.out.println(myshape.toString());
    System.out.println(myshape2.toString());
    System.out.println(myshape3.toString());
    myshape3.draw(5, 10, 15, 25, true, "Arial", Color.BLUE);
    myshape.draw(15, 100, 150, 215, false, "TimeNewRoman", Color.CYAN);
    
    myshape2.draw(5, 10, 15, 25, true, "Arial", Color.GREEN);
  }

}
