package pattern.design.observer;

public class TempratureObserver implements Observer {

  @Override
  public void getDataFromSubject(float temp) {
   System.out.println(this.getClass() +" -- "+ temp);

  }

}
