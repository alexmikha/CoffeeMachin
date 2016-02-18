package com.alexmikha.coffeeMachine;

import java.util.Scanner;

import static com.alexmikha.coffeeMachine.Ingredients.*;

public class RecipeCoffee {

    private String name = " ";
    private String name1;
    private String name2;
    private String name3;

    static int selectSugar;
    private int cost = 0;

    public RecipeCoffee() {
        name = " ";
        name1 = "Espresso";
        name2 = "Americano";
        name3 = "Cappucino";
    }

    public int recipeEspresso(int coffee, int water, int sugar, int cost) {
        int milk = 0;
        Ingredients ingr = new Ingredients(coffee, water, milk, sugar);
        setCoffee(7);
        setWater(30);
        setSugar(getSugar());
        setCost(5);
        System.out.println("Preparing drink: " + getName1());
        if (getSugar() > 0) {
            System.out.println(getName() + " coffee- " + getCoffee() + " water-" +
                    getWater() + " cost-" + getCost() + "$" + " coffee ready with sugar-" + getSugar());
        } else if (getSelectsugar() == 0)
            System.out.println(getName() + " coffee- " + getCoffee() + " water-" +
                    getWater() + " cost-" + getCost() + "$" + " coffee ready sugarless");
        ingr.takeIngredientsStock();
        return 0;

    }

    public int recipeAmericano(int coffee, int water, int sugar, int cost) {
        int milk = 0;
        Ingredients ingr = new Ingredients(coffee, water, milk, sugar);
        setCoffee(7);
        setWater(120);
        setSugar(getSugar());
        setCost(7);
        System.out.println("Preparing drink: " + getName());
        if (getSugar() > 0) {
            System.out.println(getName() + " coffee- " + getCoffee() + " water-" +
                    getWater() + " cost-" + getCost() + "$" + "  coffee ready with sugar-" + getSugar());
        } else if (getSelectsugar() <= 0)
            System.out.println(getName() + " coffee- " + getCoffee() + " water-" +
                    getWater() + " cost-" + getCost() + "$" + " coffee ready sugarless");
        ingr.takeIngredientsStock();
        return 0;
    }

    public int recipeCappucino(int coffee, int water, int milk, int sugar, int cost) {

        Ingredients ingr = new Ingredients(coffee, water, milk, sugar);
        setCoffee(7);
        setWater(30);
        setMilk(70);
        setSugar(getSugar());
        setCost(9);
        System.out.println("Preparing drink: " + getName3());
        if (getSugar() > 0) {
            System.out.println(getName3() + " coffee-" + getCoffee() + " water-" + getWater() +
                    " milk-" + getMilk() + " cost-" + getCost() + "$" + "  coffee ready with sugar-" + getSugar());
        } else if (getSelectsugar() <= 0)
            System.out.println(getName3() + " coffee-" + getCoffee() + " water-" +
                    getWater() + " milk-" + getMilk() + " cost-" + getCost() + "$" + " coffee ready sugarless");
        ingr.takeIngredientsStock();
        return 0;
    }

    public void menuSugar() {
        System.out.println("Do You want with sugar ?");
        System.out.println(1 + "-" + " yes");
        System.out.println(2 + "-" + " not");
        Scanner in = new Scanner(System.in);
        int sugar = in.nextInt();
        if (sugar == 1) {
            addSugar();
        } else {
            if (sugar == 2)
                return;
            }
        }
 //   }

    public int addSugar() {
        int sugar = 0;
        System.out.println("How much to add sugar?");
        System.out.println("Select 1, 2, 3, 4");
        Scanner ch = new Scanner(System.in);
        int sug = ch.nextInt();
        setSugar(sug);
        setSelectsugar(sug);
        return sugar;
    }

    public int getEspresso() {
        return 5;
    }
    public int getAmericano() {
        return 7;
    }
    public int getCappucino() {return 9;}

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public static int getSelectsugar() {return selectSugar;}
    public static void setSelectsugar(int selectsugar) {RecipeCoffee.selectSugar = selectsugar;}

    public String getName() {return name;}
    public String getName1() {return name1;}
    public String getName2() {
        return name2;
    }
    public String getName3() {
        return name3;
    }
}
