import java.util.*;

public class funcAverage {

    public static int avg(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum / 3;
    }

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter the second Number: ");
        num2 = sc.nextInt();

        System.out.println("Enter the third Number: ");
        num3 = sc.nextInt();

        int average = avg(num1, num2, num3);
        System.out.println("The average is: " + average);

    }
}
