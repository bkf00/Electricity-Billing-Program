package code;

import static java.lang.Integer.parseInt;

public class Encrypting {

    public static String toHex(String decimal) {
        int decimal2 = parseInt(decimal);
        int rem;
        String hex = "";
        char[] hexchars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal2 > 0) {
            rem = decimal2 % 16;
            hex = hexchars[rem] + hex;
            decimal2 = decimal2 / 16;
        }
        return hex;
    }

    public static String toPassword(String pass) {

        char[] letters = pass.toCharArray();
        int[] newPass = new int[pass.length()];
        String newPass3 = new String();
        for (int i = 0; i < pass.length(); i++) {
            newPass[i] = ((letters[i]) + 12);
            newPass3 = newPass3 + ((char) newPass[i]);
        }
        return newPass3;
    }
}