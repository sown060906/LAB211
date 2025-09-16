/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0071;

/**
 *
 * @author Admin
 */
public class Main extends TaskManager {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        while (true) {
            System.out.println("===== Task Program =====");
            System.out.println("1.Add Task");
            System.out.println("2.Delete Task");
            System.out.println("3.Show Task");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");

            int choice = Validation.checkIntLimit(1, 4);
            switch (choice) {
                case 1:
                    manager.addTask();
                    break;
                case 2:
                    manager.deleteTask();
                    break;
                case 3:
                    manager.showTasks();
                    break;
                case 4:
                    return;
            }
        }

    }

}
