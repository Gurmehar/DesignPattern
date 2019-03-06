package pattern.design.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
  private List<Memento> _list = new ArrayList<Memento>();

  public void addMemento(Memento memento) {
    _list.add(memento);
  }

  public Memento getMemento(int index) {
    return this._list.get(index);
  }

}
