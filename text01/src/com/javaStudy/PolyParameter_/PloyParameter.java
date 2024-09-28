package com.javaStudy.PolyParameter_;

public class PloyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",10000);
        Manger smith = new Manger("smith",15000,100000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(smith);
        ployParameter.testWork(tom);
        ployParameter.testWork(smith);

    }
    public void showEmpAnnual(Employee e){
        e.getAnnual();
    }
    public void testWork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        }else if (e instanceof Manger){
            ((Manger) e).manage();
        }
    }
}
