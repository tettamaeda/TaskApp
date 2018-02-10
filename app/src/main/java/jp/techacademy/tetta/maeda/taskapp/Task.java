package jp.techacademy.tetta.maeda.taskapp;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by user on 2018/01/30.
 */

public class Task extends RealmObject implements Serializable{
    private String title;
    private String contents;
    private Date date;
    private String category;

    @PrimaryKey
    public int id;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContents(){
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() { return category;}

    public void setCategory(String category){
        this.category = category;
    }

}
