package pattern.design.command;

public class StartCommand implements Command {
  
  private AirConditioner ac;
  
  

  public StartCommand(AirConditioner ac) {
    this.ac = ac;
  }



  @Override
  public void execute() {
    ac.start();

  }



  @Override
  public String toString() {
    return "StartCommand [ac=" + ac + "]";
  }
  
  

}
