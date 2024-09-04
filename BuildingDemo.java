class Building {
  protected String address;
  protected int floors;

  public Building(String address, int floors) {
      this.address = address;
      this.floors = floors;
  }

  public void display() {
      System.out.println("Address: " + address);
      System.out.println("Number of floors: " + floors);
  }
}

class Office extends Building {
  private int telephones;
  private int tables;

  public Office(String address, int floors, int telephones, int tables) {
      super(address, floors);
      this.telephones = telephones;
      this.tables = tables;
  }

  public void display() {
      super.display();
      System.out.println("Number of telephones: " + telephones);
      System.out.println("Number of tables: " + tables);
  }
}

class House extends Building {
  private int bedrooms;
  private int bathrooms;

  public House(String address, int floors, int bedrooms, int bathrooms) {
      super(address, floors);
      this.bedrooms = bedrooms;
      this.bathrooms = bathrooms;
  }

  public void display() {
      super.display();
      System.out.println("Number of bedrooms: " + bedrooms);
      System.out.println("Number of bathrooms: " + bathrooms);
  }
}

public class BuildingDemo {
  public static void main(String[] args) {
      Office office = new Office("123 Main St", 5, 20, 50);
      House house = new House("456 Elm St", 2, 3, 2);

      System.out.println("Office details:");
      office.display();

      System.out.println("\nHouse details:");
      house.display();
  }
}
