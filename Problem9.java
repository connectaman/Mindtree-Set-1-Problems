package Set1;
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check Prime or Not ");
        long num = scan.nextLong();
        System.out.println(isPrime(num));
    }
    private static boolean isPrime(long num) {
        if(num == 0 || num == 1){
            return false;
        }
        else{
            for(long i = 2; i <= num/2; ++i)
            {
                if(num % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
