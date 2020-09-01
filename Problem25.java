package Set1;
import java.util.Scanner;
public class Problem25 {
    public static void printTriplets(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                //if(i!=j){
                if(findElement(arr,arr[i]+arr[j])){
                    System.out.println("< "+arr[i]+" , "+arr[j]+" , "+(arr[i]+arr[j])+" >");
                }
                // }
            }
        }
    }
    private static boolean findElement(int[] data, int key) {
        int low = 0;
        int high = data.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(data[mid]==key){
                return true;
            }else if(data[mid]>key){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n = scan.nextInt();
        System.out.println(" Enter the array elements in ascending order : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(" Printing the Triplets : ");
        printTriplets(arr);
    }
}
