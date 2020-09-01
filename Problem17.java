package Set1;
import java.util.Scanner;
public class Problem17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Full Name");
        String name = scan.next();
        String initials = "";
        for(int i=0;i<name.length();i++){
            if(Character.isUpperCase(name.charAt(i)))
                initials+=name.charAt(i);
        }
        System.out.println(" The Initial for the Name "+name+" is "+initials);
    }
}
