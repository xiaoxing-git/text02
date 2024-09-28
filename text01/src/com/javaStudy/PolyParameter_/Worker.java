package com.javaStudy.PolyParameter_;

public class Worker extends Employee {
    public Worker(String name, double gongzi) {
        super(name, gongzi);
    }
    public void work(){
        System.out.println("普通员工"+getName()+"正在工作");
    }
    public void getAnnual(){
        System.out.println("普通员工"+getName()+"的年薪为"+(12*getGongzi()));
    }
}
