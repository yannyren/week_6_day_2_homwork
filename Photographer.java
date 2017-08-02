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

  public int count() {
    return this.camera.size();
  }

  public String printAllDetails() {
    String details = "";

    for (int i = 0; i < camera.size(); i++) {
      details += camera.get(i).printDetails();
    }

    return details;
  }

  public int numberOfPhotos() {
    return journal.size();
  }

}