/*
 * Author  : Mr.electrix
 * Project : NotesCollector
 * Date    : 9/7/24

 */

package lk.ijse.aad.notescollector.entity;

import java.io.Serializable;

public class Note implements Serializable {
    private int id;
    private String title;
    private String content;
    public String createdDate;
    public String priorityLevel;
    public String user;
}
