package pattern.design.memento;

public class Originator {

  private String state;

  public void setState(String state) {
    this.state = state;
  }
  
  public Memento saveToMemento(){    
    
    return new Memento(state);
    
  }
  
  public void loadFromMemento(Memento memento){
    state=memento.getSavedState();
    System.out.println(state +" Post Restoration");
  }
  
}
