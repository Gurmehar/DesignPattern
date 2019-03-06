package pattern.design.state;

public class StandByState implements State {

  @Override
  public void doAction(MusicPlayerContextInterface context) {    
    System.out.println(this.getClass()+"  taking action on Context");
    context.setState(new PlayState());
    System.out.println("State Chnaged to "+context.getState());
  }

}
