package pattern.design.memento;

public class TestMemento {

  public static void main(String[] args) {
    Caretaker caretaker= new Caretaker();
    Originator originator= new Originator();
    
    originator.setState("1");
    caretaker.addMemento(originator.saveToMemento());
    
    originator.setState("2");
    caretaker.addMemento(originator.saveToMemento());
    
    
    originator.setState("3");
    caretaker.addMemento(originator.saveToMemento());
    
    
    originator.loadFromMemento(caretaker.getMemento(0));
    
    originator.loadFromMemento(caretaker.getMemento(2));
    
    originator.loadFromMemento(caretaker.getMemento(1));
    
  }
  
  
}
