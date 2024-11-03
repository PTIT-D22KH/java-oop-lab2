/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9;

/**
 *
 * @author P51
 */
public class Team implements Comparable<Team>{
    private String name;
    private Institution institution;

    public Team(String name, Institution institution) {
        this.name = name;
        this.institution = institution;
    }
    
    @Override
    public String toString(){
        return name + " " + institution;
    }
    

    @Override
    public int compareTo(Team o) {
        int cmp = this.institution.compareTo(o.institution);
        if (cmp == 0) {
            return this.name.compareTo(o.name);
        }
        return cmp;
    }
}
