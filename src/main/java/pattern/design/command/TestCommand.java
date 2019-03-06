package pattern.design.command;

public class TestCommand {
 public static void main(String[] args) {
  Switch switch1 = new Switch();
  AirConditioner ac= new AirConditioner();
  
  Command onCommand=new StartCommand(ac);
  Command offCommand = new StopCommand(ac);
  switch1.storeAndExecute(onCommand);
  switch1.storeAndExecute(offCommand);
  System.out.println(switch1.commandHistory);
  
}
}
