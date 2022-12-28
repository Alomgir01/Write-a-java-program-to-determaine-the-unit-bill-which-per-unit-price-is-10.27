import java.util.Scanner;
public class Ex8
{
     static final double UNIT_PRICE=10.27;
     public static void main(String[] args)
    {
        System.out.print("Enter no. of used unit: ");
        Scanner input= new Scanner(System.in);
        double unit= input.nextDouble();
        double bill= UNIT_PRICE*unit;
        System.out.print(+bill);
    }
}  