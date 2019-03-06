package pattern.design.proxy;

import java.net.URL;

public class ProxyImage implements Image {

  private URL url;
  
  
  @Override
  public void showImage() {
    RealImage real = new RealImage(url);
    real.showImage();
        
  }


  public ProxyImage(URL url) {
    super();
    this.url = url;
  }

}
