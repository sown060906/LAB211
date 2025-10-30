/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0073;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        
        
        manager.addExpenseDirect("11-Apr-2009", 100, "Tuition fee");
        manager.addExpenseDirect("20-Apr-2009", 250, "Rent house");
        manager.addExpenseDirect("30-Apr-2009", 200, "Food");
        
     
        manager.displayAll();
        System.out.println();
        
        
        manager.display();
    }
}

