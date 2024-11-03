/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author P51
 */
public class Pair<T , S >{
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString(){ 
        return "(" + first + "," + second + ")";
    }
}
