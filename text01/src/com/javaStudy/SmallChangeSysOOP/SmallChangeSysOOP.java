package com.javaStudy.SmallChangeSysOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    double money, balance = 0;
    String cop;//消费项目
    String output = "";
    int key;
    boolean ll = true;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Scanner scanner = new Scanner(System.in);

    public void View() {
        do {
            System.out.println("-------------------------零钱通菜单---------------------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请选择（1-4）：");

            key = scanner.nextInt();
            switch (key) {
                case 1: {
                    Details();
                    break;
                }
                case 2: {
                    Recorded();
                    break;
                }
                case 3: {
                    consume();
                    break;
                }
                case 4: {
                    quit();
                    break;
                }
                default: {
                    System.out.println("选择有误，请重新输入");
                }
            }
        } while (ll);
    }

    public void Details() {
        System.out.println("--------------------零钱通明细--------------------");
        System.out.println(output);

    }

    public void Recorded() {
        System.out.println("请输入收益：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益不合理，请重新选择");
            return;
        }
        balance += money;
        date = new Date();
        output += "\n收益入账\t" + money + "\t" + sdf.format(this.date) + "\t" + balance;
    }

    public void consume() {
        System.out.println("请输入消费金额：");
        money = scanner.nextDouble();
        System.out.println("请输入消费项目：");
        cop = scanner.next();
        if (money <= 0) {
            System.out.println("消费金额有误，请重新选择");
            return;
        } else if (money > balance) {
            System.out.println("余额不足，请重新选择");
            return;
        }
        balance -= money;
        date = new Date();
        output += "\n" + cop + "\t" +"-"+ money + "\t" + sdf.format(this.date) + "\t" + balance;
    }

    public void quit() {
        String a;
        while (ll) {
            System.out.println("请问是否退出y/n");
            a = scanner.next();
            if (a.equals("n")) {
                break;
            } else if (a.equals("y")) {
                ll = false;
            }

        }


    }
}
