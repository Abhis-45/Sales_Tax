import java.util.List;

public class ReceiptGenerator {
    public static Receipt generateReceipt(ShoppingBasket basket) {
        List<Item> items = basket.getItems();
        double totalSalesTax = 0;
        double totalCost = 0;

        for (Item item : items) {
            double itemTax = TaxCalculator.calculateTax(item);
            double itemCost = item.getPrice() + itemTax;
            totalSalesTax += itemTax;
            totalCost += itemCost;
        }

        return new Receipt(items, totalSalesTax, totalCost);
    }
}
