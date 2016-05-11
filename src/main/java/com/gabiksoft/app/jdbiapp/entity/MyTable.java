package com.gabiksoft.app.jdbiapp.entity;

public class MyTable {

    private int id;

    private String name;

    public MyTable() {
    }

    public MyTable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
