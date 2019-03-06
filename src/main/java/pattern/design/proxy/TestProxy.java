package pattern.design.proxy;

import java.net.MalformedURLException;
import java.net.URL;

public class TestProxy {
  public static void main(String[] args) throws MalformedURLException {
     Image img1= new ProxyImage(new URL("https://images.pexels.com/photos/67636/rose-blue-flower-rose-blooms-67636.jpeg?cs=srgb&dl=beauty-bloom-blue-67636.jpg&fm=jpg"));
     Image img2= new ProxyImage(new URL("https://www.pexels.com/photo/assorted-beauty-blur-business-457702/"));
     Image img3= new ProxyImage(new URL("https://images.pexels.com/photos/67636/rose-blue-flower-rose-blooms-67636.jpeg?cs=srgb&dl=beauty-bloom-blue-67636.jpg&fm=jpg"));
     Image img4= new RealImage(new URL("https://www.pexels.com/photo/assorted-beauty-blur-business-457702/"));
     
     img1.showImage();
    
  }
}
