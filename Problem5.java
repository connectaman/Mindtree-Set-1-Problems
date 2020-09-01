package Set1;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter size of first Array ");
        int a_size = scan.nextInt();
        System.out.println(" Enter size of second Array ");
        int b_size = scan.nextInt();
        int[] first = new int[a_size];
        int[] second = new int[b_size];
        System.out.println(" Enter the first Array ");
        for (int i = 0; i < a_size; i++) {
            first[i] = scan.nextInt();
        }
        System.out.println(" Enter the second Array ");
        for (int i = 0; i < b_size; i++) {
            second[i] = scan.nextInt();
        }
        int len = (a_size >= b_size) ? a_size : b_size;
        int[] sum = new int[len];
        if (a_size < b_size) { // 3 < 5
            for (int i = 0; i < a_size; i++) {
                sum[i] = first[i] + second[i];
            }
            for (int i = a_size; i < len; i++) {
                sum[i] = second[i];
            }
        } else if (a_size > b_size) {
            for (int i = 0; i < b_size; i++) {
                sum[i] = first[i] + second[i];
            }
            for (int i = b_size; i < len; i++) {
                sum[i] = first[i];
            }
        }  else {
                    for (int i = 0; i < len; i++) {
                        sum[i] = first[i] + second[i];
                    }
                }
                System.out.println(" The Sum Array : ");
                for (int temp : sum) {
                    System.out.print(temp + " ");
                }
    }
}
