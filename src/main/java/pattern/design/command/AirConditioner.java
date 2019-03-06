package pattern.design.command;

public class AirConditioner {
  
  public void start(){
    System.out.println("AC started");
  }
  
  public void stop(){
    System.out.println("Ac is stopped ..");
  }

  @Override
  public String toString() {
    return "AirConditioner []";
  }
  
  
  

}
