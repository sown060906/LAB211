/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0065;

/**
 *
 * @author Admin
 */
import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        while(true){
            Student st = MarkCalculation.createStudent();
            students.add(st);
            
            System.out.println("Do you want to continue(Y/N:");
            if(!Validation.getYesNo()){
                break;
            }
        }
        students = MarkCalculation.averageStudent(students);
        MarkCalculation.display(students);
        }
    }


