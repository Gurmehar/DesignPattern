package pattern.design.chainofresponsibility;

public class TestChainOfResponsibilites {
  
  public static void main(String[] args) {
    Logger logger1,logger2,logger3;
    logger1=new StdoutLogger(Logger.DEBUG);
    logger2= logger1.setNext(new StderrLogger(Logger.ERR));
    logger3=logger2.setNext(new EmailLogger(Logger.NOTICE));
    
    logger1.message("Test Log1", Logger.DEBUG);
    logger1.message("Test Log Notice", Logger.NOTICE);
    logger1.message("Test Log ERR ", Logger.ERR);
  }

}
