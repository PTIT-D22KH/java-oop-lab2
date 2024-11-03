/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String id, name, className, email, phoneNumber, gender;

    public Student(String id, String name, String className, String email, String phoneNumber, String gender) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }
    
    
    @Override
    public String toString(){ 
        return id + " " + name + " " + className + " " + email + " " + phoneNumber;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
