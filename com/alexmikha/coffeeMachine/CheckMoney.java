package com.alexmikha.coffeeMachine;

import java.util.Scanner;

import static com.alexmikha.coffeeMachine.RecipeCoffee.selectSugar;

public class CheckMoney {

    RecipeCoffee rc = new RecipeCoffee();
    MenuCoffee mc = new MenuCoffee();
    Bank bank = new Bank();
    int money;
    int cost = 0;

    public CheckMoney() {
    }

    public int checkMoneyEspresso() {
        System.out.println("Insert money: ");
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        Scanner or = new Scanner(System.in);
        if (money == 1 || money == 2 || money == 5 || money == 10) {
            while (money < rc.getEspresso()) {
                System.out.println("Not enough money for a drink");
                System.out.println("Add money");
                money += sc.nextInt();
            }

        } else {
            System.out.println("Introduced not correct money");
            System.out.println("Take this money " + money + "$");
            return checkMoneyEspresso();
        }
        if (money >= rc.getEspresso()) {
            System.out.println("You put: " + money + "$");
            int change = money - rc.getEspresso();
            System.out.println("Enough money for: " + rc.getName1() + "-" + rc.getEspresso() + "$");

            System.out.println("Do you want to cancel your order?");
            System.out.println(1 + " -yes");
            System.out.println(2 + " -not");
            int order = or.nextInt();
            if (order == 1)
                cancelOrder();
            else if (order == 2) {
                rc.recipeEspresso(7, 30, selectSugar, 5);
                if (change != 0)
                    System.out.println("Take the change: " + change + "$");
                setCost(rc.getEspresso());
                bank.putBank(getCost());
                mc.menu();
            }
        }
        return 0;
    }

    public int checkMoneyAmericano() {
        System.out.println("Insert money: ");
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        Scanner or = new Scanner(System.in);
        if (money == 1 || money == 2 || money == 5 || money == 10) {
            while (money < rc.getAmericano()) {
                System.out.println("Not enough money for a drink");
                System.out.println("Add money");
                money += sc.nextInt();
            }

        } else {
            System.out.println("Introduced not correct money");
            System.out.println("Take this money " + money + "$");
            return checkMoneyAmericano();
        }
        if (money >= rc.getAmericano()) {
            System.out.println("You put: " + money + "$");
            int change = money - rc.getAmericano();
            System.out.println("Enough money for: : " + rc.getName2() + "-" + rc.getAmericano() + "$");

            System.out.println("Do you want to cancel your order?");
            System.out.println(1 + " -yes");
            System.out.println(2 + " -not");
            int order = or.nextInt();
            if (order == 1)
                cancelOrder();
            else if (order == 2) {
                rc.recipeAmericano(7, 120, selectSugar, 7);
                if (change != 0)
                    System.out.println("Take the change: " + change + "$");
                bank.putBank(rc.getCost());
                mc.menu();
            }
        }
        return 0;
    }

    public int checkMoneyCappucino() {
        System.out.println("Insert money: ");
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        Scanner or = new Scanner(System.in);
        if (money == 1 || money == 2 || money == 5 || money == 10) {
            while (money < rc.getCappucino()) {
                System.out.println("Not enough money for a drink");
                System.out.println("Add money");
                money += sc.nextInt();
            }

        } else {
            System.out.println("Introduced not correct money");
            System.out.println("Take this money " + money + "$");
            return checkMoneyCappucino();
        }
        if (money >= rc.getCappucino()) {
            System.out.println("You put: " + money + "$");
            int change = money - rc.getCappucino();
            System.out.println("Enough money for: " + rc.getName3() + "-" + rc.getCappucino() + "$");

            System.out.println("Do You want to cancel your order?");
            System.out.println(1 + " -yes");
            System.out.println(2 + " -not");
            int order = or.nextInt();
            if (order == 1)
                cancelOrder();
            else if (order == 2) {
                rc.recipeCappucino(7, 30, 70, selectSugar, 9);
                if (change != 0)
                    System.out.println("Take the change: " + change + "$");
                bank.putBank(rc.getCost());
                mc.menu();
            }
        }
        return 0;
    }

    public int cancelOrder() {
        System.out.println("Take this money " + money + "$");
        return 0;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
