import java.util.Scanner;
import java.util.concurrent.Callable;

public class CalcTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("press 1 to calc sin with reduction formula");
            System.out.println("press 2 to calc tan with reduction formula");
            System.out.println("press 3 to calc sec with reduction formula" );
            System.out.println( "press 4 to calc sin and cos with the special case");
            System.out.println("press 5 to calc tan with the special case");
int choice = input.nextInt();
            System.out.println("enter the power");
            int power = input.nextInt();
            CalcPf p =new CalcPf(power);
            switch (choice){
                case 1:CalcPf.calcSin();
                break;
                case 2:CalcPf.CalcTan();
                break;
                case 3:CalcPf.CalcSec();
                break;
                case 4:CalcPf.CalcSinCosDefinite();
                break;
                case 5:CalcPf.CalcTanDefinite();
                break;
                default:
                    System.out.println("invalid choice");











            }

        }



    }





}
