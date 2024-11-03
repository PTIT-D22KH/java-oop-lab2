/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author P51
 */
public class WordSet {
    private TreeSet<String> ts;
    public WordSet() {
        ts = new TreeSet();
    }
    public WordSet(String s) {
        ts = new TreeSet();
        String a[] = s.trim().toLowerCase().split("\\s+");
        ts.addAll(Arrays.asList(a));
        
    }
    public WordSet union(WordSet other) {
        WordSet res = new WordSet();
        res.ts.addAll(this.ts);
        res.ts.addAll(other.ts);
        return res;
    }
    public WordSet intersection(WordSet other) {
        WordSet res = new WordSet();
        res.ts.addAll(this.ts);
        res.ts.retainAll(other.ts);
        return res;
    }
    @Override
    public String toString(){ 
        StringBuilder res = new StringBuilder();
        for (String x : ts) {
            res.append(x).append(" ");
        }
        return res.toString().trim();
    }
}
