package Set1;
import java.util.Scanner;
// Program to find Factorial of a Number
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to calculate the Factorial");
        int value = scan.nextInt();
        long factorial = 1;
        for(int i=value;i>=1;i--){
            factorial*=i;
        }
        System.out.println("Factorial of a Given Number is "+factorial);
    }
}
