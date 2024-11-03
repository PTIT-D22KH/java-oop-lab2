/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13;

/**
 *
 * @author P51
 */
public class Commitee implements Comparable<Commitee>{
    private Student student;
    private Topic topic;
    private String commiteeId;

    public Commitee(Student student, Topic topic, String commiteeId) {
        this.student = student;
        this.topic = topic;
        this.commiteeId = commiteeId;
    }

    public String getCommiteeId() {
        return commiteeId;
    }
    @Override
    public String toString(){
        return student + " " + topic;
    }
    @Override
    public int compareTo(Commitee o) {
        return this.student.compareTo(o.student);
    }
    
}
