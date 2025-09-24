/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0065;

/**
 *
 * @author Admin
 */
public class Student {
    private String name;
    private String classes;
    private double math;
    private double chemistry;
    private double physics;
    private double average;
    private String type;

    public Student(String name, String classes, double math, double chemistry, double physics) {
        this.name = name;
        this.classes = classes;
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
    }

    // Getter & Setter
    public String getName() { return name; }
    public String getClasses() { return classes; }
    public double getMath() { return math; }
    public double getChemistry() { return chemistry; }
    public double getPhysics() { return physics; }
    public double getAverage() { return average; }
    public String getType() { return type; }

    public void setAverage(double average) { this.average = average; }
    public void setType(String type) { this.type = type; }
}
