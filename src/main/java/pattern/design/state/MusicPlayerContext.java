package pattern.design.state;

public class MusicPlayerContext implements MusicPlayerContextInterface {

  State state;
  
  
  public MusicPlayerContext(State state) {
    super();
    this.state = state;
  }

  @Override
  public void setState(State state) {
    this.state=state;
  }

  @Override
  public State getState() {
    // TODO Auto-generated method stub
    return this.state;
  }

  @Override
  public void requestPlay() {
    this.state.doAction(this);

  }

}
