package pattern.design.observer;

public class TempratureObserver2 implements Observer {

  @Override
  public void getDataFromSubject(float temp) {
     System.out.println(this.getClass() +" -- "+ temp);

  }

}
