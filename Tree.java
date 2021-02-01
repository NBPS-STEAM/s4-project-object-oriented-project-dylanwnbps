public class Tree {
  private double height;
  private String type;
  private static int treeCount = 0;
  
  public Tree(double mHeight, String mType) {
  	height = mHeight;
    type = mType;
    treeCount += 1;
  }
 
  public static int getTreeCount() {
  	return treeCount;
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




