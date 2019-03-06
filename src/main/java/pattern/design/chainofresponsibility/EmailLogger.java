package pattern.design.chainofresponsibility;

public class EmailLogger extends Logger {
  

  
  
  

  public EmailLogger(int mask) {
   
    this.mask = mask;
  }




  @Override
  protected void writeMessage(String msg) {
    System.out.println(this.getClass()+" :: "+msg);

  }

}
