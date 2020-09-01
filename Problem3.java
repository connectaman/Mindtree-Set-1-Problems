package Set1;
import java.util.Scanner;
public class Problem3 {
    public static int count = 0;
    public static void hailStrome(int num)
    {
        if(num==1){
            System.out.println("There are total "+count+" steps to reach "+num);
        }else if(num%2==0){
            count++;
            int next = num/2;
            System.out.println(num+" is even so i take half: "+next);
            hailStrome(next);
        }else if(num%2!=0){
            count++;
            int next = (3*num)+1;
            System.out.println(num+" is odd so i take 3n+1: "+next);
            hailStrome(next);
        }else{
            return;
        }
    } public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Positive Number to print HailStrom");
        int n = scan.nextInt();
        if(n!=0){
            hailStrome(n);
        }else{
            System.out.println("Wrong Input");
        }
    }
}
