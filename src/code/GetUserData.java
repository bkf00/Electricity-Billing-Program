package code;

import java.io.BufferedReader;
import java.io.FileReader;

import static code.Decrypting.getDecimal;
import static code.Decrypting.getPassword;

public class GetUserData {

    public static String getUserid(String userid, String pass) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    if (pass.equals(parts[2])) {
                        return String.valueOf(getDecimal(parts[0]));
                    } else {
                    }
                }
            }
        } catch (Exception ex) {
        }
        return "error";
    }

    public static String getUserName(String userid, String pass) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    if (pass.equals(parts[2])) {
                        return parts[1];
                    } else {
                    }
                }
            }
        } catch (Exception ex) {
        }
        return userid;
    }

    public static String getPass(String userid, String pass) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    if (pass.equals(parts[2])) {
                        return getPassword(parts[2]);
                    } else {
                    }
                }
            }
        } catch (Exception ex) {
        }
        return "error";
    }

    public static String getCountry(String userid, String pass) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    if (pass.equals(parts[2])) {
                        return parts[3];
                    } else {
                    }
                }
            }
        } catch (Exception ex) {
        }
        return "error";
    }

    public static String getAddress(String userid, String pass) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    if (pass.equals(parts[2])) {
                        return parts[4];
                    } else {
                    }
                }
            }
        } catch (Exception ex) {
        }
        return "error";
    }

    public static String getNumber(String userid, String pass) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    if (pass.equals(parts[2])) {
                        return parts[5];
                    } else {
                    }
                }
            }
        } catch (Exception ex) {
        }
        return "error";
    }

    public static String getkWh(String userid, String pass) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                if (userid.equals(parts[0])) {
                    if (pass.equals(parts[2])) {
                        return parts[6];
                    } else {
                    }
                }
            }
        } catch (Exception ex) {
        }
        return "error";
    }
}
