public class job05 {
    public static void main(String[] args) {

        char a = ' ';
        char b = '\'';
        char[] voyelles = {'a', 'e', 'y', 'u', 'i', 'o', 'A', 'E', 'Y', 'U', 'I', 'O'};

        String str = "On n’est pas le meilleur quand on le croit mais quand on le sait";
        char[] chars = str.toCharArray();
        int i = 0;

        for (char caractere : chars) {

            if (i == (a)) {
                continue;
            } else if (i == (b)) {
                continue;
            } else {
                for (char voyelle : voyelles) {
                    if (caractere == voyelle) {
                        i++;
                    }
                }
            }
            System.out.println("Le nombre de voyelles est: " + i);


            //code pour les consonnes
 //if (i !=a) && (i !=b) && (i != []voyelles) {
            //i++;
            // }System.out.println("Le nombre de consonnes est: " + i)

    /*        if (i == (a)) {
                continue;
            } else if (i == (b)) {
                continue;
            } else {
                for (char consonne !=voyelles){
                    if (caractere != voyelles) {
                        i++;

                    }
                }
            } System.out.println("Le nombre de consonnes est: " + i);*/
        }
    }
}
/* Correction
