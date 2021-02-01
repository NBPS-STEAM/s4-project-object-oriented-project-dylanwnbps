public class Monkey {
  private String size;
  private String mood;
  
  public Tree(String mSize, String mMood) {
  	size = mSize;
    mood = mMood;
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
