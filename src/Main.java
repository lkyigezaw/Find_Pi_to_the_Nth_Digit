/**
 * Created by Lyigezaw on 1/29/2017.
 */
import static java.lang.Math.PI;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        int places;
        String pi = Double.toString(PI);
        System.out.println(pi);
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the number of decimal places you would like to print PI from: ");
        places = reader.nextInt();
        System.out.print(pi.substring(0,2));

        for(int i = 0; i < places; i++){
            System.out.print(Character.toString(pi.charAt(2+i)));
        }
    }
}
