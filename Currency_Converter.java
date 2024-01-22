import java.text.DecimalFormat;
import java.util.*;
public class Currency_Converter{
    public static void main(String[] args) {
        double amt;
        DecimalFormat f=new DecimalFormat("##.###");
        Scanner s=new Scanner(System.in);
        double[][] Curr_Rates = {
            {1.0   , 77.34, 94.46, 80.36},
            {77.34 , 1.0  , 0.82 , 96.0},
            { 94.46, 0.82 , 1.0  , 1.17},
            {80.36 , 96.0 , 1.17 , 1.0}
        };
        System.out.println("!!! Currency converter menu !!!");
        System.out.println("1 for Rupee");
        System.out.println("2 for Dollar");
        System.out.println("3 for Pound");
        System.out.println("4 for Euro");

        System.out.print("Enter Base Currency [1-4] : ");
        int base_Currency=s.nextInt();
        if(base_Currency<1||base_Currency>4){
            System.out.println("Invaid selection ");
            return;
        }
        System.out.print("Enter Amount : ");
        amt=s.nextDouble();

        System.out.print("Enter Target Currency [1-4] : ");
        int target_Currency=s.nextInt();
        if(target_Currency<1||target_Currency>4){
            System.out.println("Invaid selection ");
        }

        double Rate=Curr_Rates[base_Currency-1][target_Currency-1];
        double convertion_Currency=amt*Rate;

        System.out.println("Converted Currency : "+f.format(convertion_Currency));

    }
}