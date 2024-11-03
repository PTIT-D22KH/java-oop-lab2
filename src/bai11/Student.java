/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String id, name, className, email, phoneNumber;

    public Student(String id, String name, String className, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phoneNumber = "0" + phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return id + " " + name;
    }
    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
    
}
