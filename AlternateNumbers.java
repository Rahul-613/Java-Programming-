public class AlternateNumbers {
  public static void printAlternateNumbers(int[] array) {
      for (int i = 0; i < array.length; i += 2) {
          System.out.print(array[i] + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      System.out.println("Alternate numbers:");
      printAlternateNumbers(numbers);
  }
}
