package Set1;
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements of array ");
        int n = scan.nextInt();
        int[] data = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            data[i] = scan.nextInt();
        }
        System.out.println("Enter the key element to be searched ");
        int key = scan.nextInt();
        System.out.println(isPresent(data,key));
    }
    private static boolean isPresent(int[] data, int key) {
        for(int temp:data){
            if(temp==key)
                return true;
        }
        return false;
    }
}
