package pattern.design.abstractfactory;

import pattern.design.abstractfactory.chatType.ChatPacket;
import pattern.design.abstractfactory.enums.ChatType;

public class Main {
  
  public Main() {
    // TODO Auto-generated constructor stub
  }
  public static void main(String[] args) {
    ChatFactory obj = new ChatFactory();
    ChatPacket chatPacket=obj.getChatPacket(ChatType.OpenText);
    System.out.println(chatPacket.getFirstPacket());
  }

}
