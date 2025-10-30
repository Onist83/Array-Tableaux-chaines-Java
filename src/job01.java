public class job01 {
    public static void main(String[] args) {

//Façon 1
        int somme=0;
        int[] numbs = {41,358,74,1,6,32};



      /*  Correction

      for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] % 2 == 0) {
                System.out.println(numbs[i] + "Number pair");
            } else  {
                System.out.println(numbs[i] + "Number impair");
        }*/

    /*
    }   int[] nbs = {41,358,74,1,6,32};
            if (n % 2 == 0) {
            System.out.println("Number pair");
        } else  {
            System.out.println("Number impair");
*/

        String[] arrayOfStrings = {"200", "204", "173", "98", "171", "404", "459"};
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.print(arrayOfStrings[i] + " ");
            if (i % 2 == 0) {
                System.out.println("Number pair");
            } else  {
                System.out.println("Number impair");
            }
        }

    }

    }


