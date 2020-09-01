package Set1;
import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Calculate Area ");
        System.out.println(" 1- Triangle");
        System.out.println(" 2- Square");
        System.out.println(" 3- Retangle");
        System.out.println(" 4- Circle");
        System.out.println("Enter the choice : ");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                System.out.println(" Enter side and height ");
                float side = scan.nextFloat();
                float height = scan.nextFloat();
                System.out.println(String.format("%.2f",(side*height)/2));
                break;
            case 2:
                System.out.println(" Enter side ");
                float side_squ = scan.nextFloat();
                System.out.println(String.format("%.2f",(side_squ*side_squ)));
                break;
            case 3:
                System.out.println(" Enter width and height ");
                float widths = scan.nextFloat();
                float height_rec = scan.nextFloat();
                System.out.println(String.format("%.2f",(widths*height_rec)));
                break;
            case 4:
                System.out.println(" Enter radius ");
                float radius = scan.nextFloat();
                System.out.println(String.format("%.2f",(3.14*radius*radius)));
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
