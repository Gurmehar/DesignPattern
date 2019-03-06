package pattern.design.factory;

public class ChatFactory {
  
  public ChatPacket getChatPacket(String packetType){
    ChatPacket chatPacket =null;
    if(packetType.equalsIgnoreCase("text")){
      chatPacket=new TextChat();
    }
    
    if(packetType.equalsIgnoreCase("open")){
      chatPacket=new OpenChat();
    }
    
    if(packetType.equalsIgnoreCase("closed")){
      chatPacket=new ClosedChat();
    }
    
    return chatPacket;
    
  }

}
