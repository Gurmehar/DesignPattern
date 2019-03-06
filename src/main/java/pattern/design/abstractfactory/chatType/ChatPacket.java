package pattern.design.abstractfactory.chatType;

import pattern.design.abstractfactory.enums.PsychometricChatDto;

public interface ChatPacket {

  PsychometricChatDto getFirstPacket();
  PsychometricChatDto getNextPacket(String scenarioId);
}
