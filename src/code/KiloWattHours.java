package code;

import static java.lang.Float.parseFloat;

public class KiloWattHours {
    public static double kWhToPrice(String kWh) {
        double billpay = 0;
        double units = parseFloat(kWh);
        if (units < 100)
            billpay = units * 1.20;
        else if (units <= 300)
            billpay = 100 * 1.20 + (units - 100) * 2;
        else if (units > 300)
            billpay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        return billpay;
    }
}