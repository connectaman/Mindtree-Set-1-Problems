package Set1;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting index");
        int start = scan.nextInt();
        System.out.println("Enter ending index");
        int end = scan.nextInt();
        System.out.println(" Series of Prime Number between "+start+" and "+end+" are :");
        for(int i=start;i<=end;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    private static boolean isPrime(int num) {
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
