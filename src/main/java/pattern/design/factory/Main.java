package pattern.design.factory;

import java.util.Scanner;

public class Main {
  public Main() {
   System.out.println("constructor called");
  }
  public static void main(String[] args) {
    ChatFactory obj= new ChatFactory();
   Scanner scanner = new Scanner(System.in);
    ChatPacket cp=obj.getChatPacket(scanner.nextLine());
    if(cp!=null)
    System.out.println(cp.getPacket());
  }

}
