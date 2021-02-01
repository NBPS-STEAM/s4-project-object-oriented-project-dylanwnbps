public class Monkey {
  private String size;
  private String mood;
  
  public Monkey(String mSize, String mMood) {
  	size = mSize;
    mood = mMood;
  }
  
  public Monkey(String mMood) {
  	mood = mMood;
    size = "Small"; // overloading constructor
  }
  
  public String getMood() {
    return mood;
  }
  
  public String getSize() {
    return size;
  }
      public void setMood(String newMood) {
    mood = newMood;
  }
  
  public void setSize(String newSize) {
  	size = newSize;
  }
}
