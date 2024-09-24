import java.util.List;

public class Receipt {
    private List<Item> items;
    private double totalSalesTax;
    private double totalCost;

    public Receipt(List<Item> items, double totalSalesTax, double totalCost) {
        this.items = items;
        this.totalSalesTax = totalSalesTax;
        this.totalCost = totalCost;
    }

    public void printReceipt() {
        for (Item item : items) {
            double itemTax = TaxCalculator.calculateTax(item);
            double finalPrice = item.getPrice() + itemTax;
            System.out.println(item.getName() + ": " + String.format("%.2f", finalPrice));
        }
        System.out.println("Sales Taxes: " + String.format("%.2f", totalSalesTax));
        System.out.println("Total: " + String.format("%.2f", totalCost));
    }
}
