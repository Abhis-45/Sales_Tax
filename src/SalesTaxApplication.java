import java.util.Scanner;

public class SalesTaxApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingBasket basket = new ShoppingBasket();

        System.out.println("Enter the items (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) break;
            basket.addItem(InputParser.parseItem(input));
        }

        Receipt receipt = ReceiptGenerator.generateReceipt(basket);
        receipt.printReceipt();
    }
}