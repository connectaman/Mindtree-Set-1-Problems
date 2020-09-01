package Set1;
import java.util.Scanner;
public class Problem14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 1- Binary Search for Integers Elements ");
        System.out.println(" 2- Binary Search for String Elements ");
        System.out.println(" 3- Exit ");
        System.out.println("Enter your choice : ");
        int choice = scan.nextInt();
        System.out.println("Enter the input size : ");
        int size = scan.nextInt();
        switch (choice){
            case 1:
                int[] data = new int[size];
                System.out.println("Enter the Integer Elements ");
                for(int i=0;i<size;i++){
                    data[i]=scan.nextInt();
                }
                System.out.println("Enter the key element to be searched ");
                int key = scan.nextInt();
                System.out.println(findElement(data,key));
                break;
            case 2:
                String[] names = new String[size];
                System.out.println("Enter the Integer Elements ");
                for(int i=0;i<size;i++){
                    names[i]=scan.next();
                }
                System.out.println("Enter the key element to be searched ");
                String name = scan.next();
                System.out.println(findString(names,name));
                break;
        }
    }
    private static boolean findString(String[] names, String name) {
        int low = 0, high = names.length - 1;
        while (low <= high) {
            int mid = (low+high)/2;
            int res = name.compareTo(names[mid]);
            if (res == 0)
                return true;
            if (res > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
    private static boolean findElement(int[] data, int key) {
        int low = 0;
        int high = data.length - 1;
        while(low<high){
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
}
