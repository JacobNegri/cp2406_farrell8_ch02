/**
 * Created by jc319816 on 14/08/16.
 */
public class NauticalMiles {

    public static void main(String[] args)
    {
        double KM_per_NM = 1.852;
        double Miles_per_NM = 1.150779;
        double NM = 200;
        double km;
        double miles;

        km = NM * KM_per_NM;
        miles = NM * Miles_per_NM;

        System.out.println(NM + "nautical miles are equal to " + km + " kilometers or " + miles + " miles.");

    }
}
