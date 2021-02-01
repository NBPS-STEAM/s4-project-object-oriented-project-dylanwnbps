public class Tree {
  private double height;
  private String type;
  
  public Tree(double mHeight, String mType) {
  	height = mHeight;
    type = mType;
  }
  
  public double getHeight() {
    return height;
  }
  
  public String getType() {
  	return type;
  }
  
  public void setHeight(double newHeight) {
    height = newHeight;
  }
  
  public void setType(String newType) {
  	type = newType;
  }
}