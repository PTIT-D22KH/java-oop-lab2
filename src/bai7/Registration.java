/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author P51
 */
public class Registration implements Comparable<Registration>{
    private Student student;
    private String size;
   
    public Registration(Student student, String size) {
        this.student = student;
        this.size = size;
    }

    public Student getStudent() {
        return student;
    }

    public String getSize() {
        return size;
    }
    
    
    @Override
    public String toString(){ 
        return "" + student;
    }

    @Override
    public int compareTo(Registration o) {
        return this.student.compareTo(o.student);
    }
}
