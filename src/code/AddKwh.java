package code;

import java.io.*;
import static java.lang.Double.parseDouble;

public class AddKwh {
    public static void AddRandomKwh() {
        double kwh;
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Resources\\newdata.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            BufferedReader br = new BufferedReader(
                    new FileReader("Resources\\data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("8-8-8");
                kwh = parseDouble(parts[6]);
                kwh += Math.random() * 10 + Math.random() * 20 + Math.random() * 30;
                parts[6] = String.valueOf(kwh);
                pw.print(parts[0] + "8-8-8" + parts[1] + "8-8-8" + parts[2] + "8-8-8" + parts[3] + "8-8-8" + parts[4] + "8-8-8" + parts[5] + "8-8-8" + parts[6] + "8-8-8\n");
                System.out.println(Math.round(kwh));
            }
            pw.flush();
            fw.close();
            pw.close();
            bw.close();
            br.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File newdata = new File("Resources\\newdata.txt");
        File data = new File("Resources\\data.txt");
        boolean success = data.delete();
        boolean success2 = newdata.renameTo(data);

    }
}


