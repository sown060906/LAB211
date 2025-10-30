/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0073;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();
    private int nextId = 1;

    public void addExpense() {
        System.out.print("Enter Date (dd-MMM-yyyy): ");
        String date = Validation.checkInputDate();
        
        System.out.print("Enter Amount: ");
        double amount = Validation.checkInputDouble();
        
        System.out.print("Enter Content: ");
        String content = Validation.checkInputString();

        Expense expense = new Expense(nextId++, date, amount, content);
        expenses.add(expense);
        System.out.println("Add expense successful!");
    }

    public void deleteExpense() {
        System.out.print("Enter ID to delete: ");
        int id = Validation.checkInt();

        boolean removed = false;
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getId() == id) {
                expenses.remove(i);
                System.out.println("Delete an expense successful");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.err.println("Delete an expense fail");
        }
    }

    public void displayAll() {
        if (expenses.isEmpty()) {
            System.err.println("Expense list is empty.");
            return;
        }

        System.out.printf("%-10s%-20s%-20s%-30s\n",
                "ID", "Date", "Amount of money", "Content");
        System.out.println("--------------------------------------------------------------------------------");

        double total = 0;
        for (Expense expense : expenses) {
            System.out.printf("%-10d%-20s%-20.0f%-30s\n",
                    expense.getId(),
                    expense.getDate(),
                    expense.getAmount(),
                    expense.getContent());
            total += expense.getAmount();
        }
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("Total: %.0f\n", total);
    }

    public void display() {
        while (true) {
            System.out.println("========== Handy Expense ==========");
            System.out.println("1. Add an expense");
            System.out.println("2. Display all expenses");
            System.out.println("3. Remove an expense");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Validation.checkIntLimit(1, 4);
            switch (choice) {
                case 1:
                    this.addExpense();
                    break;
                case 2:
                    this.displayAll();
                    break;
                case 3:
                    this.deleteExpense();
                    break;
                case 4:
                    return;
            }
            System.out.println();
        }
    }

    public void addExpenseDirect(String date, double amount, String content) {
        Expense expense = new Expense(nextId++, date, amount, content);
        expenses.add(expense);
        System.out.println("Add expense success (direct mode)");
    }
}

