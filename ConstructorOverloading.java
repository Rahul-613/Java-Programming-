public class ConstructorOverloading {
  private int value;

  
  public ConstructorOverloading() {
      
      this.value = 0;
  }

  
  public ConstructorOverloading(int value) {
      
      this.value = value;
  }

  
  public int getValue() {
      return this.value;
  }

  public static void main(String[] args) {
      
      ConstructorOverloading obj1 = new ConstructorOverloading(); 
      ConstructorOverloading obj2 = new ConstructorOverloading(10); 

      
      System.out.println("Value initialized with default constructor: " + obj1.getValue());
      System.out.println("Value initialized with parameterized constructor: " + obj2.getValue());
  }
}