import java.util.*;

public class Student_Grade_Calculator {
    public static void main(String[] args) {

        // Take input form user
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Marks subject_1: ");
        int sub_1 = s.nextInt();
        System.out.print("Enter Marks subject_2: ");
        int sub_2 = s.nextInt();
        System.out.print("Enter Marks subject_3: ");
        int sub_3 = s.nextInt();
        System.out.print("Enter Marks subject_4: ");
        int sub_4 = s.nextInt();
        System.out.print("Enter Marks subject_5: ");
        int sub_5 = s.nextInt();

        int total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        int percentage = total / 5;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        }
        else if (percentage >= 70) {
            grade = 'B';
        }
        else if (percentage >= 50) {
            grade = 'C';
        }
        else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Display Result");
        System.out.println("Total marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Your grade is : " + grade);

    }
}