package Set1;
import java.util.Scanner;
public class Problem19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String fname = scan.nextLine();
        System.out.println("Enter the Second Name");
        String sname = scan.nextLine();
        String fnamechange = fname.substring(0,fname.lastIndexOf(" ")) +
                sname.substring(sname.lastIndexOf(" "));
        String snamechange = sname.substring(0,sname.lastIndexOf(" ")) +
                fname.substring(fname.lastIndexOf(" "));
        System.out.println(fnamechange);
        System.out.println(snamechange);
    }
}
