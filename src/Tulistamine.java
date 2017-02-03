import java.util.Scanner;
import static java.lang.Math.round;

public class Tulistamine {
    private static int Nurk;
    private static int Tugevus;
    public Tulistamine(int lnurk, int ltug) {
        Nurk = lnurk;
        Tugevus = ltug;
    }
    static void arvutamine() {
        int vastasekaugus;
        double G;
        double lõppkõrgus;
        vastasekaugus = 120;
        G = 9.8;
        for (int kaugus=1; kaugus<=vastasekaugus;kaugus++){
            lõppkõrgus = kaugus * Math.tan(Math.PI / 180 * Nurk) - ((G * Math.pow(kaugus, 2)) / (2 * Math.pow(Tugevus, 2) * Math.pow(Math.cos(Math.PI / 180 * Nurk), 2)));
            System.out.println(kaugus +"  "+ round(lõppkõrgus));}
        }
    }




