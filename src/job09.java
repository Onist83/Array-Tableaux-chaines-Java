import java.util.Scanner;

public class job09 {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");*/

        int n = 16;// n peut etre changer
        int somme = 0;
        int[] array = {4, 5, 7, 9, 11};//les multiples peuvent etre changer

        for (int i = 1; i < n; i++) {
            for (int multiple : array) {
                if (i % multiple == 0) {
                    somme += i;
                    System.out.print(i + " ");
                }

            }

        }
        System.out.println();
        System.out.println("Somme = " + somme);
    }
}





/*  int somme = 0;
        for (int i = 1; i < n; i++) {
            somme += i;
        }
        System.out.println("Somme = " + somme);*/