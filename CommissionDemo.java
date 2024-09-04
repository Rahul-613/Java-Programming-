import java.util.Scanner;

class Commission {
    private double sales;

    // Constructor
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate commission
    public double commission() {
        if (sales < 0) {
            return -1; // Invalid input
        } else if (sales <= 1000) {
            return 0.05 * sales; // 5% commission
        } else if (sales <= 5000) {
            return 0.08 * sales; // 8% commission
        } else {
            return 0.1 * sales; // 10% commission
        }
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read sales from the user
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        // Validate sales
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object
            Commission commission = new Commission(sales);

            // Get and print the commission
            double commissionAmount = commission.commission();
            if (commissionAmount == -1) {
                System.out.println("Invalid Input");
            } else {
                System.out.println("Commission: $" + commissionAmount);
            }
        }

        scanner.close();
    }
}