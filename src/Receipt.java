import java.util.*;

public class Receipt {
    private List<Item> items;
    private double totalSalesTaxes;
    private double totalPrice;

    public Receipt() {
        items = new ArrayList<>();
        totalSalesTaxes = 0;
        totalPrice = 0;
    }

    public void addItem(Item item) {
        double tax = TaxCalculator.calculateTax(item);
        double itemTotalPrice = item.getPrice() + tax;

        items.add(item);
        totalSalesTaxes += tax;
        totalPrice += itemTotalPrice;
    }

    public void printReceipt() {
        for (Item item : items) {
            double tax = TaxCalculator.calculateTax(item);
            System.out.printf("%s: %.2f%n", item.getName(), item.getPrice() + tax);
        }
        System.out.printf("Sales Taxes: %.2f%n", totalSalesTaxes);
        System.out.printf("Total: %.2f%n", totalPrice);
    }
}
