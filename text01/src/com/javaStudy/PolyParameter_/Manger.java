package com.javaStudy.PolyParameter_;

public class Manger extends  Employee {
    private double bonus;

    public Manger(String name, double gongzi, double bonus) {
        super(name, gongzi);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理"+getName()+"正在管理");
    }
    public void getAnnual(){
        System.out.println("经理"+getName()+"的年薪为"+(12*getGongzi()+bonus));
    }
}
