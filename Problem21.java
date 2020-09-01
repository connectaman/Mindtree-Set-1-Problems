package Set1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Problem21 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the USN : ");
            String usn = scan.next();
            boolean isUsnValid = false;
            Pattern p = Pattern.compile("[1-2][A-Z][A-Z][0-9][0-9](CS|IS|EC|ME)[0-9][0-9][0-9]");
            Matcher m = p.matcher(usn);
            if(m.matches()){
                isUsnValid = true;
            }
            if(isUsnValid)
                System.out.println("The USN is Valid");
            else
                System.out.println("The USN is not Valid");
        }
}
