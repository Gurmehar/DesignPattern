package pattern.design.command;

import java.util.LinkedList;
import java.util.List;

public class Switch {
  List<Command> commandHistory= new LinkedList<Command>();
  
  public void storeAndExecute(Command cmd){
    commandHistory.add(cmd);
    cmd.execute();
    }

}
