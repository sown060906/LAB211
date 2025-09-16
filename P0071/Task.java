/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0071;

/**
 *
 * @author Admin
 */
public class Task {
    private int id;
    
    private String taskTypeId;
    private String requirementName;
    private String date;
    private String planFrom;
    private String planTo;
    private String assignee;
    private String reviewer;

    public Task(int id, String taskTypeId, String requirementName, String date, String planFrom, String planTo, String assignee,String reviewer) {
        this.id = id;
        this.taskTypeId = taskTypeId;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public String getTaskTypeId() {
        return taskTypeId;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public String getDate() {
        return date;
    }

    public String getPlanFrom() {
        return planFrom;
    }

    public String getPlanTo() {
        return planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
