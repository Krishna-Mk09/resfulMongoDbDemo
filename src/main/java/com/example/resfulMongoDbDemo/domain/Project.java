/*
 * Author Name : M.Krishna.
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.example.resfulMongoDbDemo.domain;

public class Project {
    private String projectName;
    private int projectCode;
    private int projectDuration;

    public Project() {
    }

    public Project(String projectName, int projectCode, int projectDuration) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.projectDuration = projectDuration;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(int projectCode) {
        this.projectCode = projectCode;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }
}
