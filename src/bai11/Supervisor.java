/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author P51
 */
public class Supervisor implements Comparable<Supervisor>{
    private String supervisor, topic;
    private Student student;

    public Supervisor(String supervisor, String topic, Student student) {
        this.supervisor = supervisor;
        this.topic = topic;
        this.student = student;
    }
    
    @Override
    public String toString(){ 
        return student + " " + supervisor + " " + topic + " " + student.getPhoneNumber();
    }

    @Override
    public int compareTo(Supervisor o) {
        return this.student.compareTo(o.student);
    }
}
