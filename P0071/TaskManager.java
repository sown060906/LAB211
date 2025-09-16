/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0071;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask() {
        System.out.println("Enter Requirement Name: ");
        String requirementName = Validation.checkInputString();
        System.out.println("Enter Task TypeId");
        String taskTypeId = Validation.checkInputTaskId();
        System.out.println("Enter Date(dd-MM-yyyy): ");
        String date = Validation.checkInputDate();
        System.out.print("Enter From");
        System.out.print("Enter From: ");
        String planFrom = Validation.checkInputPlan();

        String planTo;
        while (true) {
            System.out.print("Enter To: ");
            planTo = Validation.checkInputPlan();
            if (Double.parseDouble(planTo) > Double.parseDouble(planFrom)) {
                break;
            } else {
                System.err.println("Plan To must be greater than Plan From. Re-input.");
            }
        }
        
        System.out.println("Enter Assignee");
        String assignee = Validation.checkInputString();
        System.out.println("Enter Reviewer");
        String reviewer = Validation.checkInputString();

        Task t = new Task(nextId++, requirementName, taskTypeId, date, planFrom, planTo, assignee, reviewer);
        tasks.add(t);
        System.out.println("Add task Success");
        return;
    }

    public void deleteTask() {
        if (tasks.isEmpty()) {
            System.err.println("List empty");
            return;
        }
        System.out.println("Enter ID to delete: ");
        int id = Validation.checkInputInt();
        Task found = null;
        for (Task t : tasks) {
            if (t.getId() == id) {
                found = t;
                break;
            }
        }
        if (found != null) {
            tasks.remove(found);
            System.out.println("Delete success");
        } else {
            System.err.println("Not found");
        }
    }

    public void showTasks() {
    if (tasks.isEmpty()) {
        System.err.println("Task list is empty.");
        return;
    }

    System.out.printf("%-5s%-20s%-15s%-15s%-10s%-15s%-15s\n",
            "ID", "Requirement Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");

    for (Task task : tasks) {
        double time = Double.parseDouble(task.getPlanTo()) - Double.parseDouble(task.getPlanFrom()); 
        System.out.printf("%-5d%-20s%-15s%-15s%-10.1f%-15s%-15s\n",
                task.getId(),
                task.getRequirementName(),
                task.getTaskTypeId(),
                task.getDate(),
                time,                      
                task.getAssignee(),
                task.getReviewer());
    }
    }
}

