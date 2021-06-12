package code;

import java.io.*;
import static code.Encrypting.toHex;
import static code.Encrypting.toPassword;

public class Appending {
//        public static void main(String[] args) {
//           writing("112233","Adi", "123456","Constanta","Constanta STR. BABA NOVAC nr. 117,","0744 121 615","5");
//      }
    public static void writing(String userid, String Name, String Password, String County, String Address, String Telephone, String kWh) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Resources\\data.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.print(toHex(userid) + "8-8-8" + Name + "8-8-8" + toPassword(Password) + "8-8-8" + County + "8-8-8" + Address + "8-8-8" + Telephone + "8-8-8" + kWh + "8-8-8\n");
            pw.flush();
        } catch (Exception ex) {
            return;
        }
    }
}
