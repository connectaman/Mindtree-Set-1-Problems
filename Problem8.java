package Set1;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit :");
        int digit = scan.nextInt();
        System.out.println(" Reverse : "+reverseDigit(digit));
    }
    private static int reverseDigit(int digit) {
        int rev = 0;
        while(digit!=0){
            int rem = digit % 10;
            rev=(rev*10)+rem;
            digit = digit/10;
        }
        return rev;
    }
}
