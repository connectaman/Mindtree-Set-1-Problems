package Set1;
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements of array ");
        int n = scan.nextInt();
        int[] data = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            data[i] = scan.nextInt();
        }
        for (int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println(" Array Element after sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(data[i]+" ");
        }
    }
}
