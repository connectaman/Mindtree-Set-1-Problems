package Set1;
import java.util.Scanner;
public class Problem18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First name : ");
        String fname = scan.next();
        System.out.println("Enter Middle name : ");
        String mname = scan.next();
        System.out.println("Enter Last name : ");
        String lname = scan.next();
        System.out.println("Enter the age : ");
        int age = scan.nextInt();
        String password = "";
        password+= fname.charAt(0)+""+mname.charAt(0)+""+lname.charAt(0)+""+Integer.toString(age);
        System.out.println("Your password is : "+password);
    }
}
