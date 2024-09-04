import java.util.Scanner;

class Grader {
    private int score;

    
    public Grader(int score) {
        this.score = score;
    }

    
    public String letterGrade() {
        if (score >= 90 && score <= 100) {
            return "O"; 
        } else if (score >= 80 && score < 90) {
            return "E"; 
        } else if (score >= 70 && score < 80) {
            return "A"; 
        } else if (score >= 60 && score < 70) {
            return "B"; 
        } else if (score >= 50 && score < 60) {
            return "C"; 
        } else {
            return "F"; 
        }
    }
}

public class GraderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Score must be between 0 and 100.");
        } else {
            
            Grader grader = new Grader(score);

            
            String grade = grader.letterGrade();
            System.out.println("Letter grade: " + grade);
        }

        scanner.close();
    }
}