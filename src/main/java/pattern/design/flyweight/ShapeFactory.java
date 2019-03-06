package pattern.design.flyweight;

import java.util.HashMap;
import java.util.Map;


public class ShapeFactory {

  private static final Map<String,MyShape> shapeMap= new HashMap<String,MyShape>();
  
  public static MyShape getShape(String label){
    
    if(shapeMap.containsKey(label)){
      return shapeMap.get(label);
    }
    MyShape myShape=null;
    if(label.equals("R")){
      myShape= new MyRect(label);
    }else if(label.equals("O")){
      myShape= new MyOval(label);
    }
    shapeMap.put(label, myShape);
    
    return  myShape;
  }
  
}
