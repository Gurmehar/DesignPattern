package pattern.design.chainofresponsibility;

public class StderrLogger extends Logger {
  
  
  

  public StderrLogger(int mask) {
   
    this.mask = mask;
  }



  @Override
  protected void writeMessage(String msg) {
    System.out.println(this.getClass()+" :: "+msg);

  }

}
