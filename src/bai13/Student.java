/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String studentId, name, phoneNumber, email;

    public Student(String studentId, String name, String phoneNumber, String email) {
        this.studentId = studentId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }
    @Override
    public String toString(){
        return studentId + " " + name;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
