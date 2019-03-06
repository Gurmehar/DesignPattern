package pattern.design.state;

public interface MusicPlayerContextInterface {
  
 // public State state;
  
  public void setState(State state);
  
  public State getState();
  
  public void requestPlay();
  

}
