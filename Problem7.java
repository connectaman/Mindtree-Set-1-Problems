package Set1;
import java.util.Scanner;
public class Problem7 {
    public static int GetMax(int a,int b,int c){
        return a > b ? ( a > c ? a : c) : (b > c ? b : c);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 integers to check the largets ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(" Largest Number : "+GetMax(a,b,c));
    }
}
