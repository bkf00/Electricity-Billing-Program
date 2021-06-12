package code;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckUserPass {
    public static boolean checkUser(String userid) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    System.out.println("Username found");
                    return true;
                }
            }
        } catch (Exception ex) {
        }
        return false;
    }

    public static boolean checkPass(String userid, String pass) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    if (pass.equals(parts[2])) {
                        System.out.println("password correct");
                        return true;
                    } else {
                        System.out.println("password incorrect");
                        return false;
                    }
                }
            }
        } catch (Exception ex) {
        }
        return false;
    }
}
