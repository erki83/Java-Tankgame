import java.util.Scanner;

public class Main {
    public static void Sissejuhatus(String args[])
    {
        System.out.println("Tankiga purustatakse koode!");
        System.out.println("Autor: Erki Ruus");
    }


    public static void main (String args[])
    {
        Scanner lask1 = new Scanner(System.in);
        Scanner lask2 = new Scanner(System.in);
        System.out.println("Sisesta laskenurk");
        int lnurk = lask1.nextInt();
        System.out.println("Sisesta lasketugevus");
        int ltug = lask2.nextInt();
        Tulistamine Tulistamine = new Tulistamine(lnurk, ltug);
        Tulistamine.arvutamine();




    }
}