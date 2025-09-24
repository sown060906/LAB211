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
public class MarkCalculation {
    public static Student createStudent(){
            System.out.println("Enter your name:");
            String name = Validation.getString();
            System.out.println("Enter class name:");
            String classes = Validation.getString();
            System.out.println("Enter Math Mark");
            double math = Validation.getDouble(1,10);
            System.out.println("Enter Chemistry Mark");
            double chemistry = Validation.getDouble(1, 10);
            System.out.println("Enter Physisc Mark");
            double physisc = Validation.getDouble(1, 10);
            return new Student(name, classes, math,chemistry,physisc);
    }
    public static List<Student> averageStudent(List<Student>students){
        for(Student st: students){
            double avg = (st.getMath() + st.getChemistry() + st.getPhysics())/3;
            st.setAverage(avg);
            if(avg > 7.5){
                st.setType("A");
            }
            else if(avg>=6){
                st.setType("B");
            }
            else if(avg>=4){
                st.setType("C");
            }
            else{
                st.setType("D");
            }
            
        }
        return students;
    }
    public static HashMap<String, Double>getPercentTypeStudent(List<Student>students){
        HashMap<String,Integer> countMap = new HashMap<>();
        countMap.put("A", 0);
        countMap.put("B", 0);
        countMap.put("C", 0);
        countMap.put("D", 0);
        for(Student st:students){
            String type = st.getType();
            countMap.put(type,countMap.get(type)+1);
        }
        HashMap<String,Double>percentMap = new HashMap<>();
        int total = students.size();
        for(String key : countMap.keySet()){
            double percent = (countMap.get(key)*100.0)/total;
            percentMap.put(key,percent);
        }return percentMap;
    }
    public static void display(List<Student> students){
        System.out.println("\n=====List Student=====");
        for(Student st : students){
            System.out.printf("Name: %s|Class: %S|Avg:%.2f|Type: %s/n ",st.getName(),st.getClasses(),st.getAverage(),st.getType());
        }
        HashMap<String,Double> percent = getPercentTypeStudent(students);
        System.out.println("====Statistics====");
        System.out.printf("A: %.2f%%\n",percent.get("A"));
        System.out.printf("B: %.2f%%\n",percent.get("B"));
        System.out.printf("C: %.2f%%\n",percent.get("C"));
        System.out.printf("D: %.2f%%\n",percent.get("D"));
    }
}

