/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9;

/**
 *
 * @author P51
 */
public class Institution implements Comparable<Institution>{
    private String id, name;
    public Institution(String s){
        String a[] = s.trim().split("\\s+");
        this.id = a[0];
        StringBuilder name = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            name.append(a[i]).append(" ");
        }
        this.name = name.toString().trim();
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Institution o) {
        return this.name.compareTo(o.name);
    }
}
