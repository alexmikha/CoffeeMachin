package com.alexmikha.coffeeMachine;

import java.util.Scanner;


public class MenuCoffee {

    private String name = " ";

    private int espresso;
    private int americano;
    private int cappucino;
    RecipeCoffee rc = new RecipeCoffee();

    public MenuCoffee() {
        americano = 7;
        espresso = 5;
        cappucino = 9;
    }

    public int menu() {
        System.out.println();
        Ingredients ing = new Ingredients();
        ing.checkIngradients();
        System.out.println("You choose a drink");

        System.out.println(1 + "-" + getName1() + " cost-" + espresso + "$");
        System.out.println(2 + "-" + getName2() + " cost-" + americano + "$");
        System.out.println(3 + "-" + getName3() + " cost-" + cappucino + "$");
        System.out.println(4 + "-" + "other");
        Scanner menu = new Scanner(System.in);
        int recipe = menu.nextInt();
        if (recipe == 1) {
            rc.menuSugar();
            setName("Espresso");
            System.out.println("You chose " + getName());
            CheckMoney cm = new CheckMoney();
            cm.checkMoneyEspresso();
        }
        if (recipe == 2) {
            rc.menuSugar();
            setName("Americano");
            System.out.println("You chose " + getName());
            CheckMoney cm = new CheckMoney();
            cm.checkMoneyAmericano();
        }
        if (recipe == 3) {
            rc.menuSugar();
            setName("Cappucino");
            System.out.println("You chose " + getName());
            CheckMoney cm = new CheckMoney();
            cm.checkMoneyCappucino();
        }
        if (recipe == 4) {
            menuAdmin();
        } else {
            return menu();
        }
        return 0;
    }

    public int menuAdmin() {

        String admin1 = "ad1";
        String admin2 = "ad2";
        Scanner sc = new Scanner(System.in);
        String admin = sc.nextLine();
        System.out.println("Login:");
        AdminBank adminBank = new AdminBank();
        AdminIngradient adminIngr = new AdminIngradient();

        if (admin.equals(admin1)) {
            System.out.println("Welcome to menuAdminMoney");
            adminBank.takeMoney();
        }
        if (admin.equals(admin2)) {
            System.out.println("Welcome to menuAdminIngradient");
            adminIngr.adminIngradient();
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return "Espresso";
    }

    public String getName2() {
        return "Americano";
    }

    public String getName3() {
        return "Cappucino";
    }
}
