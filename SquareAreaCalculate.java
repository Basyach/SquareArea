import java.util.Scanner;
public class SquareAreaCalculate{
    public static void main(String[]args) {
        Scanner userinput = new Scanner (System.in);
        System.out.println("================================");
        System.out.println("   Calculate Square Area     ");
        System.out.println("================================");
        System.out.println();
        System.out.print("Input Long : ");
        int a = userinput.nextInt();
        System.out.print("Input width : ");
        int b = userinput.nextInt();
        int c = a*b;
        System.out.println("Large = " +c);
        System.out.println("================================");
        System.out.println("          By :Basyach           ");
        System.out.println("================================");

    }
   
}