import java.math.*;

public class TaxCalculator {
    private static final double BASIC_SALES_TAX = 0.10;
    private static final double IMPORT_DUTY = 0.05;

    public static double calculateTax(Item item) {
        double tax = 0;

        if (!item.isTaxExempt()) {
            tax += item.getPrice() * BASIC_SALES_TAX;
        }

        if (item.isImported()) {
            tax += item.getPrice() * IMPORT_DUTY;
        }

        return roundUpToNearestFiveCents(tax);
    }

    private static double roundUpToNearestFiveCents(double amount) {
        return new BigDecimal(Math.ceil(amount * 20) / 20.0)
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}

