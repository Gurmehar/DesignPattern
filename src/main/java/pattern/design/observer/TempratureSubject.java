package pattern.design.observer;

import java.util.LinkedList;
import java.util.List;

public class TempratureSubject implements Subject {

  private List<Observer> _list= new LinkedList<>();
  private float temp=0.0f;
  
  
  
  public TempratureSubject(List<Observer> _list, float temp) {
    super();
    this._list = _list;
    this.temp = temp;
    notif();
  }
  
  public void changetemp(float temp){
    this.temp=temp;
    notif();
  }

  @Override
  public void notif() {
    for (Observer observer : _list) {
      observer.getDataFromSubject(temp);
    }
    
  }
  
  @Override
  public void addObserver(Observer observer){
    _list.add(observer);
  }
  @Override
  public void removeObserver(Observer observer){
    _list.remove(observer);
  }
  

}
