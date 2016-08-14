/**
 * Created by jc319816 on 14/08/16.
 */
import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args)
    {
        double KM_per_NM = 1.852;
        double Miles_per_NM = 1.150779;
        double NM;
        double km;
        double miles;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Nautical Mile value:");
        NM = input.nextDouble();

        km = NM * KM_per_NM;
        miles = NM * Miles_per_NM;

        System.out.println(NM + "  nautical miles are equal to " + km + " kilometers or " + miles + " miles.");

    }
}

