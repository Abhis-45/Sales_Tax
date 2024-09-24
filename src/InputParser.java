public class InputParser {
    public static Item parseItem(String input) {
        boolean isImported = input.contains("imported");
        boolean isTaxExempt = input.contains("book") || input.contains("chocolate") || input.contains("pills");

        String[] parts = input.split(" at ");
        String name = parts[0];
        double price = Double.parseDouble(parts[1]);

        return new Item(name, price, isImported, isTaxExempt);
    }
}
