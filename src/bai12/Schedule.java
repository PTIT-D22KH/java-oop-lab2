/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author P51
 */
public class Schedule implements Comparable<Schedule>{
    private Section section;
    private Course course;
    private String groupId;
    private int numStudents;

    public Schedule(Section section, Course course, String groupId, int numStudents) {
        this.section = section;
        this.course = course;
        this.groupId = groupId;
        this.numStudents = numStudents;
    }
    @Override
    public String toString(){
        return section + " " + course + " " + groupId + " " + numStudents;
    }

    @Override
    public int compareTo(Schedule o) {
        return this.section.compareTo(o.section);
    }
}
