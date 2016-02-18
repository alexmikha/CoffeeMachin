package com.alexmikha.coffeeMachine;

import java.util.Scanner;

import static com.alexmikha.coffeeMachine.Ingredients.map;


public class AdminIngradient {

    MenuCoffee mc = new MenuCoffee();
    Ingredients ing = new Ingredients();

    public AdminIngradient() {
    }

    public int adminIngradient() {

        System.out.println("Password:");
        String pass = "ing";

        Scanner sc = new Scanner(System.in);
        String adminingrad = sc.nextLine();

        if (adminingrad.equals(pass)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Insert password yet");
            return adminIngradient();
        }
        System.out.println("Ingredients have been spend: " + map.toString());
        //       Ingredients ing = new Ingredients();
        ing.showIngradients();

        System.out.println(1 + " -add Ingradients");
        System.out.println(2 + " -return to menu");
        sc = new Scanner(System.in);
        int add = sc.nextInt();
        if (add == 1) {
            ing.addIngradientsStock();
        }
        if (add == 2) {
            mc.menu();
        }
        return mc.menu();
    }
}

