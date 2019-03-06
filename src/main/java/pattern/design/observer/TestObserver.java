package pattern.design.observer;

import java.util.LinkedList;

public class TestObserver {
  
  public static void main(String[] args) {
    TempratureSubject subject= new TempratureSubject(new LinkedList<Observer>(), 32.9f);
    
    subject.addObserver(new TempratureObserver());
    subject.addObserver(new TempratureObserver2());
    subject.changetemp(99.7f);
  }

}
