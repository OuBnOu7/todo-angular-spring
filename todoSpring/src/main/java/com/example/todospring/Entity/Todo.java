package com.example.todospring.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {
    @Id
    private String _id;
    private String text;
    private boolean actif;


    public Todo(String _id, String text, boolean actif) {
        this._id = _id;
        this.text = text;
        this.actif = actif;


    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "_id='" + _id + '\'' +
                ", text='" + text + '\'' +
                ", actif=" + actif +
                '}';
    }
}
