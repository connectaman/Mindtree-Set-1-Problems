package Set1;
import java.util.Scanner;
public class Problem6 {
    public static void displayName(String name){
        System.out.println("Hello, "+name+"!");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name : ");
        displayName(scan.nextLine());
    }
}
