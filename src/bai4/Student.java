/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String name;
    private int numTrues, numSubmits;
    
    public Student(String name, String result) {
        this.name = name;
        String a[] = result.trim().split("\\s+");
        this.numTrues = Integer.parseInt(a[0]);
        this.numSubmits = Integer.parseInt(a[1]);
    }
    @Override
    public String toString() {
        return name + " " + numTrues + " " + numSubmits;
    }
    @Override
    public int compareTo(Student o) {
        if (numTrues == o.numTrues) {
            if (numSubmits == o.numSubmits) {
                return this.name.compareTo(o.name);
            }
            return Integer.compare(this.numSubmits, o.numSubmits);
        }
        return Integer.compare(o.numTrues, this.numTrues);
    }
    
}
