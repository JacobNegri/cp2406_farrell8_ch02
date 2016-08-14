/**
 * Created by jc319816 on 14/08/16.
 */
import java.util.Scanner;

public class MinutesConversion
{
    public static void main(String[] args)
    {
        int min;
        double hours;
        double days;
        double MINS_IN_HR = 60;
        double HRS_IN_DAY = 24;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        min = input.nextInt();
        hours = min / MINS_IN_HR;
        days = hours / HRS_IN_DAY;
        System.out.println(min + " minutes is " + hours + " hours or " + days + " days.");
    }
}
