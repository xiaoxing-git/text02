package com.javaStudy.PolyParameter_;

public class Employee {
    private String name;
    private double gongzi;
    public Employee(String name, double gongzi) {
        this.name = name;
        this.gongzi = gongzi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGongzi() {
        return gongzi;
    }

    public void setGongzi(double gongzi) {
        this.gongzi = gongzi;
    }
    public void getAnnual(){
        System.out.println("员工"+name+""+(12*gongzi));
    }
}
