import java.util.*;

public class SalesTaxApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Receipt receipt = new Receipt();

        System.out.println("Enter your items (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] parts = input.split(" at ");
            String itemName = parts[0];
            double price = Double.parseDouble(parts[1]);

            boolean isImported = itemName.toLowerCase().contains("imported");
            boolean isTaxExempt = isTaxExempt(itemName);

            Item item = new Item(itemName, price, isImported, isTaxExempt);
            receipt.addItem(item);
        }

        receipt.printReceipt();
    }

    private static boolean isTaxExempt(String itemName) {
        String[] exemptItems = {"book", "chocolate", "pill"};
        for (String exemptItem : exemptItems) {
            if (itemName.toLowerCase().contains(exemptItem)) {
                return true;
            }
        }
        return false;
    }
}
