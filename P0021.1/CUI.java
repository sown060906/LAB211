/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0024;

/**
 *
 * @author Admin
 */
import java.util.*;

public class CUI {

    private ArrayList<Student> students = new ArrayList<>();
    private StudentManagement sm = new StudentManagement();

    public void display() {
        while (true) {
            System.out.println("===== STUDENT MANAGEMENT =====");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            int choice;
            choice = Validation.checkLimitInput(1, 5);

            switch (choice) {
                case 1:
                    handleCreate();
                    break;
                case 2:
                    handleFind();
                    break;
                case 3:
                    handleUD();
                    break;
                case 4:
                    handleReport();
                    break;
                case 5:
                    return;
            }
        }
    }

    private void handleCreate() {
        int count = 0;
        while (true) {
            System.out.println("\n--- Enter info for student #" + (count + 1) + " ---");
            System.out.print("Enter student ID: ");
            String id = Validation.checkInputString();
            System.out.print("Enter student name: ");
            String name = Validation.checkInputString();
            System.out.print("Enter semester (1-9): ");
            int semester = Validation.checkLimitInput(1, 9);
            System.out.print("Enter course name: ");
            String course = Validation.checkInputCourse();
            Student s = new Student(id, name, semester, course);
            sm.addStudent(students, s);
            count++;
            if (count >= 4 && count % 4 == 0) {
                System.out.print("Do you want to continue (Y/N)? ");
                boolean yes = Validation.checkInputYN();
                if (!yes) {
                    break;
                }
            }
        }

        System.out.println("\n You have entered " + count + " students in total!");
    }

    private void handleFind() {
        System.out.print("Enter name to find: ");
        String name = Validation.checkInputString();
        ArrayList<Student> result = sm.findByName(students, name);
        if (result.isEmpty()) {
            System.out.println("No student found.");
        } else {
            System.out.printf("%-15s%-15s%-10s\n", "ID", "Name", "Course");
            for (Student s : result) {
                System.out.printf("%-15s%-15s%-10s\n", s.getId(), s.getStudentName(), s.getCourseName());
            }
        }
    }

    public void handleUD() {
        System.out.print("Enter student ID: ");
        String id = Validation.checkInputString();

        Student found = sm.getStudentById(students, id);
        if (found == null) {
            System.out.println(" Student not found!");
            return;
        }

        System.out.print("Do you want to Update (U) or Delete (D)? ");
        boolean isUpdate = Validation.checkUD(); // true = U, false = D

        if (isUpdate) {
            handleUpdate(found);
        } else {
            handleDelete(found);
        }
    }

    private void handleUpdate(Student s) {
        System.out.print("Enter new name: ");
        String newName = Validation.checkInputString();

        System.out.print("Enter new semester (1-9): ");
        int newSemester = Validation.checkLimitInput(1, 9);

        System.out.print("Enter new course: ");
        String newCourse = Validation.checkInputCourse();

        boolean ok = sm.updateStudent(s, newName, newSemester, newCourse);
        if (ok) {
            System.out.println("✅ Update success!");
        } else {
            System.out.println("❌ Update failed!");
        }
    }

    private void handleDelete(Student s) {
        boolean ok = sm.deleteStudent(students, s);
        if (ok) {
            System.out.println("✅ Update success!");
        } else {
            System.out.println("❌ Update failed!");
        }
    }

    private void handleReport() {
        System.out.println("===== REPORT =====");
        Map<String, Integer> report = new HashMap<>();
        for (Student s : students) {
            String key = s.getStudentName() + " - " + s.getCourseName();
            report.put(key, report.getOrDefault(key, 0) + 1);
        }
        for (String key : report.keySet()) {
            System.out.println(key + ": " + report.get(key));
        }
    }
}
