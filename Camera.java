public class Camera {

  private String name;
  private String filterType;
  private String resolution;

  public Camera(String name, String filterType, String resolution) {
    this.name = name;
    this.filterType = filterType;
    this.resolution = resolution;
  }

  public String printDetails(){
    return this.name +" " + this.filterType + " " + this.resolution;
  }

}