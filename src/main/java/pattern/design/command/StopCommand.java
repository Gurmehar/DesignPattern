package pattern.design.command;

public class StopCommand implements Command {
  
  private AirConditioner ac;
  
  

  public StopCommand(AirConditioner ac) {
   
    this.ac = ac;
  }



  @Override
  public void execute() {
    ac.stop();

  }



  @Override
  public String toString() {
    return "StopCommand [ac=" + ac + "]";
  }

}
