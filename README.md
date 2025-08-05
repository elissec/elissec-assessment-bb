# elissec-assessment-bb
Programming Assessment Exam for Balsam Brands by Elisse Campos.

# Getting Started
This repository contains the code for the programming assessment for a Junior QA Automation Engineer.

## The Tasks
A set of data is provided in the instructions and created as a CSV file called `productData.csv`.
The tasks are composed of the following:
1.  Parse the CSV file and store the data in a suitable data structure.
2.
   1. Print all products that are in stock and cost more than 100.
   2. Group products by category and print the number of products per category.
3.  Sort the products by price and print the top 5 most expensive products.
4.  Generate a summary report. Print it to the console or save it to a text file.

## Running the Program

The main test is located in the `src/main/java/runtests/` directory, named `Main.java`.
The encapsulated tests are in `src/main/java/questions` and named `Task1.java`, `Task2.java`, `Task3.java`, and `Task4.java`.

To run the program, ensure you have at least Java JDK 24 installed on your machine.
You can run the script using the following command:

```mvn clean compile exec:java -Dexec.mainClass="runtests.Main"```

## Example Input/Output

Running `Main.java` will produce the following output:
1. The original product data, unsorted, from the CSV file.
2. Filtered products that are in stock and cost more than 100, grouped and counted by category.
3. The top 5 most expensive products sorted by price.
4. A summary report of the products printed to console and saved in a text file located at `src/test/java/testReport.txt`.

Example: Test #2, which is run via `Main.java` executes `printExpensiveProducts(lstProducts, intPriceThreshold);` and produces the following output:
```
| ---------- Test #2 Results ---------- |

------------ Products with Price Greater than 100 and In Stock ------------
Available product: Laptop | price: 1500 | category: Electronics
Available product: Monitor | price: 220 | category: Electronics

------------ Category: Electronics (4) ------------
Product 1: 
 	 ProductName: Laptop
 	 Price: 1500
 	 InStock: true
Product 2: 
 	 ProductName: Keyboard
 	 Price: 50
 	 InStock: true
...
```
## Bonus: Price threshold
A price threshold was added in the code to filter expensive or low-cost products.
It can be modified in the `Main.java` file, where the variable `intPriceThreshold` is defined.

_P.S. I attempted to create a JSON file to store the report, but I encountered issues with formatting._
