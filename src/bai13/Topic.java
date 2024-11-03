/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13;

/**
 *
 * @author P51
 */
public class Topic {
    private String topicId, lecturerName, topicName;

    public Topic(String topicId, String lecturerName, String topicName) {
        this.topicId = topicId;
        this.lecturerName = lecturerName;
        this.topicName = topicName;
    }

    public String getTopicId() {
        return topicId;
    }
    @Override
    public String toString (){
        return topicName + " " + lecturerName; 
    }
    
}
