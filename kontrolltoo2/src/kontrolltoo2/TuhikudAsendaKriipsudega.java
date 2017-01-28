package kontrolltoo2;

/**
 * Asendada t�hikuid kriipsudega
 */
public class TuhikudAsendaKriipsudega {

    public static void main(String[] args) {
        String s = "Tere, TUDENG,   tore ARVUTI sul!";
        String t = asenda(s);//Tere,-TUDENG,---tore-ARVUTI-sul!
        System.out.println(s + " > " + t);
    }

    private static String asenda(String s) {
        String asenda = "";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);//k�sib t�he k�est indeksil i ja salvestab a-sse
            if (Character.isWhitespace(a)) {
                asenda = asenda + '-';
            } else {
                asenda = asenda + a;
            }
        }
        return asenda;
    }
}
