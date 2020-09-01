package Set1;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to print the Multiplication Number");
        int num = scan.nextInt();
        for (int i=1;i<=12;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
