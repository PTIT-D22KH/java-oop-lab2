/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Section implements Comparable<Section>{
    private String id, dateString, startTimeString, room;
    private Date date;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Section(String id, String dateString, String startTimeString, String room) {
        this.id = id;
        this.dateString = dateString;
        this.startTimeString = startTimeString;
        this.room = room;
        try {
            String concatDate = dateString + " " + startTimeString;
            this.date = dateFormat.parse(concatDate);
        } catch (Exception e) {
        }
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return dateString + " " + startTimeString + " " + room;
    }

    @Override
    public int compareTo(Section o) {
        int cmp = this.date.compareTo(o.date);
        if (cmp == 0) {
            return this.id.compareTo(o.id);
        }
        return cmp;
    }
}
