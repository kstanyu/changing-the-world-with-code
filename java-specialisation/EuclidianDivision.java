
import java.util.Scanner;

public class EuclidianDivision {

public static int euclidDiv(int num1, int num2) {
    int small, diff, gcd;
    if ((num1 > num2) && (num1 != num2)) {
        small = num2;
        diff = num1 - small;
        gcd = euclidDiv(diff,small);
    } else if (num1 == num2) {
        gcd = small = num2;
    } else {
        small = num1;
        diff = num2 - small;
        gcd = euclidDiv(diff, small);
    }
    
    return gcd;
} 

    public static void main(String [] args) {
    int num1, num2;
    Scanner scan = new Scanner(System.in);    

    System.out.println("Enter first number: ");
    num1 = scan.nextInt();
    System.out.println("Enter Second number: ");
    num2 = scan.nextInt();
    System.out.println(euclidDiv(num1, num2));
    
    }
}

