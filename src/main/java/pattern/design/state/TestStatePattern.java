package pattern.design.state;

public class TestStatePattern {

  
  public static void main(String[] args) {
    
    MusicPlayerContextInterface musicPlayer = new MusicPlayerContext(new StandByState());
    musicPlayer.requestPlay();
    //musicPlayer.setState(new PlayState());
    musicPlayer.requestPlay();
    musicPlayer.setState(new RecordState());
    musicPlayer.requestPlay();
    musicPlayer.requestPlay();
  }
  
  
}
