package code;

public class Decrypting {

    public static int getDecimal(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static String getPassword(String pass) {

        char[] letters = pass.toCharArray();
        int[] newPass = new int[pass.length()];
        String newPass2 = new String();
        for (int i = 0; i < pass.length(); i++) {
            newPass[i] = ((letters[i]) - 12);
            newPass2 = newPass2 + ((char) newPass[i]);

        }
        return newPass2;
    }
}

