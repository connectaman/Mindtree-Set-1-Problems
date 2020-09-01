package Set1;
import java.util.Scanner;
public class Problem24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scan.next();
        // str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && (str.charAt(i) == str.charAt(i +
                    1)||str.charAt(i) == (str.charAt(i + 1)+32) || (str.charAt(i)+32) == str.charAt(i +
                    1))) {
                count++;
                i++;
            }
            System.out.print(str.charAt(i));
            System.out.print(count);
        }
    }
}
