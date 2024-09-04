class Building {
  protected int numberOfFloors;
  protected int numberOfRooms;
  protected double totalFootage;
  public Building(int numberOfFloors, int numberOfRooms, double totalFootage) {
      this.numberOfFloors = numberOfFloors;
      this.numberOfRooms = numberOfRooms;
      this.totalFootage = totalFootage;
  }
  public void displayInfo() {
      System.out.println("Number of Floors: " + numberOfFloors);
      System.out.println("Number of Rooms: " + numberOfRooms);
      System.out.println("Total Footage: " + totalFootage + " sq.ft");
  }
}
class House extends Building {
  private int numberOfBedrooms;
  private int numberOfBathrooms;
  public House(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfBedrooms, int numberOfBathrooms) {
      super(numberOfFloors, numberOfRooms, totalFootage);
      this.numberOfBedrooms = numberOfBedrooms;
      this.numberOfBathrooms = numberOfBathrooms;
  }
  public void displayInfo() {
      super.displayInfo();
      System.out.println("Number of Bedrooms: " + numberOfBedrooms);
      System.out.println("Number of Bathrooms: " + numberOfBathrooms);
  }
}
public class Buildingmain {
  public static void main(String[] args) {
      House myHouse = new House(2, 5, 2000.0, 3, 2);
      System.out.println("House Information:");
      myHouse.displayInfo();
  }
}
