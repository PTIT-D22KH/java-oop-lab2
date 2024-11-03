/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author P51
 */
public class Course {
    private String courseId, courseName, testType;

    public Course(String courseId, String courseName, String testType) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.testType = testType;
    }

    public String getCourseId() {
        return courseId;
    }
    
    @Override
    public String toString(){
        return courseName;
    }
}
