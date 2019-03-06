package pattern.design.proxy;

import java.net.URL;

public class RealImage implements Image {

  private URL url;
  
  
  
  public RealImage(URL url) {
    super();
    this.url = url;
    loadImage();
  }



  @Override
  public void showImage() {
    System.out.println("Image Displayed");

  }



  private void loadImage() {
    System.out.println("Load Image using URL Class"+this.url);
    
  }

}
