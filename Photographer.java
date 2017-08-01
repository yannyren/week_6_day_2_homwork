import java.util.*;


public class Photographer {

  private ArrayList<Camera> camera;
  private HashMap<String, String> journal;


  public Photographer(){
    this.camera = new ArrayList<Camera>();
    this.journal = new HashMap<String, String>();
  }

  public void addCamera(Camera camera) {
    this.camera.add(camera);
  }

  public void removeCamera(Camera camera) {
    this.camera.remove(camera);
  }

  public String count() {
    return this.camera.size;
  }

  public String printAllDetails() {
    for (i = 0; i < camera.size; i++) {
      return camera[i].printAllDetails();
    }
  }

  public String numberOfPhotos() {
    return journal.size();
  }

}