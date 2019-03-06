package pattern.design.abstractfactory.chatType;

import pattern.design.abstractfactory.enums.PsychometricChatDto;

public class WelcomeChat implements ChatPacket {

  @Override
  public PsychometricChatDto getFirstPacket() {
    // TODO Auto-generated method stub
    return new PsychometricChatDto();
  }

  @Override
  public PsychometricChatDto getNextPacket(String scenarioId) {
    // TODO Auto-generated method stub
    return new PsychometricChatDto();
  }

}
