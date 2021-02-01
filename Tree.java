public class Tree {
  private double height;
  private String type;
  private static int treeCount = 0; // static variable
  
  public Tree(double mHeight, String mType) {
  	height = mHeight;
    type = mType;
    treeCount += 1;
  }
  
  public Tree(double mHeight) { // lines 96-106 are overloading constructors
  	height = mHeight;
    type = "Cypress";
    treeCount++;
  }
  
  public Tree(String mType) {
  	type = mType;
    height = 60;
    treeCount++;
  }
 
  public static int getTreeCount() { // static method 
  	return treeCount;
  }
  
  public double getHeight() {   // appropriate accessor methods (getters)
    return height;
  }
  
  public String getType() {
  	return type;
  }
  
  public void setHeight(double newHeight) { // appropriate mutator methods (setters)
    height = newHeight;
  }
  
  public void setType(String newType) {
  	type = newType;
  }
 
}