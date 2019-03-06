package pattern.design.abstractfactory;

import pattern.design.abstractfactory.chatType.ChatPacket;
import pattern.design.abstractfactory.chatType.ExperienceChat;
import pattern.design.abstractfactory.chatType.WelcomeChat;
import pattern.design.abstractfactory.enums.ChatType;

public class ChatFactory {
  
 public ChatPacket getChatPacket(ChatType chatType){
   ChatPacket chatPacket=null;
   if(chatType.equals(ChatType.Psychometric)){
     chatPacket= new ExperienceChat();
   }else{
     chatPacket=new WelcomeChat();
   }
   return chatPacket;
 }

}
