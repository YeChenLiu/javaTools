package com.ycl.bean;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private Student stduent;
    private List<Student> list;


    public Student getStduent() {
        return stduent;
    }

    public void setStduent(Student stduent) {
        this.stduent = stduent;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
