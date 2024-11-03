/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author P51
 */
public class Course implements Comparable<Course>{
    private String id, name, testType;

    public Course(String id, String name, String testType) {
        this.id = id;
        this.name = name;
        this.testType = testType;
    }

    @Override
    public int compareTo(Course o) {
        return this.id.compareTo(o.id);
    }
    @Override
    public String toString(){ 
        return id + " " + name + " " + testType;
    }
}
