package Set1;

public class Problem4 {
    public static void main(String[] args) {
        int[] data = {1,5,6,7,4,5,6};
        int sum = 0;
        for(int temp:data){
            sum+=temp;
        }
        System.out.println("Sum of elements in Array : "+sum);
    }
}
