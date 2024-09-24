# Sales Tax Calculator - Makkajai Dev Challenge

This is a Java console application that calculates sales tax and generates a formatted receipt for shopping baskets based on the given input. The project was developed as part of the Makkajai Dev Challenge task.

## Problem Statement

The problem involves calculating sales tax for items in a shopping basket, applying basic sales tax and import duty where applicable, and generating a receipt with the following details:
- Item names with prices (including tax)
- Total sales taxes
- Total cost of the items

### Tax Rules:
1. Basic sales tax: 10% on all goods, except books, food, and medical products which are exempt.
2. Import duty: An additional 5% on all imported goods, with no exemptions.
3. Sales tax is rounded up to the nearest 0.05.

### Input/Output Examples:

**Input 1:**
```
1 book at 12.49
1 music CD at 14.99
1 chocolate bar at 0.85
```

**Output 1:**
```
1 book: 12.49
1 music CD: 16.49
1 chocolate bar: 0.85
Sales Taxes: 1.50
Total: 29.83
```

**Input 2:**
```
1 imported box of chocolates at 10.00
1 imported bottle of perfume at 47.50
```

**Output 2:**
```
1 imported box of chocolates: 10.50
1 imported bottle of perfume: 54.65
Sales Taxes: 7.65
Total: 65.15
```

## Features

- Handles multiple shopping baskets
- Calculates sales tax according to specified rules
- Rounds tax up to the nearest 0.05
- Outputs formatted receipt with total sales taxes and total cost

## How to Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Abhis-45/Sales_Tax.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd sales-tax-calculator
   ```

3. **Compile the Java application:**

   ```bash
   javac SalesTaxCalculator.java
   ```

4. **Run the application:**

   ```bash
   java SalesTaxCalculator
   ```

## Example Usage

After running the application, you will be prompted to input items in the format:

```
<quantity> <product name> at <price>
```

Once you've entered all items for a basket, press Enter to view the receipt with calculated tax and totals.

## Project Structure

```
sales-tax-calculator/
│
├── src/
│   ├── SalesTaxCalculator.java
│   └── Item.java
    └── TaxCalculator.java
    └── Receipt.java
├── README.md
```

## Technologies Used

- Java

---

This README provides an overview of your project and instructions for running it. You can modify the details, especially the GitHub link and project structure, according to your actual implementation.
