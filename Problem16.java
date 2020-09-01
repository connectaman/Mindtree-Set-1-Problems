package Set1;

public class Problem16 {
    public static void bubbleSort(String[] arr, int n)
    {
        String temp;
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (arr[j].compareTo(arr[i]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static String[] insertionSort(String array[], int f){
        String temp="";
        for(int i=0;i<f;i++){
            for(int j=i+1;j<f;j++){
                if(array[i].compareToIgnoreCase(array[j])>0){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        String[] arr = { "aman", "anikesh",
                "ashutosh", "akash", "arpit" };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Strings after sorting using bubble Sort");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
        insertionSort(arr, n);
        System.out.println("Strings after sorting using Inseetion Sort");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
