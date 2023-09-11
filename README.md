# Java Assessment One - Problem Solving

Welcome to the Java Assessment One repository! This repository contains two Java programs: `Sorting` and `Accounting`, each designed to showcase different aspects of Java programming and problem-solving. Whether you are new to Java or looking to enhance your Java skills, this README will guide you through understanding, compiling, and running each program, along with additional information about sorting algorithms and accounting principles.

## Program 1: Sorting

### SortingAlgorithms.java

This Java program demonstrates three popular sorting algorithms: Bubble Sort, Selection Sort, and Insertion Sort. It generates random arrays of different sizes, sorts them using each algorithm, and measures the execution time for performance analysis.

#### Sorting Algorithms:

1. **Bubble Sort**:
   - **Algorithm Overview**: Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process continues until no more swaps are needed, indicating that the list is sorted.
   - **Time Complexity**: O(n^2) in the worst and average cases, making it inefficient for large datasets.
   - **Use Cases**: Bubble Sort is useful for educational purposes and for sorting small datasets where simplicity is more important than efficiency.

2. **Selection Sort**:
   - **Algorithm Overview**: Selection Sort divides the input list into two parts: the sorted and the unsorted sublists. It repeatedly selects the minimum element from the unsorted sublist and swaps it with the first element in the unsorted sublist. This process continues until the entire list is sorted.
   - **Time Complexity**: O(n^2) in the worst and average cases, making it inefficient for large datasets.
   - **Use Cases**: Selection Sort is another simple sorting algorithm that is suitable for small datasets.

3. **Insertion Sort**:
   - **Algorithm Overview**: Insertion Sort builds the final sorted array one item at a time. It takes one element from the input data and inserts it into the correct position in the sorted portion of the list. This process continues until all elements are sorted.
   - **Time Complexity**: O(n^2) in the worst and average cases, but it performs better than Bubble Sort and Selection Sort for small datasets and nearly sorted data.
   - **Use Cases**: Insertion Sort is often used when dealing with small lists or when the input data is almost sorted.

#### How to Execute:

1. **Setting Up Your Environment**:

   - Ensure that you have Java Development Kit (JDK) installed on your system. If not, you can download and install it from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).

   - Choose a suitable integrated development environment (IDE) like Eclipse, IntelliJ IDEA, or use a text editor for coding. Make sure the Java extension is installed if you are using a text editor like Visual Studio Code.

2. **Creating the Java File**:

   - Create a new Java file in your chosen development environment or text editor.

   - Copy the entire code from `SortingAlgorithms.java` and paste it into the newly created Java file.

   - Save the Java file with the name `SortingAlgorithms.java`.

3. **Compiling and Running**:

   - Open your terminal or command prompt.

   - Navigate to the directory where `SortingAlgorithms.java` is saved.

   - Compile the Java program using the following command:

     ```bash
     javac SortingAlgorithms.java
     ```

   - Run the compiled program with this command:

     ```bash
     java SortingAlgorithms
     ```

   - Run the compiled test program with:
      
      ```bash
      java SortingAlgorithmsTest.java
      ```

4. **Viewing Results**:

   - The program will execute and display the execution times for Bubble Sort, Selection Sort, and Insertion Sort for different array sizes. You will observe how execution times increase with larger array sizes.

### SortingAlgorithmsTest.java

This Java program provides test cases for the sorting algorithms implemented in `SortingAlgorithms.java`. It uses a sample unsorted array to validate if each sorting algorithm produces the expected sorted result.

#### How to Execute:

1. **Creating the Java File**:

   - Create a new Java file in your development environment or text editor.

   - Copy the entire code from `SortingAlgorithmsTest.java` and paste it into the newly created Java file.

   - Save the Java file with the name `SortingAlgorithmsTest.java`.

2. **Compiling and Running**:

   - Open your terminal or command prompt.

   - Navigate to the directory where `SortingAlgorithmsTest.java` is saved.

   - Compile the Java program using the following command:

     ```bash
     javac SortingAlgorithmsTest.java
     ```

   - Run the compiled program with this command:

     ```bash
     java SortingAlgorithmsTest
     ```

3. **Viewing Results**:

   - The program will run test cases for Bubble Sort, Selection Sort, and Insertion Sort and display the results in the terminal. You will see if each sorting algorithm passes or fails the test.

## Program 2: Accounting

### Account.java

This Java class defines an `Account` with properties such as customer ID, customer name, customer address, customer phone number, and balance. It includes methods to manipulate the account, such as adding and subtracting from the balance and applying yearly interest.

### AccountDriver.java

The `AccountDriver` program allows you to interact with and manage multiple accounts. It provides a user-friendly menu-driven interface where you can perform various actions, such as adding accounts, displaying individual accounts, displaying all accounts, depositing to individual accounts, withdrawing from individual accounts, and applying yearly interest to all accounts.

#### Principles of Accounting:

1. **Accounting Basics**:
   - **Customer Information**: The `Account` class stores customer details such as ID, name, address, and

 phone number.

2. **Account Manipulation**:
   - **Balancing**: You can add to or subtract from the balance of an account using the `add` and `subtract` methods.

3. **Financial Year-End**:
   - **Yearly Interest**: The `yearlyInterest` method allows you to simulate applying yearly interest to all accounts, increasing their balances.

#### How to Execute:

1. **Creating the Java Files**:

   - Create two separate Java files in your development environment or text editor: one for `Account.java` and another for `AccountDriver.java`.

   - Copy the entire code from `Account.java` and paste it into the `Account.java` file.

   - Save the `Account.java` file.

   - Copy the entire code from `AccountDriver.java` and paste it into the `AccountDriver.java` file.

   - Save the `AccountDriver.java` file.

2. **Compiling the `Account` Class**:

   - Open your terminal or command prompt.

   - Navigate to the directory where `Account.java` is saved.

   - Compile the `Account` class using the following command:

     ```bash
     javac Account.java
     ```

3. **Compiling and Running the `AccountDriver` Program**:

   - Keep your terminal or command prompt open and navigate to the same directory.


   - Run the compiled program with this command:

     ```bash
     java AccountDriver.java
     ```

4. **Interacting with the Program**:

   - The program will display a menu with various options for managing accounts.

   - Follow the on-screen instructions to interact with the program and manage accounts. You can add accounts, display individual accounts, display all accounts, deposit to individual accounts, withdraw from individual accounts, and apply yearly interest to all accounts.

This README provides detailed step-by-step instructions for compiling and running each program and includes additional information about sorting algorithms and accounting principles. You can choose to work with either program based on your interests and learning objectives. Feel free to explore, modify, and learn from the code to enhance your Java programming skills. Enjoy coding!ss