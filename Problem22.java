package Set1;
import java.util.Scanner;
public class Problem22 {
    public static String reverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<sb.length();i++) {
            if(Character.isLetter(sb.charAt(i))) {
                int k = i;
                while(k < sb.length() && Character.isLetter(sb.charAt(k)))
                    k++;
                if(k-i > 1) {
                    StringBuffer sb1 = new StringBuffer(sb.substring(i,k));
                    sb1.reverse();
                    sb.replace(i,k,new String(sb1));
                    i = k;
                }
                k--;
            }
        }
        return new String(sb);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence to reverse : ");
        String str = scan.nextLine();
        System.out.println(reverse(str));
    }
}
