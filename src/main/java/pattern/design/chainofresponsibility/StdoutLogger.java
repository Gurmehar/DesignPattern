package pattern.design.chainofresponsibility;

public class StdoutLogger extends Logger {

   
  
  public StdoutLogger(int mask) {
    this.mask = mask;
  }



  @Override
  protected void writeMessage(String msg) {
    System.out.println(this.getClass()+" :: "+msg);

  }

}
