package com.example.handling.model;

import javax.persistence.Entity;

@Entity
public class Employee {
	//private int id;
    private String name;
    private String title;
    private String dept;
    private String desg;
    private String sal;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDesg() {
        return desg;
    }

    public void getDesg(String desg) {
        this.desg = desg;
    }
    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }
   
    
    

}
