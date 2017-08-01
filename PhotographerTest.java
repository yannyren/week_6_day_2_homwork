import static org.junit.Assert.*;

import org.junit.*;

public class PhotographerTest {

  // ArrayList<Camera> camera;
  DigitalCamera digitalcamera;
  AnalogCamera analogcamera;
  Photographer photogapher;

  @Before 
  public void before() {
    digitalcamera = new DigitalCamera("Nikon 34T", "Noise reduction filter", "Hi-resolution");
    analogcamera = new AnalogCamera("Sony ILCE5100L", "No noise reduciton", "Lo-resolution"); 
    photogapher = new Photographer();
  }

  @Test
  public void cameraCollectionStartEmpty() {
    String size = photographer.size;
    assertEquals(0, size);
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(digitalcamera);
    assertEquals(1, photographer.count());
  }

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(camera);
    photographer.removeCamera(camera);
    assertEquals(0, photogapher.count);

  }

  // @Test
  // public void canPrintAllDetails(){
    
  // }


}