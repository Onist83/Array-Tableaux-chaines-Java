public class job03 {
    public static void main(String[] args) {

        String[] voyelles = {"I", "o", "a", "e", "i", "o"};


        String str = "I'm sorry Dave I'm afraid I can't do that";
        char[] chars = str.toCharArray();
        for(char caractere: chars) {
            /*for (String voyelle : voyelles) {
                if (voyelle == caractere) {
                    System.out.print(caractere);
                }*/
            if ('I' == caractere ||'o' == caractere ||'a' == caractere ||'e' == caractere ||'i' == caractere ||'o' == caractere ){

                System.out.print(caractere);
            }
        }
    }
}



