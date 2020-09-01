package Set1;
import java.util.HashMap;
import java.util.Scanner;
public class Problem23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the Sentence : ");
        String str = scan.nextLine();
        HashMap<String,Integer> count = new HashMap<String,Integer>();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' ' || str.charAt(i+1)==' ')
                continue;
            else{
                if((Math.abs((str.charAt(i) - str.charAt(i+1)))==1)){
                    if(count.containsKey(str.substring(i,i+2))){

                        count.put(str.substring(i,i+2),count.get(str.substring(i,i+2))+1);
                    }else
                        count.put(str.substring(i,i+2),1);
                }
            }
        }
        System.out.println(count);
    }
}

