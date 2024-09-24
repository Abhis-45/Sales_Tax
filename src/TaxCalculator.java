public class TaxCalculator {
    private static final double BASIC_TAX_RATE = 0.10;
    private static final double IMPORT_TAX_RATE = 0.05;

    public static double calculateTax(Item item) {
        double tax = 0;

        // Apply basic tax if the item is not tax-exempt
        if (!item.isTaxExempt()) {
            tax += roundUpToNearestFiveCents(item.getPrice() * BASIC_TAX_RATE);
        }

        // Apply import tax if the item is imported
        if (item.isImported()) {
            tax += roundUpToNearestFiveCents(item.getPrice() * IMPORT_TAX_RATE);
        }

        return tax;
    }

    private static double roundUpToNearestFiveCents(double amount) {
        return Math.ceil(amount * 20.0) / 20.0;
    }
}
