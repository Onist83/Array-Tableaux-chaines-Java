public class job06 {
    public static void main(String[] args) {

        String str = "Les choses que l'on possède finissent par nous posséder";
        char[] chars = str.toCharArray();
        int j = 0;
        int c = 10;

            for (int i = chars.length - 1; i>-1; i--) {
// ou (int i = chars.length - 1; i>=0; i--)
                System.out.print( "" + chars[i]);
            }
        }
    }


