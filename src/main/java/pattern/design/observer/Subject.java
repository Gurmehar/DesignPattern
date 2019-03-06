package pattern.design.observer;

public interface Subject {
  
  public void notif();
  public void addObserver(Observer observer);
  public void removeObserver(Observer observer);

}
