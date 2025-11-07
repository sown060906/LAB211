package J1.S.P0024;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.*;

public class StudentManagement {
    public Student findById(ArrayList<Student> list, String id) {
        for (Student stu : list) {
            if (stu.getId().equalsIgnoreCase(id)) {
                return stu;
            }
        }
        return null;
    }
    public ArrayList<Student> findByName(ArrayList<Student> list, String name) {
    ArrayList<Student> result = new ArrayList<>();
    for (Student stu : list) {
        if (stu.getStudentName().toLowerCase().contains(name.toLowerCase())) {
            result.add(stu);
        }
    }

    Collections.sort(result, new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getStudentName().compareToIgnoreCase(s2.getStudentName());
        }
    });
    return result;
}
    public boolean addStudent(ArrayList<Student> list, Student s) {
        if (s == null) return false;
        list.add(s);
        return true;
    }
    public boolean delete(ArrayList<Student> list, Student s) {
        return list.remove(s);
    }

    public boolean update(Student s, String name, int semester, String course) {
        s.setStudentName(name);
        s.setSemester(semester);
        s.setCourseName(course);
        return true;
    }
    public Student getStudentById(ArrayList<Student> list, String id) {
        for (Student s : list) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
    public boolean updateStudent(Student s, String newName, int newSemester, String newCourse) {
        if (s == null) return false;
        s.setStudentName(newName);
        s.setSemester(newSemester);
        s.setCourseName(newCourse);
        return true;
    }
    public boolean deleteStudent(ArrayList<Student> list, Student s) {
        if (s == null) return false;
        return list.remove(s);
    }
}

    

